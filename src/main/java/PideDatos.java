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
                System.err.println("Tiene que ser un valor numérico. Prueba otra vez");
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
                System.err.println("El valor debe ser un valor entre "
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


    public static int pideValorMinMaxCamiones(int valorMinimo, int valorMaximo) {
        return pideValorMinMax(valorMinimo,valorMaximo,"Cuántos camiones quiere comprar? ");
    }
    public static int pideValorMinMaxCamiones(int valorMinimo, int valorMaximo, String pregunta) {
        int valor = 0;
        do {
            valor = pideEntero(pregunta);
            if ((valor < valorMinimo) || (valor > valorMaximo)) {
                System.err.println("El valor debe ser un valor entre "
                        + valorMinimo + " y " + valorMaximo);
            }
        } while ((valor < valorMinimo) || (valor > valorMaximo));
        return valor;
    }

    public static int pideValorMinMaxEmpleados(int valorMinimo, int valorMaximo) {
        return pideValorMinMax(valorMinimo,valorMaximo,"Cuántos empleados tiene? ");
    }
    public static int pideValorMinMaxEmpleados(int valorMinimo, int valorMaximo, String pregunta) {
        int valor = 0;
        do {
            valor = pideEntero(pregunta);
            if ((valor < valorMinimo) || (valor > valorMaximo)) {
                System.err.println("El valor debe ser un valor entre "
                        + valorMinimo + " y " + valorMaximo);
            }
        } while ((valor < valorMinimo) || (valor > valorMaximo));
        return valor;
    }

    public static Product pideProduct(){
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        do {
            try {
                System.out.println("Elige una opcion entre Box, Hybrid o Flatbed");
                String option = scan.nextLine().toUpperCase().trim();

                switch (option) {
                    case "BOX":
                        return Product.BOX;
                    case "HYBRID":
                        return Product.HYBRID;
                    case "FLATBED":
                        return Product.FLATBED;
                    default:
                        System.err.println("You have to select an appropriate option.");
                        exit = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                scan.next();
            }
        } while (!exit);
        return pideProduct();
    } //ESTÁ PERFECT!

    public static Industry pideIndustry(){
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        do {
            try {
                System.out.println("Elige una opcion entre PRODUCE, ECOMMERCE, MANUFACTURING, MEDICAL, OTHER");
                String option = scan.nextLine().toUpperCase().trim();

                switch (option) {
                    case "PRODUCE":
                        System.out.println("Ha elegido PRODUCE.");
                        return Industry.PRODUCE;
                    case "ECOMMERCE":
                        System.out.println("Ha elegido ECOMMERCE.");
                        return Industry.ECOMMERCE;
                    case "MANUFACTURING":
                        System.out.println("Ha elegido MANUFACTURING.");
                        return Industry.MANUFACTURING;
                    case "MEDICAL":
                        System.out.println("Ha elegido MEDICAL.");
                        return Industry.MEDICAL;
                    case "OTHER":
                        System.out.println("Ha elegido OTHER.");
                        return Industry.OTHER;
                    default:
                        System.err.println("You have to select an appropriate option.");
                        exit = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                scan.next();
            }
        } while (!exit);
        return pideIndustry();
    }


}
