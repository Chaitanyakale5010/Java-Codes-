import java.util.*; 
public class Fibbonacii {
    public static int fibb(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        else
        {
            return fibb(n-1)+fibb(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to form Fibbonacii Series number ..:");
        int num=scan.nextInt();
       int res = fibb(num);
       System.out.println("The series uber is:"+res);
    }
}
