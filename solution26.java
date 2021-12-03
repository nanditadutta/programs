import java.util.Scanner;

public class solution26 {
    public static void s26(){
    
        for(int i=0;i<n;i++){
            int k=arr[n-1];
            int temp=0;
            if(arr[i]%10==0){
                temp=arr[i];
                arr[i]=k;
                k=temp;


                
            }
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        s26();

    }
    
}
