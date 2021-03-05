package travel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Frame;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JTextField;
import javax.swing.ImageIcon; 

public class Complaint extends JFrame {
	

	private JPanel contentPane;
	private JTextField textc1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Complaint frame = new Complaint();
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
	public Complaint() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(00, 00, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 10, 1276, 57);
		contentPane.add(panel);
		
		JLabel lblComplaint = new JLabel("Complaint");
		lblComplaint.setFont(new Font("Tahoma", Font.BOLD, 35));
		panel.add(lblComplaint);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu= new Menu();
				menu.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(750, 474, 85, 21);
		contentPane.add(btnNewButton);
		
		JComboBox comboComplaint = new JComboBox();
		comboComplaint.setModel(new DefaultComboBoxModel(new String[] {"Complaint Type", "Bus Related", "Staff Related", "Schedule", "Theft", "Damages/Accident", "Other"}));
		comboComplaint.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboComplaint.setBounds(597, 180, 150, 28);
		contentPane.add(comboComplaint);
		
		JTextArea textArea = new JTextArea();
		textArea.setToolTipText("Type your complaint Here");
		textArea.setBounds(441, 242, 503, 180);
		contentPane.add(textArea);
		
		
		
		JButton btnNewButton_1 = new JButton("Post");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(542, 474, 85, 21);
		contentPane.add(btnNewButton_1);
		
		textc1 = new JTextField();
		textc1.setBounds(441, 213, 96, 19);
		contentPane.add(textc1);
		textc1.setColumns(10);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent em) {
				
				//writing contents in text file
				 File log = new File("complaint.txt");
						 String contents = textArea.getText();
						 if (contents.isBlank())
						 {
							 JOptionPane.showMessageDialog(null, 
		                              "Complaint is empty!", 
		                              "ERROR", 
		                              JOptionPane.WARNING_MESSAGE);
							 
						 }
						 else if(comboComplaint.getSelectedIndex()==0)
						 {
							 JOptionPane.showMessageDialog(null, 
		                              "Please Select Complaint Type", 
		                              "ERROR", 
		                              JOptionPane.WARNING_MESSAGE);
							 
						 }
						 else {
							 JOptionPane.showMessageDialog(null, 
		                              "Your complaint was recorded!", 
		                              "Success", 
		                              JOptionPane.PLAIN_MESSAGE);
					        
								 
						 
						    try{
						    if(log.exists()==false){
						            System.out.println("We had to make a new file.");
						            log.createNewFile();
						    }
						    String value= comboComplaint.getSelectedItem().toString();
						    PrintWriter out = new PrintWriter(new FileWriter(log, true));
						    out.append("----------"+"\n"+"Complaint type : "+value + "\n"+contents+"\n"+"----------");
						    textArea.setText("");
						    out.close();
						    }catch(IOException e){
						        System.out.println("COULD NOT LOG!!");
						        textArea.setText("");
						        
						        
						    }
						 }
				
				
			}
		});//String contents = textArea.getText();
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(542, 474, 85, 21);
		contentPane.add(btnNewButton_1);
		
		textc1 = new JTextField();
		textc1.setBounds(441, 213, 96, 19);
		contentPane.add(textc1);
		textc1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("F:\\JavaProjects\\Travel\\src\\travel\\hdbrts-logo2.png"));
		lblNewLabel.setBounds(218, 264, 214, 134);
		contentPane.add(lblNewLabel);
		 
}	
}
