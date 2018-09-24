package shapes;

//    class Square{
//    int length;
//
//    public Square(int squLength){
//        this.length = squLength;
//    }
//
//    public int calculateArea(){
//        return this.length * this.length;
//    }
//}
//
//    class Triangle{
//    int base;
//    int height;
//
//    public Triangle(int triBase, int triHeight){
//        this.base = triBase;
//        this.height = triHeight;
//    }
//
//    public int calculateArea(){
//        return this.base * this.height;
//    }
//}
//
//    class Circle{
//        //property
//    double radius;
//
//    //constructor
//    public Circle(double radiusGiven){
//        this.radius = radiusGiven;
//    }
//
//    //method
//    public double calculateArea(){
//        return Math.PI * this.radius * this.radius;
//    }
//}

class Calculator{
    double numberOne;
    double numberTwo;

    public Calculator(double firstNum, double secondNum){
        this.numberOne = firstNum;
        this.numberTwo = secondNum;
    }

    public double addNumbers(){
        return numberOne + numberTwo;
    }

    public double subtractNumbers(){
        return numberOne - numberTwo;
    }

    public double multiplyNumbers(){
        return numberOne * numberTwo;
    }

    public double divideNumbers(){
        return numberOne / numberTwo;
    }

    public double exponentNumber(){
        return numberOne * numberOne;
    }

    public double squareRootNumber(){
        return Math.sqrt(numberOne);
    }

    public double squareNumber(){
        return Math.pow(numberOne, numberTwo);
    }

    public double sine() {
        return Math.sin((Math.toRadians(numberOne)));
    }

    public double cosine() {
        return Math.cos((Math.toRadians(numberOne)));
    }

}

//class Laptop{
//    String display;
//    String size;
//    String processor;
//    String gpu;
//    String brand;
//    String keyboard;
//    String mouse;
//    String colors[] = new String[5];
//
//    public Laptop(String displayLaptop, String sizeLaptop, String processorLaptop, String gpuLaptop, String brandLaptop, String keyboardLaptop, String mouseLaptop){
//        this.display = displayLaptop;
//        this.size = sizeLaptop;
//        this.processor = processorLaptop;
//        this.gpu = gpuLaptop;
//        this.brand = brandLaptop;
//        this.keyboard = keyboardLaptop;
//        this.mouse = mouseLaptop;
//    }
//
//    public String displayLap(){
//        return display;
//    }
//
//    public String sizeLap(){
//        return size;
//    }
//
//    public String processorLap(){
//        return processor;
//    }
//
//    public String gpuLap(){
//        return gpu;
//    }
//
//    public String brandLap(){
//        return brand;
//    }
//
//    public String keyboardLap(){
//        return keyboard;
//    }
//
//    public String mouseLap(){
//        return mouse;
//    }
//
//}
