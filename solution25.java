import java.util.Scanner;

public class solution25 {
    public static void s25(int[] arr, int[]brr,int[]crr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( arr[i]==brr[j] && arr[i]==crr[j] ){
                    System.out.println("common elements are:"+arr[i]);
                
                }
                
            }
        }
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        
        int[] arr = new int[n];
        int[] brr = new int[n];
        int[] crr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        } 
        for(int i=0;i<n;i++){
            brr[i]= sc.nextInt();
        } 
        for(int i=0;i<n;i++){
            crr[i]= sc.nextInt();
        } 
        s25(arr,brr,crr,n);

    }
    
}
