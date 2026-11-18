/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssalesreport;

/**
 *
 * @author Student
 */
public class PrintProduct {
   public void printTotalSales(Product product, int[][] sales){
       int total = product.GetTotalProductSold(sales);
       System.out.println("Total Products Sold: " + total);
   }
   
   public void printAverageSales(Product product, int[][] sales){
       double average = product.GetAverageProductSold(sales);
       System.out.printf("Average Products Sold: %.0f%n", average);
   }
   
   public void printMostPopularProduct(Product product, int[][] sales, String[] products){
       String popular = product.GetMostPopularProductSold(sales, products);
       System.out.println("Most Popular Products: " + popular);
   }
}
