package com.seme30.todo.services.serviceImpl;

import java.util.List;

import com.seme30.todo.models.todoItem;
import com.seme30.todo.repository.TodoItemRepository;
import com.seme30.todo.services.TodoItemService;

import org.springframework.stereotype.Service;

@Service
public class TodoItemServiceImpl implements TodoItemService{

    private TodoItemRepository todoItemRepository;

    public TodoItemServiceImpl(TodoItemRepository todoItemRepository){
        this.todoItemRepository = todoItemRepository;
    }

    @Override
    public todoItem saveTodo(todoItem todo) {
        return todoItemRepository.save(todo);
    }

    @Override
    public List<todoItem> getAllTodos() {
        return todoItemRepository.findAll();
    }
    
}
