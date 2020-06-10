import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class TTUPLE {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0){
            String s[] = br.readLine().split(" ");
            int abc[] = new int[3];
            int pqr[] = new int[3];
            for (int i = 0; i <3 ; i++) {
                abc[i] = Integer.parseInt(s[i]);
            }
            s = br.readLine().split(" ");
            for (int i = 0; i < 3; i++) {
                pqr[i] = Integer.parseInt(s[i]);
            }
            //s = null;
            int subtraction[] = new int[3];
            int quotient[] = new int[3];
            int remainder[] = new int[3];
            int cost1 = 0,cost2 = 0;
            HashMap<Integer,Integer> submap = new HashMap<>();
            HashMap<Integer,Integer> multimap = new HashMap<>();

            for(int i=0;i<3;i++){
                subtraction[i] = pqr[i]-abc[i];
                if(subtraction[i]!=0){
                    if(! submap.containsKey(subtraction[i])){
                        submap.put(subtraction[i],1);
                    }
                    else submap.put(subtraction[i],submap.get(subtraction[i])+1);
                }
            }
            cost1 = submap.size();
            for(int i=0;i<3;i++){
                if(abc[i] == 0){
                    quotient[i] = 0;
                    remainder[i] = -1;
                }
                else{
                    quotient[i] = pqr[i]/abc[i];
                    remainder[i] = pqr[i]%abc[i];
                    if(remainder[i] == 0){
                        if(! multimap.containsKey(quotient[i])){
                            multimap.put(quotient[i],1);
                        }
                        else multimap.put(quotient[i],multimap.get(quotient[i])+1);
                    }
                    else cost2++;
                }
            }
            cost2 += multimap.size();


            System.out.println(Math.min(cost1,cost2));
        }

    }
}
/**
 * for (int i = 0; i < 3; i++) {
 *                 subtraction[i]  = pqr[i]- abc[i];
 *                 if(abc[i]==0) abc[i] = -1;
 *                 quotient[i] = pqr[i]/abc[i];
 *                 remainder[i] = pqr[i]%abc[i];
 *             }
 *             HashMap<Integer,Integer> hm = new HashMap<>();
 *             HashMap<Integer,Integer> hm1 = new HashMap<>();
 *             for (int i = 0; i < 3; i++) {
 *                 if(!hm.containsKey(subtraction[i])) hm.put(subtraction[i],1);
 *                 else hm.put(subtraction[i],hm.get(subtraction[i])+1);
 *
 *                 if(remainder[i] == 0 ) {
 *                     if(!hm1.containsKey(quotient[i])){
 *                         hm1.put(quotient[i],1);
 *                     }
 *                     else hm1.put(quotient[i],hm1.get(quotient[i])+1);
 *                 }
 *             }
 *             int cost2 = 0;
 *             if(hm1.size() == 0) cost2 = 3;
 *             else {
 *                 int sum = 0;
 *
 *                 for(Map.Entry<Integer,Integer>entry :hm1.entrySet()) {
 *                     sum += entry.getValue();
 *                 }
 *                 switch (hm1.size()){
 *                     case 1:
 *                         if (sum == 3) cost2++;
 *                         if( sum == 2 ) cost2 = 2;
 *                         if( sum == 1 ) cost2 = 3;
 *                         break;
 *                     case 2:
 *                         if(sum == 2) cost2 = 3;
 *                         if(sum == 3) cost2 = 2;
 *                         break;
 *                     case 3:
 *                         if(sum == 3) cost2 = 3;
 *                         break;
 *                 }
 *             }
 *             int cost1 = hm.containsKey(0)?hm.size()-1:hm.size();
 */
