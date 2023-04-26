import java.util.Scanner;
//import java.util.zip.DataFormatException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        menu();
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in); // con esto pides un numero entero
        System.out.println("1) [Calculadora]");
        System.out.println("2) [Eventos]");
        System.out.println("3) [Utiliarios]");
        System.out.println("4) [Salir]");
        int opt = sc.nextInt();
        sc.close();
        switch(opt){
            case 1:
                // System.out.println();
                Calculadora();
                break;
            case 2:
                Eventos();
                break;
            case 3:
                util();
                break;
            case 4:
                // salir
                salir();
                break;
            default :
                break;
        }
        
    }
    public static void Calculadora(){
        System.out.println("Hola estas en calculadora");
        System.out.println("que deseas hacer");
    }
    public static void Eventos() {
        System.out.println("hola estas en eventos");
        System.out.println("que deseas hacer");
    }
    public static void util(){
        System.out.println("hola estas en utiliarios");
        System.out.println("que deseas hacer");
    }
    public static void salir(){
        System.out.println("ADIOS . . .");
        
    }
}
