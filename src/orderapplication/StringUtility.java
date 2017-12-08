/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderapplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import orderapplication.model.OrderItem;
import orderapplication.model.Product;

/**
 *
 * @author user
 */
public class StringUtility {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(new File("C:/DEV/dataproduk.txt"));
            //ArrayList<Product> products = new ArrayList<>();
            ArrayList<OrderItem> items = new ArrayList<>();
            while (scan.hasNextLine()) {
                String produkDanHarga = scan.nextLine();
                String[] data = produkDanHarga.split(",");
                String namaProduk = data[0];

                String clear = data[1].trim(); // trim menghilangkan spasi pada data 1
                String clear2 = data[2].trim(); // trim menghilangkan spasi pada data 1
                
                double harga = Double.parseDouble(clear);
                int quantity = Integer.parseInt(clear2);
                
                Product p = new Product(namaProduk, harga);
                OrderItem oi = new OrderItem(p, quantity);
                //products.add(p);
                items.add(oi);
            }
            for (OrderItem item : items) {
                System.out.println(item+ " \t || Total = Rp "+item.calculateItemTotalPrice());
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(StringUtility.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
