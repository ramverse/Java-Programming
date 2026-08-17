package conditionals;
import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("enter the age of the candidate");
        int age=sc.nextInt();



        if(age>=18){

            System.out.print("state if the voter has an voting id");
            boolean ans=sc.nextBoolean();
            if(ans==true){
                System.out.print("you are eligible to vote");
            }
            else{
                System.out.print("Generate an voting id to vote");
            }
        }
        else{
            System.out.println("you are not eligible to vote ");
        }

        sc.close();
    }
}
