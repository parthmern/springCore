package org.example;

public class DisealEngine implements Engine{
    public DisealEngine() {
        System.out.println("DisealEngine constructor");
    }

    @Override
    public int start() {
        System.out.println("DisealEngine started");
        return 1;
    }
}
