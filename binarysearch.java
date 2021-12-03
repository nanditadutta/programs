import java.util.*;
public class solution1 {
    public static int bs(int[] arr, int n,int key){
        
        Arrays.sort(arr);
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(key==arr[mid]){
                return mid;
            }
            if(key<arr[mid]){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int key =sc.nextInt();
        int[] arr= new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        } 
        
        System.out.println("Element "+key+" found at "+bs(arr,n, key));


    }
    
}

