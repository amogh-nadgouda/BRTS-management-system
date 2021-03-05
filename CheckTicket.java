package travel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Frame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class CheckTicket extends JFrame{

	private JPanel contentPane;
	private JTextField textVerification;

	/**
	 * Launch the application.
	 */
	//LINEAR SEARCH TO SEARCH FOR TICKET CODE
	public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
	
	
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	//////
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckTicket frame = new CheckTicket();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}}});}

	/**
	 * Create the frame.
	 */
	public CheckTicket() {
		////
		
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(00, 00, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(463, 44, 637, 80);
		contentPane.add(panel_1);
		
		JLabel lblTicketVerification = new JLabel("Ticket Verification");
		lblTicketVerification.setFont(new Font("Tahoma", Font.BOLD, 35));
		panel_1.add(lblTicketVerification);
		
		JLabel lblEnterTicketNumber = new JLabel("Enter Ticket Number");
		lblEnterTicketNumber.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEnterTicketNumber.setBounds(485, 209, 218, 35);
		contentPane.add(lblEnterTicketNumber);
		
		textVerification = new JTextField();
		textVerification.setBounds(856, 209, 225, 28);
		contentPane.add(textVerification);
		textVerification.setColumns(10);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strnew =textVerification.getText();
				boolean check=isNumeric(strnew);
				
				if(check==false)
					
				{
					JOptionPane.showMessageDialog(null, 
							"Please enter a valid Ticket Code(integer).", 
							"ERROR", 
							JOptionPane.WARNING_MESSAGE);
					
				}
				
				
				if(textVerification.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, 
							"Please enter Ticket Code.", 
							"ERROR", 
							JOptionPane.WARNING_MESSAGE);
				
					
				}
				//TO SCAN FROM FILE
				Scanner scanner = null;
				try {
					scanner = new Scanner(new File("F:\\JavaProjects\\Travel\\codess.txt"));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				int [] tall = new int [100];
				int i = 0;
				while(scanner.hasNextInt())
				{
				     tall[i++] = scanner.nextInt();
				}
				//System.out.println(tall[]);
				
				

				int[] a1= tall  ;  
		        String str = textVerification.getText(); 
		        int key = Integer.parseInt(str);
		 if((linearSearch(a1, key))==-1)//calling linear search
				 {
			 
					JOptionPane.showMessageDialog(null, 
							"INVALID TICKET", 
							"ERROR", 
							JOptionPane.WARNING_MESSAGE);
				
			 
				 }
		 else {

			 JOptionPane.showMessageDialog(null, 
						"VALID TICKET !", 
						"Success", 
						JOptionPane.DEFAULT_OPTION);
				
			}
		}});
		btnCheck.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCheck.setBounds(646, 326, 85, 21);
		contentPane.add(btnCheck);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(467, 146, 633, 21);
		contentPane.add(separator);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu=new Menu();
				menu.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBounds(817, 328, 85, 21);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("F:\\JavaProjects\\Travel\\src\\travel\\hdbrts-logo2.png"));
		lblNewLabel.setBounds(349, 10, 214, 134);
		contentPane.add(lblNewLabel);
	}
}
