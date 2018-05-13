package src;

public abstract class Animal {
    protected String name;
    public abstract void sayHello();

    public Animal(String name) {
        this.name = name;
    }
}
