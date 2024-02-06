import java.util.ArrayList;
import java.util.List;

public abstract class VendedorNPC {
    protected String nombre;
    protected String ciudad;

    private static List<Item> items;

    public VendedorNPC(String nombre, String ciudad){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.items = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public List<Item> getItems() {
        return items;
    }

    public void mostrarItems(){
        items.forEach(System.out::println);
    }

    public void añadirItem(Item item) throws Exception {
        if (items.size() < getMaxItems()) {
            items.add(item);
        } else {
            throw new Exception("Inventario lleno! El vendedor no puede comprar el ítem.");
        }
    }
    public abstract int getMaxItems();

    @Override
    public String toString() {
        return "VendedorNPC{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
