package com.revature.jenkins.jenkinsss;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Jenkins {

        @GetMapping("/example/{name}")
        public String getMappingWithPathVariable(@PathVariable String name) {
            return "Hello, " + name + "!";
        }


}
