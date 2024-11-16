import java.util.Scanner;

public class Contar{
    public static void main(String[] args){
        try {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = terminal.nextInt();
            terminal.close();
    
            contagem(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo número deve ser maior que o primeiro!");
        }
    } 
    public static void contagem(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        int contaParametros = parametroDois - parametroUm;
        
            if(parametroUm >= parametroDois){
            throw new ParametrosInvalidosException();
            }

            for(int contando = parametroUm; contando <= parametroDois; contando++) {
            System.out.println("Imprimindo o número "+contando);
            }
        }
    }