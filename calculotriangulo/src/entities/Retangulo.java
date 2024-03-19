/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 18/03/2024
 * @brief Class Triangulo
 */
public class Retangulo {

    
    public double area;
    public double width;
    public double heigth;
    
    public double area() {
        return width * heigth;
 }
    public double perimeter() {
        return width + heigth + heigth + width;
 }
    public double diagonal() {
        return (Math.sqrt(Math.pow(width, 2) + Math.pow(heigth, 2)));
 }
    
     public String toString() {
        return   "AREA: "
               + String.format ("%.2f", area())
               + "\n " 
               + "PERIMETER: "
               + String.format ("%.2f", perimeter())
               + "\n " 
               + "DIAGONAL: "
               + String.format ("%.2f", diagonal());
    }
    
}
