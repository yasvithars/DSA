import java.util.*;
public class Multiplesofx {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x");
        int x = scan.nextInt();

        for(int i=x;i<=1000;i+=x){
            System.out.println(i);
        }
    }
}
