
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.Panel;
import java.awt.Color;
import java.awt.ScrollPane;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class WelcomePanel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePanel frame = new WelcomePanel();
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
	JProgressBar progressBar = new JProgressBar();
	JLabel lblStarting = new JLabel("Welcome! Starting soon...");
	public WelcomePanel() {
		setTitle("Welcome");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(51, 0, 204));
		panel.setBounds(0, 0, 684, 209);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblOwnerName = new JLabel("\r\nBy : Mu'Ammar Haikal, Alif Serbaini, Rafiq Farhan, Luqman");
		lblOwnerName.setHorizontalAlignment(SwingConstants.CENTER);
		lblOwnerName.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblOwnerName.setForeground(Color.WHITE);
		lblOwnerName.setBounds(134, 141, 426, 57);
		panel.add(lblOwnerName);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(WelcomePanel.class.getResource("/image/logo/Background@4x.png")));
		lblNewLabel.setBounds(205, 11, 242, 145);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(0, 102, 255));
		panel_1.setBounds(0, 210, 684, 71);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		progressBar.setForeground(new Color(0, 255, 255));
		progressBar.setBounds(75, 29, 527, 31);
		panel_1.add(progressBar);
		progressBar.setVisible(true);
		lblStarting.setForeground(Color.WHITE);
		
		lblStarting.setFont(new Font("Courier New", Font.BOLD, 16));
		lblStarting.setBounds(75, 4, 527, 25);
		panel_1.add(lblStarting);
	}
}
