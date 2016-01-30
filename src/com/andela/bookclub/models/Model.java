package com.andela.bookclub.models;

/*
*  The superclass for all model classes
*/
public abstract class Model {
    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}