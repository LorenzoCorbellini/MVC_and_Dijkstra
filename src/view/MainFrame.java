package view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField verticesCountTextField;
	private JTextField weightTextField;
	private JButton generateButton;
	private JComboBox<String> toComboBox;
	private JComboBox<String> fromComboBox;

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("Dijkstra");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel verticesCountLabel = new JLabel("Number of vertices:");
		verticesCountLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		verticesCountLabel.setBounds(10, 10, 158, 40);
		contentPane.add(verticesCountLabel);
		
		verticesCountTextField = new JTextField();
		verticesCountTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		verticesCountTextField.setBounds(178, 16, 56, 36);
		contentPane.add(verticesCountTextField);
		verticesCountTextField.setColumns(10);
		
		generateButton = new JButton("Generate");
		generateButton.setEnabled(false);
		generateButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		generateButton.setBounds(261, 20, 126, 30);
		contentPane.add(generateButton);
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFrom.setBounds(10, 74, 64, 40);
		contentPane.add(lblFrom);
		
		fromComboBox = new JComboBox();
		fromComboBox.setEnabled(false);
		fromComboBox.setBounds(68, 84, 72, 30);
		contentPane.add(fromComboBox);
		
		JLabel toLabel = new JLabel("To:");
		toLabel.setEnabled(false);
		toLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		toLabel.setBounds(178, 74, 64, 40);
		contentPane.add(toLabel);
		
		toComboBox = new JComboBox();
		toComboBox.setBounds(215, 84, 72, 30);
		contentPane.add(toComboBox);
		
		JLabel weightLabel = new JLabel("Weight:");
		weightLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		weightLabel.setBounds(329, 74, 64, 40);
		contentPane.add(weightLabel);
		
		weightTextField = new JTextField();
		weightTextField.setEditable(false);
		weightTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		weightTextField.setColumns(10);
		weightTextField.setBounds(403, 78, 56, 36);
		contentPane.add(weightTextField);
		
		JButton okButton = new JButton("OK");
		okButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		okButton.setBounds(659, 439, 64, 30);
		contentPane.add(okButton);
		
		JButton addButton = new JButton("Add row");
		addButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		addButton.setBounds(566, 249, 136, 30);
		contentPane.add(addButton);
		
		JButton removeButton = new JButton("Remove row");
		removeButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		removeButton.setBounds(566, 289, 136, 30);
		contentPane.add(removeButton);
	}

	public JTextField getVerticesCountTextField() {
		return verticesCountTextField;
	}

	public JButton getGenerateButton() {
		return generateButton;
	}

	public JTextField getWeightTextField() {
		return weightTextField;
	}

	public JComboBox<String> getToComboBox() {
		return toComboBox;
	}

	public JComboBox<String> getFromComboBox() {
		return fromComboBox;
	}
}
