/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssalesreport;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class MattressSalesReport {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//Single dimensional for the mattress
    String[] products = {
        "Cozy Night Monarch",
        "Restonic Barbados",
        "Sealy Phuket"
    };
//2D arrays to store the sales 
    int[][] sales = new int[3][3];
    
//Input methods for the products
    for (int i = 0; i < products.length; i++) {
           for (int j = 0; j < 3; j++) {
              System.out.print("Enter number of sales for month " + (j + 1) + " for " +products[i]+ " matteress: ");
              sales[i][j] = input.nextInt();
           }
              System.out.println();
       }

//Calculation
        int totalSales = 0;
        int totalEntries = 0;
        int highestTotal = 0;
        String mostPopularProduct = "";
        
         for (int i = 0; i < products.length; i++) {
            int productTotal = 0;
          for (int j = 0; j < 3; j++) {
              totalSales += sales[i][j];
              productTotal += sales[i][j];
              totalEntries++;
                
          } 
           if (productTotal > highestTotal){
            highestTotal = productTotal;
            mostPopularProduct = products[i];
         }
        }
        int averageSales = totalSales / totalEntries;
        
//Print out the final report
    System.out.println("\n PRODUCT SALES REPORT - 2026");
    System.out.println("**********************************************");
    System.out.println("TOTAL PRODUCT SALES: " +totalSales);
    System.out.println("AVERAGE PRODUCT SALES: " + averageSales);
    System.out.println("MOST POPLUAR PRODUCT: " + mostPopularProduct + "("+ highestTotal +")");
              
    input.close();
    }
}
