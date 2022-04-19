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
        Matrix.min(a);
        Matrix.mid(a);
        Matrix.sum(a);
        Matrix.add(a,a);
        Matrix.sub(a,a);
        Matrix.mul(a,a);

    }
    static void min(int a[][]){
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
    static void mid(int a[][]){
        int mid=a.length/2;

        System.out.println("mid element = "+ a[mid][mid]);
    }
    static void sum(int a[][]){
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                temp+=a[i][j];
            }
        }
        System.out.println("sum = "+temp);

    }
    static void add(int a[][],int b[][]){
        int res[][]=new int[a.length][b.length];
       for(int i=0;i<a.length;i++){
           for(int j=0;j<b.length;j++){

                res[i][j]=a[i][j]+b[i][j];
           }
       }
        System.out.println("add :");
       for (int i=0;i<a.length;i++){
           for(int j=0;j<b.length;j++){
               System.out.print(res[i][j] + " ");
           }
           System.out.println();
       }
    }
    static void sub(int a[][],int b[][]){
        int res[][]=new int[a.length][b.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){

                res[i][j]=a[i][j]-b[i][j];
            }
        }
        System.out.println("sub :");
        for (int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void mul(int a[][],int b[][]){
        int res[][]=new int[a.length][b.length];

        for (int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                for(int k=0;k<a.length;k++){
                    res[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("mul :");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

}
