import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Payment extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment();
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
	public Payment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 634, 21);
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
		panel.setBackground(new Color(0, 128, 0));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(0, 25, 123, 303);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TICKET");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(29, 11, 60, 29);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(122, 25, 10, 10);
		contentPane.add(panel_1);
	}
}
