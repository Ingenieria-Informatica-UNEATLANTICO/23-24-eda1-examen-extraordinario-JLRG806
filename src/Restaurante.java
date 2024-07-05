package src;

class Restaurante {

    private void atender() {

        Cocinero bobEsponja = new Cocinero();
        Camarero calamardo = new Camarero();

        bobEsponja.prepararHamburguesa();

        Hamburguesa hamburguesa = bobEsponja.entregar();

        System.out.println();
        System.out.println("Prueba de la refactorización:");

        System.out.println("Hambuguesa antes de reorganizar, quitar elemento y/o agregar elementos intermendios:");

        System.out.println("Sale una " + hamburguesa.describir());
        hamburguesa.mostrar();
        hamburguesa.describir();

        System.out.println("Hamburguesa después de añadir y quitar elementos:");

        hamburguesa.insertarExtra(1, new Huevo());
        hamburguesa.insertarExtra(2, new Cheddar());
        hamburguesa.quitarExtra(2);
        hamburguesa.insertarExtra(2, new Mayonesa("mucho"));
        hamburguesa.quitarExtra(4);
        hamburguesa.insertarExtra(2, new Cheddar());


        System.out.println("Prueba de la reorganización de elementos:");
        hamburguesa.reorganizarExtras(3, 5);
        System.out.println("Sale una " + hamburguesa.describir());
        hamburguesa.mostrar();

        System.out.println("Prueba de la reorganización de elementos:");
        hamburguesa.reorganizarExtras(4, 2);
        System.out.println("Sale una " + hamburguesa.describir());
        hamburguesa.mostrar();


        
        calamardo.recibir(bobEsponja.entregar());
        calamardo.servir();
    }

    public static void main(String[] args) {
        Restaurante crustaceoCrujiente = new Restaurante();
        crustaceoCrujiente.atender();
    }
}
