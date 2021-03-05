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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(00, 00, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(611, 37, 551, 66);
		contentPane.add(panel);
		
		JLabel lblWelcome = new JLabel("HDBRTS");
		lblWelcome.setForeground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 35));
		panel.add(lblWelcome);
		
		JButton btnReport = new JButton("Report");
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, 
						"Comping Soon!", 
						"Bus Management Systemm", 
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnReport.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnReport.setBounds(507, 209, 238, 45);
		contentPane.add(btnReport);
		
		JButton btnTicket = new JButton("Ticket");
		btnTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Travel tra=new Travel();
				tra.setVisible(true);
			}
		});
		btnTicket.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnTicket.setBounds(507, 319, 238, 45);
		contentPane.add(btnTicket);
		
		JButton btnMap = new JButton("Map");
		btnMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map map=new Map();
				map.setVisible(true);
			}
		});
		btnMap.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnMap.setBounds(988, 209, 238, 45);
		contentPane.add(btnMap);
		
		JButton btnComplaint = new JButton("Complaint");
		btnComplaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Complaint complaint =new Complaint();
				complaint.setVisible(true);
			}
		});
		btnComplaint.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnComplaint.setBounds(988, 319, 238, 45);
		contentPane.add(btnComplaint);
		
		JButton btnNewButton_1_1_1 = new JButton("Exit");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","HDBRTS",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_1_1_1.setBounds(742, 531, 238, 45);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnContact = new JButton("Contact");
		btnContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contact contact = new Contact();
				contact.setVisible(true);
			}
		});
		btnContact.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnContact.setBounds(988, 413, 238, 45);
		contentPane.add(btnContact);
		
		JButton btnVerify = new JButton("Verify");
		btnVerify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckTicket checkTicket= new CheckTicket();
				checkTicket.setVisible(true);
			}
		});
		btnVerify.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnVerify.setBounds(507, 413, 238, 45);
		contentPane.add(btnVerify);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(611, 139, 551, 11);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(866, 139, 52, 382);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("F:\\JavaProjects\\Travel\\src\\travel\\hdbrts-logo2.png"));
		lblNewLabel.setBounds(460, 21, 214, 134);
		contentPane.add(lblNewLabel);
		
		
		
	}
}
