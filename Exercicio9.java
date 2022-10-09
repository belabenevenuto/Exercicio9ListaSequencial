import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        double grausF, grausC;
        Scanner teclado = new Scanner(System.in);
        grausF = teclado.nextDouble();
        grausC = 5 * ((grausF - 32) / 9);
        System.out.print("O resultado é " + grausC + " Graus Celsius");
    }   
}
