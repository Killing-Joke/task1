/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet1full;
import java.util.Scanner;
/**
 *
 * @author mohamed tarek
 */
public class Sheet1full {

    public static void main(String[] args) {
    	int d,r,p,cost;
        System.out.println("Enter distance of the commute in miles ");
        Scanner in = new Scanner(System.in);
    	d= in.nextInt();
        System.out.println("the automobile’s fuel consumption rate in miles per gallon");
    	r=in.nextInt();
        System.out.println("price of a gallon of gas ");
        p=in.nextInt();
        cost= (p/r)*d;
        System.out.println(cost);
    }
    }
    
