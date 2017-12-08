/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderapplication.model;

/**
 *
 * @author user
 */
public class Product {

    private String productName;
    private double price;

    public Product() {
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        
    }

    public Product(String cilok_Premium, double d, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

            
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return this.getProductName() + " Rp "+this.getPrice() ; //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the quantity
     */
//    public int getQuantity() {
//        return quantity;
//    }
//
//    /**
//     * @param quantity the quantity to set
//     */
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }

}
