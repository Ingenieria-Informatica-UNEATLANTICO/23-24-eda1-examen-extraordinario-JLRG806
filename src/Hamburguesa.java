package src;

import java.util.ArrayList;
import java.util.List;

class Hamburguesa {
    private Pan panSuperior;
    private Pan panInferior;
    private Carne carne;
    private List<Extra> extras;

    public Hamburguesa(Pan panSuperior, Pan panInferior, Carne carne, int numeroExtras) {
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
        String descripcion;
        descripcion = panes[0].describir() + ", " + carne.describir();
        for (int i = 0; i < extrasAgregados; i++) {
            descripcion = descripcion + ", " + extras[i].describir();
        }
        descripcion = descripcion + "\n";
        return descripcion;
    }
}
