import java.util.*;
public class OneTON {
    public static void recursion(int n)
    {
        if(n<1)
        {
            return;
        }
        else
        {
            System.out.println(n);
            recursion(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number:");
        int n=sc.nextInt();       
        recursion(n);
    }
}
