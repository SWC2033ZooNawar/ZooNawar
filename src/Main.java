import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		WelcomePanel WelcomePanel;
		SignUp Signup;
		//Call WelcomePanel first and then Sign Up after finishing with the progress bar of WelcomePanel
		try {
			WelcomePanel = new WelcomePanel();
			Signup = new SignUp();
			
			WelcomePanel.setVisible(true);
			Thread.sleep(2000);
			WelcomePanel.progressBar.setVisible(true);
		
			try {
				for (int i = 0; i <= 100; i += 4) {
			
				Thread.sleep(20);
				WelcomePanel.progressBar.setValue(i);
				WelcomePanel.lblStarting.setText("Welcome! Starting up " + i + "%");
				}
				Thread.sleep(1000);
				WelcomePanel.setVisible(false);
				Signup.setVisible(true);
			} catch (Exception e) {
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
