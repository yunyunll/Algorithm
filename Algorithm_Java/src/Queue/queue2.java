package Queue;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class queue2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < k; i++){
            q.add(i + 1);
        }
        for(int i = 0; i < k; i++){
            for(int j = 0; j < n-1; j++){
                q.add(q.peek());
                q.poll();
            }
            System.out.print(q.peek());
            System.out.print(" ");
            q.poll();
        }
    }
}