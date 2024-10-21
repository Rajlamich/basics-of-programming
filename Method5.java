import java.util.Scanner;

public class Method5 {

    public static int area(int length,int breadth)
{
    return length*breadth;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth : ");
        int breadth = sc.nextInt();

        System.out.println("The area of given length and breadth is "+area(length, breadth));

        if ((area(length, breadth))>50) {
            System.out.println("Huge room");
        }
        else
    {
        System.out.println("Standard room size");
    }

    }
}
