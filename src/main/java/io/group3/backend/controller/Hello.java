package io.group3.backend.controller;

import com.sun.jndi.toolkit.ctx.AtomicContext;
import io.group3.backend.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class Hello {

    private AtomicInteger counter = new AtomicInteger();

    @GetMapping("/hello")
    public Greeting hello(@RequestParam(name = "msg", defaultValue = "Hello, World") String msg) {
        return new Greeting(counter.incrementAndGet(), msg);
    }

}
