package foods;

public abstract class Restaurant {
    public int chairs;
    public int tables;
    public int waiters;
    public int haters;

    abstract void waiters();
    abstract void haters();
}
