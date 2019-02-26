package DataStructures;

import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
       for(int i=0;i<game.length;) {
            if (i + leap >= game.length)
                return true;
            else if(i + 1 <= game.length && game[i+1] == 0) {
                i++;     
            }
             else if( i + leap <= game.length && game[i+leap]==0) {
                i=i+leap;
            }else if(i-1 > 0 && game[i-1] == 0 && game[i-1+leap] == 0) {
            		i = i-1;
            }
            else
                return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}