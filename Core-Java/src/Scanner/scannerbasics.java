package Scanner;

import java.util.Scanner;

public class scannerbasics {

    public static void main(){

        Scanner sc=new Scanner(System.in);

        System.out.print("enter your age");
        int age=sc.nextInt();

        System.out.print("minimun age to vote");
        int minage=sc.nextInt();

        if(age<minage){
            System.out.println("you cant vote");
        }

        else{
            System.out.println("you are eligible to vote");
        }


        System.out.print("Hey its a good day");


    }


}
