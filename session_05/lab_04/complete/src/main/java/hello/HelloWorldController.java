package hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public Greeting hello() {
        return new Greeting(1, "Hello, World!");
    }
}
