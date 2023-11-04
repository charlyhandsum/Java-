class CircularShape
{
    private double radius;

    //creating the constructor
    public CircularShape(double radius) {
        this.radius = radius;
    }

    //setRadius method
    public void setRadius(double radius){
        this.radius = radius;
    }

    //getRadius method
    public double getRadius() {
        return radius;
    }

    //calculate Circumference
    public double calculateCircumference(){
        return (2 * Math.PI * radius);
    }

    //calculate diameter
    public double calculateDiameter(){
        return (2 * radius);
    }
}
