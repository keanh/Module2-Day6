public class Circle {
    public double radius;
    public String color ="red";

    public Circle(double radius) {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public String toString(){
        return "The circle with radius = "
                +getRadius()
                +" and have "
                +getColor()
                +" color";
    }

}
