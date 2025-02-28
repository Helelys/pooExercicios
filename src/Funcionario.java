public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double imposto;
    private double porcentagem;

    public String getNome() {
        return nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public Funcionario(String nome, double salarioBruto, double imposto, double porcentagem) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
        this.porcentagem = porcentagem;
    }

    public void mostrarDados() {
        double salarioLiquido = getSalarioBruto() - getImposto();
        System.out.printf("Olá %s, seu salário líquido é: R$ %.2f \n", getNome(), salarioLiquido);
    }

    public void aumentarSalario() {
        setPorcentagem(porcentagem / 100);
        double calculo = (getSalarioBruto() * getPorcentagem()) + (getSalarioBruto() - getImposto()) ;
        System.out.printf("Olá %s, seu salário com imposto é: R$ %.2f\n", getNome(), calculo);
    }
}
