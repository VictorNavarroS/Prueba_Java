package prueba_1;

import java.util.Random;
import java.util.Scanner;

public class PRUEBA_1 {

    public static void main(String[] args) {
//1- cree un metodo q retorne un numero aleatorio, cuyo largo maximo sera recibido como parametro ej, si recibe 3 el numero maximo q se puede generar es 999(hasta los tres digitos)
//2- cree un metodo privado q reciba un num por aprametro y cada digito lo transfiera a una posicion de un vector q debe ser creado del largo q posea el num (cantidad d edigitos), luego muestre por consola todos los elementos
//3- cree un metodo q reciba un num q indicara la cantidad de elementos de un vector que generara y lo llenara con nums de la secuencia de fibonacci, luego imprima los resultados del vector
//4- cree un metodo q reciba un num por parametro q indicara la cantidad de elementos q poseera un vector, luego llenara cada elemento con nums aleatorios en tre el 0 u 9m y retornara un string con la concatenacopmn de todos los digitos
        Scanner teclado = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        PRUEBA_1 aleatorio = new PRUEBA_1();
        int digitos = 3;
        String largo = "";

        int num2 = 12345678;
        PRUEBA_1 cantidad = new PRUEBA_1();
        cantidad.CantidadDigitos(num2);

        int num3 = 12;
        PRUEBA_1 x = new PRUEBA_1();
        x.Fibonacci(num3);

        int num4 = 5;
        PRUEBA_1 z = new PRUEBA_1();
        z.Concatenacion(num4);
    }

// ejercicio 1
    public int NumAleatorio(int digitos) {
        Random rnd = new Random();
        String largo = "";
        largo.length();
        int num1 = rnd.nextInt(digitos);
        return num1;
    }

    // ejercicio 2
    private void CantidadDigitos(int num2) {
        String texto = "" + num2;
        String[] vector1 = new String[num2];
        for (int i = 0; i < texto.length(); i++) {
            vector1[i] = "" + texto.charAt(i);
            System.out.println(vector1[i]);
        }
    }
// ejercicio 3

    public void Fibonacci(int num3) {        
        int[] fibonacci = new int[num3];
        fibonacci[0] = 0;
        System.out.println(fibonacci[0]);
        if (num3 > 1) {
            fibonacci[1] = 1;
            System.out.println(fibonacci[1]);
            for (int i = 2; i < num3; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                System.out.println(fibonacci[i]);
            }
        }
    }
// ejercicio 4    

    public String Concatenacion(int num4) {
        Random random = new Random();
        String texto = "";
        int[] concatenacion = new int[num4];
        for (int i = 0; i < num4; i++) {
            concatenacion[i] = random.nextInt(10);
            texto = texto + concatenacion[i];
        }
        return texto;
    }
}
