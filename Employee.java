/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication25;


public class Employee {
    private String name;
    private String Date;
    private double Salary;
    public Employee(){
        
    }
    public  Employee(String name,double Salary,String Date){
        this.name=name;
        this.Salary=Salary;
        this.Date=Date;
    }
    public String getName(){
        return this.name;
    }
    public String getDate(){
        return this.Date;
    }
    public double getSalary(){
        return this.Salary;
    }
    public String toString(){
        return "ad: "+this.getName()+" maaş: "+this.getSalary()+" işe alım tarihi: "+this.getDate();
    }
    
}
