import java.util.Scanner; // esto hay que importarlo para poder recibir datos por parte del usuario

public class App {
    public static void main(String[] args) throws Exception {
        // aqui hare el programa clasico de la calculadora pero lo hare en una funcion
        // si quiere calcular o salir

        // System.out.println("Bienvenido\n");
        // Scanner scanner = new Scanner();
        // System.out.println("Ingrese el texto: ");
        // String text = Scanner.nextLine();
        // System.out.println("el texto dice: " + text);
        System.out.flush(); // segun chat gpt esto funciona para limpiar la consola como un console clear,
        // pero no reinicio, mas adelante sigo
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un texto: ");
            String inputText = scanner.nextLine();
            System.out.println("El texto ingresado es: " + inputText);
          } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
          }
          /*todo este trozo de codigo desde el line 15 es para ingresar datos por el usuario con la importacion del java scanner */
    }
}
