package com.mb4321.springboot_restapi_v1_xp_simulations.models;

public class Greeting {

    private String name;
    private String text;

    public Greeting(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }
}
