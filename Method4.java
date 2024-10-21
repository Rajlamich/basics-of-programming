import java.util.*;
public class Method4 {

    public static void area(int length, int breadth){
        
        System.out.println("The area of given length and width is : "+length*breadth);
    } 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int length= sc.nextInt();
        System.out.print("Enter the breadth : ");
        int width= sc.nextInt();

        area(length, width);


    }
}
