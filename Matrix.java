import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows and columns:");
        int r= sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("enter elemnts of matrix:");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("the given matrix is:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int min=a[0][0];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]<min){
                    min=a[i][j];
                }
            }

        }
        System.out.println("minimum = "+min);
    }

}
