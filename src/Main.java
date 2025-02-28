import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        /*
        * 1º) Fazer um programa para ler os valores da largura e altura de um retângulo.
        * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
        * Usar uma classe como mostrado no projeto ao lado.
        */

        Retangulo retangulo = new Retangulo(3.00 , 4.00);

        System.out.println(retangulo.area());
        System.out.println(retangulo.perimetro());
        System.out.println(retangulo.diagonal());

    }
}