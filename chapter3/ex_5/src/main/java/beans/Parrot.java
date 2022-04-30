package beans;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Koko";

    @Override
    public String toString() {
        return "Parrot : " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
