import java.util.ArrayList;
import java.util.List;

public class Mercader extends VendedorNPC{

    private List<Item> items;

    public Mercader(String nombre, String ciudad) {
        super(nombre, ciudad);
        this.items = new ArrayList<>();
    }

    @Override
    public int getMaxItems() {
        return 7;
    }

    @Override
    public void añadirItem(Item item) throws Exception {
        super.añadirItem(item);
        item.setPrecio((int) (item.getPrecio() * 1.04)); // Añadir impuesto del 4%
    }

}
