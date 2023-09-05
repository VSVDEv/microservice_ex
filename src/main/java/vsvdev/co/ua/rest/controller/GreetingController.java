package vsvdev.co.ua.rest.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vsvdev.co.ua.rest.Greeting;
import vsvdev.co.ua.rest.service.GreetingService;

@RestController
@Slf4j
@AllArgsConstructor
public class GreetingController {

    private final GreetingService service;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        log.info("!!!!! Request with name {}", name);
        Greeting greet = service.greet(name);
        log.info("!!!!! Response with content {} and id {}", greet.content,greet.id);
        return greet;
    }
}