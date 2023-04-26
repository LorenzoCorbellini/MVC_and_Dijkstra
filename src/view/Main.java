package view;

import java.awt.EventQueue;

import controller.MainController;
import model.Graph;

public class Main {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					Graph model = new Graph();
					MainController controller = new MainController(frame, model);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
