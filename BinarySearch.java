import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int a[]={22,82,19,28,36,84,62};
        Arrays.sort(a);
        System.out.println("sorted array : "+Arrays.toString(a));
        System.out.println(a.length);
        int low=0;
        int high=a.length-1;
        Scanner scanner=new Scanner(System.in);
        int key=scanner.nextInt();
        System.out.println("index : "+binarysearch(a,low,high,key));


    }
    static int binarysearch(int a[],int low,int high,int key){
        int mid=(low+high)/2;
       while (low<=high){
           if(a[mid]<key){
               low=mid+1;
           }
           else if(a[mid]==key){
               return mid;

           }
           else{
               high=mid-1;
           }
           mid=(low+high)/2;
       }
       if(low>high)
       {    return -1;}
       return -1;

    }

}
