import java.util.*;
public class PowerOFNumber {
    public static int PowerOfElement(int a,int b)
    {
        int result=0;
        if(b==0)
        {
            return 1;
        }
        else
        {
             result=a*(PowerOfElement(a, b-1));
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("enter a value for A :");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter value for B:");
        int b=sc.nextInt();
       int result= PowerOfElement(a,b);
        System.out.println("The power of "+a+" to "+b+" is: "+result);
    }
}
