import java.util.*;
public class oneToN {
    public static void Recursion(int n)
    {
        if(n>0)
        {
            Recursion(n-1); 
           System.out.print(n+" ");
           
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a statring number ");
        int n = sc.nextInt();
        Recursion(n);

    }
}
