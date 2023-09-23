/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_01_b;

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
    private boolean active;
    
    //Default constructor
        public Product(){
            this.itemNumber = 0;
            this.nameOfTheProduct = "";
            this.numberOfUnitsInStock = 0;
            this.priceOfEachUnit = 0.0;
            this.active = true;
        }
        
    //Overloaded constructor    
        public Product(int itemNumber, String nameOfTheProduct, int numberOfUnitsInStock, double priceOfEachUnit){
            this.itemNumber = itemNumber;
            this.nameOfTheProduct = nameOfTheProduct;
            this.numberOfUnitsInStock = numberOfUnitsInStock;
            this.priceOfEachUnit = priceOfEachUnit;
            this.active = true;
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
        
        public boolean getIsActive(){
            return  this.active;
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
        
        public void setIsActive(boolean active){
            this.active = active;
        }
        
    //Method to return the value of the item stored in the inventary
        public double getInventoryValue(){
            return this.getPriceOfEachUnit() * this.getNumberOfUnitsInStock();
        }
        
    //toString
        public String toString() {
        String string = "\nItem number: " + getItemNumber()
                  + "\nName of the product: " + getNameOfTheProduct()
                  + "\nNumber of units in stock: " + getNumberOfUnitsInStock()
                  + "\nPrice of each unit: " + getPriceOfEachUnit()
                  + "\nProduct status: " + (getIsActive() == true ? "Active\n" : "Discontinued"
                  + "\nStock value: " + getInventoryValue()
                  + "\n");
    return string;
}

}
