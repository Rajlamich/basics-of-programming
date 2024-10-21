

public class array1 {
    public static void main(String[] args) {
       // simple array printing;
        String furnitures[] = {"table","chair","shelf","Sofa"};
        for (int i = 0; i < 4; i++) 
        {
        System.out.println(furnitures[i]);    
        }

        // Changing the app that prints only first two elements
        System.out.println("The first two elements are : ");
        for (int i = 0; i < 2; i++) {
            System.out.println(furnitures[i]);
            
        }
        
        // Changing the app that only sofa is printed if it is found in array
        String x="Sofa";
        for (int i = 0; i < 4; i++) {
            if (furnitures[i]==x) {
                
                System.out.println(furnitures[i]);
            }
            
        }
    }
    
}
