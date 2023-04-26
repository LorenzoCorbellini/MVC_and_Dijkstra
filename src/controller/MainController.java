package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import model.Graph;
import view.MainFrame;

public class MainController {
	//due campi: uno legato alla view e un riferimento al model
	//il controller fa da tramite tra model e view gestendo gli eventi
	
	private MainFrame mainFrame;
	private Graph graph;
	
	public MainController(MainFrame mainFrame, Graph model) {
		this.mainFrame = mainFrame;
		this.graph = model;
		
		assignNodeFieldController();
		assignGenerateButtonController();
	}
	
	//Quando scrivo/cancello il testo nel text field:
	private void assignNodeFieldController() {
		mainFrame.getVerticesCountTextField().getDocument()
			.addDocumentListener(new JButtonStateController(mainFrame.getGenerateButton()));
	}
	
	//Quando clicco sul bottone "Generate":
	private void assignGenerateButtonController() {
		
		mainFrame.getGenerateButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int nodesCount = Integer.parseInt(mainFrame.getVerticesCountTextField().getText()) ;
				List<String> nodeNames = graph.setNodes(nodesCount);
				
				mainFrame.getFromComboBox().setEnabled(true);
				mainFrame.getToComboBox().setEnabled(true);
				mainFrame.getWeightTextField().setEditable(true);
				
				nodeNames.forEach((n) -> mainFrame.getFromComboBox().addItem(n));
				nodeNames.forEach((n) -> mainFrame.getToComboBox().addItem(n));
			}
		});
		
	}
}
