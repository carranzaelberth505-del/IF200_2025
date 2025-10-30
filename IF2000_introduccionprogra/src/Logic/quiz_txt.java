/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;
 import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Lenovo X1
 */
public class quiz_txt {
   
public class QuizRegistroPersona {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Registro de Persona ===");

        String nombre = leerNoVacio(sc, "Ingrese nombre completo: ");
        String id = leerNoVacio(sc, "Ingrese identificación (cédula o ID): ");
        int edad = leerEnteroPositivo(sc, "Ingrese edad: ");
        String correo = leerEmailValido(sc, "Ingrese correo electrónico: ");
        String telefono = leerTelefonoValido(sc, "Ingrese teléfono: ");

        // Fecha y hora actual
        LocalDateTime fechaHora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String fechaFormateada = fechaHora.format(formatter);

        // Formato del registro
        String linea = String.format("%s|%s|%d|%s|%s|%s",
                nombre, id, edad, correo, telefono, fechaFormateada);

        // Guardar en archivo
        guardarLinea(linea);

        System.out.println("Registro guardado en personas.txt");

        sc.close();
    }

    public static String leerNoVacio(Scanner sc, String prompt) {
        String entrada;
        while (true) {
            System.out.print(prompt);
            entrada = sc.nextLine().trim();
            if (!entrada.isEmpty()) {
                return entrada;
            } else {
                System.out.println("Error: el campo no puede estar vacío.");
            }
        }
    }

    public static int leerEnteroPositivo(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String entrada = sc.nextLine().trim();
            try {
                int valor = Integer.parseInt(entrada);
                if (valor > 0) {
                    return valor;
                } else {
                    System.out.println("Error: la edad debe ser un número positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar un número válido.");
            }
        }
    }

    public static String leerEmailValido(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String correo = sc.nextLine().trim();
            if (correo.contains("@") && correo.length() > 3) {
                return correo;
            } else {
                System.out.println("Error: correo inválido (debe contener '@').");
            }
        }
    }

    public static String leerTelefonoValido(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String telefono = sc.nextLine().trim();
            if (telefono.matches("\\d{8,}")) {
                return telefono;
            } else {
                System.out.println("Error: el teléfono debe contener solo dígitos y tener al menos 8 caracteres.");
            }
        }
    }

    public static void guardarLinea(String linea) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("personas.txt", true))) {
            bw.write(linea);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}

}
