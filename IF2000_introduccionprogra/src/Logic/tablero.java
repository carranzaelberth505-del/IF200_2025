/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;
 import java.util.Scanner;
/**
 *
 * @author Lenovo X1
 */
public class tablero {
    static char[][] tablero = new char[8][8];
    static char turno = 'R';

    public static void main(String[] args) {
        inicializarTablero();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (true) {
            mostrarTablero();
            System.out.println("Turno: " + turno);
            System.out.print("Fila origen: ");
            int fo = sc.nextInt();
            System.out.print("Columna origen: ");
            int co = sc.nextInt();
            System.out.print("Fila destino: ");
            int fd = sc.nextInt();
            System.out.print("Columna destino: ");
            int cd = sc.nextInt();

            if (esMovimientoValido(fo, co, fd, cd)) {
                tablero[fd][cd] = tablero[fo][co];
                tablero[fo][co] = '.';
                turno = (turno == 'R') ? 'B' : 'R';
                System.out.println("Movimiento realizado.");
            } else {
                System.out.println("Movimiento no valido.");
            }
        }
    }

    static void inicializarTablero() {
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                tablero[i][j] = '.';

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 8; j++)
                if ((i + j) % 2 == 1)
                    tablero[i][j] = 'B';

        for (int i = 5; i < 8; i++)
            for (int j = 0; j < 8; j++)
                if ((i + j) % 2 == 1)
                    tablero[i][j] = 'R';
    }

    static void mostrarTablero() {
        System.out.print("  ");
        for (int i = 0; i < 8; i++)
            System.out.print(i + " ");
        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean esMovimientoValido(int fo, int co, int fd, int cd) {
        if (fo < 0 || fo > 7 || co < 0 || co > 7 || fd < 0 || fd > 7 || cd < 0 || cd > 7)
            return false;
        if (tablero[fo][co] != turno)
            return false;
        if (tablero[fd][cd] != '.')
            return false;
        if (Math.abs(cd - co) != 1)
            return false;
        if (turno == 'R' && fd != fo - 1)
            return false;
        if (turno == 'B' && fd != fo + 1)
            return false;
        return true;
    }
}

 

