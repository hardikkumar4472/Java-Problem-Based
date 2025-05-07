
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int ac=0;
        int gc=0;
        int cc=0;
        int tc=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='a'){
                ac++;
            }
            else if (s.charAt(i)=='g'){
                gc++;
            }
            else if (s.charAt(i)=='c'){
                cc++;
            }
            else if (s.charAt(i)=='t'){
                tc++;
            }
        }
        System.out.println(ac);
        System.out.println(gc);
        System.out.println(cc);
        System.out.println(tc);
    }
}
