import java.util.Scanner;

public class Contar{
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        contagem(parametroUm, parametroDois);
    }     
    
    public static void contagem(int parametroUm, int parametroDois){
        int contagem = parametroDois - parametroUm;
        System.out.println("A diferença entre os dois parâmetros é " + contagem);

        for(int contando = parametroUm; contando <= parametroDois; contando++) {
            System.out.println("Imprimindo o número "+contando);
        }
        
        /*while(numeroAtual <= parametroDois){
            System.out.println("Contando: " + numeroAtual);
            numeroAtual++;
        }*/

        if(parametroUm > parametroDois){
            System.out.println("O segundo número deve ser maior que o primeiro!");
        }
    }
}