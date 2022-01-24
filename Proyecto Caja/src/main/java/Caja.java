public class Caja {

    private int ancho;
    private int alto;
    private int profundo;

    public Caja() {
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public String Volumen(){
        return ("El volumen de la caja es: " + (ancho * alto * profundo));
    }

    public String toString() {
        return "Caja{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", profundo=" + profundo +
                '}';
    }
}
