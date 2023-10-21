package br.com.classes;

public class Circle2D {

    private double x_center;
    private double y_center;
    private double radius;

    public Circle2D(){
        this.x_center = 0.0;
        this.y_center = 0.0;
        this.radius = 1.0;
    }

    public Circle2D(double x_center, double y_center, double radius){
        this.x_center = x_center;
        this.y_center = y_center;
        this.radius = radius;
    }

    public double getX(){
        return this.x_center;
    }

    public double getY(){
        return this.y_center;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2.0);
    }

    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    public boolean contains(double x, double y){
        double distance = Math.sqrt(Math.pow(x - this.x_center, 2.0) + Math.pow(y - this.y_center, 2.0));
        if (distance <= this.radius){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean containsCircle(Circle2D circle){
        double radiusModulus = (circle.getRadius() - this.radius);
        double distanceCs = Math.sqrt(Math.pow((circle.getX() - this.x_center), 2.0) + Math.pow((circle.getY() - this.y_center), 2.0));
        boolean isContained = false;

            if (radiusModulus < 0){
                radiusModulus *= -1;
            }

            if (distanceCs >= 0 && distanceCs < radiusModulus){
                isContained = true;
            }
            return isContained;
    }

    public boolean overlaps(Circle2D circle){
        double radiusModulus = (circle.getRadius() - this.radius);
        double distanceCs = Math.sqrt(Math.pow((circle.getX() - this.x_center), 2.0) + Math.pow((circle.getY() - this.y_center), 2.0));
        boolean isOverlaped = false;

        if (distanceCs <= circle.getRadius() + this.radius){
            isOverlaped = true;
        }
        return isOverlaped;
    }
}
