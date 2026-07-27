package Package1;
import java.util.Scanner;
class line {
    String palindrome(String s1){
        int i = 0;
        int j = s1.length()-1;
        while(i<j){
            if(s1.charAt(i)==s1.charAt(j)){
                i++;
                j--;
            }
            else{
                return "Not Palindrome";
            }
        }

        return "Palindrome";
    }
}
public class string4 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        line l1 = new line();
        System.out.println(l1.palindrome(s1));
    }
}
