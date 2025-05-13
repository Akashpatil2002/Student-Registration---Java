import javax.swing.*; 
import java.awt.*;  
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.lang.Exception;
import java.sql.SQLException;
import java.util.Map;  
  

class Login extends JFrame implements ActionListener  
{   
    JButton btn1;  
    JPanel newPanel;  
    JLabel userLabel, passLabel;  
    final JTextField  tf1, tf2;  
    
    Login()  
    {     
    	JFrame fm=new JFrame();
    	fm.setSize(700,490);
    	fm.getContentPane().setLayout(null);
    	
    	JPanel panel = new JPanel();
    	panel.setBackground(Color.WHITE);
		panel.setBounds(275, 0, 421, 453);
		panel.setLayout(null);
		fm.getContentPane().add(panel);
		
		JLabel labellll = new JLabel("Login Here");
		labellll.setForeground(new Color(0, 191, 255));
		labellll.setBounds(63, 11, 121, 31);
		panel.add(labellll);
		labellll.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
        
		JLabel lbl1 = new JLabel("Username :-");
		lbl1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbl1.setBounds(72, 88, 93, 17);
		panel.add(lbl1);
        
		   
        
		JLabel lbl2 = new JLabel("Password :- ");
		lbl2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbl2.setBounds(73, 165, 72, 14);
		panel.add(lbl2);      
        
		tf2 = new JPasswordField();
		tf2.setBounds(73, 190, 255, 31);
		panel.add(tf2); 
      
		btn1=new JButton("Login");
		btn1.setBackground(new Color(255, 255, 240));
		btn1.setIcon(new ImageIcon("D:\\Eclipse Programs\\Logo\\login.png"));
       	btn1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btn1.setBounds(73, 277, 99, 37);
		panel.add(btn1);
		
		JButton btn2 = new JButton("Exit");
		btn2.setBackground(SystemColor.textHighlightText);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btn2.setIcon(new ImageIcon("D:\\Eclipse Programs\\Logo\\exit.png"));
		btn2.setBounds(230, 277, 99, 37);
		panel.add(btn2);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(0, 153, 204));
		panel1.setLayout(null);
		panel1.setBounds(-11, -17, 287, 473);
		
		fm.getContentPane().add(panel1);
		
		JLabel lbl7 = new JLabel("Akash");
		lbl7.setForeground(new Color(245, 255, 250));
		lbl7.setFont(new Font("Yu Gothic", Font.BOLD, 24));
		lbl7.setBounds(55, 58, 124, 40);
		panel1.add(lbl7);
		
		JLabel lbl3 = new JLabel("Developer");
		lbl3.setForeground(new Color(248, 248, 255));
		lbl3.setBackground(new Color(245, 255, 250));
		lbl3.setFont(new Font("Yu Gothic", Font.BOLD, 24));
		lbl3.setBounds(55, 96, 143, 45);
		panel1.add(lbl3);
		
		JLabel lblNewLabel = new JLabel("Or Login with");
		lblNewLabel.setForeground(SystemColor.controlText);
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		lblNewLabel.setBounds(73, 381, 99, 22);
		panel.add(lblNewLabel);
		
		JLabel lbl4 = new JLabel("");
		lbl4.setForeground(new Color(255, 255, 255));
		lbl4.setIcon(new ImageIcon("D:\\Eclipse Programs\\Logo\\Facebook\\user-avatar-with-check-mark.png"));
		lbl4.setBounds(65, 152, 173, 286);
		panel1.add(lbl4);
        btn1.addActionListener(this); 
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\Eclipse Programs\\Logo\\Facebook\\facebook.png"));
		label.setBounds(220, 372, 29, 31);
		panel.add(label);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Eclipse Programs\\Logo\\Facebook\\gmail.png"));
		lblNewLabel_2.setBounds(276, 373, 29, 31);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Eclipse Programs\\Logo\\Facebook\\twiter.png"));
		lblNewLabel_1.setBounds(326, 372, 29, 31);
		panel.add(lblNewLabel_1);
		
		tf1 = new JTextField();
		tf1.setBounds(73, 112, 255, 31);
		panel.add(tf1);
		tf1.setColumns(10);
	
    	fm.setVisible(true);
    }  
     
    public void actionPerformed(ActionEvent ae)     
    {  
    	
        String userValue = tf1.getText();         
        String passValue = tf2.getText();        
   
        if (userValue.equals("admin") && passValue.equals("admin")) {  
        	StudRagistr page = null;
			try {
				page = new StudRagistr();
			} catch (SQLException e) {
	
				e.printStackTrace();
			}  
         
            page.setVisible(true);  
            }  
      //JOptionPane.showMessageDialog(null, "Please Enter Username & Password","Error",JOptionPane.ERROR_MESSAGE);
        else{  
         
        	JOptionPane.showMessageDialog(newPanel, "Please enter valid username and password !!!","Login Error",JOptionPane.ERROR_MESSAGE);
        }  
        
    }  
    
    public static void main(String arg[])  
    {  
        try  
        {   
        	Login ff = new Login();  
              
        }  
        catch(Exception e)  
        {       
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }  
    }  
}