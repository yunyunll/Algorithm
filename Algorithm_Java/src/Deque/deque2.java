package Deque;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class deque2 {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i = 0; i < x; i++){
            dq.addLast(i+1);
        }

        while(dq.size() != 1){
            dq.pollFirst();
            dq.addLast(dq.peekFirst());
            dq.pollFirst();
        }
        System.out.println(dq.peekFirst());



    }
}
