package src;

import java.util.ArrayList;
import java.util.List;

class Hamburguesa {
    private Pan panSuperior;
    private Pan panInferior;
    private Carne carne;
    private List<Extra> extras;

    public Hamburguesa(Pan panSuperior, Pan panInferior, Carne carne) {
        this.panSuperior = panSuperior;
        this.panInferior = panInferior;
        this.carne = carne;
        this.extras = new ArrayList<>();
    }

    public void agregarExtra(Extra extra) {
        extras.add(extra);
    }

    public void mostrar() {
        panSuperior.mostrar();
        carne.mostrar();
        for (Extra extra : extras) {
            extra.mostrar();
        }
        panInferior.mostrar();
    }

    public String describir() {
        StringBuilder descripcion = new StringBuilder(panSuperior.describir() + ", " + carne.describir());
        for (Extra extra : extras) {
            descripcion.append(", ").append(extra.describir());
        }
        descripcion.append("\n");
        return descripcion.toString();
    }

    public void quitarExtra(int indice) {

        extras.remove(indice);
        
    }

    public void reorganizarExtras(int indiceOrigen, int indiceDestino) {
        if (indiceOrigen >= 0 && indiceOrigen < extras.size() && indiceDestino >= 0 && indiceDestino < extras.size()) {
            Extra extra = extras.remove(indiceOrigen);
            extras.add(indiceDestino, extra);
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
    }

    public void insertarExtra(int indice, Extra extra) {
        if (indice >= 0 && indice <= extras.size()) {
            extras.add(indice, extra);
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
    }
}
