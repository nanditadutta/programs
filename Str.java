import java.util.*;
public class Str{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you wanna reverse?");
        String s = sc.nextLine(); // takes the string input from the user
        String output =""; //for storing the reversal string string
        int length = s.length(); // for finding the length of the string
        System.out.println("The reversal of the string is");
        for(int i =s.length()-1;i>=0;i--) {
            output = output + s.charAt(i);
        }
            System.out.println(output);



    }
}