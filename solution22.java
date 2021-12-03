import java.util.Scanner;

public class solution22 {
    public static void my(int[]arr,int n,int sum){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("pairs of elements in an array whose sum is equal are:"+arr[i]+" "+arr[j]);
                }
            }
            
            
        }
    }

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        my(arr,n,sum);
    }
    
}
