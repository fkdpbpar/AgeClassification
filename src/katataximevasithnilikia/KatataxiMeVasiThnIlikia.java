
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katataximevasithnilikia;

import java.util.Scanner;

/**
 *
 * @author 30694
 */
public class KatataxiMeVasiThnIlikia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Whats your name?");
        String name = input.next();
        System.out.println("ok " + name + " What's your age?");
        int age = input.nextInt();
        if (age<=0){//if only, if - else, if - else if
            System.out.println("not valid age");
        }
        if (age>=0 && age<=12){
            System.out.println("you are a kid");
            
        }
        if (age>=13 && age<=18){
        System.out.println("you are a teenager");
        }//ή πατάω else if (age>=19 && age<=119)
        if (age>=19 && age<=119){
             System.out.println("you are an adult");
        }
        if (age>=120){
            System.out.println("you are not serious");
        }
            
        }
    

}
