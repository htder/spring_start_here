package main;

public class Parrot {
    private String name;

    public Parrot() {
        System.out.println("Parrot Created!");
    }

    @Override
    public String toString() {
        return "Parrot - " + this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
