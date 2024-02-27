package miPrincipal;
import java.util.Scanner;
public class AppNaturales{
    public static void menu() {
        Scanner Leer = new Scanner(System.in);

        System.out.println("=====================");
        System.out.println("Numeros naturales");

        System.out.println("proporciona numero");
        int n = Leer.nextInt();

        System.out.println("Version Iterativa");
        muestraNaturalesIte(n);

        System.out.println("Version Recursiva");
        muestraNaturalesRec(n);
    }


    public static void muestraNaturalesIte(int n)
    {
        for (int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }


    public static void muestraNaturalesRec(int n)
    {
        if(n>0)
        {
            muestraNaturalesRec(n-1);
            System.out.println(n);
        }
    }
}