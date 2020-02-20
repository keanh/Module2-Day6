public class Shape {
    public String color = "color";
    boolean filled = true;

    Shape(){
    }

    Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        return "A shape with color of "
                +getColor()
                +" and "
                +(isFilled() ? "filled" : "not filled");
    }
}
