package shape;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int sides, int base, int height){
        super(sides);
        this.base = base;
        this.height = height;
    }

    @Override
    public int calculateArea(){
        return base * height;
    }
}
