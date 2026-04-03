package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JDateChooser dateChooser;
    JRadioButton r1,r2,m1,m2,m3;
    Button buttonNEXT;

    JTextField textName,textFName ,textState, textPinCod, textCity, textAddress, textEmail;
    Random ran=new Random();
    long first4=(ran.nextLong()%9000L)+1000L;
    String first=" "+Math.abs(first4);

    Signup(){

        super("APPLICATION FORM");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO : "+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway", Font.BOLD,38));
        add(label1);

        JLabel label2=new JLabel("Page 1");
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        add(label2);

        JLabel label3 =new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,100,600,30);
        add(label3);

        JLabel labelName=new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,300,30);
        add(labelName);

        textName =new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelFName=new JLabel("Father's Name : ");
        labelFName.setBounds(100,240,200,30);
        labelFName.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelFName);

        textFName=new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(300,240,400,30);
        add(textFName);

        JLabel DOB=new JLabel("Date Of Birth : ");
        DOB.setBounds(100,290,200,30);
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        add(DOB);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,400,30);
        add(dateChooser);

        JLabel labelG=new JLabel("Gender : ");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,340,200,30);
        add(labelG);

        r1=new JRadioButton("Male");
        r1.setBounds(300,340,60,30);
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        add(r1);

        r2=new JRadioButton("Female");
        r2.setBounds(450,340,90,30);
        r2.setBackground(new Color(222,255,228));
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        add(r2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail=new JLabel("Email address : ");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail=new JTextField();
        textEmail.setBounds(300,390,400,30);
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        add(textEmail);

        JLabel labelMartialstatus=new JLabel("Martial Status : ");
        labelMartialstatus.setBounds(100,440,200,30);
        labelMartialstatus.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelMartialstatus);

//        textMartialStatus=new JTextField();
//        textMartialStatus.setFont(new Font("Raleway",Font.BOLD,14));
//        textMartialStatus.setBounds(300,440,400,30);
//        add(textMartialStatus);
        m1=new JRadioButton("Married");
        m1.setBounds(300,440,100,30);
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
         add(m1);

        m2=new JRadioButton("Unmarried");
        m2.setBounds(450,440,100,30);
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        add(m2);

        m3=new JRadioButton("Other");
        m3.setBounds(600,440,100,30);
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        add(m3);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAddress =new JLabel("Address : ");
        labelAddress.setBounds(100,490,200,30);
        labelAddress.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelAddress);

        textAddress=new JTextField();
        textAddress.setFont(new Font("Raleway",Font.BOLD,14));
        textAddress.setBounds(300,490,400,30);
        add(textAddress);

        JLabel labelCity=new JLabel("City : ");
        labelCity.setBounds(100,540,200,30);
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelCity);

        textCity=new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel labelPinCode=new JLabel("Pin Code : ");
        labelPinCode.setBounds(100,640,200,30);
        labelPinCode.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelPinCode);

        textPinCod=new JTextField();
        textPinCod.setFont(new Font("Raleway",Font.BOLD,14));
        textPinCod.setBounds(300,640,400,30);
        add(textPinCod);

        JLabel labelState=new JLabel("State : ");
        labelState.setBounds(100,590,200,30);
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelState);

        textState=new JTextField();
        textState.setBounds(300,590,400,30);
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        add(textState);

        buttonNEXT=new Button("Next");
        buttonNEXT.setBounds(620,700,100,30);
        buttonNEXT.setForeground(Color.WHITE);
        buttonNEXT.setBackground(Color.BLACK);
        buttonNEXT.setFont(new Font("Raleway",Font.BOLD,14));
        buttonNEXT.addActionListener(this);
        add(buttonNEXT);




        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

public void actionPerformed(ActionEvent e){
        //taking all the information which
       // user entered and then we have to store it in the database;
    String formno=first;
    String name = textName.getText();
    String fname=textFName.getText();
    String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
    String gender=null;
    if(r1.isSelected()){
        gender="Male";
    }
    else if(r2.isSelected()){
        gender="Female";
    }
    String email=textEmail.getText();
    String martial = null;
    if(m1.isSelected()){
        martial="Married";
    }
    else if(m2.isSelected()){
        martial="Unmarried";
    }
    else if(m3.isSelected()){
        martial="Other";
    }
    String address=textAddress.getText();
    String city=textCity.getText();
    String pincode=textPinCod.getText();
    String state=textState.getText();

    //storing the info in the databse
    try {
        if (textName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fill all the fields");
        } else {
            Con con1 = new Con();
            String q = "insert into signup values('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + martial + "','" + address + "','" + city + "','" + pincode + "','" + state + "')";
            con1.statement.executeUpdate(q);
            new Signup2(formno);
            setVisible(false);
        }
    }
    catch(Exception E){
        E.printStackTrace();
    }

}
    public static void main(String[] args) {
        new Signup();
    }
}
