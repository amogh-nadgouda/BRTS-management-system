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
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class Contact extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contact frame = new Contact();
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
	public Contact() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(00, 00, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(656, 39, 551, 66);
		contentPane.add(panel);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 35));
		panel.add(lblContact);
		
		JLabel lblHdbrtsControlRoom = new JLabel("HDBRTS control room");
		lblHdbrtsControlRoom.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHdbrtsControlRoom.setBounds(656, 193, 223, 34);
		contentPane.add(lblHdbrtsControlRoom);
		
		JLabel lblEmergency = new JLabel("Emergency");
		lblEmergency.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEmergency.setBounds(656, 260, 223, 34);
		contentPane.add(lblEmergency);
		
		JLabel lblHubliTerminal = new JLabel("Hubli Terminal");
		lblHubliTerminal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHubliTerminal.setBounds(656, 324, 195, 34);
		contentPane.add(lblHubliTerminal);
		
		JLabel lblDharwadTerminal = new JLabel("Dharwad Terminal");
		lblDharwadTerminal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDharwadTerminal.setBounds(656, 388, 195, 34);
		contentPane.add(lblDharwadTerminal);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu= new Menu();
				menu.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(858, 472, 102, 34);
		contentPane.add(btnNewButton_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(656, 127, 551, 15);
		contentPane.add(separator);
		
		JLabel lblHdbrtsControlRoom_1 = new JLabel("1800-599-1010");
		lblHdbrtsControlRoom_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHdbrtsControlRoom_1.setBounds(943, 193, 223, 34);
		contentPane.add(lblHdbrtsControlRoom_1);
		
		JLabel lblEmergency_1 = new JLabel("112");
		lblEmergency_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEmergency_1.setBounds(943, 260, 223, 34);
		contentPane.add(lblEmergency_1);
		
		JLabel lblHubliTerminal_1 = new JLabel("918362222007");
		lblHubliTerminal_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHubliTerminal_1.setBounds(943, 324, 195, 34);
		contentPane.add(lblHubliTerminal_1);
		
		JLabel lblHubliTerminal_1_1 = new JLabel("918362322700");
		lblHubliTerminal_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHubliTerminal_1_1.setBounds(943, 388, 195, 34);
		contentPane.add(lblHubliTerminal_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("F:\\JavaProjects\\Travel\\src\\travel\\hdbrts-logo2.png"));
		lblNewLabel.setBounds(518, 10, 214, 134);
		contentPane.add(lblNewLabel);
	}
}
