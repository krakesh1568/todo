package com.learning.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/todos/dummy")
    public int[] dummy()
    {
        int[] arr = new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i] = i + i*2;
        }

        return arr;
    }
}
