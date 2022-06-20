import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;

public class OrderTicket extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPhoneNumber;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtAdults;
	private JTextField txtKids;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderTicket frame = new OrderTicket();
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
	public OrderTicket() {
		setTitle("Order");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 684, 21);
		contentPane.add(menuBar);
		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setFont(new Font("Courier New", Font.ITALIC, 12));
		menuBar.add(mnHelp);
		
		JMenuItem mntmHowToUse = new JMenuItem("How To Use");
		mntmHowToUse.setFont(new Font("Courier New", Font.ITALIC, 12));
		mnHelp.add(mntmHowToUse);
		
		JMenu mnOther = new JMenu("Other");
		mnOther.setFont(new Font("Courier New", Font.ITALIC, 12));
		menuBar.add(mnOther);
		
		JMenuItem mntmMadeBy = new JMenuItem("Made By");
		mntmMadeBy.setFont(new Font("Courier New", Font.ITALIC, 12));
		mnOther.add(mntmMadeBy);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 102, 102));
		panel.setBounds(0, 414, 584, 97);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(255, 153, 255));
		panel_1.setBounds(20, 81, 533, 322);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtAdults = new JTextField();
		txtAdults.setText("0");
		txtAdults.setEnabled(false);
		txtAdults.setBounds(232, 76, 47, 20);
		panel_1.add(txtAdults);
		txtAdults.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 144, 322);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(new Color(255, 153, 153));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Costumer Name :");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 124, 20);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Phone Number :");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 42, 124, 14);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblFamilyMember = new JLabel("Family Member :");
		lblFamilyMember.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblFamilyMember.setBounds(10, 79, 124, 14);
		panel_2.add(lblFamilyMember);
		
		JLabel lblNewLabel_2 = new JLabel("Additional :");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 146, 124, 14);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Membership :");
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 207, 124, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Date : ");
		lblNewLabel_4.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 239, 46, 14);
		panel_2.add(lblNewLabel_4);
		
		txtName = new JTextField();
		txtName.setBounds(154, 11, 369, 20);
		panel_1.add(txtName);
		txtName.setColumns(10);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setBounds(154, 42, 144, 20);
		panel_1.add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);
		
		txtKids = new JTextField();
		txtKids.setText("0");
		txtKids.setEnabled(false);
		txtKids.setColumns(10);
		txtKids.setBounds(232, 113, 47, 20);
		panel_1.add(txtKids);
		
		JCheckBox chckbxAdult = new JCheckBox("Adults");
		chckbxAdult.setBackground(new Color(255, 153, 255));
		chckbxAdult.setBounds(150, 75, 81, 23);
		panel_1.add(chckbxAdult);
		chckbxAdult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxAdult.isSelected()) {
					txtAdults.setEnabled(true);
					
				}
				else {
					txtAdults.setText("");
					txtAdults.setEnabled(false);
					
				}
		}
		});
		
		JCheckBox chckbxChildren = new JCheckBox("Children");
		chckbxChildren.setBackground(new Color(255, 153, 255));
		chckbxChildren.setBounds(150, 112, 81, 23);
		panel_1.add(chckbxChildren);
		chckbxChildren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxChildren.isSelected()) {
					txtKids.setEnabled(true);
				}
				else {
					txtKids.setText("");
					txtKids.setEnabled(false);
				}
		}
		});
		
		JCheckBox chckbxTramRide = new JCheckBox("Tram Ride");
		chckbxTramRide.setBackground(new Color(255, 153, 255));
		chckbxTramRide.setBounds(150, 144, 81, 23);
		panel_1.add(chckbxTramRide);
		
		JCheckBox chckbxAquarium = new JCheckBox("Aquarium");
		chckbxAquarium.setBackground(new Color(255, 153, 255));
		chckbxAquarium.setBounds(150, 170, 81, 23);
		panel_1.add(chckbxAquarium);
		
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		buttonGroup.add(rdbtnYes);
		rdbtnYes.setBackground(new Color(255, 153, 255));
		rdbtnYes.setBounds(150, 205, 56, 23);
		panel_1.add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setSelected(true);
		buttonGroup.add(rdbtnNo);
		rdbtnNo.setBackground(new Color(255, 153, 255));
		rdbtnNo.setBounds(242, 205, 56, 23);
		panel_1.add(rdbtnNo);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(328, 76, 195, 128);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Adult : RM15 Per Person");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Rockwell", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 11, 164, 14);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Children : RM7 Per Person");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setFont(new Font("Rockwell", Font.PLAIN, 12));
		lblNewLabel_5_1.setBounds(10, 36, 164, 14);
		panel_3.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6 = new JLabel("Tram Ride : RM 6 Per Person");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Rockwell", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(10, 66, 164, 14);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5_2 = new JLabel("Aquarium : RM 12 Per Person");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setFont(new Font("Rockwell", Font.PLAIN, 12));
		lblNewLabel_5_2.setBounds(10, 91, 175, 14);
		panel_3.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("PRICE");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(328, 42, 195, 36);
		panel_1.add(lblNewLabel_4_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(154, 235, 108, 20);
		panel_1.add(dateChooser);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				txtName.setText("");
				txtPhoneNumber.setText("");
				txtAdults.setText("0");
				txtKids.setText("0");
				
				chckbxAdult.setSelected(false);
				chckbxChildren.setSelected(false);
				chckbxTramRide.setSelected(false);
				chckbxAquarium.setSelected(false);
				rdbtnNo.setSelected(true);
				rdbtnYes.setSelected(false);
				txtAdults.setEnabled(false);
				txtKids.setEnabled(false);
				
			}
		});
		btnClear.setFont(new Font("Lato", Font.BOLD, 16));
		btnClear.setBounds(81, 11, 140, 75);
		panel.add(btnClear);
		
		JButton btnOrder = new JButton("Pay");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String CustomerName = txtName.getText();
				String PhoneNum = txtPhoneNumber.getText();
				double TramRide = 0;
				double Aquarium = 0;
				double NumChildren = Double.parseDouble(txtKids.getText());
				double NumAdult = Double.parseDouble(txtAdults.getText());
				double MembershipTotal = 0;
				
				
				if(chckbxTramRide.isSelected()) {
					TramRide = 6 * NumChildren * NumAdult;
				}
				if(chckbxAquarium.isSelected()) {
					Aquarium = 12 * NumChildren * NumAdult;
				}
				if (rdbtnYes.isSelected() == true) {
					MembershipTotal = 0.20 * NumChildren * NumAdult;
				}
				
				double PriceChildren = 0;
				PriceChildren = 7 * NumChildren;
				double PriceAdult = 0;
				PriceAdult = 15 * NumAdult;
				double PriceTotal = 0;
				PriceTotal = PriceChildren + PriceAdult + TramRide + Aquarium + MembershipTotal;		
				
				boolean process = false;
				boolean nameerror = false;
				boolean phonenoerror = false;
				boolean childrenerror = false;
				boolean adulterror = false;
				
				
				if (CustomerName.isEmpty()) {
					nameerror = true;
				}
				if (PhoneNum.isEmpty()) {
					phonenoerror = true;
				}
				if (chckbxChildren.isSelected() == true && NumChildren == 0) {
					childrenerror = true;
					
				}
				if (chckbxChildren.isSelected() == true && NumAdult == 0) {
					adulterror = true;
				}
				
				if (nameerror || phonenoerror || childrenerror || adulterror ) {
					String error = "Check your required field:";
					if (nameerror) {
						error += "\nName is empty";
					}
					if (phonenoerror) {
						error += "\nPhone number is empty";
					}
					if (childrenerror) {
						error += "\nNumber Of children is Empty";
					}
					if (adulterror) {
						error += "\nNumber of Adults is Empty";
					}
					JOptionPane.showMessageDialog(null,error,"",JOptionPane.ERROR_MESSAGE);
				} else {
					process = true;
					Payment jf3 = new Payment();
					jf3.show();
					jf3.my_update(CustomerName, PhoneNum, TramRide, Aquarium, PriceChildren, PriceAdult, PriceTotal, MembershipTotal);
					dispose();
				}
			}
		});
		btnOrder.setFont(new Font("Lato", Font.BOLD, 16));
		btnOrder.setBounds(357, 11, 140, 75);
		panel.add(btnOrder);
		
		JLabel lblOrderTitle = new JLabel("Order for Costumer");
		lblOrderTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrderTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblOrderTitle.setBounds(10, 32, 564, 38);
		contentPane.add(lblOrderTitle);
	}
}
