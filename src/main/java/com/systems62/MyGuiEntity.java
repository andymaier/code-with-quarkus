package com.systems62;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class MyGuiEntity {
    private Long id;
    private String field;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
