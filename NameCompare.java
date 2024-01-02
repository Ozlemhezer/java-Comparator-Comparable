/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication23;

import java.util.Comparator;


public class NameCompare implements Comparator<Movie>{
    @Override
    public int compare(Movie m1,Movie m2){
        return m1.getName().compareTo(m2.getName());
    }
}
