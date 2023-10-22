public class Triangle extends GeometricObject{

    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSideOne(){
        return this.side1;
    }

    public double getSideTwo(){
        return this.side2;
    }

    public double getSideThree(){
        return this.side3;
    }

    public void setSideOne(double side1){
        this.side1 = side1;
    }

    public void setSideTwo(double side2){
        this.side2 = side2;
    }

    public void setSideThree(double side3){
        this.side3 = side3;
    }

    public double getArea(){
        double sum = (getSideOne() + getSideTwo() + getSideThree()) / 2;
        double area = Math.sqrt(sum * (sum - getSideOne()) * (sum - getSideTwo()) * (sum - getSideThree()));

        return area;
    }

    public double getPerimeter(){
        return (getSideOne() + getSideTwo() + getSideThree());
    }

    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
