/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day1;

/**
 *
 * @author Diana
 */
public class Square {
    private double length;
    private String color;
    
    //izveidojam objektu - Kvadrāts
    public Square(double length, String color)
    {
        this.color = color;
        this.length = length;
        
    }
    //nosakam aprēķināmos lielumus
    public double getArea(){
        return length*length;              
    }
    
    public double getPerimeter(){
        return length*4;
    }
    
    public String getColor(){
        return this.color;
    }
}
    

