/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class JavaApplication25 {

    
    public static void main(String[] args) {
       ArrayList<Employee> workers = new ArrayList<Employee>();
       Employee emp1 = new Employee("Özlem HEZER",2000.0,"20-08-2024");
       Employee emp2 = new Employee("Medine TIRAŞ",2000.3,"23-09-2024");
       Employee emp3 = new Employee("Betül TOPALOĞLU",2000.2,"22-09-2024");
       workers.add(emp1);
       workers.add(emp2);
       workers.add(emp3);
       System.out.println("Sorting by Salary");
       Collections.sort(workers, new SalaryComparator());
       Iterator itr = workers.iterator();
       while(itr.hasNext()){
           Employee w = (Employee)itr.next();
           System.out.println(w);
       }
       System.out.println("Sorted by hire date");
       Collections.sort(workers, new DateComparator());
       Iterator itr2 = workers.iterator();
       while(itr2.hasNext()){
           Employee w =(Employee)itr2.next();
           System.out.println(w);
       }
       
       
       
    }
    
}
