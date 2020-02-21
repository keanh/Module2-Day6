public class Shape {
    public double size1 = 1.0;
    public double size2 = 1.0;
    public double size3 = 1.0;

    Shape(){}
    Shape(double size1,double size2,double size3){
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getArea(){
        double p=getPerimeter()/2;
        return Math.sqrt(p*(p-size1)*(p-size2)*(p-size3));
    }

    public double getPerimeter(){
        return size1+size2+size3;
    }

    public String toString(){
        return "Tam giác có 3 cạnh = " + size1 +", " +size2 + ", " +size3+" và có diện tích = " + getArea() + ", có chu vi = " +
                getPerimeter();
    }
}
