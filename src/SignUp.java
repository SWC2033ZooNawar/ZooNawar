import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField txtFullName;
	private JTextField txtUsername;
	private JPasswordField txtpass;
	private JPasswordField txtconfirmpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUp() {
		setTitle("Sign Up Screen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 51));
		panel.setBounds(0, 0, 619, 374);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 51));
		panel_1.setBounds(-1, 0, 167, 374);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFullName = new JLabel("Full Name : ");
		lblFullName.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblFullName.setBounds(28, 60, 132, 28);
		panel_1.add(lblFullName);
		lblFullName.setForeground(Color.WHITE);
		
		JLabel lblusername = new JLabel("Username : ");
		lblusername.setForeground(Color.WHITE);
		lblusername.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblusername.setBounds(28, 148, 132, 14);
		panel_1.add(lblusername);
		
		JLabel lblpass = new JLabel("Password : ");
		lblpass.setForeground(Color.WHITE);
		lblpass.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblpass.setBounds(28, 222, 132, 14);
		panel_1.add(lblpass);
		
		JLabel lblconfirmpass = new JLabel("Confirm Password : ");
		lblconfirmpass.setBackground(new Color(255, 255, 255));
		lblconfirmpass.setForeground(Color.WHITE);
		lblconfirmpass.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblconfirmpass.setBounds(28, 296, 132, 14);
		panel_1.add(lblconfirmpass);
		
		JLabel lblSignUpText = new JLabel("Sign Up");
		lblSignUpText.setBackground(new Color(51, 0, 102));
		lblSignUpText.setFont(new Font("Perpetua Titling MT", Font.BOLD, 16));
		lblSignUpText.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignUpText.setBounds(10, 11, 150, 36);
		panel_1.add(lblSignUpText);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Malgun Gothic", Font.BOLD, 14));
		btnReset.setBackground(new Color(255, 51, 153));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFullName.setText("");
				txtUsername.setText("");
				txtpass.setText("");
				txtconfirmpass.setText("");
			}
		});
		btnReset.setBounds(28, 335, 104, 28);
		panel_1.add(btnReset);
		
		txtFullName = new JTextField();
		txtFullName.setForeground(Color.BLACK);
		txtFullName.setBackground(Color.WHITE);
		txtFullName.setBounds(179, 64, 258, 20);
		panel.add(txtFullName);
		txtFullName.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setForeground(Color.BLACK);
		txtUsername.setBackground(Color.WHITE);
		txtUsername.setBounds(179, 142, 258, 20);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtpass = new JPasswordField();
		txtpass.setForeground(Color.BLACK);
		txtpass.setBackground(Color.WHITE);
		txtpass.setBounds(179, 220, 258, 20);
		panel.add(txtpass);
		
		txtconfirmpass = new JPasswordField();
		txtconfirmpass.setForeground(Color.BLACK);
		txtconfirmpass.setBackground(Color.WHITE);
		txtconfirmpass.setBounds(179, 298, 258, 20);
		panel.add(txtconfirmpass);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnter.setFont(new Font("Malgun Gothic", Font.BOLD, 14));
		btnEnter.setForeground(Color.BLACK);
		btnEnter.setBackground(new Color(255, 51, 204));
		btnEnter.setBounds(180, 329, 124, 34);
		panel.add(btnEnter);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Malgun Gothic", Font.BOLD, 14));
		btnExit.setBackground(new Color(255, 51, 204));
		btnExit.setForeground(Color.BLACK);
		btnExit.setBounds(313, 329, 124, 34);
		panel.add(btnExit);
		
		JLabel lblZooImg = new JLabel("");
		lblZooImg.setIcon(new ImageIcon("E:\\Xeon Gaming\\Downloads\\depositphotos_28402621-stock-photo-cartoon-zoo-illustration-for-the.jpg"));
		lblZooImg.setBounds(452, 0, 167, 374);
		panel.add(lblZooImg);
		
		JLabel lblWelcome = new JLabel("Welcome New Users! Please Register Yourself!");
		lblWelcome.setFont(new Font("Palatino Linotype", Font.BOLD, 12));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setForeground(Color.WHITE);
		lblWelcome.setBounds(180, 11, 257, 28);
		panel.add(lblWelcome);
	}
}
