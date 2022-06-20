import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		WelcomePanel WelcomePanel;
		Information Information;
		
		try {
			WelcomePanel = new WelcomePanel();
			Information = new Information();
			
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
			Information.setVisible(true);
			} catch (Exception e) {
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
