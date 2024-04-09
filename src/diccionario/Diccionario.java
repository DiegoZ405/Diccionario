
package diccionario;
import java.util.ArrayList;

public class Diccionario {


    public static void main(String[] args) {
       ArrayList<String> contrasenas = generarContrasenas();
        
        System.out.println("Total de contraseñas generadas: " + contrasenas.size());
        System.out.println("Contraseñas generadas:");
        int contador = 1;
        for (String contrasena : contrasenas) {
            System.out.println(contador + ". " + contrasena);
            contador++;
        }
    }
    
    public static ArrayList<String> generarContrasenas() {
        ArrayList<String> contrasenas = new ArrayList<>();
        
        // Generar todas las combinaciones posibles
        for (char c1 = 'a'; c1 <= 'z'; c1++) {
            for (char c2 = 'a'; c2 <= 'z'; c2++) {
                for (char c3 = 'a'; c3 <= 'z'; c3++) {
                    for (char c4 = 'a'; c4 <= 'z'; c4++) {
                        String contrasena = "" + c1 + c2 + c3 + c4;
                        contrasenas.add(contrasena);
                    }
                }
            }
        }
        
        // Agregar combinaciones con números
        for (char c1 = '0'; c1 <= '9'; c1++) {
            for (char c2 = '0'; c2 <= '9'; c2++) {
                for (char c3 = '0'; c3 <= '9'; c3++) {
                    for (char c4 = '0'; c4 <= '9'; c4++) {
                        String contrasena = "" + c1 + c2 + c3 + c4;
                        contrasenas.add(contrasena);
                    }
                }
            }
        }
        
        return contrasenas;
    }
}