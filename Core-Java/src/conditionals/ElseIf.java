package conditionals;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
         System.out.print("enter the marks of the student");
         int marks=sc.nextInt();

         if(marks>90){
             System.out.print("Student Scored Grade A+");
         } else if (marks>80 && marks<90) {
             System.out.print("Student Scored Grade A");

         }else if (marks>70 && marks<80) {
             System.out.print("Student Scored Grade B+");

         }else if (marks>60 && marks<70) {
             System.out.print("Student Scored Grade B");

         }else if (marks>35 && marks<60) {
             System.out.print("Student is passed with low grade");

         }else if (marks<35) {
             System.out.print("Student has to reattempt the exam");

         }

         sc.close();

    }



}
