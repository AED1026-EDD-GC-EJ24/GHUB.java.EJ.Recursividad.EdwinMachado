package miPrincipal;

public class AppFactorial
{

    public static void menu() 
    {
        System.out.println("====================");
        System.out.println("      FACTORIAL      ");
        System.out.println("====================");
        System.out.println("Version Iterativa");
        int n=5;

        System.out.println("Factorial de " +n+ "!= " + factorial_ite(n));
        System.out.println("Factorial de " +n+ "!= " + factorial_rec(n));   
     }

     public static long factorial_ite(int n)
     {
        long fact=1;

        for(int i=0;i>0;i--)
        {
            fact=fact*i;
        }
     }
}