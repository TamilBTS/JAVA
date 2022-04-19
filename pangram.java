import java.util.Scanner;


public class pangram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        str=str.toUpperCase();
        str=str.replace(" ","");
        str=str.replace(".","");        //The quick brown fox jumps. over a lazy dog   T H E Q U I C K B R O W N F O X J   U M  P  S  O  V  E  R  A  L  A  Z Y D O G
        System.out.println(str);                                                   // A=65 Z=91
        char[] t=str.toCharArray();                 // 65
        int [] t1=new int[26];  // 1 1 1 1
        for(int i=0;i<t.length;i++){
             int index=t[i]-65; // 19
             t1[index] = 1;  //T[19]=1 T[7]=1  T[2]=0
        }
        for(int i=0;i<t1.length;i++){
            System.out.print(t1[i]);
        }
        for(int i=0;i<t1.length;i++){
            if(t1[i]==1){
            }
            else{
                System.out.println("not a pangram");
            System.exit(0);}
        }
        System.out.println("pangram");
    }
}
