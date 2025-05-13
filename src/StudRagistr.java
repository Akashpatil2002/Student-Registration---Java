
//Ata paryant success zala ahe 31-12-2022
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.Statement;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class StudRagistr {

	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	Statement stmt;
	String filename = null;
	byte[] personimg = null;
	byte[] img = null;

	private DefaultTableModel model;
	private JTable table;
	private JTextField txt;
	private final JSeparator separator_1 = new JSeparator();
	String s;
//	private JComboBox date;
//    private JComboBox month;
//    private JComboBox year;
//	
//        private String dates[]
//            = { "1", "2", "3", "4", "5",
//                "6", "7", "8", "9", "10",
//                "11", "12", "13", "14", "15",
//                "16", "17", "18", "19", "20",
//                "21", "22", "23", "24", "25",
//                "26", "27", "28", "29", "30",
//                "31" };
//        private String months[]
//            = { "Jan", "feb", "Mar", "Apr",
//                "May", "Jun", "July", "Aug",
//                "Sup", "Oct", "Nov", "Dec" };
//        private String years[]
//            = { "1995", "1996", "1997", "1998",
//                "1999", "2000", "2001", "2002",
//                "2003", "2004", "2005", "2006",
//                "2007", "2008", "2009", "2010",
//                "2011", "2012", "2013", "2014",
//                "2015", "2016", "2017", "2018",
//                "2019","2020","2021","2022" };

	public StudRagistr() throws SQLException {

		JFrame fm = new JFrame();
		fm.getContentPane().setBackground(new Color(240, 240, 240));

		fm.setBounds(10, 10, 1341, 707);
		fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font f = new Font("Times New Roman", Font.BOLD, 20);

		JLabel lbl = new JLabel("Student Ragistration System");
		lbl.setBounds(501, 0, 300, 48);
		lbl.setBackground(Color.WHITE);
		lbl.setForeground(Color.BLACK);
		lbl.setVisible(true);
		fm.getContentPane().setLayout(null);
		lbl.setFont(new Font("Segoe UI Symbol", Font.BOLD | Font.ITALIC, 22));
		fm.getContentPane().add(lbl);

		JLabel lbl1 = new JLabel("Name : ");
		lbl1.setBounds(39, 123, 104, 40);
		lbl1.setVisible(true);
		lbl1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		fm.getContentPane().add(lbl1);

		JLabel lbl3 = new JLabel("User ID : ");
		lbl3.setBounds(39, 219, 83, 40);
		lbl3.setVisible(true);
		lbl3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		fm.getContentPane().add(lbl3);

		JLabel lbl4 = new JLabel("Password : ");
		lbl4.setBounds(39, 269, 89, 40);
		lbl4.setVisible(true);
		lbl4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		fm.getContentPane().add(lbl4);

		JLabel lbl5 = new JLabel("Email-Id : ");
		lbl5.setBounds(39, 319, 89, 40);
		lbl5.setVisible(true);
		lbl5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		fm.getContentPane().add(lbl5);

		JLabel lbl6 = new JLabel("Mobile Number :");
		lbl6.setBounds(39, 369, 130, 40);
		lbl6.setVisible(true);
		lbl6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		fm.getContentPane().add(lbl6);

		final JTextField tf = new JTextField();
		tf.setBounds(179, 132, 150, 25);
		tf.setVisible(true);
		fm.getContentPane().add(tf);

//	        date = new JComboBox(dates);
//	        date.setFont(new Font("Arial", Font.PLAIN, 15));
//	        date.setSize(47, 20);
//	        date.setLocation(179, 197);
//	        fm.getContentPane().add(date);
//	 
//	        month = new JComboBox(months);
//	        month.setFont(new Font("Arial", Font.PLAIN, 15));
//	        month.setSize(53, 20);
//	        month.setLocation(233, 197);
//	        fm.getContentPane().add(month);
//	 
//	        year = new JComboBox(years);
//	        year.setFont(new Font("Arial", Font.PLAIN, 15));
//	        year.setSize(65, 20);
//	        year.setLocation(296, 197);
//	        fm.getContentPane().add(year)

		final JTextField tf1 = new JTextField();
		tf1.setBounds(179, 183, 150, 25);
		fm.getContentPane().add(tf1);
		tf1.setColumns(10);

		final JTextField tf2 = new JTextField();
		tf2.setBounds(179, 228, 150, 25);
		tf2.setVisible(true);
		fm.getContentPane().add(tf2);

		final JPasswordField tf3 = new JPasswordField();
		tf3.setBounds(179, 278, 150, 25);
		tf3.setVisible(true);
		fm.getContentPane().add(tf3);

		final JTextField tf4 = new JTextField();
		tf4.setBounds(179, 328, 150, 25);
		tf4.setVisible(true);
		fm.getContentPane().add(tf4);

		final JTextField tf5 = new JTextField();
		tf5.setBounds(179, 378, 150, 25);
		tf5.setVisible(true);
		fm.getContentPane().add(tf5);

		final JTextField tf6 = new JTextField();
		tf6.setBounds(179, 84, 150, 25);
		tf6.setVisible(true);
		fm.getContentPane().add(tf6);

		final JScrollPane sp = new JScrollPane();
		sp.setBounds(358, 183, 948, 402);

		sp.setEnabled(false);
		fm.getContentPane().add(sp);

		final JRadioButton m = new JRadioButton("Male");
		m.setBounds(179, 422, 53, 21);
		m.setFont(new Font("Tahoma", Font.BOLD, 10));
		m.setBackground(new Color(214, 244, 254));
		fm.getContentPane().add(m);

		final JRadioButton fe = new JRadioButton("Female");
		fe.setBounds(256, 422, 73, 21);
		fe.setFont(new Font("Tahoma", Font.BOLD, 10));
		fe.setBackground(new Color(214, 244, 254));
		ButtonGroup bg = new ButtonGroup();
		bg.add(m);
		bg.add(fe);
		fm.getContentPane().add(fe);

		final TextArea ta = new TextArea(10, 15);
		ta.setBounds(118, 467, 215, 107);
		fm.getContentPane().add(ta);

		table = new JTable();
		table.setBackground(new Color(230, 230, 230));
		model = new DefaultTableModel();
		Object[] column = { "ID", "Name", "DOB", "User ID", "Password", "E-mail", "Phone", "Gender", "Address",
				"Image" };
		final Object[] row = new Object[6];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		sp.setViewportView(table);

		JLabel lbl7 = new JLabel("ID :");
		lbl7.setBounds(39, 78, 89, 35);
		lbl7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		fm.getContentPane().add(lbl7);

		JLabel lblNewLabel = new JLabel("DOB ;");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(39, 186, 45, 13);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		fm.getContentPane().add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(19, 65, 321, 588);
		panel_1.setBackground(new Color(207, 242, 254));
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		fm.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JButton btn = new JButton("  Save");
		btn.setBounds(24, 538, 109, 40);
		panel_1.add(btn);
		btn.setIcon(new ImageIcon("D:\\Eclipse Programs\\Logo\\New PNG.png"));
		btn.setHorizontalAlignment(SwingConstants.LEADING);

		btn.setFont(new Font("Times New Roman", Font.BOLD, 14));

		final JLabel lblimg = new JLabel("");
		lblimg.setBounds(1167, 0, 150, 137);
		fm.getContentPane().add(lblimg);
		JButton btnchoose = new JButton("Brows");
		btnchoose.setForeground(new Color(51, 102, 255));
		btnchoose.setSize(50, 50);
		btnchoose.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnchoose.setBounds(1177, 138, 129, 25);
		btnchoose.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnchoose.setIcon(new ImageIcon("D:\\Eclipse Programs\\Logo\\Facebook\\chooose.png"));

//			ithun

		btnchoose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
				FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
				fileChooser.addChoosableFileFilter(filter);
				int result = fileChooser.showSaveDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fileChooser.getSelectedFile();
					String path = selectedFile.getAbsolutePath();
					lblimg.setIcon(ResizeImage(path));
					s = path;
				} else if (result == JFileChooser.CANCEL_OPTION) {
					System.out.println("No Data");
				}
			}

			private Icon ResizeImage(String path) {
				ImageIcon MyImage = new ImageIcon(path);
				Image img = MyImage.getImage();
				Image newImage = img.getScaledInstance(lblimg.getWidth(), lblimg.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon image = new ImageIcon(newImage);
				return image;
			}
		});

		// button to insert image and some data into mysql database

		fm.getContentPane().add(lblimg);

