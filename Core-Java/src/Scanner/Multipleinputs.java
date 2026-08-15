package Scanner;

import java.util.Scanner;

public class Multipleinputs {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("enter your name :");

        String name=sc.nextLine();

        System.out.print("enter your age :");
        int age=sc.nextInt();

        System.out.print("enter you Qualification");
        String edu=sc.next();

        System.out.print("enter you Qualification marks");
        double marks=sc.nextDouble();

        System.out.println("you name is :"+name);
        System.out.println("your age is :"+age);
        System.out.println("you qualification is :"+edu);

        System.out.println("your score is :"+marks);




    }

}
