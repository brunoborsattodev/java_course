package java_course.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping
    public String heloWorld() {
        return "Hello World!";

    }
}
