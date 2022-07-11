package com.seme30.todo.services;

import java.util.List;

import com.seme30.todo.models.todoItem;
public interface TodoItemService {
    
    todoItem saveTodo(todoItem todo);
    List<todoItem> getAllTodos();
    
}
