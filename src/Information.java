import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Information extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Information frame = new Information();
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
	public Information() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
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
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(153, 153, 204));
		panel_1.setBounds(0, 311, 684, 78);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnOrder = new JButton("Order");
		btnOrder.setForeground(new Color(0, 0, 0));
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				OrderTicket jf2 = new OrderTicket();
				jf2.show();
				dispose();
			}
		});
		btnOrder.setBackground(new Color(255, 0, 255));
		btnOrder.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnOrder.setBounds(105, 11, 140, 56);
		panel_1.add(btnOrder);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(255, 0, 255));
		btnCancel.setForeground(new Color(0, 0, 0));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnCancel.setBounds(427, 11, 140, 56);
		panel_1.add(btnCancel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(204, 153, 255));
		panel.setBounds(180, 78, 311, 130);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Would You Order A Ticket?");
		lblNewLabel.setFont(new Font("Courier New", Font.PLAIN, 16));
		lblNewLabel.setBounds(27, 105, 263, 25);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome To Zoo Nawar ");
		lblNewLabel_1.setFont(new Font("Myanmar Text", Font.BOLD, 16));
		lblNewLabel_1.setBounds(60, 11, 189, 33);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ticket System");
		lblNewLabel_1_1.setFont(new Font("Myanmar Text", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(100, 44, 111, 33);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblUsername = new JLabel("");
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(10, 80, 291, 14);
		panel.add(lblUsername);
	}
}
