import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution2{
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0){
            String s[]=br.readLine().split(" ");
            int n = Integer.parseInt(s[0]),b1 = Integer.parseInt(s[1]),b2 = Integer.parseInt(s[2]);

            int not = n-2;
            long count = (n-2)*(n-2)-2*(n-2);
            if(Math.abs(b1-b2) == 1 || Math.abs(b1-b2)==n-1){
                if(n%2 ==0)
                    count -= 2;
                else count -= 1;
            }
            else count -= 4;
            if(count<=0) count = 1;
            System.out.println(count);
        }
    }
}