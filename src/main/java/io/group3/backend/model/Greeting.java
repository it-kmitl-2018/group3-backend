package io.group3.backend.model;

public class Greeting {

    private int id;
    private String msg;

    public Greeting(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public int getId() {
        return id;
    }

}
