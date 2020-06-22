import java.io.*;
import java.util.*;


class Solution{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            long n = sc.nextLong();
            long ans=1;
            if(n==0){
                System.out.println(1);
            }
            else{
                if(n%10 !=0) System.out.println(n);
                else{
                    while(n>1){
                        n = n/10;
                        ans *= 11;
                    }
                    System.out.println(ans);
                }
            }
        }
    }
}