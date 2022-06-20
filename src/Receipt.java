import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import java.text.DecimalFormat;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import java.awt.SystemColor;

public class Receipt extends JFrame {

	private JPanel contentPane;
	private JButton btnReceipt;
	private JTextArea area;
	private JTextField txtPay;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	DecimalFormat priceformatter = new DecimalFormat("#0.00");
	
	String name;
	String phonenum;
	String OrderDate;
	int numChildren;
    int numAdult;String AdultPrice;
    String ChildPrice;
    String tramRideBool;
    String aquariumBool;
    double tramRide;
    double aquarium;
    double priceTotal;
    String Membership;

	/**
	 * Launch the application.
	 */
    


	public Receipt() {
		setTitle("Receipt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 845);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 16, 557, 89);
		panel.setBackground(new Color(0, 51, 0));
		
		JLabel lblName = new JLabel("Customer Name : ");
		lblName.setBounds(10, 164, 121, 14);
		lblName.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblName.setForeground(new Color(255, 255, 255));
		
		JLabel lblPhoneNum = new JLabel("Phone Number : ");
		lblPhoneNum.setBounds(10, 202, 121, 20);
		lblPhoneNum.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblPhoneNum.setForeground(new Color(255, 255, 255));
		
		JLabel lblOrderDate = new JLabel("Order Date : ");
		lblOrderDate.setBounds(375, 161, 88, 20);
		lblOrderDate.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblOrderDate.setForeground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(558, 194, 0, 0);
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_3 = new JLabel("Membership : ");
		lblNewLabel_3.setBounds(10, 275, 100, 20);
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_4 = new JLabel("Receipt And Payment ");
		lblNewLabel_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 23));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addGap(160)
					.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(150))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(29)
					.addComponent(lblNewLabel_4)
					.addContainerGap(33, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblPhoneNum);
		contentPane.add(lblName);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblOrderDate);
		contentPane.add(panel);
		
		
		
		JLabel lblOrderID = new JLabel("Order ID :");
		lblOrderID.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblOrderID.setForeground(new Color(255, 255, 255));
		lblOrderID.setBounds(375, 205, 88, 14);
		contentPane.add(lblOrderID);

			
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 102, 0));
		panel_1.setBounds(0, 718, 577, 95);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTotal = new JLabel("Total : RM");
		lblTotal.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblTotal.setForeground(new Color(255, 255, 255));
		lblTotal.setBounds(388, 11, 97, 14);
		panel_1.add(lblTotal);
		
		JLabel lblTotalPaid = new JLabel("Total Paid: RM");
		lblTotalPaid.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblTotalPaid.setForeground(new Color(255, 255, 255));
		lblTotalPaid.setBounds(388, 38, 97, 14);
		panel_1.add(lblTotalPaid);
		
		JLabel lblBalance = new JLabel("Balance : ");
		lblBalance.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblBalance.setForeground(new Color(255, 255, 255));
		lblBalance.setBounds(388, 65, 97, 14);
		panel_1.add(lblBalance);
		
		JButton btnPrint = new JButton("Print to PDF");
		btnPrint.setBounds(10, 35, 125, 23);
		panel_1.add(btnPrint);
		
		JButton btnNewButton = new JButton("Finish");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(240, 32, 90, 28);
		panel_1.add(btnNewButton);
		
		JLabel lblTotalOut = new JLabel("");
		lblTotalOut.setForeground(Color.WHITE);
		lblTotalOut.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblTotalOut.setBounds(492, 11, 79, 16);
		panel_1.add(lblTotalOut);
		
		JLabel lblTotalPaidOut = new JLabel("");
		lblTotalPaidOut.setForeground(Color.WHITE);
		lblTotalPaidOut.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblTotalPaidOut.setBounds(492, 37, 79, 16);
		panel_1.add(lblTotalPaidOut);
		
		JLabel lblBalanceOut = new JLabel("");
		lblBalanceOut.setForeground(Color.WHITE);
		lblBalanceOut.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblBalanceOut.setBounds(492, 64, 79, 16);
		panel_1.add(lblBalanceOut);
		
		
		
		JButton btnReceipt = new JButton("Generate Receipt");
		btnReceipt.setBounds(375, 275, 137, 23);
		contentPane.add(btnReceipt);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(102, 102, 102));
		panel_2.setBounds(0, 306, 577, 411);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		

		JTextArea area = new JTextArea();
		area.setForeground(SystemColor.desktop);
		area.setFont(new Font("Monospaced", Font.PLAIN, 14));
		area.setBackground(new Color(128, 128, 128));
		area.setBounds(0, 0, 577, 414);
		panel_2.add(area);
		
		txtPay = new JTextField();
		txtPay.setBounds(125, 117, 262, 20);
		contentPane.add(txtPay);
		txtPay.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Amount : ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 120, 109, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCustName = new JLabel("");
		lblCustName.setForeground(new Color(255, 255, 255));
		lblCustName.setBounds(141, 164, 119, 14);
		contentPane.add(lblCustName);
		
		JLabel lblPhoneNumOut = new JLabel("");
		lblPhoneNumOut.setForeground(new Color(255, 255, 255));
		lblPhoneNumOut.setBounds(141, 205, 119, 14);
		contentPane.add(lblPhoneNumOut);
		
		JLabel lblMembershipOut = new JLabel("");
		lblMembershipOut.setForeground(new Color(255, 255, 255));
		lblMembershipOut.setBounds(141, 280, 119, 14);
		contentPane.add(lblMembershipOut);
		
		JLabel lblOrderDateOut = new JLabel("");
		lblOrderDateOut.setForeground(new Color(255, 255, 255));
		lblOrderDateOut.setBounds(485, 164, 82, 14);
		contentPane.add(lblOrderDateOut);
		
		JLabel lblOrderIDOut = new JLabel("");
		lblOrderIDOut.setForeground(new Color(255, 255, 255));
		lblOrderIDOut.setBounds(485, 205, 82, 14);
		contentPane.add(lblOrderIDOut);
				
		JButton btnPay = new JButton("Pay");
		btnPay.setBounds(422, 116, 89, 23);
		contentPane.add(btnPay);
		
		//Pay Button
		btnPay.addActionListener(new ActionListener() {
			private double balance;

			public void actionPerformed(ActionEvent e) {

				if(e.getSource() == btnPay) {
					boolean process = false;
					boolean payerror = false;
					Double pricetotal = Double.parseDouble(priceformatter.format(priceTotal));
					Double TotalPayment = Double.parseDouble(txtPay.getText());
					
					if(pricetotal > TotalPayment) {
						payerror = true;
					}
					if(pricetotal < TotalPayment) {
						balance = TotalPayment - priceTotal;
						lblCustName.setText(name);
						lblPhoneNumOut.setText(phonenum);
						lblMembershipOut.setText(Membership);
						lblOrderDateOut.setText(OrderDate);
						lblOrderIDOut.setText(null);
						lblTotalOut.setText(""+priceformatter.format(priceTotal));
						lblTotalPaidOut.setText(""+priceformatter.format(TotalPayment));
						lblBalanceOut.setText(""+priceformatter.format(balance));

						//lblOrder.setText(null);
						JOptionPane.showMessageDialog(null, "Thank you for choosing to spend your time at Zoo Nawar! \n Have A Nice Day");
					}
					if (payerror) {
                    String error = "\n" ;
					if (payerror){
						error += "Insufficient amount to be paid";
					}
					JOptionPane.showMessageDialog(null,error,"",JOptionPane.ERROR_MESSAGE);
					}
					else{
						process = true;
					}
				}
			}
		});

		
    //Print Receipt Button
	btnReceipt.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btnReceipt)
		area.setText("=========================================================\n");
		area.setText(area.getText() +"===                  Zoo Nawar Receipt                === \n" );
		area.setText(area.getText() + "=========================================================\n");
		
		area.setText(area.getText() + "Customer Name : "+name +  "\n" );
		area.setText(area.getText() + "Phone Number  : " +phonenum + "\n");
		area.setText(area.getText() + "Date : " +OrderDate +"\n");
		
		area.setText(area.getText() +"Adults Amounts : "  +numAdult +"  "+AdultPrice +"\n" );
        area.setText(area.getText() +"Childs Amounts : " +numChildren  +"  "+ChildPrice+"\n\n\n");

        area.setText(area.getText() + "=========================================================\n");
        area.setText(area.getText() + "Tram Amount : " +tramRideBool +" "+ tramRide +"\n");
        area.setText(area.getText()+ "Aquarium : " +aquariumBool+" "+aquarium + "\n");
        area.setText(area.getText() + "=========================================================\n");
        
        area.setText(area.getText() + "=========================================================\n");

        area.setText(area.getText() + "Membership : "+Membership + "\n\n");
        area.setText(area.getText() + "Total : " +priceTotal + "\n");

        area.setText(area.getText() + "=========================================================\n");
		

        }
	});
	btnPrint.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e ) {
		try
			{
				area.print();
			}
			catch(Exception e1)
			{
				
			}
						
		}
		});
		}
	//Mutator with Parameter
	public void display(String name,String phonenum, String OrderDate, int numChildren, int numAdult,String AdultPrice, String ChildPrice,String tramRideBool, String aquariumBool,  double tramRide, double aquarium,double priceTotal, String Membership) {
	    this.name = name;
		this.phonenum = phonenum;
		this.OrderDate = OrderDate;
		this.numChildren = numChildren;
		this.numAdult = numAdult;
		
		this.AdultPrice = AdultPrice;
		this.ChildPrice= ChildPrice;
		this.tramRideBool =  tramRideBool;
		this.aquariumBool = aquariumBool;
		this.tramRide = tramRide;
		this.aquarium = aquarium;
		this.priceTotal = priceTotal;
		this.Membership = Membership;
	}
	}
						


	

