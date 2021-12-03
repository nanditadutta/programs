import java.util.Scanner;

public class solution28 {
    public static void s28(int[] a){
        Arrays. sort(a);
        System. out. println("Minimum = " + nums[0]);
        System. out. println("Maximum = " + nums[nums. length-1]);
     
      int result=max-min;
      System.out.println("result is"+result);
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] a= new int [n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        s28(a,n);
    }
    
}
