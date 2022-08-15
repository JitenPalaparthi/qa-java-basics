package io.akalabs.springdemo1;

public class HelloWorld {
    private String name;
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void output() {
        System.out.println("Bean says " + name);
    }
}