package mp1;

import java.util.Scanner;

public class MAin {
    public static void main(String[] args){

        short item = -1;

        Scanner sc = new Scanner(System.in);

        System.out.print("1-sqrt of triangle \n 2-sqrt of rectangle \n");
        item = sc.nextShort();

        double h, a, S = 0;
        if(item == 1){
            System.out.print("Enter height and footing of triangle: ");
            h = sc.nextDouble();
            a = sc.nextDouble();
            S = 0.5*h*a;
        }else if(item == 2){
            System.out.print("Enter all sides of rectangle: ");
            h = sc.nextDouble();
            a = sc.nextDouble();
            S = h*a;
        }

        System.out.println("Sqrt is: " + S);

        sc.close();
        }
    }

