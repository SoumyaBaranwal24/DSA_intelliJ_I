package Package1;
import java.util.Scanner;
class S {
    int vowels(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
        }
        return count;
    }
}
public class string2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        S s1= new S();

        System.out.println(s1.vowels(str));
        sc.close();
    }
}