/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication23;

import java.util.ArrayList;
import java.util.Collections;

/*1. Consider a Movie class that has members like, rating, name, year. Functions of the class:
public double getRating() 
public String getName()   
public int getYear()*/

/*Suppose we wish to sort a list of Movies based on year of release. 
We can implement the Comparable interface with the Movie class, and 
we override the method compareTo() of Comparable interface.*/
public class JavaApplication23 {

    
    public static void main(String[] args) {
       ArrayList<Movie> diziler=new ArrayList<Movie>();
       diziler.add(new Movie("Force Awakens",8.3,2015));
       diziler.add(new Movie("Star Wars",8.7,1977));
       diziler.add(new Movie("Empire Strikes Back",8.8,1980));
       diziler.add(new Movie("Return of the Jedi",8.4,1983));
       System.out.println("Sorted by year");
       Collections.sort(diziler);
       for(Movie m:diziler){
           System.out.println(m);
       }
       RatingCompare ratingCompare = new RatingCompare();
       Collections.sort(diziler,ratingCompare);
       System.out.println("Sorted by rating");
       for(Movie m:diziler){
           System.out.println(m);
       }
       NameCompare nameCompare = new NameCompare();
       Collections.sort(diziler,nameCompare);
       System.out.println("Sorted by Name");
       for(Movie m:diziler){
           System.out.println(m);
       }
    }
    
}
