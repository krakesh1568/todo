package com.learning.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/todos/dummy")
    public double dummy()
    {
        return 1+5.8;
    }
}
