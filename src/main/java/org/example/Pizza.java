/** Project: Lab 4 Pizza Shop
 * Purpose Details: Pizza Class
 * Course: IST 242
 * Author: Jordan Borrero
 * Date Developed:3/12/24
 * Last Date Changed:3/12/24
 * Rev:1

 */
package org.example;

public class Pizza {
    // class attributes
    public String Size;
    private String Topping1;
    private String Topping2;
    private double Cost;

    // class constructor
    public Pizza(String size, String Top1, String Top2, double cost) {
        Size = size;
        Topping1 = Top1;
        Topping2 = Top2;
        Cost = cost;
    }

    // getters and setters
    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getTopping1() {
        return Topping1;
    }

    public void setTopping1(String topping1) {
        Topping1 = topping1;
    }

    public String getTopping2() {
        return Topping2;
    }

    public void setTopping2(String topping2) {
        Topping2 = topping2;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }
}
