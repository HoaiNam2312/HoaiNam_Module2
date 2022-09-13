package ss6_ke_thua.Bai_tap.Point_MovablePoint;

public class MovablePoint extends Point {
    protected float xSpeed, ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.setxSpeed(xSpeed);
        this.setySpeed(xSpeed);
    }

    public float[] getSpeed(float xSpeed,float ySpeed) {
        float arr[] = new float[2];
        arr[0] = xSpeed;
        arr[1] = ySpeed;
        return arr;
    }

    public String toString() {
        return "("+this.getX()+", "+this.getY()+"), speed= ("+this.getxSpeed()+", "+this.getySpeed()+").";
    }

    public MovablePoint move() {
        this.x += this.xSpeed;
        this.y += this.ySpeed;
        return this;
    }
}
