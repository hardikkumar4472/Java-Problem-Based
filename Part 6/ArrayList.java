import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            arr.add(s);
        }
        System.out.println(arr);
    }
}
