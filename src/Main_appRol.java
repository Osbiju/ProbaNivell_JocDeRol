import java.util.Scanner;

public class Main_appRol {
    static Scanner entrada = new Scanner(System.in);
    static GestorApp gestorApp = new GestorApp();

    public static void main(String[] args) {


        int opcio = 0;


        do {
            System.out.println("Bienvenido, selecciona una de las sigueintes opciones:" +
                    "\n1. Crear NPC" +
                    "\n2. Crear item" +
                    "\n3. Añadir item al inventario de un NPC" +
                    "\n4. Crear Jugador" +
                    "\n5. Comprar Item (desde Jugador)" +
                    "\n6. Mostrar el item mas barato de toso los vendedores de una ciudad" +
                    "\n7. Consultar los items de un NPC" +
                    "\n8. Restaurar un item" +
                    "\n9. Consultar items de un Jugador" +
                    "\n10. Consultar todos los vendedores que hay en una ciudad" +
                    "\n11. Mostrar todos los items de un determinado tipo ordenados por precio ASC " +
                    "\n12. Sortir.");
            opcio = entrada.nextInt();

            switch (opcio){
                case 1:
                    gestorApp.crearNPC();
                    break;
                case 2:
                    gestorApp.crearItem();
                    break;
                case 3:
                    gestorApp.añadirItemNPC();
                    break;
                case 4:
                    gestorApp.crearJugador();
                    break;
                case 5:
                    gestorApp.comprarItem();
                    break;
                case 6:
                    //mostrarItemMasBarato();
                    break;
                case 7:
                    gestorApp.consultarItemsNPC();
                    break;
                case 8:
                    //restaurarItem();
                    break;
                case 9:
                    gestorApp.consultarItemsJugador();
                    break;
                case 10:
                    //consultarVendedores();
                    break;
                case 11:
                    //mostrarItemsPorPrecio();
                    break;
                case 12:
                    System.out.println("Adios, gracias.");
                    break;
                default:
                    System.out.println("Error, escoje una opcion valida");
            }

        }while (opcio != 12);

    }




}
