import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private static List<Item> itemsComprados;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.itemsComprados = new ArrayList<Item>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Item> getInventario() {
        return itemsComprados;
    }

    public void comprarItem(VendedorNPC vendedor, Item item) {
        itemsComprados.add(item);
        vendedor.getItems().remove(item);
    }
}
