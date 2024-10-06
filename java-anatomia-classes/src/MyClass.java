public class MyClass {
    public static void main(String[] args) {

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
