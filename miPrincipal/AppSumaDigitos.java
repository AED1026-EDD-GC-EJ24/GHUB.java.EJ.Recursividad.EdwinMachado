package miPrincipal;

import java.util.Scanner;

public class AppSumaDigitos
{
    public static void menu() {
        System.out.println("===================");
        System.out.println("  SUMA DIGITOS");
        System.out.println("===================");
        Scanner Scanner = new Scanner(System.in);

        System.out.println("proporciona numero: ");
        int n = Scanner.nextInt();
        System.out.println("Version iterativa");
        System.out.println("Resultado = " + sumaDigitosIte(n));
    }

    public static  sumaDigitosIte(int n)
    {
        int suma =0;
        while (n>0)
        {
            suma = suma + n%10;
            n=n/10;
        }
         return (suma +n);
    }

    public static int sumaDigitosRec(int n)
    {
        if(n<=0)
        {
            return n;
        }
        else
        {
            return sumaDigitosRec(n/10) + n%10;
        }
    }
}