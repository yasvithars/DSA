import java.util.*;

class UserInput{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input ");
        
        int age = scan.nextInt();
        scan.nextLine();
        String name = scan.nextLine();
        char initial = scan.next().charAt(0);
        
        System.out.println("Age Name Initial");
        System.out.print(age + " " + name +" "+initial);
        
    }
}