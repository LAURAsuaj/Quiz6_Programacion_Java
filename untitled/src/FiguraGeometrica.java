public class FiguraGeometrica {
    private String nombre;
    private String color;

    /**
     * Constructor de la clase FiguraGeometrica.
     * @param nombre
     * @param color
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    /**
     * Método para obtener el área de la figura.
     * Este método debe ser anulado en las clases derivadas.
     * @return
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerArea() {
        return 0.0; // Valor predeterminado, debe anularse en las clases derivadas.
    }

    /**
     * Método para obtener el perímetro de la figura.
     * Este método debe ser anulado en las clases derivadas.
     * @return
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerPerimetro() {
        return 0.0; // Valor predeterminado, debe anularse en las clases derivadas.
    }

    /**
     * Método getter para obtener el nombre de la figura.
     * @return
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para establecer el nombre de la figura.
     * @param nombre
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para obtener el color de la figura.
     * @return
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public String getColor() {
        return color;
    }

    /**
     * Método setter para establecer el color de la figura.
     * @param color
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setColor(String color) {
        this.color = color;
    }
}
