package swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//int s1;
public class gui1 implements  ActionListener
{
	
    static JFrame jf_intro=new JFrame();
    static JFrame jf=new JFrame("Registration Form");
    static String cb1[]= {" ","M","F","other"};
    static JTextField t_f_name=new JTextField(8);
    static JTextField t_l_name=new JTextField(8);
    static JTextField t_p_number=new JTextField(8);
    static JTextField t_dob=new JTextField(8);
    static JTextField t_father_name=new JTextField(8);
    static JTextField t_moters_name=new JTextField(8);
    static JTextField t_house_name=new JTextField(8);
    static JComboBox j_sex=new JComboBox(cb1);
    static JTextField t_pass_word=new JTextField();
    static JTextField t_user_name=new JTextField();
    static JLabel l_pass_word=new JLabel("id");
    static JLabel l_user_name=new JLabel("name");
    static JButton j_ok=new JButton("OK");
    static JButton make_new=new JButton("make new");
    public static void main(String[]args)
    {
    	 new_frame();
    }
    public static void new_frame()
    {
        jf.dispose();
        jf_intro.setLayout(new GridLayout(6,0,1,1));
        jf_intro.add(l_user_name);
        jf_intro.add(t_user_name);
        jf_intro.add(l_pass_word);
        jf_intro.add(t_pass_word);
        jf_intro.add(j_ok);
        jf_intro.add(make_new);
        gui1 g=new gui1();
        make_new.addActionListener(g);
        j_ok.addActionListener(g);
        jf_intro.setSize(400,200);
        jf_intro.setVisible(true);
        jf_intro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void f_frame()
    {
    	jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        gui1 g1=new gui1();
        jf_intro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf_intro.setBackground(Color.RED);
        jf.setBackground(Color.RED);
        t_p_number.setBackground(Color.LIGHT_GRAY);
        //jf_intro.setBackground(Color.darkGray);
        jf.add(new JLabel("                                                                                                       Registration Form"));
        String cb[]= {"a1","a2","a3"};
        // jf.add(new JComboBox(cb));
        JButton jb=new JButton("reset");
        JButton jb2=new JButton("ok");
        // jf.add(new JTextField(8));
        jf.setLayout(new GridLayout(19, 0,1 , 1));
        // Add labels and text fields to the frame
        jf.add(new JLabel("First Name"));
        jf.add(t_f_name);
        jf.add(new JLabel("last name"));
        // jf.add(new JComboBox(cb));
        jf.add(t_l_name);
        JLabel l_phone_number=new JLabel("phone number");
        // l_phone_number.setBackground(new ImageIcon("photo_2019-07-10_23-59-04"));
        jf.add(l_phone_number);
        jf.add(t_p_number);
        jf.add(new JLabel("DOB"));
        jf.add(t_dob);
        JLabel l1=new JLabel("father's name");
        jf.add(l1);
        jf.add(t_father_name);
        jf.add(new JLabel("mother's name"));
        jf.add(t_moters_name);
        jf.add(new JLabel("house name"));
        jf.add(t_house_name);
        jf.add(new JLabel("sex"));
        jf.add(j_sex);
        jb.setSize(30,40);
        jf.setSize( 1000, 2000);
        jf.add(jb);
        jf.add(jb2);
        //gui1 c=new gui1();
        jb.addActionListener(g1);
        jb2.addActionListener(g1);
        //jf.setOpacity();
        jf.setBackground(Color.blue);
        l1.setBackground(Color.green);
        //  System.out.println(c);
        System.out.println(t_f_name.getText());
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String response=e.getActionCommand();
        if(response=="ok")
        {
            System.out.println("ok is being pressed");
            String sex= String.valueOf(j_sex.getItemAt(j_sex.getSelectedIndex()));
            //  customer c1=new customer(t_father_name.getText(),t_f_name.getText(),t_l_name.getText(),t_moters_name.getText(),t_house_name.getText(),sex,Integer.valueOf(t_dob.getText()),Integer.valueOf(t_p_number.getText()));
           jf.dispose();
        }
        else if(response=="reset")
        {
            System.out.println("reset is being pressed");
            t_f_name.setText("");
            t_dob.setText("");
            t_father_name.setText("");
            t_house_name.setText("");
            t_l_name.setText("");
            t_moters_name.setText("");
            t_p_number.setText("");
            j_sex.setSelectedItem(" ");
            //jf.dispose();
        }
        else if(response=="make new")
        {
        	f_frame();
        	jf_intro.dispose();
        	System.out.println("test1243");
        	
        }
        else if(response=="OK")
        {
         jf_intro.dispose();
        }
    }
}
class customer
{
    private String first_name,last_name,fathers_name,mothers_name,house_name,sex;
    private int dob,phone_number;
    customer(String fathers_name,String first_name,String last_name,String mothers_name,String house_name,String sex,int dob,int phone_number)
    {
        this.dob=dob;
        this.phone_number=phone_number;
        this.fathers_name=fathers_name;
        this.mothers_name=mothers_name;
        this.first_name=first_name;
        this.last_name=last_name;
        this.house_name=house_name;
        this.sex=sex;
    }
}