import java.util.Scanner;

public class solution27 {
    public static void s27(int[] arr, int n){
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.println(" the even elements in the array are:"+arr[i]);
            }    
            else{  
                System.out.println(" the odd elements in the array are:"+arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        s27(arr,n);
    }
    
}
//for counting of the even numbers and odd numbers in the array
public static int evcnt(int[] arr,int n){
    int cnt=0;
    if(arr[i]%2==0){
        cnt=+1;
        return cnt;
    }
}
public static int odcnt(int[] arr,int n){
    int cnt=0;
    if(arr[i]%2!=0){
        cnt=+1;
        return cnt;
    }
}   
