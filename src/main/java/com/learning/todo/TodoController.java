package com.learning.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/todos/dummy")
    public boolean dummy()
    {
        if (1==2)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
