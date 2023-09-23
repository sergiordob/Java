/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_01_a;

/**
 *
 * @author Sergio
 */
public class Product {
    
    //Class variables
    private int itemNumber;
    private String nameOfTheProduct;
    private int numberOfUnitsInStock;
    private double priceOfEachUnit;
    
    //Default constructor
        public Product(){
            this.itemNumber = 0;
            this.nameOfTheProduct = "";
            this.numberOfUnitsInStock = 0;
            this.priceOfEachUnit = 0.0;
        }
        
    //Overloaded constructor    
        public Product(int itemNumber, String nameOfTheProduct, int numberOfUnitsInStock, double priceOfEachUnit){
            this.itemNumber = itemNumber;
            this.nameOfTheProduct = nameOfTheProduct;
            this.numberOfUnitsInStock = numberOfUnitsInStock;
            this.priceOfEachUnit = priceOfEachUnit;
        }
        
    //Gets    
        public int getItemNumber(){
            return this.itemNumber;
        }
        
        public String getNameOfTheProduct(){
            return this.nameOfTheProduct;
        }
        
        public int getNumberOfUnitsInStock(){
            return this.numberOfUnitsInStock;
        }
        
        public double getPriceOfEachUnit(){
            return this.priceOfEachUnit;
        }
    
    //Sets    
        public void setItemNumber(int itemNUmber){
            this.itemNumber = itemNumber;
        }
        
        public void setNameOfTheProduct(String nameOfTheProduct){
            this.nameOfTheProduct = nameOfTheProduct;
        }
        
        public void setNumberOfUnitsInStock(int numberOfUnitsInStock){
            this.numberOfUnitsInStock = numberOfUnitsInStock;
        }
        
        public void setPriceOfEachUnit(double priceOfEachUnit){
            this.priceOfEachUnit = priceOfEachUnit;
        }
        
    //toString
        public String toString(){
            String string = "";
            
            string = "Item number: " + getItemNumber()
                    + "\nName of the product: " + getNameOfTheProduct()
                    + "\nNumber of units in stock: " + getNumberOfUnitsInStock()
                    + "\nPrice of each unit: " + getPriceOfEachUnit();
                       
            return string;        
        }
          
}
