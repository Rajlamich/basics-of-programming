import java.util.Scanner;

public class Login {

    public static void GenerateEmail(String FirstName, String LastName, String Domain){
        String Email = (FirstName+"."+LastName+"@"+Domain).toLowerCase();
        System.out.println(Email);
    }

    public static void GenerateUsername(String FirstName, String LastName){
        String firstChar=FirstName.substring(0,4);
        String lastChar =LastName.substring(LastName.length()-4);
        String Username= (firstChar+lastChar).toLowerCase();
        System.out.println(Username);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First name?");
        
        String FirstName= sc.nextLine();
        
        System.out.println("Last name?");
        
        String LastName= sc.nextLine();
        
        System.out.println("Business domain name?");
        
        String Domain= sc.nextLine();

        if (FirstName.equals("")||LastName.equals("")||Domain.equals("")) {
            System.out.println("Error! First and/or last name is missing.");
        
        }
        // Function Calling passing the value.
        GenerateEmail(FirstName,LastName,Domain);
        GenerateUsername(FirstName, LastName);
        sc.close();
    }
}