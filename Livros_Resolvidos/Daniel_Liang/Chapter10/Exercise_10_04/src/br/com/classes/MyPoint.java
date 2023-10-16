package br.com.classes;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double distanceA(MyPoint myPoint){
        double dx = this.x - myPoint.getX();
        double dy = this.y - myPoint.getY();
        return Math.sqrt(Math.pow(dx, 2.0) + Math.pow(dy, 2.0));
    }

    public double distanceB(double x, double y){
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(Math.pow(dx, 2.0) + Math.pow(dy, 2.0));
    }

    public static double distance(MyPoint p1, MyPoint p2){
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
