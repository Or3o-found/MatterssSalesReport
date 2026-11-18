/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssalesreport;

/**
 *
 * @author Student
 */
public class Product implements IProduct{
    public int TotalSales(int[][] productSales){
     int total = 0;
       for (int[] product : productSales) {
           for (int sale : product) {
               total += sale;
           }
       }
   return total;
}
   public double AverageSales(int[][] productSales){
     int total = TotalSales(productSales);
     int count = 0;
       for (int[] product : productSales) {
               count += product.length;
           }
        return (double) total / count;
       }
   public String MostPopularProduct(String[] products, int[][] productSales){
     int highestTotal = -1;
     String popularProduct = "";
        for (int[] productSale : productSales) {
            int productTotal = 0;
            for (int j = 0; j < productSale.length; j++) {
                productTotal += productSale[j];
            }
            if (productTotal > highestTotal) {
                highestTotal = productTotal;
            }
        }
   return popularProduct;
}

    @Override
    public int GetTotalProductSold(int[][] sales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double GetAverageProductSold() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String GetMostPopularProduct() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int GetTotalProductSold(int[][] sales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String GetMostPopularProductSold(int[][] sales, String[] products) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    double GetAverageProductSold(int[][] sales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

