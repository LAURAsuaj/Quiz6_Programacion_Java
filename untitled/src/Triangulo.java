public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    /**
     * Constructor de la clase Triangulo.
     * @param nombre
     * @param color
     * @param base
     * @param altura
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método para calcular y obtener el área del Triángulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea() {
        return (base * altura) / 2.0;
    }

    /**
     * Método para calcular y obtener el perímetro del Triángulo.
     * El cálculo del perímetro requiere conocer los lados del triángulo,
     * por lo que se asume que los lados se conocen al crear el objeto Triángulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro() {
        // Calcula el tercer lado (hipotenusa) utilizando el teorema de Pitágoras
        double lado3 = Math.sqrt(base * base + altura * altura);

        // Calcula el perímetro del triángulo sumando los tres lados
        double perimetro = base + altura + lado3;
        return perimetro;
    }
}
