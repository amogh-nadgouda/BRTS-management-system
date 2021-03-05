package travel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Frame;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Report extends JFrame {

	private JPanel contentPane;
	private JTextField textTotP;
	private JTextField textTotA;
	int tA=0,tP=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report frame = new Report();
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
	
	public Report() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(00, 00, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 1276, 57);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel);
		
		JLabel lblReport = new JLabel("Report");
		lblReport.setFont(new Font("Tahoma", Font.BOLD, 35));
		panel.add(lblReport);
		
		JLabel lblNoOfPassengers = new JLabel("No of passengers");
		lblNoOfPassengers.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNoOfPassengers.setBounds(52, 173, 191, 37);
		contentPane.add(lblNoOfPassengers);
		
		JLabel lblTotalAmountCollected = new JLabel("Total Amount Collected");
		lblTotalAmountCollected.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotalAmountCollected.setBounds(52, 259, 256, 37);
		contentPane.add(lblTotalAmountCollected);
		
		textTotP = new JTextField();
		textTotP.setBounds(404, 186, 191, 37);
		contentPane.add(textTotP);
		textTotP.setColumns(10);
		
		textTotA = new JTextField();
		textTotA.setColumns(10);
		textTotA.setBounds(404, 259, 191, 37);
		contentPane.add(textTotA);

		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu=new Menu();
				menu.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(469, 412, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				////
				Scanner scanner = null;
				try {
					scanner = new Scanner(new File("F:\\JavaProjects\\Travel\\totalA.txt"));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				float [] tall = new float [100];
				int i = 0;
				while(scanner.hasNextInt())
				{
				     tall[i++] = scanner.nextInt();
				}
				System.out.println(tall[0]);
				
				
////
				
		}});
		btnCheck.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCheck.setBounds(304, 414, 85, 21);
		contentPane.add(btnCheck);
	}
}
