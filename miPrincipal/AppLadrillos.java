package miPrincipal;
public class AppLadrillos
{
    public static void menu() {
        for(int i=0; i<10;i++)
        {
           dibujarHilera();
        }

        dibujarPared();
    }



    public static void dibujarPared()
    {

        dibujarPared();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
    }

    public static void dibujarHilera() 
    {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
    }
}