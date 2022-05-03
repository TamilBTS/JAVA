import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet extends Frame {
    Applet(){
        Label FirstName=new Label("FirstName");
        FirstName.setBounds(20,50,80,20);
        Label Lastname=new Label("Lastname");
        Lastname.setBounds(20,90,80,20);
        Label DOB=new Label("DOB");
        DOB.setBounds(20,130,80,20);
        TextField FN=new TextField();
        FN.setBounds(120,50,100,20);
        TextField LN=new TextField();
        LN.setBounds(120,90,100,20);
        TextField DOB1=new TextField();
        DOB1.setBounds(120,130,100,20);
        Label Languages=new Label("Languages");
        Languages.setBounds(20,160,100,20);
        Checkbox c1=new Checkbox("C++");
        c1.setBounds(120,160,100,20);
        Checkbox c2=new Checkbox("Java");
        c2.setBounds(120,190,100,20);
        Checkbox c3=new Checkbox("Python");
        c3.setBounds(120,220,100,20);
        Checkbox c4=new Checkbox("C#");
        c4.setBounds(120,250,100,20);
        Label Gender=new Label("Gender");
        Gender.setBounds(20,280,100,20);
        JRadioButton r1=new JRadioButton("Male");
        r1.setBounds(120,280,100,20);
        JRadioButton r2=new JRadioButton("Female");
        r2.setBounds(120,310,100,20);
        JRadioButton r3=new JRadioButton("Others");
        r3.setBounds(120,340,100,20);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        Button submit=new Button("Submit");
        submit.setBounds(120,370,100,30);
        Button reset=new Button("Reset");
        reset.setBounds(10,370,100,30);


        add(FirstName);
        add(FN);
        add(Lastname);
        add(LN);
        add(DOB);
        add(DOB1);
        add(submit);
        add(reset);
        add(Languages);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(Gender);
        add(r1);
        add(r2);
        add(r3);

        setSize(300,300);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        Applet a=new Applet();
    }


}
