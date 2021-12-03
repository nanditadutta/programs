import java.util.Scanner;

public class solution24 {
 public static int s24(int[] arr,int n){
   int total = 1;
        for (int i = 2; i <= (n + 1); i++)
        {
            total =total+ i;
            total =total-arr[i - 2];
        }
        return total;
        
}

    public static void main(String[] args) {
     Scanner sc= new Scanner (System.in);
     int n= sc.nextInt();
     int[] arr= new int[n];
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
        }
        System.out.println(s24(arr,n));
    }
}