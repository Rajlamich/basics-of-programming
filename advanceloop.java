import java.util.Scanner;

public class advanceloop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count=0;
        String b= "Emma";
        String c ="stop";
        while (true) {
            System.out.println("Guess my name (type stop to exit)");
            String a = sc.nextLine();
            count++;
            if ((a.equalsIgnoreCase(b))) {
                System.out.println("Congratulations!");
            break;
            }
            
            else if ((a.equalsIgnoreCase(c))) {
                count=count-1;
                break;
            }
        
        }
        System.out.println("You guessed "+count+" times"+".");
    
    }
}