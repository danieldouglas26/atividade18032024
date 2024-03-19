/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 18/03/2024
 * @brief Class Product
 */
public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantidade) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantidade) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name 
               + ", $"
               + String.format ("%.2f", price)
               + ", " 
               + quantity
               + "units, Total: $"
               + String.format("%.2f", totalValueInStock());
    }
}
