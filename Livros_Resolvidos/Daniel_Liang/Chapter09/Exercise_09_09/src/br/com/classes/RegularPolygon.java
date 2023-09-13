package br.com.classes;

public class RegularPolygon {
    private int numberOfSidesInThePolygon;
    private double lengthSide;
    private double xCoordinateOfThePolygonsCenter;
    private double yCoordinateOfThePolygonsCenter;

    //Construtores
    public RegularPolygon(){
        numberOfSidesInThePolygon = 3;
        xCoordinateOfThePolygonsCenter = 0.0;
        yCoordinateOfThePolygonsCenter = 0.0;
    }

    public RegularPolygon(int numberOfSidesInThePolygon, double lengthSide){
        this.numberOfSidesInThePolygon = numberOfSidesInThePolygon;
        this.lengthSide = lengthSide;
        xCoordinateOfThePolygonsCenter = 0.0;
        yCoordinateOfThePolygonsCenter = 0.0;
    }

    public RegularPolygon(int numberOfSidesInThePolygon, double lengthSide, double xCoordinateOfThePolygonsCenter, double yCoordinateOfThePolygonsCenter){
        this.numberOfSidesInThePolygon = numberOfSidesInThePolygon;
        this.lengthSide = lengthSide;
        this.xCoordinateOfThePolygonsCenter = xCoordinateOfThePolygonsCenter;
        this.yCoordinateOfThePolygonsCenter = yCoordinateOfThePolygonsCenter;
    }

    //Metodos Gets
    public int getNumberOfSidesInThePolygon() {
        return numberOfSidesInThePolygon;
    }

    public double getLengthSide(){
        return lengthSide;
    }

    public double getXCoordinateOfThePolygonsCenter(){
        return xCoordinateOfThePolygonsCenter;
    }

    public double getYCoordinateOfThePolygonsCenter(){
        return yCoordinateOfThePolygonsCenter;
    }

    //Metodos Sets
    public void setNumberOfSidesInThePolygon(int numberOfSidesInThePolygon) {
        this.numberOfSidesInThePolygon = numberOfSidesInThePolygon;
    }

    public void setLengthSide(double lengthSide){
        this.lengthSide = lengthSide;
    }

    public void setXCoordinateOfThePolygonsCenter(double xCoordinateOfThePolygonsCenter){
        this.xCoordinateOfThePolygonsCenter = xCoordinateOfThePolygonsCenter;
    }

    public void setYCoordinateOfThePolygonsCenter(double yCoordinateOfThePolygonsCenter){
        this.yCoordinateOfThePolygonsCenter = yCoordinateOfThePolygonsCenter;
    }

    //Metodo getPerimeter
    public double getPerimeter(){
        return (this.getLengthSide() * this.getNumberOfSidesInThePolygon());
    }

    //Metodo getArea
    public double getArea(){
        double num = (numberOfSidesInThePolygon * Math.pow(lengthSide, 2.0));
        double den = (4 * Math.tan(Math.PI / numberOfSidesInThePolygon));

        return num / den;
    }
}
