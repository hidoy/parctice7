package com.javaex.ex02;

public abstract class Bird {
    private String name;
    public Bird() {
    }
    public void setName(String name) {
    	this.name=name;
    }
    protected String getName() {
    	return name;
    }
    public abstract void sing();
    public abstract void fly();
    public abstract void showName();
}
