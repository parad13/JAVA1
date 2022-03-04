// Main.java
import java.util.*;
class Main {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the text from the document");
            String value = sc.nextLine();
            System.out.println("Enter the string to be found in the data");
            String key = sc.nextLine();
            if(value.contains(key.trim())) 
                System.out.println("String is found in the document");
            else System.out.println("String is not found in the document");
     }
}