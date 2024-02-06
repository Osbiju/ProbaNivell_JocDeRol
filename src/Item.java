import java.util.EnumSet;

public class Item {
    private String nomItem;
    private String tipo;
    private int precio;
    private double estado;

    public Item(String nomItem, String tipo, int precio, int estado){
        this.nomItem = nomItem;
        this.tipo = tipo;
        this.precio = precio;
        this.estado = 1;
    }

    public String getNomItem() {
        return nomItem;
    }

    public void setNomItem(String nomItem) {
        this.nomItem = nomItem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getEstado() {
        return (int) estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nomItem='" + nomItem + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", estado=" + estado +
                '}';
    }
}
