public class ParametrosInvalidosException extends Exception {
    static String parametroExcecao(String contar) throws ParametrosInvalidosException{
        return "O segundo número deve ser maior que o primeiro!";
    }
}
