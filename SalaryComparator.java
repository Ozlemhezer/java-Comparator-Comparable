/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication25;

import java.util.Comparator;


public class SalaryComparator implements Comparator<Employee>{
    public int compare(Employee emp1,Employee emp2){
        return Double.compare(emp1.getSalary(),emp2.getSalary());
    }
    
}
