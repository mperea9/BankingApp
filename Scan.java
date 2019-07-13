import java.util.Scanner;

public class Scan{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter character:");
        char charact = scan.next().charAt(0);
        System.out.println("Value = " + charact);
        
    }
}