//			btnchoose.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//					JFileChooser chooser=new JFileChooser();
//					chooser.showOpenDialog(null);
//					File f=chooser.getSelectedFile();
//					filename=f.getAbsolutePath();
//					ImageIcon imgicon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(),Image.SCALE_SMOOTH));
//					lblimg.setIcon(imgicon);
//					try {
//						File image=new File(filename);
//						FileInputStream fis=new FileInputStream(image);
//						ByteArrayOutputStream bos=new ByteArrayOutputStream();
//						byte[] buf=new byte[1024];
//						for(int readNum;(readNum=fis.read(buf))!=-1;) {
//							bos.write(buf,0,readNum);
//						}
//						personimg=bos.toByteArray();
//					}
//					catch(Exception ex) {
//						JOptionPane.showMessageDialog(null, ex);
//					}
//					
//				}
//			});
		fm.getContentPane().add(btnchoose);

		table.addMouseListener(new MouseAdapter() {
			private Date dob1;

			@Override
			public void mouseClicked(MouseEvent e) throws NullPointerException {
				int i = table.getSelectedRow();

				String id = table.getValueAt(i, 0).toString();
				String name = table.getValueAt(i, 1).toString();
				String dob = table.getValueAt(i, 2).toString();
				String user = table.getValueAt(i, 3).toString();
				String pass = table.getValueAt(i, 4).toString();
				String email = table.getValueAt(i, 5).toString();
				String mobile = table.getValueAt(i, 6).toString();
				String gender = table.getValueAt(i, 7).toString();
				if (gender.equals("Male")) {
					m.setSelected(true);
				} else {
					fe.setSelected(true);
				}
				String address = table.getValueAt(i, 8).toString();

				tf6.setText(id);
				tf.setText(name);
				tf1.setText(dob);
				tf2.setText(user);
				tf3.setText(pass);
				tf4.setText(email);
				tf5.setText(mobile);
				ta.setText(address);

			}
		});

		JSeparator separator = new JSeparator();
		separator.setBounds(-21, 46, 1043, 2);
		fm.getContentPane().add(separator);

		JLabel lblNewLabel_1 = new JLabel("Address :");
		lblNewLabel_1.setBounds(39, 465, 83, 25);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		fm.getContentPane().add(lblNewLabel_1);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1327, 48);
		panel.setBackground(new Color(116, 218, 252));
		fm.getContentPane().add(panel);
		separator_1.setBounds(0, 46, 1001, 2);
		fm.getContentPane().add(separator_1);

		JButton show = new JButton("View");
		show.setBounds(186, 538, 114, 40);
		panel_1.add(show);
		show.setIcon(new ImageIcon("D:\\Eclipse Programs\\Logo\\View1.png"));
		show.setFont(new Font("Times New Roman", Font.BOLD, 14));

		JLabel lbl9 = new JLabel("Gender :");
		lbl9.setVisible(true);
		lbl9.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbl9.setBounds(21, 354, 112, 25);
		panel_1.add(lbl9);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(348, 167, 969, 486);
		panel_2.setBackground(new Color(255, 255, 204));
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		fm.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JButton btnup = new JButton(" Update");
		btnup.setBounds(43, 436, 109, 40);
		panel_2.add(btnup);
		btnup.setIcon(new ImageIcon("D:\\Eclipse Programs\\Logo\\update.png"));
		btnup.setFont(new Font("Times New Roman", Font.BOLD, 14));

		final JButton btndel = new JButton("Delete");
		btndel.setBounds(299, 436, 114, 40);
		panel_2.add(btndel);
		btndel.setIcon(new ImageIcon("D:\\Eclipse Programs\\Logo\\delete.png"));
		btndel.setFont(new Font("Times New Roman", Font.BOLD, 14));

		JButton btnclr = new JButton(" Clear");
		btnclr.setBounds(566, 436, 109, 40);
		panel_2.add(btnclr);
		btnclr.setIcon(new ImageIcon("D:\\Eclipse Programs\\Logo\\clear.png"));
		btnclr.setFont(new Font("Times New Roman", Font.BOLD, 14));

		JButton btnexit = new JButton(" Exit");
		btnexit.setBounds(821, 436, 114, 40);
		panel_2.add(btnexit);
		btnexit.setIcon(new ImageIcon("D:\\Eclipse Programs\\Logo\\exit.png"));
		btnexit.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnclr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf6.setText("");
				tf.setText("");
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				ta.setText("");
			}
		});
		btndel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
					int row = table.getSelectedRow();
					String val = (table.getModel().getValueAt(row, 0).toString());
					int p = JOptionPane.showConfirmDialog(null, "Are You Sure To Delete", "Delete",
							JOptionPane.YES_NO_OPTION);
					if (p == 0) {
						String query = "DELETE FROM `newonee` WHERE ID= " + val;
						pst = con.prepareStatement(query);
						pst.executeUpdate();
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						model.setRowCount(0);
						JOptionPane.showMessageDialog(null, "Recored Deleted...");

						tf.setText("");
						tf1.setText("");
						tf2.setText("");
						tf3.setText("");
						tf4.setText("");
						tf5.setText("");
						tf.requestFocus();

					}
				} catch (Exception e3) {
					JOptionPane.showMessageDialog(null, e3);
				}

			}
		});
		btnup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
					int row = table.getSelectedRow();
					String value = (table.getModel().getValueAt(row, 0).toString());
					String query = "UPDATE `newonee` SET `Name`=?,`DOB`=?,`User ID`=?,`Password`=?,`E-mail`=?,`Phone`=?,`Gender`=?,`Address`=?  WHERE `ID`="
							+ value;
					pst = con.prepareStatement(query);
					pst.setString(1, tf.getText());
					pst.setString(2, tf1.getText());
					pst.setString(3, tf2.getText());
					pst.setString(4, tf3.getText());
					pst.setString(5, tf4.getText());
					pst.setString(6, tf5.getText());
					String gen = null;
					if (m.isSelected()) {
						gen = "Male";
					}
					if (fe.isSelected()) {
						gen = "Female";
					}
					pst.setString(7, gen);
					pst.setString(8, ta.getText());

					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Recored Has Been Updated...! ");

					tf.setText("");
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
					tf4.setText("");
					tf5.setText("");
					ta.setText("");

				} catch (Exception e4) {
					e4.printStackTrace();
				}
			}
		});

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

