import java.util.*;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		ArrayList<String> arr=new ArrayList<String>();
		sc.nextLine();
		for (int i=0;i<n;i++){
		    String s=sc.nextLine();
		    arr.add(s);
		}
		arr.add(0,"Nice");
		System.out.println(arr);
		System.out.println(arr.get(3));
		arr.set(3,"or");
		System.out.println(arr);
		arr.remove(0);
		System.out.println(arr);
		System.out.println(arr.size());
		Collections.sort(arr);
		System.out.println(arr);
		
	}
}
