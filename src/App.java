import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Você deseja ver os multiplos de qual número:\n");
        Scanner entrada = new Scanner(System.in);

        final int numero = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + numero * i);
        }
    }
}
