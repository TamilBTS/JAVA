import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calc extends Frame implements ActionListener {
    TextField FN;
    TextField SN,Res;
    Button a1,a2,a3,a4,a5;

    Calc(){
        Label FirstNum=new Label("First Number");
        FirstNum.setBounds(20,60,100,20);
        add(FirstNum);
         FN=new TextField();
        FN.setBounds(120,60,100,20);
        add(FN);
        Label SecondNum=new Label("Second Number");
        SecondNum.setBounds(20,100,100,20);
        add(SecondNum);
         SN=new TextField();
        SN.setBounds(120,100,100,20);
        add(SN);
         a1=new Button("Add");
        a1.setBounds(20,180,80,20);
        a1.addActionListener(this);
        add(a1);
        a2=new Button("Sub");
        a2.setBounds(120,180,80,20);
        a2.addActionListener(this);
        add(a2);
        a3=new Button("Mul");
        a3.setBounds(20,220,80,20);
        a3.addActionListener(this);
        add(a3);
        a4=new Button("Div");
        a4.setBounds(120,220,80,20);
        a4.addActionListener(this);
        add(a4);
        a5=new Button("clear");
        a5.setBounds(60,260,100,20);
        a5.addActionListener(this);
        add(a5);
        Label res=new Label("RESULT");
        res.setBounds(20,140,100,20);
        add(res);
         Res=new TextField();
        Res.setBounds(120,140,100,20);
        add(Res);

        setSize(500,500);
        setLayout(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==a1){
            int x=Integer.parseInt(FN.getText());
            int y=Integer.parseInt(SN.getText());
            int sum=x+y;
            Res.setText(""+sum);
        }
        else if(e.getSource()==a2){
            int x=Integer.parseInt(FN.getText());
            int y=Integer.parseInt(SN.getText());
            int sum=x-y;
            Res.setText(""+sum);
        }
        else if(e.getSource()==a3){
            int x=Integer.parseInt(FN.getText());
            int y=Integer.parseInt(SN.getText());
            int sum=x*y;
            Res.setText(""+sum);
        }
        else if(e.getSource()==a4){
            int x=Integer.parseInt(FN.getText());
            int y=Integer.parseInt(SN.getText());
            int sum=x/y;
            Res.setText(String.valueOf(sum));
        }
        else{
            FN.setText("");
            SN.setText("");
            Res.setText("");
        }
    }

    public static void main(String[] args) {
       Calc c=new Calc();
    }



}

