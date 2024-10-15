import java.util.Locale;
import java.util.Scanner;

public class TesteInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu primero nome: ");
        String nome = scanner.next();        

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite a linguagem que está estudando: ");
        String linguagem = scanner.next();
        
        System.out.println("Olá, me chamo " + nome + " " + sobrenome + ", tenho " + idade + " anos e " + altura + "m de altura. Atualmente estudo a linguagem " + linguagem + ".");

    }
}
