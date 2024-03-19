/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package applacation;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;
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

        Retangulo retangulo = new Retangulo();

        System.out.println("Enter retangle width and height:");
        retangulo.width = sc.nextDouble();
        retangulo.heigth = sc.nextDouble();
        System.out.println(retangulo);
        
        sc.close();
} 

}
