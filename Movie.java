/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication23;

import java.util.Comparator;


class Movie implements Comparable<Movie>{
    private double rating;
    private String name;
    private int year;
    Movie(String name,double rating,int year){
        this.name=name;
        this.rating=rating;
        this.year=year;
    }
    public double getRating(){
        return this.rating;
    }
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    @Override
    public int compareTo(Movie m){
        return year-m.year;
    }
    
    @Override
    public String toString(){
        return getName() +" "+ getYear()+" "+ getRating()+" ";
    }
    
}


