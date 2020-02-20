public class Point2D {
    public float x;
    public float y;

    public Point2D(float x,float y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float[] getXY(){
        return new float[]{this.x,this.y};
    }

    public String toString(){
        return "x=" + getXY()[0] + " y=" + getXY()[1];
    }
}
