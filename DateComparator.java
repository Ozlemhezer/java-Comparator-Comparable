/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication25;

import java.util.Comparator;

/**
 *
 * @author mustafa hezer
 */
public class DateComparator implements Comparator<Employee> {
    public int compare(Employee emp1,Employee emp2){
        return emp1.getDate().compareTo(emp2.getDate());
    }
}
