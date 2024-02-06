import java.util.ArrayList;
import java.util.List;

public class Ladron extends VendedorNPC implements RestaurarItem{
    private List<Item> items;

    public Ladron(String nombre, String ciudad) {
        super(nombre, ciudad);
        this.items = new ArrayList<>();
    }

    @Override
    public int getMaxItems() {
        return 3;
    }

    @Override
    public void añadirItem(Item item) throws Exception {
        super.añadirItem(item);
        item.setEstado((int) (item.getEstado() * 0.75)); // Deteriorar el estado del ítem un 25%
    }

    @Override
    public void restaurarItem(Item item) {
        item.setEstado((int) (item.getEstado() * 1.10)); // Restaurar el estado del ítem un 10%
    }
}
