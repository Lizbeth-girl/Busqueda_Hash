/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.metododebusqueda;
 import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class Metododebusqueda {

    public static void main(String[] args) {
        HashMap<String, String> tablaHash = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            limpiarConsola();
            System.out.println("===== MENÚ DE OPERACIONES =====");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Buscar elemento por clave");
            System.out.println("3. Eliminar elemento por clave");
            System.out.println("4. Mostrar todos los elementos");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la clave: ");
                    String clave = scanner.nextLine();
                    System.out.print("Ingrese el valor: ");
                    String valor = scanner.nextLine();
                    tablaHash.put(clave, valor);
                    System.out.println("Elemento agregado correctamente.");
                    pausa(scanner);
                    break;

                case 2:
                    System.out.print("Ingrese la clave a buscar: ");
                    String claveBuscada = scanner.nextLine();
                    if (tablaHash.containsKey(claveBuscada)) {
                        System.out.println("Valor encontrado: " + tablaHash.get(claveBuscada));
                    } else {
                        System.out.println("Clave no encontrada.");
                    }
                    pausa(scanner);
                    break;

                case 3:
                    System.out.print("Ingrese la clave a eliminar: ");
                    String claveEliminar = scanner.nextLine();
                    if (tablaHash.containsKey(claveEliminar)) {
                        tablaHash.remove(claveEliminar);
                        System.out.println("Elemento eliminado.");
                    } else {
                        System.out.println("Clave no encontrada.");
                    }
                    pausa(scanner);
                    break;

                case 4:
                    if (tablaHash.isEmpty()) {
                        System.out.println("La tabla hash está vacía.");
                    } else {
                        System.out.println("Elementos en la tabla:");
                        for (String k : tablaHash.keySet()) {
                            System.out.println("  " + k + " → " + tablaHash.get(k));
                        }
                    }
                    pausa(scanner);
                    break;

                case 5:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println(" Opción inválida. Intenta nuevamente.");
                    pausa(scanner);
            }

        } while (opcion != 5);

        scanner.close();
    }

    // Método para simular limpieza de consola
    public static void limpiarConsola() {
        for (int i = 0; i < 40; i++) System.out.println();
    }

    // Método para pausar hasta que el usuario presione Enter
    public static void pausa(Scanner scanner) {
        System.out.print("\nPresiona Enter para continuar...");
        scanner.nextLine();
    }
    }

