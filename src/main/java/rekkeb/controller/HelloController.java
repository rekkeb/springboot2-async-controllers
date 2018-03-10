package rekkeb.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path="/controller", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getHello() {
        return "{\"name\" : \"hello\"}";
    }

}
