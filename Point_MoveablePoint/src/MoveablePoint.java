public class MoveablePoint extends Point {
    public float xSpeed;
    public float ySpeed;
    public MoveablePoint(float x, float y,float xSpeed,float ySpeed) {
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(){

    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{this.xSpeed,this.ySpeed};
    }

    @Override
    public String toString() {
        return "("
                +getXSpeed()
                +", "
                +getYSpeed()
                +")"
                +"("
                +getMoveX()
                +", "
                +getMoveY()
                +")";
    }

    public float getMoveY(){
        return y+=ySpeed;
    }

    public float getMoveX(){
        return x+=xSpeed;
    }
}
