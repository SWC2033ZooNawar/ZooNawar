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
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;
import com.github.lgooddatepicker.components.DateTimePicker;
import javax.swing.JTree;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;
import javax.swing.SpinnerNumberModel;
import com.github.lgooddatepicker.components.TimePicker;
import javax.swing.JSeparator;

public class OrderTicket extends JFrame {
	
	DecimalFormat priceformatter = new DecimalFormat("#0.00");
	
	private JPanel contentPane;
	private JTextField txtPhoneNumber;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtNameOut;
	private JTextField txtPhoneNumOut;
	private JTextField txtAdultsout;
	private JTextField txtChildOut;
	private JTextField txtAdditionalOut;
	private JTextField txtMembershipOut;
	private JTextField txtDateOut;
	private JTextField txtTimeOut;
	private JTextField txtTotal;
	private JSpinner txtKids;
	private JSpinner txtAdults;
	private JButton btnSubmit;
	private JCheckBox chckbxTramRide;
	private JCheckBox chckbxAquarium;
	private JRadioButton rdbtnYes;
	private JRadioButton rdbtnNo;
	private JDateChooser dateChooser;
	private TimePicker timePicker;
	private JLabel lblName;

	//Default Constructor
	public OrderTicket() {
		setTitle("Order");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 954, 543);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 938, 21);
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
		panel.setBounds(10, 414, 558, 79);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(255, 153, 255));
		panel_1.setBounds(20, 81, 533, 322);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
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
		
		JLabel lblDatetime = new JLabel("Date and Time : ");
		lblDatetime.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblDatetime.setBounds(10, 243, 124, 14);
		panel_2.add(lblDatetime);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setBounds(154, 42, 164, 20);
		panel_1.add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);

		
		JCheckBox chckbxTramRide = new JCheckBox("Tram Ride");
		chckbxTramRide.setBackground(new Color(255, 153, 255));
		chckbxTramRide.setBounds(150, 144, 134, 23);
		panel_1.add(chckbxTramRide);
		
		JCheckBox chckbxAquarium = new JCheckBox("Aquarium");
		chckbxAquarium.setBackground(new Color(255, 153, 255));
		chckbxAquarium.setBounds(150, 170, 134, 23);
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
		
		JSpinner txtAdults = new JSpinner();
		txtAdults.setModel(new SpinnerNumberModel(0, 0, 30, 1));
		txtAdults.setBounds(242, 73, 76, 20);
		panel_1.add(txtAdults);
		
		JSpinner txtKids = new JSpinner();
		txtKids.setModel(new SpinnerNumberModel(0, 0, 30, 1));
		txtKids.setBounds(242, 113, 76, 20);
		panel_1.add(txtKids);
		
		JLabel lblAdult = new JLabel("Adults : ");
		lblAdult.setBounds(154, 76, 46, 14);
		panel_1.add(lblAdult);
		
		JLabel lblChildren = new JLabel("Children : ");
		lblChildren.setBounds(154, 116, 78, 14);
		panel_1.add(lblChildren);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(154, 243, 116, 20);
		panel_1.add(dateChooser);
		
		TimePicker timePicker = new TimePicker();
		timePicker.setBounds(270, 243, 80, 21);
		panel_1.add(timePicker);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(280, 288, 89, 23);
		panel_1.add(btnSubmit);
		
		lblName = new JLabel("");
		lblName.setBounds(154, 17, 164, 14);
		panel_1.add(lblName);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(new Color(204, 51, 51));
		btnClear.setFont(new Font("Lato", Font.BOLD, 16));
		btnClear.setBounds(81, 11, 140, 57);
		panel.add(btnClear);
		
		JButton btnPay = new JButton("Pay");
		btnPay.setFont(new Font("Lato", Font.BOLD, 16));
		btnPay.setBounds(357, 11, 140, 57);
		panel.add(btnPay);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(204, 153, 153));
		panel_4.setBounds(594, 33, 334, 460);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 102, 102));
		panel_5.setBounds(0, 0, 160, 464);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblOutName = new JLabel("Name : ");
		lblOutName.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblOutName.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutName.setBounds(10, 33, 140, 14);
		panel_5.add(lblOutName);
		
		JLabel lblOutPhonenum = new JLabel("Phone Number : ");
		lblOutPhonenum.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblOutPhonenum.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutPhonenum.setBounds(10, 80, 140, 14);
		panel_5.add(lblOutPhonenum);
		
		JLabel lblOutAdults = new JLabel("Adults Amount : ");
		lblOutAdults.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblOutAdults.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutAdults.setBounds(10, 127, 140, 14);
		panel_5.add(lblOutAdults);
		
		JLabel lblOutChild = new JLabel("Children Amount : ");
		lblOutChild.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblOutChild.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutChild.setBounds(10, 174, 140, 14);
		panel_5.add(lblOutChild);
		
		JLabel lblOutAdditional = new JLabel("Additional :");
		lblOutAdditional.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblOutAdditional.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutAdditional.setBounds(10, 221, 140, 14);
		panel_5.add(lblOutAdditional);
		
		JLabel lblOutMembership = new JLabel("Membership : ");
		lblOutMembership.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblOutMembership.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutMembership.setBounds(10, 268, 140, 14);
		panel_5.add(lblOutMembership);
		
		JLabel lblOutDate = new JLabel("Date : ");
		lblOutDate.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblOutDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutDate.setBounds(10, 315, 140, 14);
		panel_5.add(lblOutDate);
		
		JLabel lblTimeOut = new JLabel("Time : ");
		lblTimeOut.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblTimeOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblTimeOut.setBounds(10, 362, 140, 14);
		panel_5.add(lblTimeOut);
		
		JLabel lblTotalAmount = new JLabel("Total Amount : ");
		lblTotalAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalAmount.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		lblTotalAmount.setBounds(10, 409, 140, 14);
		panel_5.add(lblTotalAmount);
		
		txtNameOut = new JTextField();
		txtNameOut.setBounds(160, 32, 174, 20);
		panel_4.add(txtNameOut);
		txtNameOut.setColumns(10);
		
		txtPhoneNumOut = new JTextField();
		txtPhoneNumOut.setBounds(160, 78, 174, 20);
		panel_4.add(txtPhoneNumOut);
		txtPhoneNumOut.setColumns(10);
		
		txtAdultsout = new JTextField();
		txtAdultsout.setBounds(160, 125, 174, 20);
		panel_4.add(txtAdultsout);
		txtAdultsout.setColumns(10);
		
		txtChildOut = new JTextField();
		txtChildOut.setBounds(160, 172, 174, 20);
		panel_4.add(txtChildOut);
		txtChildOut.setColumns(10);
		
		txtAdditionalOut = new JTextField();
		txtAdditionalOut.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdditionalOut.setBounds(160, 218, 174, 20);
		panel_4.add(txtAdditionalOut);
		txtAdditionalOut.setColumns(10);
		
		txtMembershipOut = new JTextField();
		txtMembershipOut.setBounds(160, 265, 174, 20);
		panel_4.add(txtMembershipOut);
		txtMembershipOut.setColumns(10);
		
		txtDateOut = new JTextField();
		txtDateOut.setBounds(160, 314, 174, 20);
		panel_4.add(txtDateOut);
		txtDateOut.setColumns(10);
		
		txtTimeOut = new JTextField();
		txtTimeOut.setBounds(160, 361, 174, 20);
		panel_4.add(txtTimeOut);
		txtTimeOut.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(160, 407, 173, 20);
		panel_4.add(txtTotal);
		txtTotal.setColumns(10);
		
		JButton btnCancel = new JButton("Cancel");

		btnCancel.setBounds(202, 426, 93, 34);
		panel_4.add(btnCancel);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(153, 153, 204));
		panel_6.setBounds(120, 44, 334, 38);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_15 = new JLabel("Order for Customer : ");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_15.setBounds(0, 0, 329, 38);
		panel_6.add(lblNewLabel_15);
		
		JLabel lblNewLabel_4 = new JLabel("hah");
		lblNewLabel_4.setIcon(new ImageIcon(OrderTicket.class.getResource("/image/logo/Cartoon-zoo-design-vectors-02.png")));
		lblNewLabel_4.setBounds(20, 32, 100, 50);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(OrderTicket.class.getResource("/image/logo/imageszoo1.png")));
		lblNewLabel_7.setBounds(454, 33, 100, 48);
		contentPane.add(lblNewLabel_7);
		
		//Cancel Button (Exit The Program)
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

        //Clear button (Clear the texts)
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				txtPhoneNumber.setText("");
				txtAdults.setValue(0);
				txtKids.setValue(0);
				dateChooser.setToolTipText("");
					
				chckbxTramRide.setSelected(false);
				chckbxAquarium.setSelected(false);
				rdbtnNo.setSelected(true);
				rdbtnYes.setSelected(false);
				
				
			}
		});

        //Order Button
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnPay){
					
				String CustomerName = lblName.getText();
				String PhoneNum = txtPhoneNumber.getText();
				String Membership = null;
				double TramRide = 0;
				double Aquarium = 0;
				int NumChildren = (int) txtKids.getValue();
				int NumAdult = (int) txtAdults.getValue();
				double MembershipTotal;
				double AdditionalPrice =0.00;
				int totalCategory = 0;
				int AdultPrice = 0;
				int ChildPrice = 0;
				double PriceTotal = 0.00;
				String TramRideBool = null ;
				String AquariumBool = null;
                String tramRide = "";
				String aquarium = "";

				String txtAdultCalc;
				String txtChildCalc;
				
					AdultPrice = NumAdult * 15;
					ChildPrice = NumChildren * 7;
					txtAdultCalc = ("" + AdultPrice);
					txtChildCalc = ("" + ChildPrice);

				if(chckbxTramRide.isSelected()) {
					totalCategory = NumAdult + NumChildren;
					TramRide = 6 *totalCategory; 
					txtAdditionalOut.setText(" | Tram Ride |");
					TramRideBool = "True";
					tramRide += "Tram Ride | ";
				}
				if(chckbxAquarium.isSelected()) {
					Aquarium = 12 *totalCategory;
					txtAdditionalOut.setText("| Aquarium |");
					AquariumBool = "True";
					aquarium += " Aquarium";
				}if(chckbxAquarium.isSelected() && chckbxTramRide.isSelected()) {
					TramRide = 6 *totalCategory; 
					Aquarium = 12 *totalCategory;
					TramRideBool = "True";
					AquariumBool = "True";
					txtAdditionalOut.setText(" | Aquarium |  | Tram Ride | ");
				}
				if (rdbtnYes.isSelected()) {

					AdditionalPrice = Aquarium + TramRide;

					MembershipTotal = (AdditionalPrice + AdultPrice + ChildPrice) * 0.20;
					PriceTotal = (AdditionalPrice + AdultPrice + ChildPrice) - MembershipTotal;
					Membership = "True";
					txtTotal.setText("" + PriceTotal);

				}else if (rdbtnNo.isSelected()){
					PriceTotal = TramRide + Aquarium + AdultPrice + ChildPrice;
					Membership = "False";
					txtTotal.setText("" + PriceTotal);
				}
				
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
					
					SimpleDateFormat Tdate = new SimpleDateFormat("E,dd-MM-yyyy");
					String Date = Tdate.format(dateChooser.getDate());

			        Receipt receipt = new Receipt();
			        receipt.setVisible(true);
			        receipt.setLocationRelativeTo(null);
			        dispose();
			        
					        receipt.display(CustomerName, PhoneNum, Date, NumChildren, NumAdult ,txtAdultCalc, txtChildCalc, TramRideBool, AquariumBool,TramRide,Aquarium,  PriceTotal, Membership);
				        }
				}
			}
		});
		//Submit button
		btnSubmit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
																
				if(e.getSource()==btnSubmit){
									
				String CustomerName = lblName.getText();
				String PhoneNum = txtPhoneNumber.getText();
				double TramRide = 0;
				double Aquarium = 0;
				int NumChildren = (int) txtKids.getValue();
				int NumAdult = (int) txtAdults.getValue();
				double MembershipTotal;
				double AdditionalPrice =0.00;
				int totalCategory = 0;
				int AdultPrice = 0;
				int ChildPrice = 0;
				double PriceTotal = 0.00;
                String tramRide = "";
				String aquarium = "";

					AdultPrice = NumAdult * 15;
					ChildPrice = NumChildren * 7;

				if(chckbxTramRide.isSelected()) {
					totalCategory = NumAdult + NumChildren;
					TramRide = 6 *totalCategory; 
					txtAdditionalOut.setText(" | Tram Ride |");
					tramRide += "Tram Ride | ";
				}
				if(chckbxAquarium.isSelected()) {
					Aquarium = 12 *totalCategory;
					txtAdditionalOut.setText("| Aquarium |");
					aquarium += " Aquarium";
				}if(chckbxAquarium.isSelected() && chckbxTramRide.isSelected()) {
					TramRide = 6 *totalCategory; 
					Aquarium = 12 *totalCategory;
					txtAdditionalOut.setText(" | Aquarium |  | Tram Ride | ");
				}
				if (rdbtnYes.isSelected()) {

					AdditionalPrice = Aquarium + TramRide;

					MembershipTotal = (AdditionalPrice + AdultPrice + ChildPrice) * 0.20;
					PriceTotal = (AdditionalPrice + AdultPrice + ChildPrice) - MembershipTotal;
					txtMembershipOut.setText("True");
					txtTotal.setText("" + priceformatter.format(PriceTotal));

				}else if (rdbtnNo.isSelected()){
					PriceTotal = TramRide + Aquarium + AdultPrice + ChildPrice;
					txtMembershipOut.setText("False");
					txtTotal.setText("" + PriceTotal);
				}		
				
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
					
					SimpleDateFormat Tdate = new SimpleDateFormat("E,dd-MM-yyyy");
					
					txtAdditionalOut.setText(tramRide + aquarium);
					txtNameOut.setText(CustomerName);
					txtPhoneNumOut.setText(PhoneNum);
					txtAdultsout.setText("" + NumAdult);
					txtChildOut.setText("" + NumChildren);
					txtDateOut.setText("" + Tdate.format(dateChooser.getDate()));
					txtTimeOut.setText("" + timePicker.getTime());
				}

				
				}
			}
			});
	}
	//Mutator with Parameter
	public void Name(String name){
		lblName.setText(name);
	}
}
