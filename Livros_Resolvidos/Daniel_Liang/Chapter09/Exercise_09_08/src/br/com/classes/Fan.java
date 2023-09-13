package br.com.classes;

public class Fan
{
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

     public Fan() {
        speed = SLOW;
        on = false;
        radius = 5.0;
        color = "blue";
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSpeed() {
        String s = "";
        switch (speed) {
            case SLOW: s = "SLOW"; break;
            case MEDIUM: s = "MEDIUM"; break;
            case FAST: s = "FAST"; break;
        }
        return s;
    }

    public void setMode(boolean on) {
        this.on = on; //true para on e false para off
    }

    public boolean getMode() {
        return this.on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String toString(){
        if (on == true){
            return ("Fan speed = " + getSpeed() + "\nColor = " + getColor() + "\nRadius = " + getRadius());
        }
        else {
            return ("Fan is off" + "\nColor = " + getColor() + "\nRadius = " + getRadius());
        }
    }
}
