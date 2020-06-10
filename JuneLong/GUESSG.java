import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

class GUESSG {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //while(tc-->0){
            int grader = Integer.parseInt(br.readLine());
            int start = 0,end = grader-1,mid = (end-start)/2;
            System.out.println(mid);
            solve(start,end,br);

    }
    public static int solve(int start,int end,BufferedReader br)throws IOException{
        char ch = br.readLine().charAt(0);
        if(ch == 'E') return 0;
        int mid = start+(end - start)/2;
        if(ch == 'G'){
            System.out.println(mid);
            int val  = solve(mid+1,end,br);
            if(val == -1){
                val = solve(start,mid-1,br);
            }
            if(val == 0) return 0;
            if(start == end) return -1;

        }
        else {
            System.out.println(mid);
            int val = solve(start,mid-1,br);
            if(val ==- 1){
                val = solve(mid+1,end,br);
            }
            if(val == 0) return 0;
            if(start == end) return -1;

        }
        return 1;
    }
}
