import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> ts=new TreeSet<Integer>();
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            ts.add(a);
        }
        System.out.println(ts);
        System.out.println(ts.contains(2));
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.higher(3));
        System.out.println(ts.lower(3));
        ts.remove(2);
        ts.pollFirst();
        ts.pollLast();
        System.out.println(ts);
    }
}
