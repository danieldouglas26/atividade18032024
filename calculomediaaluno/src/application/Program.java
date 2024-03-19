/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package application;
import entities.Aluno;
import java.util.*;
/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 19/03/2024
 * @brief Class Program
 */
public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        Aluno aluno = new Aluno ();
        aluno.name = sc.nextLine();
        aluno.grade1 = sc.nextDouble();
        aluno.grade2 = sc.nextDouble();
        aluno.grade3 = sc.nextDouble();
        System.out.println(aluno);

        
    }
    
}
