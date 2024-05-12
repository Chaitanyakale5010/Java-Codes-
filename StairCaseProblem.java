import java.util.*;
public class StairCaseProblem {
    public static int StairCase(int n)
    {
        int result=0;
        if(n<=1)
        {
            return n;
        }
        else
        {
            result=StairCase(n-1)+StairCase(n-2);
        }
        return result;        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of stairs:");
        int n=sc.nextInt();
        int res=StairCase(n+1);
        System.out.println("The number of ways are :"+res);
    }
}
