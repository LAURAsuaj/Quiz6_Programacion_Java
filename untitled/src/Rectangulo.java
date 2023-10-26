public class Rectangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;

    /**
     * Constructor de la clase Rectangulo
     * @param nombre
     * @param color
     * @param lado1
     * @param lado2
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * Método para obtener el área del Rectángulo.
     * @return
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea() {
        // Área del rectángulo: lado1 * lado2
        return lado1 * lado2;
    }

    /**
     * Método para obtener el perímetro del Rectángulo.
     * @return
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2);
    }
}