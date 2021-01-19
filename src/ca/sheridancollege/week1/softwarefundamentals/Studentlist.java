/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author aeghn
 */
public class Studentlist {
    
    
   public static void main (String[]args){
   
       Student [] myList = new Student[5];
       
       
   for(int i=0; i<= myList.length-1 ; i++){
   
    myList[i] =new Student();
    myList[i].setName("student"+ (i+1)); 
   }
   
    
    for(Student names : myList){
  System.out.println("the student name is:"+ names.getName()); 
   
   
   
   }
   
   
   
   
   
   
   
   
   } 
    
}
