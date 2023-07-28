package com.db.grad.javaapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
//@Column
public class Dog
{

    @Column
    private long id;
    @Column
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
