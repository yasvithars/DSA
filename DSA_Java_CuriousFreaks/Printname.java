import java.util.*;
public class Printname {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter FirstName");
        String fname = scan.nextLine();
        System.out.println("Enter LastName");
        String lname = scan.nextLine();
        System.out.println("Enter a Number");
        int n = scan.nextInt();

        int i=1;
        while(i<=n){
            System.out.println(fname+lname);
            i++;
        }
    }
}
