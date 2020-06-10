import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class COVDSMPL {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0){
            solve(br.readLine().split(" "),br);
        }
    }
    public static void solve(String s[],BufferedReader br) throws IOException {
        int n = Integer.parseInt(s[0]);
        int p = Integer.parseInt(s[1]);
        int grader = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("1 "+(i+1)+" "+(j+1)+" "+(i+1)+" "+(j+1));
                grader = Integer.parseInt(br.readLine());
                if(grader!=-1)
                    sb.append(grader+" ");
            }
            sb.append("\n");
        }
        System.out.println(2);
        System.out.print(sb);
        grader = Integer.parseInt(br.readLine());
        if(grader == -1){
            System.exit(0);
        }
    }
}
