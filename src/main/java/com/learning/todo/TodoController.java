package com.learning.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@RestController
public class TodoController {

    @GetMapping("/todos/dummy")
   /* public ArrayList<String> dummy()
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Rakesh");
        list.add("chitranjan");
        list.add("Manish");
        //list.remove(1);
        return list;

    }*/
    public Set<String> dummy() {
        Set<String> name=new HashSet<String>();
        name.add("rakesh");
        name.add("chitranjan");
        name.add("Manish");
        name.add("rakesh");

        return name;
    }

}
