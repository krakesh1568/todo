package com.learning.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/todos/dummy")
    public String dummy()
    {
        return "dummy data";
    }
}
