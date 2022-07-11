package com.seme30.todo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seme30.todo.models.todoItem;
import com.seme30.todo.services.TodoItemService;

import java.util.List;

@RestController
@RequestMapping("api/v1/todoitems")
public class TodoItemController {

    private TodoItemService todoItemService;

    public TodoItemController(TodoItemService todoItemService){
        this.todoItemService = todoItemService;
    }

    //Creates Todo
    @PostMapping(consumes={"application/json"})
    public ResponseEntity<todoItem> saveTodo(@RequestBody todoItem todo){
        System.out.println(todo.getTodoTitle());
        return new ResponseEntity<todoItem>(todoItemService.saveTodo(todo), HttpStatus.CREATED);
    }

    //Get All Todos
    @GetMapping
    public List<todoItem> getAllTodos(){
        return todoItemService.getAllTodos();
    }
    
    
}
