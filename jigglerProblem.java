import java.util.*;

//import javax.xml.transform.Source;
public class JugglerProblem {
  public static List<Integer> Juggler(int n)
  {
    List<Integer> l = new ArrayList<Integer>();
    l.add(n);
    if(n==1)
    {
        return l;
    }
    else
    {
        if(n%2==0)
        {
            n=n/2;
        }
        else
        {
            n=(n*3)+1;
        }
        System.out.print(n+" ");
        Juggler(n);
    }
    return l;

  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
       List<Integer> l =  Juggler(n);
       System.out.println(l);    
    }
}
