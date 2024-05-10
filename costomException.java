package ExceptionHandelling;
class MyException extends Exception
{
    public MyException(String msg)
    {
       super(msg); 
    }
}
public class costomException {
    public static void main(String[] args) {
        int num1=6;
        int num2=-2;
        int res=0;
       
        try
        {
            if(num2<0)  
            {
               // System.out.println("Enter a valid number ...");
               Exception e = new MyException("Negative number");
               throw e;
            }
            else
            {
                res = num1/num2;
                System.out.println(res);
            }
        } 
        catch (Exception e) {
         
            System.out.println("Enter a valid number :"+e);
        }
        System.out.println(res);
    }
}
