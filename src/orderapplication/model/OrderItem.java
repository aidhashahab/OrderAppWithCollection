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
public class OrderItem {

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    private Product product;
    private int quantity;
    private double discount;

    public OrderItem() {
    }

    
    public OrderItem(Product product, int quantity, double discount) {
        this.product = product;
        this.quantity = quantity;
        this.discount = discount;
        
    }
    
    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        
    }
    
   public double calculateItemTotalPrice(){
        double totalPrice = this.getProduct().getPrice() * this.getQuantity();
        return totalPrice;
    }

    public double calculateDiscountItemValue(){
        double discountValue = calculateItemTotalPrice()*this.getDiscount();
        return discountValue;
    }
    
    public double calculateTotalPriceAfterDiscount(){
        double totalAkhir = calculateItemTotalPrice()-calculateDiscountItemValue();
        return totalAkhir;
    }
    @Override
    public String toString() {
        
        return getProduct().getProductName()+"\t || Harga = Rp " +getProduct().getPrice() + " || \t Qty = " + this.getQuantity()  ; //To change body of generated methods, choose Tools | Templates.
    }

}
