import jdk.swing.interop.SwingInterOpUtils;

class Sample {
             void print(String s){
                 for (int i = 0; i < 5; i++) {
                     System.out.println("printing " + s + " " + i);
              }
                           }

        }

class Thread1 extends Thread{
    Sample sample;
    Thread1(Sample s){
        this.sample=s;
    }
    public void run(){
        sample.print("tamil");
    }
}
class Thread2 extends Thread{
    Sample sample;
    Thread2(Sample s){
        sample=s;
    }
    public void run(){
        sample.print("arasi");
    }
}
 public class MultiThreading  {
    public static void main(String[] args) throws InterruptedException{
        Sample s1=new Sample();
        Sample s2=new Sample();

        Thread1 t1=new Thread1(s1);
        Thread1 t2=new Thread1(s2);
        t1.start();
        t1.stop();
        System.out.println(t1.isAlive());



        t2.start();
    }
}
