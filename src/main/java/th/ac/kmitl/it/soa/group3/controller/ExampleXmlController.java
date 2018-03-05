package th.ac.kmitl.it.soa.group3.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmitl.it.soa.group3.model.ExampleXmlModel;
import java.util.ArrayList;

@RestController
@Api(value = "Example Xml", description = "This is an example of how to use jackson xml")
public class ExampleXmlController {

    @GetMapping(value = "/examplexml")
    public ExampleXmlModel exampleXml() {

        ArrayList<String> exampleStrings = new ArrayList<>();
        exampleStrings.add("Test 1");
        exampleStrings.add("Test 2");
        exampleStrings.add("Test 3");

        ExampleXmlModel exampleXmlModel = new ExampleXmlModel(
                "exampleId",
                "examplename",
                "exampleDesc",
                exampleStrings);

        return exampleXmlModel;
    }
}
