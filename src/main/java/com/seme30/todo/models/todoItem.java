package com.seme30.todo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "TodoList")
public class todoItem {

    @Id
    @GeneratedValue
    private long id;

    @Getter
    @Setter
    @Column(name="title")
    private String todoTitle;

    @Getter
    @Setter
    @Column(name="createdDate")
    private Date todoCreatedDate;
    
    @Getter
    @Setter
    @Column(name="deadline")
    private Date todoDeadline;

    @Getter
    @Setter
    @Column(name="status")
    private String status;



    
}
