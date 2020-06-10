import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class EOEO {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0){
            long num = Long.parseLong(br.readLine());
            System.out.println(solve(num));
        }
    }
    public static long solve(long num){
        long count = 0;
        long original_number = num;
        if(num%2 == 0){
            int p = 1;
            while((num/2)%2 == 0){
                num /= 2;
                p++;
            }
            count = (long) (original_number/(long)Math.pow(2,p+1));
        }
        else{
            count = num/2;
        }
        return count;
    }
}
