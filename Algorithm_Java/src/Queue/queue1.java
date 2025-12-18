package Queue;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class queue1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < k; i++){
            String str = sc.next();
            if(str.equals("push")){
                int n = sc.nextInt();
                q.add(n);
            }
            else if(str.equals("pop")){
                if(!q.isEmpty()){
                    System.out.println(q.peek());
                    q.poll();
                }
                else System.out.println(-1);
            }
            else if(str.equals("size")){
                System.out.println(q.size());
            }
            else if(str.equals("empty")){
                if(q.isEmpty()){
                    System.out.println("1");
                }
                else System.out.println("0");
            }
            else if(str.equals("front")){
                System.out.println(q.peek());

            }
        }
    }
}
