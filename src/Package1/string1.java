package Package1;
import java.util.Scanner;
public class string1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        for(int i=0;i<ch.length();i++){
            System.out.println(ch.charAt(i));
        }
    }
}