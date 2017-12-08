/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderapplication.model;

import static com.sun.org.apache.xalan.internal.Version.getProduct;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Order {

    /**
     * @return the orderItems
     */
    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    /**
     * @param orderItems the orderItems to set
     */
    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    //member variable
//    private OrderItem[] orderItems;
    private final double PPN = 0.1;
    private ArrayList<OrderItem> orderItems;


    //constructor default
 
Product p = new Product ();
    public Order() {
    }

    public Order(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public double calculateTotalOrder() {
        double totalOrder = 0.0;
        for (OrderItem orderItem : getOrderItems()) {
            totalOrder += orderItem.calculateItemTotalPrice();
        }
        return totalOrder;
    }
    
    public double calculateTotalOrderWithDiscount() {
        double totalOrder = 0.0;
        for (OrderItem orderItem : getOrderItems()) {
            totalOrder += orderItem.calculateTotalPriceAfterDiscount();
        }
        return totalOrder;
    }

//    public double hitungPPNTotalOrder(){
//        double hitungTotalPPN = calculateTotalOrder()*PPN;
//        double hitungTotalSetelahPPN = calculateTotalOrder()+hitungTotalPPN;
//        return hitungTotalSetelahPPN;
//    }
    public double hitungPPN(){
      double hitungTotalPPN = calculateTotalOrderWithDiscount()*PPN;
        return hitungTotalPPN;
    }
    
    public double hitungPPNTotalWithOrder(){
        double hitungTotalSetelahPPN = calculateTotalOrderWithDiscount()+hitungPPN();
        return hitungTotalSetelahPPN;
    }

    @Override
    public String toString() {
        return  p.getProductName()+"\t" + this.getQuantity() + "\t Rp "+calculateTotalOrder(); //To change body of generated methods, choose Tools | Templates.
    }

    private String getQuantity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
