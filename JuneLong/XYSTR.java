import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class XYSTR {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        while(tc-->0){
            String str = br.readLine();
            int pairs = 0;
            for (int i = 0; i < str.length()-1 ; i++) {
                if(str.charAt(i) == 'x' && str.charAt(i+1) == 'y') {i++;pairs++;}
                else
                    if(str.charAt(i) == 'y' && str.charAt(i+1) == 'x') {i++;pairs++;}
            }
            System.out.println(pairs);
        }
    }
}
