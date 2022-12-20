package codingTestQueStack;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon1874 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb=new StringBuilder();

        int start=0;

        while(n > 0){
            int value=sc.nextInt();
            if(value>start){
                for(int i=start+1; i<=value; i++){
                    stack.push(i); // start+1부터 입력받은 값까지 스택에 푸시
                    sb.append("+").append('\n');
                }
                start=value; // value 위의 숫자로 푸시하기 위함
            }
            else if(stack.peek() != value){ // start가 value보다 큰데 스택의 top에 있는 원소가 value와 같지 않다면
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');
            n--;
        }
        System.out.println(sb);
    }

}
