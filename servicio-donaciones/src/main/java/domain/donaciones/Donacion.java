package domain.donaciones;

import domain.categorias.Categoria;
import domain.necesidades.Necesidad;

public class Donacion {
    private Categoria categoria;
    private Integer cantidad;
    private UnidadMedida unidadMedida;
    private String foto;
    private Necesidad necesidadAsignada;

    public Donacion(ItemDonado item) {

        this.categoria = item.getCategoria();
        this.cantidad = item.getCantidad();
        this.unidadMedida = item.getUnidadMedida();
        this.foto = item.getFoto();
    }

    public void asignarA(Necesidad necesidad){
        this.necesidadAsignada = necesidad;
    }

    public boolean estaAsignada() {
        return necesidadAsignada != null;
    }
}
