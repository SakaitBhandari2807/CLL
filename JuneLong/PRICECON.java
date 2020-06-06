
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PRICECON{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        while(testCases-->0){
            String s[] = br.readLine().split(" ");
            int size = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            s = br.readLine().split(" ");
//            int prices[] = new int[size];
            int sum = 0;
            for(int i=0;i<s.length;i++){
              int price = Integer.parseInt(s[i]);
              if(price>k){
                  sum += price -k;
              }
            }
            System.out.println(sum);
        }
    }
}