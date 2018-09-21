package car.zoomer;

 class Automobile {
    private String manufacturer = "Honda";
    public String model = "CRV";
    private int wheels = 4;
    private String licensePlate = "3MN6270";
    private String body = "Sedan";
    public long distance = 900;

    public String distanceDriven(){
        return manufacturer + model + " has driven" + distance + " miles.";
    }

}
