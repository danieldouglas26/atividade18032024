/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 18/03/2024
 * @brief Class Program
 */
public class Program {
 public static void main(String[] args) {
       
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Name: ");
        funcionario.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        funcionario.grosssalary = sc.nextDouble();
        System.out.print("Tax: ");
        funcionario.tax = sc.nextInt();

        System.out.println();
        System.out.println("Exployee: " + funcionario);

        System.out.println();
        System.out.print("Witch procentage to increase salary?: ");
        double porcent= sc.nextInt();
        funcionario.increaseSalary(porcent);

        System.out.println();
        System.out.println("Updated data: " + funcionario);

        sc.close();
} 

}
