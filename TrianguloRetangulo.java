public class TrianguloRetangulo {

    private double h;
    private double c1;
    private double c2;

    // Construtor
    public TrianguloRetangulo(double c1, double c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    // Método que calcula a hipotenusa
    public double calculaHipotenusa() {
        h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        return h;
    }

    // Método que calcula a área do triângulo
    public double calculaArea() {
        return (c1 * c2) / 2;
    }
}