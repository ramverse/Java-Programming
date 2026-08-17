package conditionals;

import java.util.Scanner;

public class IfelseStatement {

    public static void main(String[] arg){

        int agerequired=18;


        Scanner sc=new Scanner(System.in);
        System.out.print("enter the age of the candidate");
        int age=sc.nextInt();

        if(age>=agerequired){
            System.out.println("Candidate is eligible to vote");
        }

        else{
            System.out.print("candidate cant vote");
        }

        sc.close();

    }

}
