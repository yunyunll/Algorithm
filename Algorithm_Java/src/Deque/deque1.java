package Deque;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class deque1 {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i = 0; i < x; i++){
            String s = sc.next();
            if(s.equals("push_front")){
                int y = sc.nextInt();
                dq.addFirst(y);
            }
            else if(s.equals("push_back")){
                int y = sc.nextInt();
                dq.addLast(y);
            }
            else if(s.equals("pop_front")){
                System.out.println(dq.peekFirst());
                dq.pollFirst();
            }
            else if(s.equals("pop_back")){
                System.out.println(dq.peekLast());
                dq.pollLast();
            }
            else if(s.equals("size")){
                System.out.println(dq.size());
            }
            else if(s.equals("empty")){
                if(dq.isEmpty()){
                    System.out.println("1");
                }
                else System.out.println("0");
            }
            else if(s.equals("front")){
                System.out.println(dq.peekFirst());
                dq.peekFirst();
            }
            else if(s.equals("back")){
                System.out.println(dq.peekLast());
                dq.peekLast();
            }
        }



    }
}
