/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entities;

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 19/03/2024
 * @brief Class Aluno
 */
public class Aluno {
 public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public Aluno() {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public String getStatus() {
        if (finalGrade() >= 60.0) {
            return "PASS";
        } else {
            return "FAILED\nMISSING " + (60.0 - finalGrade()) + " POINTS";
        }
    }

    @Override
    public String toString() {
        return "FINAL GRADE = " + String.format("%.2f", finalGrade()) + "\n" + getStatus();
    }
    
}
