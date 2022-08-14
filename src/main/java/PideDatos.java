import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.IllegalFormatException;
import java.util.Scanner;

public class PideDatos {

    public static int pideEntero(String pregunta) {
        System.out.println(pregunta);
        int num = 0;
        boolean repite = true;
        while (repite) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String op = br.readLine();
                num = Integer.parseInt(op);
                repite = false;
            } catch (Exception a) {
                System.out.println("Tiene que ser un valor numérico. Prueba otra vez");
            }
        }

        return num;
    }

    public static int pideValorMinMax(int valorMinimo, int valorMaximo) {
        return pideValorMinMax(valorMinimo,valorMaximo,"Introduce el valor entre "+valorMinimo+" y "+valorMaximo);
    }
    public static int pideValorMinMax(int valorMinimo, int valorMaximo, String pregunta) {
        int valor = 0;
        do {
            valor = pideEntero(pregunta);
            if ((valor < valorMinimo) || (valor > valorMaximo)) {
                System.out.println("El valor debe ser un valor entre "
                        + valorMinimo + " y " + valorMaximo);
            }
        } while ((valor < valorMinimo) || (valor > valorMaximo));
        return valor;
    }

    public static String pideString(String txt) {
        System.out.println(txt);
        boolean repeat;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            repeat = false;
            try {
                return br.readLine();
            } catch (IOException ex) {
                repeat = true;
            }
        } while (repeat);
        return null;
    }

    public static Product pideProduct() {
        System.out.println("Elige una opcion entre Box, Hybrid o Flatbed");
        boolean repeat;
        Scanner scan = new Scanner(System.in);
        String option = scan.nextLine().toUpperCase().trim();

        do {
            repeat = false;
            try{

            if (option.equals(Product.BOX)) {
                System.out.println("Producto Box añadido a este opportunity");
                return Product.BOX;

            }else if (option.equals(Product.HYBRID)) {
                System.out.println("Producto Hybrid añadido a este opportunity");
                return Product.HYBRID;

            }else if (option.equals(Product.FLATBED)) {
                System.out.println("Producto Flatbed añadido a este opportunity");
                return Product.FLATBED;
            }

            }catch (Exception e){
                System.err.println("Elige una opcion entre Box, Hybrid o Flatbed");
                repeat = true;
            }
        } while (repeat);
        return null;
    }


}
