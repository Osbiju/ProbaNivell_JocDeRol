import java.util.ArrayList;
import java.util.List;

public class Campesino extends VendedorNPC implements RestaurarItem{
    private List<Item> items;


    public Campesino(String nombre, String ciudad) {
        super(nombre, ciudad);
        this.items = new ArrayList<>();
    }

    @Override
    public int getMaxItems() {
        return 5;
    }

    @Override
    public void añadirItem(Item item) throws Exception {
        super.añadirItem(item);
        item.setPrecio((int) (item.getPrecio() * 1.02)); // Añadir impuesto del 2%
        item.setEstado((int) (item.getEstado() * 0.85)); // Deteriorar el estado del ítem un 15%
    }


    @Override
    public void restaurarItem(Item item) {
        item.setEstado((int) (item.getEstado() * 1.15));
    }
}
