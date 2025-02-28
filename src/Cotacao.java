public class Cotacao {
    private double valor;
    private double dolar;
    private double iof = 0.06;

    public double getValor() {
        return valor;
    }

    public double getDolar() {
        return dolar;
    }

    public double getIof() {
        return iof;
    }

    public Cotacao(double valor, double dolar) {
        this.valor = valor;
        this.dolar = dolar;
    }

    public void cotado() {
        double valorTotal = getDolar() * getValor();
        double iof = valorTotal * getIof();
        double gastoNecessario = valorTotal + iof;
        System.out.printf("O valor cotado é: R$ %.2f", gastoNecessario);
    }
}
