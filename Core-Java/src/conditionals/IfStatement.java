package conditionals;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("enter the age of the candidate");
        int age=sc.nextInt();


        if(age>=18){
            System.out.println("you are eligible to vote");
        }

        System.out.print("program is completed");
        sc.close();


    }

}
