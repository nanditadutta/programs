import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class solution23 {
    public static void s23(int[]arr,int[]brr){
        if(Arrays.equals(arr, brr)){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n= sc.nextInt();
        
        int[] arr= new int[n];
        int[] brr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++){
            brr[i]= sc.nextInt();
        }
        s23(arr,brr);

    }
}

//how maany elements are equal in the array

public static int solu(HashSet<Integer> h1,HashSet<Integer>h2)
    h1.retainAll(h2);(--> finds intersection between two arrays holds the value to keep the value to preserve the value)
    //to find the cnt of the h1 is
    h1.size();