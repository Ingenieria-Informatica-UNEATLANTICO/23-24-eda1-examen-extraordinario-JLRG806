package src;

class Hamburguesa {
    private Pan panSuperior;
    private Pan panInferior;
    private Carne carne;
    private GenericList<Extra> extras;

    public Hamburguesa(Pan panSuperior, Pan panInferior, Carne carne) {
        this.panSuperior = panSuperior;
        this.panInferior = panInferior;
        this.carne = carne;
        this.extras = new GenericList<Extra>();
    }

    public void agregarExtra(Extra extra) {
        extras.insertEnd(extra);
    }

    public void mostrar() {
        panSuperior.mostrar();
        carne.mostrar();

        for (int i = 0; i < extras.size(); i++) {
            Extra extra = extras.get(i);
            extra.mostrar();
        }
        panInferior.mostrar();
    }

    public String describir() {
        StringBuilder descripcion = new StringBuilder(panSuperior.describir() + ", " + carne.describir());

        for (int i = 0; i < extras.size(); i++) {

            Extra extra = extras.get(i);

            descripcion.append(", ").append(extra.describir());
        }
        return descripcion.toString();

    }

    public void quitarExtra(int indice) {

        extras.remove(indice);

    }

    public void reorganizarExtras(int indiceOrigen, int indiceDestino) {
        if (indiceOrigen >= 0 && indiceOrigen < extras.size() && indiceDestino >= 0 && indiceDestino < extras.size()) {
            Extra extra = extras.remove(indiceOrigen);
            extras.insertAt(indiceDestino, extra);

        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
    }

    public void insertarExtra(int indice, Extra extra) {
        if (indice >= 0 && indice <= extras.size()) {
            extras.insertAt(indice, extra);
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
    }
}
