public class Circulo extends FiguraGeometrica {
    private double radio;

    /**
     * Constructor de la clase Circulo.
     *
     * @param nombre
     * @param color
     * @param radio
     */
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    /**
     * Método para obtener el área del Círculo.
     *
     * @return
     */
    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    /**
     * Método para obtener el perímetro del Círculo.
     *
     * @return
     */
    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}