//					String first=tf.getText();
//					String last=tf1.getText();
//					String user=tf2.getText();
//					String password=tf3.getText();
//					String email=tf4.getText();
//					String mobile=tf5.getText();

					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
					String query = "INSERT INTO `newonee`(`Name`, `DOB`, `User ID`, `Password`, `E-mail`, `Phone`, `Gender`, `Address`, `Image`) VALUES (?,?,?,?,?,?,?,?,?)";
					pst = con.prepareStatement(query);
					InputStream is = new FileInputStream(new File(s));
					pst.setString(1, tf.getText());
					pst.setString(2, tf1.getText());
					pst.setString(3, tf2.getText());
					pst.setString(4, tf3.getText());
					pst.setString(5, tf4.getText());
					pst.setString(6, tf5.getText());
					String dept = null;
					if (m.isSelected()) {
						dept = m.getText();
					}
					if (fe.isSelected()) {
						dept = fe.getText();
					}
					pst.setString(7, dept);
					pst.setString(8, ta.getText());
//					pst.setString(1, first);
//					pst.setString(2, last);
//					pst.setString(3, user);
//					pst.setString(4, password);
//					pst.setString(5, email);
//					pst.setString(6, mobile);
					pst.setBlob(9, is);
					pst.executeUpdate();

					JOptionPane.showMessageDialog(null, "Data Successfully Added");

					con.close();

				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		btn.setVisible(true);
		show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sql = "SELECT * from newonee";

				try {
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
					PreparedStatement pst = con.prepareStatement(sql);
					ResultSet rs = pst.executeQuery();
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.setRowCount(0);
					while (rs.next()) {
						model.addRow(new String[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
								rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9) });
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		fm.setVisible(true);
	}

	public static void main(String[] args) throws SQLException {
		StudRagistr s = new StudRagistr();
	}

	public void setVisible(boolean b) {
	}

	public Container getContentPane() {
		return null;
	}
}
