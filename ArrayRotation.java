import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        int arr[]={0,1,2,3};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of rotations:");
        int n=sc.nextInt();
        System.out.println("Given Array :"+Arrays.toString(arr));
        func(arr,n);
    }
    static int func(int arr[],int n){
        int n1=arr[0];
        int n2=arr[1];
        int n3=arr[2];
        int n4=arr[3];
        int arr2[]={n2,n3,n4,n1};
        n--;
        if(n==0) {
            System.out.println(Arrays.toString(arr2));
            return 0;
        }
        func(arr2,n);
    return 0;
    }
}
