/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 18/03/2024
 * @brief Class Funcionario
 */
public class Funcionario {

    public String name;
    public double grosssalary;
    public int tax;

    public double realSalary() {
        return grosssalary - tax;
    }

    public void increaseSalary(double porcent) {
        
        double increaseAmount = porcent / 100 * realSalary();
        this.grosssalary += increaseAmount;

    }

    public String toString() {
        return name 
               + ", $ "
               + String.format ("%.2f", realSalary());
    }
}
