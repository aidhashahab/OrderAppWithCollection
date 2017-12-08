/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderapplication;

import java.util.ArrayList;
import orderapplication.model.Product;

/**
 *
 * @author user
 */
public class ArrayListTest {

    public static void main(String[] args) {

            ArrayList<Product> products = new ArrayList<>();
            products.add(new Product("Cilok Premium" , 4000.0, 0));
            products.add(new Product("Es Cincau Mahal" , 150000.0, 0));
            for (Product product : products) {
                System.out.println("Produk : "+product.getProductName());
               
        }

            ArrayList<String> names = new ArrayList<>();
            names.add("John");
            names.add("James");
            names.add("Siti");
            names.add("Bond");
            
            names.remove(2);
            
            for (String name : names) {
                System.out.println("Nama : "+name);
        }
        // TODO code application logic here
    }
    
}
