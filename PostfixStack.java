/**
 * Clase PostfixStach para evaluar expresiones matemáticas en formato Postfix.
 * Lee expresiones desde un archivo y utiliza una pila para evaluarlas.
 * Fernando Hernandez-23645
 * Nicolas Concua-23197
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PostfixStack{
        /**
     * El punto de entrada principal del programa.
     * Lee el archivo "datos.txt" y evalúa las expresiones contenidas en él.
     *
     * @param args Argumentos pasados al programa (no utilizados).
     */
    public static void main(String[] args) {
        // Crea una nueva pila
        MyStack<Integer> stack = new MyStack<>();
        String line;
        // Lee el archivo línea por línea
        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            while ((line = br.readLine()) != null) {
                // Divide la línea en tokens separados por espacios
                for (String token : line.split(" ")) {
                    if (token.matches("\\d+")) { // Si es un número
                        stack.push(Integer.parseInt(token));
                    } else { // Si es un operador
                        int a = stack.pop();
                        int b = stack.pop();
                        switch (token) {
                            // Realiza la operación correspondiente
                            case "+":
                                stack.push(b + a);
                                System.out.println("Suma: " + stack.top());
                                break;
                            case "-":
                                stack.push(b - a);
                                System.out.println("Resta: " + stack.top());
                                break;
                            case "*":
                                stack.push(b * a);
                                System.out.println("Multiplicacion: " + stack.top());
                                break;
                            case "/":
                                stack.push(b / a);
                                System.out.println("Division: " + stack.top());
                                break;
                        }
                    }
                }
                System.out.println("\nResultado: " + stack.pop() + "\n");
            }
        } catch (IOException e) {
            // Imprime el error en caso de que ocurra
            System.out.println(e.getMessage());
        }
    }
}