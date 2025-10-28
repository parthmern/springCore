package org.example;

public class PetrolEngine implements Engine{
    @Override
    public int start() {
        System.out.println("PetrolEngine started");
        return 1;
    }
}
