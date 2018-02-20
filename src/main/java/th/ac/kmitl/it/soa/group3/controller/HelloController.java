package th.ac.kmitl.it.soa.group3.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import th.ac.kmitl.it.soa.group3.model.GreetingModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
@Api(value = "Example Api", description = "This description show as a demo of implementing notation.")
public class HelloController {

    private AtomicInteger counter = new AtomicInteger();

    @GetMapping("/hello")
    @ApiOperation(value = "This is example api method.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Example text for successfull case"),
            @ApiResponse(code = 404, message = "Example text for not found case")
    })
    public GreetingModel hello(@RequestParam(name = "msg", defaultValue = "Hello, World") String msg) {
        return new GreetingModel(counter.incrementAndGet(), msg);
    }

}
