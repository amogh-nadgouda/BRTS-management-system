package travel;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Frame;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Print extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String sou1="";
	String des1="";
	String busType="";
	String journey1="";
	String ageGroup1="";
	int randOut1=0;
	

	/**
	 * Launch the application.
	 */
	/**
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Print frame = new Print(String sou1, des1,);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public Print(String busType1,String ageGroup1,String journey1,String des1,String sou1,int randOut1) {
		
		
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(00, 00, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(76, 56, 551, 66);
		contentPane.add(panel);
		
		JLabel lblTicketDetails = new JLabel("Ticket Details");
		lblTicketDetails.setFont(new Font("Tahoma", Font.BOLD, 35));
		panel.add(lblTicketDetails);
		Calendar timer =Calendar.getInstance();
		
		timer.getTime();
		SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat tDate = new SimpleDateFormat("dd:MM:yyyy");
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(221, 161, 264, 283);
		contentPane.add(textArea);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu =new Menu();
				menu.setVisible(true);
			}
		});
		btnGoBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGoBack.setBounds(306, 496, 109, 27);
		contentPane.add(btnGoBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("F:\\JavaProjects\\Travel\\src\\travel\\hdbrts-logo2.png"));
		lblNewLabel.setBounds(82, 223, 214, 134);
		contentPane.add(lblNewLabel);
		String s=String.valueOf(randOut1);
		textArea.append("Ticket Code : "+s);
		textArea.append(""+"\n");
		textArea.append("Time : ");
		textArea.append(tTime.format(timer.getTime()));
		textArea.append(""+"\n");
		textArea.append("Date : ");
		textArea.append(tDate.format(timer.getTime()));
		textArea.append(""+"\n");
		textArea.append(busType1);
		
		textArea.append(""+"\n"+"From : "+sou1+"\n"+"To : "+des1+"\n"+"Journey Type : "+journey1+"\n"+ageGroup1);
		
	}
}
