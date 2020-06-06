import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CHFICRM {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0){
            int size = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" ");
            if(Integer.parseInt(s[0])!=5) System.out.println("NO");
            else System.out.println(solveCoinChange(s));
        }
    }

    public static String solveCoinChange(String []s){
//        int shopkeeperMoney = 5;
        int coins[] = new int[4];
        coins[1] = 1;
        for(int i=1;i<s.length;i++){
            int money = Integer.parseInt(s[i]);
            int moneyToBeReturned = money - 5;
            coins[money/5]++;
            if(coins[moneyToBeReturned/5] != 0 ){
                coins[moneyToBeReturned/5]--;

            }
            else if(coins[1]*5>= moneyToBeReturned){
                coins[1] -= moneyToBeReturned/5;
            }
            else return "NO";
        }
        return "YES";
    }
}
