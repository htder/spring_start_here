package main;

public class Parrot {
    private String name;

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
