package com.Loading;

import java.util.Scanner;

public class Main {
    void switch1(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your roll number");
        int roll=scanner.nextInt();

        switch (roll){
            case 101:
                System.out.println("You are Admin");
                break;
            case 102:
                System.out.println("You are Teacher");
                break;
            case 103:
                System.out.println("You are Accountant");
                break;
            default:
                System.out.println("You are Student");
        }

    }


    public static void main(String[] args) {
	Main m1=new Main();
	m1.switch1();
    }
}
