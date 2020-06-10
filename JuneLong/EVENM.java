import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class EVENM {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0){
            solve(Integer.parseInt(br.readLine()));
        }
    }
    public static void solve(int n){
        StringBuilder sb1 = new StringBuilder();
        boolean flag = true;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=1;i<=n*n;i++){
            if(flag){
                sb1.append(i+" ");
                stack.push(i+n);
                if(i%n == 0) {flag = false;sb1.append("\n");}
            }
            else {
                sb1.append(stack.pop()+" ");
                if(i%n == 0){
                    sb1.append("\n");
                    flag=true;
                }
            }
        }
        System.out.print(sb1);
    }
}
