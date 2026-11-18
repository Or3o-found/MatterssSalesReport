/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mattresssalesreport;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class ProductTest {
 
@Test 
public void GetTotalProductSales_WithValidData_ReturnsCorrectValue(){
    Product product = new Product();
    int[][] sales = {
        {100, 150, 200},
        {300, 250, 350}
    };
    int expected = 1350;
    int actual = product.GetTotalProductSold(sales);
       assertEquals(expected, actual);
    }
@Test
public void GetAverageSales_WithValidData_ReturnsCorrectValue(){
   Product product = new Product();
    
    double expectedAverage = 225.0;
    int[][] validSalesData = null;
    double actual = product.GetTotalProductSold(validSalesData);
    double expected = 0;
       assertEquals(expected, actual); 
}
}
  