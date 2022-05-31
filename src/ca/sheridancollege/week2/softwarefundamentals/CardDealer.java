/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author Sameh Jadda, 2022, 
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card obj = new Card("Diamond", 9);
        Card nineClubs = new Card("Clbs", 9);
        
        nineClubs.setSuit("diamonds");
        System.out.println(obj);//print the object
        
    }
}
