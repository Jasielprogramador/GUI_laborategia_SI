package lana;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class Ariketa extends JFrame {

	private JPanel contentPane;
	private JPanel panelGridLayout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ariketa frame = new Ariketa();
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
	public Ariketa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanelGridLayout(), BorderLayout.CENTER);
	}

	private JPanel getPanelGridLayout() {
		if(panelGridLayout==null) {
			panelGridLayout=new JPanel();
			panelGridLayout.setLayout(new GridLayout(3,3,0,0));
			matrizeaSortu();
		}
		return panelGridLayout;
	}
	
	private void matrizeaSortu() {
		GridBagConstraints gbc = new GridBagConstraints();  
		for(int l=0;l<3;l++) {
			for(int z=0;z<3;z++) {
				panelGridLayout.add(getPanelGB(l,z));
			}
		}
	}
	
	private JPanel getPanelGB(int lerroa, int zutabea) {
		JPanel panelGB = new JPanel();
		GridBagLayout gbl_panelGB = new GridBagLayout();
		gbl_panelGB.columnWidths = new int[] {0};
		gbl_panelGB.rowHeights = new int[] {0, 30, 30};
		gbl_panelGB.columnWeights = new double[]{1.0};
		gbl_panelGB.rowWeights = new double[]{0.0, 0.0, 0.0};
		panelGB.setLayout(gbl_panelGB);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridheight = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 1;
		panelGB.add(getTextField(), gbc_textField);
		GridBagConstraints gbc_labelGB = new GridBagConstraints();
		gbc_labelGB.gridx = 0;
		gbc_labelGB.gridy = 0;
		panelGB.add(getLabelGB(lerroa,zutabea), gbc_labelGB);
		return panelGB;
	}
	
	private JLabel getLabelGB(int lerroa, int zutabea) {
			
		JLabel labelGB = new JLabel("L"+lerroa+"Z"+zutabea);
					
		return labelGB;
		
		
	}
	private JTextField getTextField() {
		//if (textField == null) {
			JTextField textField = new JTextField();
			textField.setColumns(10);
		//}
		return textField;
	}
	
	
}