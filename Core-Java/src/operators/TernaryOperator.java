package operators;

public class TernaryOperator {

    public static void main(){

        int marks=85;

        String result = (marks >= 35) ? "pass" : "fail";
        System.out.println(result);

        int num=8;

        int ans= (num%2==0) ? 0 : 1; //0 = even 1=odd
        System.out.print(ans);
    }

}
