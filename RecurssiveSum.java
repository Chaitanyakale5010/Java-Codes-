import java.util.*;

public class RecurssiveSum {
    public static int SumOfNaturalNums(int num)
    {
        int sum=0;
        if(num<0)
        {
            return 0;
        }
        else
        {
             sum = num +SumOfNaturalNums(num-1);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to find sum of n natural numbers :");
        int num =  scan.nextInt();
        int result=SumOfNaturalNums(num);
        System.out.println("The sum of natural numbers upto "+ num+" is:"+result);
    }
}
