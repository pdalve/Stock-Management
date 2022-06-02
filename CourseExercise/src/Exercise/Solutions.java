package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Solutions {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int c = 0;
         for(int i= 0; i<n ; i++){
             a[i] = scan.nextInt();
         } 
         int count =0;
         int sum=0;
         for(int i=0;i<n;i++){ 
             
             for(int j=i;j<n;j++){
         int b1[] = Arrays.copyOfRange(a, i, j);
         
         for(int k=0;k<b1.length;k++){
               sum = sum +b1[k];
              if(sum<0){
                  count++;
              }
              }
         
         
             }

        }  
        System.out.println(count) ;      
    }             
             
} 