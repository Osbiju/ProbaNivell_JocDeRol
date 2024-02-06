import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorApp {
    static Scanner entrada = new Scanner(System.in);

    private static List<VendedorNPC> vendedorNPCList;
    private static List<Item> itemList;
    private static List<Jugador> jugadorList;

    public GestorApp() {
        this.vendedorNPCList = new ArrayList<>();
        this.itemList = new ArrayList<>();
    }

    public static void crearNPC() {
        int opcio = 0;
        String nombre = "";
        String ciudad = "";

        System.out.println("Dime el nombre");
        nombre = entrada.next();
        System.out.println("Dime la ciudad");
        ciudad = entrada.next();

        System.out.println("Escoje que tipo de NPC quieres crear:" +
                "\n1. Campesino" +
                "\n2. Ladron" +
                "\n3. Mercader" +
                "\n4. Salir");
        opcio = entrada.nextInt();

        switch (opcio) {
            case 1:
                VendedorNPC campesino = new Campesino(nombre, ciudad);
                vendedorNPCList.add(campesino);
                System.out.println("Campesino creado correctamente\r\n");
                break;
            case 2:
                VendedorNPC ladron = new Ladron(nombre, ciudad);
                vendedorNPCList.add(ladron);
                System.out.println("Ladron creado correctamente\r\n");
                break;
            case 3:
                VendedorNPC mercader = new Mercader(nombre, ciudad);
                vendedorNPCList.add(mercader);
                System.out.println("Mercader creado correctamente\n\n");
                break;
            case 4:
                System.out.println("Saliendod de crear NPC\n\n");
                break;
            default:
                System.out.println("Escoje una opcion valida\n\n");
        }

    }

    public static Item crearItem() {
        int estado = 0;
        String nomItem;
        String tipo;
        int precio;

        System.out.println("Nombre del Item?");
        nomItem = entrada.next();
        System.out.println("De que tipo es el item?");
        tipo = entrada.next();
        precio = 0;

        Item item = new Item(nomItem, tipo, precio, estado);
        System.out.println("Item creado correctamente");
        itemList.add(item);
        return item;
    }

    public static void añadirItemNPC() {
        int NPC = 0;
        int item = 0;

        System.out.println("Escoje con numero el NPC");
        vendedorNPCList.forEach(System.out::println);
        NPC = entrada.nextInt() - 1;

        System.out.println("Escoje el item");
        itemList.forEach(System.out::println);
        item = entrada.nextInt() - 1;

        try {
            vendedorNPCList.get(NPC).añadirItem(itemList.get(item));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void crearJugador() {
        String nombre = "";

        System.out.println("Introduce el nombre del jugador");
        nombre = entrada.next();

        Jugador jugador = new Jugador(nombre);
        jugadorList.add(jugador);
        System.out.println("Jugador creado correctamente");
    }

    public static void comprarItem(){
        int NPC = 0;
        int item = 0;

        System.out.println("Escoje con numero el NPC");
        vendedorNPCList.forEach(System.out::println);
        NPC = entrada.nextInt() - 1;

        vendedorNPCList.get(NPC).mostrarItems();

        System.out.println("Escoje el item");
        vendedorNPCList.get(NPC).getItems().forEach(System.out::println);
        item = entrada.nextInt() - 1;

        jugadorList.get(0).comprarItem(vendedorNPCList.get(NPC),vendedorNPCList.get(NPC).getItems().get(item));

        System.out.println("Item comprat correctament");

    }

    public static void mostrarItemMasBarato(){

    }

    public static void consultarItemsJugador(){
        List<Item> item = jugadorList.get(0).getInventario();

        item.forEach(System.out::println);

    }

    public static void consultarItemsNPC(){
        List<Item> items = vendedorNPCList.get(0).getItems();
        items.forEach(System.out::println);
    }
}
