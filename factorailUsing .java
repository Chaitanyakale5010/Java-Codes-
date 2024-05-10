import java.util.*;
public class factorailUsing {
    public static int factorialNum(int num)
    {
        int result=0;
        if(num==0 || num==1)
        {
            return 1;
        }
        else
        {
             result=num*factorialNum(num-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        if(num<0)
        {
            num=num*(-1);
        }
        int result =factorialNum(num);
        System.out.println("Factorial of the number is : "+result);
    }
}
