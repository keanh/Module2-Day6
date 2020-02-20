public class Cylinder extends Circle {
    public double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius,double height){
        super(radius);
        this.height=height;
    }

    public double getV(){
        return Math.PI*this.radius*this.height;
    }

    public String toString(){
        return "A Cynlinder with height="
                +getHeight()
                +" and get the V = "
                +getV()
                +" have the radius = "
                +getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
