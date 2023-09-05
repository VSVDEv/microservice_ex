package vsvdev.co.ua.rest.service;

import org.springframework.stereotype.Service;
import vsvdev.co.ua.rest.Greeting;

import java.util.concurrent.atomic.AtomicLong;
@Service
public class GreetingServiceImpl implements GreetingService {

    private static final String template = "Hello, %s!";
    private static final AtomicLong counter = new AtomicLong();

    @Override
    public Greeting greet(String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
