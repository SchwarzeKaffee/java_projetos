package edu.java.anatomiaClasse;

public class ExemploClasse {
    public static void main(String[] args) throws Exception {
       
        // declaração de VARIÁVEIS
        final String meuNome = "Samuel Arruda Alves";
        int idade = 25;
        final int dataNascimento = 1999;
        double altura = 1.65;
        int peso = 64;
        String firstName = "Samuel";
        String lastName = "Alves" ;
        String fullName = fullName(firstName, lastName);
        
        
        System.out.print (fullName);

    }
    // exemplo de MÉTODO
    public static String fullName (String firstName, String lastName) {

        return firstName.concat(" ").concat(lastName);  

    } 
}
