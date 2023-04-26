import java.util.Scanner; // esto hay que importarlo para poder recibir datos por parte del usuario
public class App {
    public static void main(String[] args) throws Exception {
        // estos son los conceptos basicos de java oracle
        // llamar variables
        var name = "hola, darlyn";
        System.out.println(name);
        // condicionales
        // supongo que seran las mismas de todos los lenguajes, veamos
        int n1 = 5;
        int n2 = 9;

        if(n1 > n2){
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }
        // ahora vamos a hacer algo un poco mas complejo
        // ciclos
        for(int i = 0; i < 10; i++){
           System.out.println("hola mundo"); // esta linea es la salida, como el console.writeline de c# o el console.log de javascript 
        }
        // int num = 1;
        // while(num > 0){
        // } este while lo dejo vacio para que no se buguee
        // las variables y los tipos de datos se llaman igual que en c# 
        System.out.flush(); // segun chat gpt esto funciona para limpiar la consola como un console clear,
        // pero no reinicio, mas adelante sigo
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un texto: ");
            String inputText = scanner.nextLine();
            System.out.println("El texto ingresado es: " + inputText);
          } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
          }
          /*todo este trozo de codigo desde el line 29 es para ingresar datos por el usuario con la importacion del java scanner */

          Scanner sc = new Scanner(System.in); // con esto pides un numero entero
          System.out.println("1) [Calculadora]");
          System.out.println("2) [Eventos]");
          System.out.println("3) [Utiliarios]");
          System.out.println("4) [Salir]");
          int opt = sc.nextInt();
          sc.close(); // con esto cierras el proceso del scanner
          if(opt > 0){
            System.out.println("hola");
          }
        // hare un programa mas complejo que se encontrara en la carpeta projectoBasico
    }
}
