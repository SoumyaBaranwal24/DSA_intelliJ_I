package Package1;
import java.util.Scanner;
class str{
    String reverse(String s1){
        int n = s1.length();
        String rev = "";
        for(int i=n-1; i>=0; i--) {
            rev += s1.charAt(i);
        }
        return rev;
    }
}
public class string3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        str obj1 = new str();
        System.out.println(obj1.reverse(s1));

    }
}
