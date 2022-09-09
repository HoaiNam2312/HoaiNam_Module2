package ss4_lop_va_doi_tuong.Fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public boolean getterOn() {
        return this.on;
    }
    public double getterRadius() {
        return this.radius;
    }

    public String getColor() {
        return color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void khoiTaoMacDinh() {
        this.speed = 1;
        this.on = false;
        this.radius = 5;
        this.color = "Blue";
    }

    public String toString() {
        if (this.on) {
            return "Speed: "+getSpeed() + ", Radius: " + getterRadius() +", Color: "+ getColor() +", Status: "+ "fan is on.";
        } else {
            return "Speed: "+getSpeed() + ", Radius: " + getterRadius() +", Color: "+ getColor() +", Status: "+ "fan is off.";
        }
    }
}
