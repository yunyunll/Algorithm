package Stack;
import java.util.Scanner;
import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < k; i++){
            String str = sc.next();
            if(str.equals("push")){
                int n = sc.nextInt();
                s.push(n);
            }
            else if(str.equals("pop")){
                System.out.println(s.peek());
                s.pop();
            }
            else if(str.equals("size")){
                System.out.println(s.size());
            }
            else if(str.equals("empty")){
                if(s.isEmpty()){
                    System.out.println("1");
                }
                else System.out.println("0");
            }
            else if(str.equals("top")){
                System.out.println(s.peek());

            }
        }
    }
}