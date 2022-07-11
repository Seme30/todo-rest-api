package com.seme30.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seme30.todo.models.todoItem;

public interface TodoItemRepository extends JpaRepository<todoItem,Long>{
    
}
