public class Retangulo {
    private double largura;
    private double altura;

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double area() {
        return getAltura() * getLargura();
    }

    public double perimetro() {
        return 2 * (getLargura() + getAltura());
    }

    public double diagonal() {
        return Math.sqrt((getAltura() * getAltura()) + (getLargura() * getLargura()));
    }
}
