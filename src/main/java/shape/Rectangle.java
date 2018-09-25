package shape;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int sides, int length, int width){
        super(sides);
        this.length = length;
        this.width = width;
    }

    @Override
    public int calculateArea(){
        return length * width;
    }
}
