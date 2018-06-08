/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parameter_of_circle;

import java.util.Scanner;


public class Parameter_of_circle {

    
    public static void main(String[] args) {
       
        double r, p;
        
        Scanner scn =new Scanner(System.in);
        
        System.out.println("Enter the Radius OF circle:");
        r =scn.nextDouble();
        
        p =2*3.14*r;
        
        System.out.println("parimeter of cricle is:" + p);
    }
    
}
