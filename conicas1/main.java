package conicas1;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Elipse elipse1 = new Elipse(3, 4);
        circunferencia_grupo1 circu1 = new circunferencia_grupo1(3, 23);
        hiperbole hiperbole1 = new hiperbole(3, 7);
        Parabola_Equipo2 parabola = new Parabola_Equipo2(2, 5, 6, 6, 9);
        //Menu principal---------------------------------------------------------------------------------------
        System.out.println("\n---------------Menu de conicas------------------");
        System.out.println("Calculo del area y perimetro de las siguientes figuras: ");
        System.out.println("1. Circunferencia  ");
        System.out.println("2. Elipse ");
        System.out.println("3. Hiperbole ");
        System.out.println("4. Parabola");
        System.out.print("Seleccione una de las opciones del menu: ");
        int opt = entrada.nextInt();

        switch (opt) {
            case 1 -> {
                System.out.println("\n----> CIRCUNFERENCIA");
                System.out.println("Circunferencia:" + circu1.area_cir());
            }
            case 2 -> {
                System.out.println("\n----> ELIPSE ");
                System.out.println("Elipse: " + elipse1.area_elipse());
            }

            case 3 -> {
                System.out.println("\n----> HIPERBOLE ");
                System.out.println("Hiperbole:"+ hiperbole1.variables());
            }
            case 4 -> {
                System.out.println("\n----> PARABOLA ");
                System.out.println("Parabola:"+ parabola.Parabola_Equipo2_ImpVer());

            }
        }
    }
}

