public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void notaFinal() {
        double notaFinalAluno = getNota1() + getNota2() + getNota3();
        System.out.printf("O aluno %s teve como nota final %.2f\n", getNome(), notaFinalAluno);
        aprovacao();
    }

    public void aprovacao() {
        double notaFinalAluno = getNota1() + getNota2() + getNota3();
        if (notaFinalAluno < 60) {
            double notaCalculada = (60 - notaFinalAluno);
            System.out.printf("Reprovado! Você precisava de %.2f pontos para passar.\n", notaCalculada);
        }
        else {
            System.out.println("Aprovado!");
        }
    }
}
