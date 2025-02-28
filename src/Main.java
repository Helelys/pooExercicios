import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        /*
        * 1º) Fazer um programa para ler os valores da largura e altura de um retângulo.
        * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
        * Usar uma classe como mostrado no projeto ao lado.


        Retangulo retangulo = new Retangulo(3.00 , 4.00);

        System.out.println(retangulo.area());
        System.out.println(retangulo.perimetro());
        System.out.println(retangulo.diagonal());

        * */

        /*
        2º) Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
        Em seguida, mostrar os dados do funcionário (nome e salário líquido).
        Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada
        (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário.
        Use a classe projetada ao lado.


        Funcionario tallys = new Funcionario("Tallys", 6000, 1000, 10.0);
        tallys.mostrarDados();
        tallys.aumentarSalario();

        */

        /*
        3º) Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
        (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada).
        Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (APROVADO)
        ou não (REPROVADO) e, em caso negativo, quantos pontos faltaram para o aluno obter o mínimo para ser aprovado
        (que é 60% da nota). Você deve criar uma classe Student para resolver este problema.
        */

        System.out.println("Digite as três notas referentes aos três trimestres!");
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();

        while (nota1 > 30 || nota2 > 35 || nota3 > 35) {
            System.out.println("Ops! Você digitou alguma nota acima do permitido. Digite novamente.");
            nota1 = teclado.nextDouble();
            nota2 = teclado.nextDouble();
            nota3 = teclado.nextDouble();
        }

        Aluno tallys = new Aluno("Tallys", nota1, nota2, nota3);
        tallys.notaFinal();
    }
}