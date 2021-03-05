package travel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Frame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Map extends JFrame {
	
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Map frame = new Map();
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
	public Map() {
		
		
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel background;
		setSize(1200,700);
		getContentPane().setLayout(null);
		 
			
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLink = new JButton("HDBRTS Link");
		btnLink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String myurl= "https://www.hdbrts.com/en/travel-info/route-diagram/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
				} catch(Exception e2) {
				e2.printStackTrace();
			}
			}
		});
		btnLink.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLink.setBounds(325, 595, 234, 58);
		contentPane.add(btnLink);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu= new Menu();
				menu.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(835, 595, 234, 58);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("F:\\JavaProjects\\Travel\\src\\travel\\Screenshot (405).png"));
		lblNewLabel.setBounds(0, 10, 1380, 663);
		contentPane.add(lblNewLabel);
	}
}
