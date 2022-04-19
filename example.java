import org.w3c.dom.ls.LSOutput;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    class example{
        public static void main(String[] args) {
            Random random=new Random();
            int array[]=new int[5];
            for(int i=0;i<array.length;i++){
                array[i]=random.nextInt(10);
            }
            System.out.println(Arrays.toString(array));
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter no:");
            int n=scanner.nextInt();
            example sample=new example();
            sample.checking(array,n);
        }
        void checking(int a[],int n){
            for(int i=0;i<a.length;i++){
                if(a[i]==n) {
                    System.out.println("index: " + i);
                    return;
                }

            }
            System.out.println("index: -100");
        }

    }

