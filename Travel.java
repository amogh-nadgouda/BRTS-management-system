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
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Stream;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.ImageIcon;



public class Travel extends JFrame 
{

	private JPanel contentPane;
	String timer,sourceOut,destinationOut,busType,journey,AgeGroup;
	private JTextField textFrom;
	private JTextField textTo;
	private JTextField textPrice;
	private JTextField textDist;
	private JTextField textTicketNo;
	int totalPassengers=0,totalAmount=0;




	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater
		(
				new Runnable()
				{
					public void run() 
					{
						try {
							Travel frame = new Travel();
							frame.setVisible(true);

						}
						catch (Exception e) 
						{
							e.printStackTrace();

						}
					}
				}
				);
	}


	/**
	 * Create the frame.
	 */
	public Travel()
	{
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(00, 00, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(65, 31, 637, 80);
		contentPane.add(panel);

		JLabel lblNewLabel = new JLabel("Bus Ticket Booking");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		panel.add(lblNewLabel);







		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener
		(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						Menu menu= new Menu();
						menu.setVisible(true);
					}
				}
				);

		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMenu.setBounds(279, 391, 85, 21);
		contentPane.add(btnMenu);

		JRadioButton rdbtnNonStop = new JRadioButton("Non Stop");
		rdbtnNonStop.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNonStop.setBounds(65, 205, 103, 21);
		contentPane.add(rdbtnNonStop);

		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnStandard.setBounds(65, 251, 103, 21);
		contentPane.add(rdbtnStandard);

		JRadioButton rdbtnReturnTicket = new JRadioButton("Return Ticket");
		rdbtnReturnTicket.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnReturnTicket.setBounds(212, 205, 129, 21);
		contentPane.add(rdbtnReturnTicket);

		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnSingleTicket.setBounds(212, 251, 129, 21);
		contentPane.add(rdbtnSingleTicket);

		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnChild.setBounds(401, 205, 103, 21);
		contentPane.add(rdbtnChild);

		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnAdult.setBounds(401, 227, 103, 21);
		contentPane.add(rdbtnAdult);

		JRadioButton rdbtnSeniorCitizen = new JRadioButton("Senior Citizen");

		rdbtnSeniorCitizen.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnSeniorCitizen.setBounds(401, 251, 140, 21);
		contentPane.add(rdbtnSeniorCitizen);
		//Radiobutton Groups
		ButtonGroup group1 = new ButtonGroup();
		group1.add(rdbtnNonStop);
		group1.add(rdbtnStandard);

		ButtonGroup group2 = new ButtonGroup();
		group2.add(rdbtnReturnTicket);
		group2.add(rdbtnSingleTicket);

		ButtonGroup group3 = new ButtonGroup();
		group3.add(rdbtnChild);
		group3.add(rdbtnAdult);
		group3.add(rdbtnSeniorCitizen);

		JSeparator separator = new JSeparator();
		separator.setBounds(65, 133, 484, 4);
		contentPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(369, 147, 6, 138);
		contentPane.add(separator_1);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_1.setBounds(182, 147, 6, 138);
		contentPane.add(separator_1_1);

		JLabel lblBusType = new JLabel("Bus Type");
		lblBusType.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBusType.setBounds(65, 143, 108, 34);
		contentPane.add(lblBusType);

		JLabel lblJourney = new JLabel("Journey");
		lblJourney.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblJourney.setBounds(207, 143, 108, 34);
		contentPane.add(lblJourney);

		JLabel lblAgeGroup = new JLabel("Age Group");
		lblAgeGroup.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAgeGroup.setBounds(396, 151, 108, 34);
		contentPane.add(lblAgeGroup);

		JComboBox comboDestination = new JComboBox();
		comboDestination.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Dharwad Terminal", "NTTF", "Vidyagiri", "SDM", "RTO", "Navanagar", "BVB", "Hubli Terminal"}));
		comboDestination.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboDestination.setBounds(217, 319, 147, 34);
		contentPane.add(comboDestination);

		JComboBox comboSource = new JComboBox();
		comboSource.setModel(new DefaultComboBoxModel(new String[] {"Source", "Dharwad Terminal", "NTTF", "Vidyagiri", "SDM", "RTO", "Navanagar", "BVB", "Hubli Terminal"}));
		comboSource.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboSource.setBounds(41, 319, 147, 34);
		contentPane.add(comboSource);

		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalPassengers++;








				Random rand = new Random();








				JFrame frame = new JFrame("Exit");



				rdbtnNonStop.setActionCommand("Bus Type:Non Stop");
				rdbtnStandard.setActionCommand("Bus Type:Standard");
				rdbtnReturnTicket.setActionCommand("Return Ticket");
				rdbtnSingleTicket.setActionCommand("Standard Ticket");
				rdbtnChild.setActionCommand("Age Group:Child");
				rdbtnAdult.setActionCommand("Age Group:Adult");
				rdbtnSeniorCitizen.setActionCommand("Age Group:Senior Citizen");

				sourceOut =	((String)comboSource.getSelectedItem());
				//testingSystem.out.println(source);//testing
				destinationOut =	((String)comboDestination.getSelectedItem());
				rand = new Random();

				// Obtain a number between [0 - 1000].
				int randOut = rand.nextInt(1000);
				String code = Integer.toString(randOut);
				File lo = new File("codess.txt");
				 try{
					    if(lo.exists()==false){
					            System.out.println("We had to make a new file.");
					            lo.createNewFile();
					    }
					   
					    PrintWriter out = new PrintWriter(new FileWriter(lo, true));
					    out.append(code+" ");
					   
					    out.close();
					    }catch(IOException eoa){
					        System.out.println("COULD NOT LOG!!");
					        
					        
					        
					    }
				 ////////////////
				





				// Creating an empty Stack 
				Stack<Integer> STACK = new Stack<Integer>(); 

				// Use push() to add elements into the Stack 
				STACK.push(randOut);

				System.out.println("Final Stack: " + STACK);

				File log = new File("Ticket.txt");
				String price = textPrice.getText();
				String dist = textDist.getText();
				String  from= textFrom.getText();
				String to = textTo.getText();
				String busType=group1.getSelection().getActionCommand();
				String journey=group2.getSelection().getActionCommand();
				String ageGroup=group3.getSelection().getActionCommand();
				
				try{
					if(log.exists()==false){
						System.out.println("We had to make a new file.");
						log.createNewFile();
					}
                    PrintWriter out = new PrintWriter(new FileWriter(log, true));
					out.append("\n\n"+"\n"+"Booking details : " +"\n" + "From : "+from+ "\n");
					out.append("To : "+to+ "\n");
					out.append("  "+busType+"   "+journey+"   "+ageGroup);
					out.append("Total Distance : "+dist+ "\n");
					out.append("Total Price : "+price+ "\n");
					out.append("Total Dist : "+dist+ "\n");
					out.close();
				}catch(IOException ec){
					System.out.println("COULD NOT LOG!!");



				}
				//////////
				 File tot = new File("totalA.txt");
				 try{
					    if(tot.exists()==false){
					            System.out.println("We had to make a new file.");
					            tot.createNewFile();
					    }
					   
					    PrintWriter out = new PrintWriter(new FileWriter(tot, true));
					    out.append(price+" ");
					   
					    out.close();
					    }catch(IOException eoa){
					        System.out.println("COULD NOT LOG!!");
					        
					        
					        
					    }
				 /////////
				 File tota = new File("totalP.txt");
				 try{
					    if(tota.exists()==false){
					            System.out.println("We had to make a new file.");
					            tota.createNewFile();
					    }
					   
					    PrintWriter out = new PrintWriter(new FileWriter(tota, true));
					    out.append("1 ");
					   
					    out.close();
					    }catch(IOException eoa){
					        System.out.println("COULD NOT LOG!!");
					        
					        
					        
					    }
				 ///////////






				Print print =new Print(busType,ageGroup,journey,destinationOut,sourceOut,randOut);

				print.setVisible(true);


			}
		});

		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPrint.setBounds(516, 393, 85, 21);
		contentPane.add(btnPrint);

		JButton btnReset = new JButton("Reset");
		//Resetting all fields on clicking Reset Button
		btnReset.addActionListener
		(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFrame frame = new JFrame("Reset");
				if(JOptionPane.showConfirmDialog(frame,"All fields will be reset!","Ticket System",JOptionPane.OK_CANCEL_OPTION)
						!=JOptionPane.OK_CANCEL_OPTION)
				{
					textFrom.setText(null);
					textTo.setText(null);
					rdbtnStandard.setSelected(false);
					rdbtnReturnTicket.setSelected(false);
					rdbtnAdult.setSelected(false);
					rdbtnChild.setSelected(false);
					rdbtnSeniorCitizen.setSelected(false);
					rdbtnNonStop.setSelected(false);
					comboDestination.setSelectedItem("Destination");
					comboSource.setSelectedItem("Source");
				}
			}
		});


		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBounds(153, 393, 85, 21);
		contentPane.add(btnReset);

		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFrom.setBounds(599, 158, 108, 34);
		contentPane.add(lblFrom);

		JLabel lblDestination = new JLabel("To");
		lblDestination.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDestination.setBounds(599, 211, 108, 34);
		contentPane.add(lblDestination);

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrice.setBounds(599, 317, 108, 34);
		contentPane.add(lblPrice);

		textFrom = new JTextField();
		textFrom.setBounds(746, 170, 96, 19);
		contentPane.add(textFrom);
		textFrom.setColumns(10);

		textTo = new JTextField();
		textTo.setColumns(10);
		textTo.setBounds(746, 230, 96, 19);
		contentPane.add(textTo);

		textPrice = new JTextField();
		textPrice.setColumns(10);
		textPrice.setBounds(746, 329, 96, 19);
		contentPane.add(textPrice);

		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setOrientation(SwingConstants.VERTICAL);
		separator_1_2.setBounds(547, 147, 6, 138);
		contentPane.add(separator_1_2);

		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNext.setBounds(27, 391, 85, 21);
		contentPane.add(btnNext);

		JLabel lblDist = new JLabel("Distance");
		lblDist.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDist.setBounds(599, 273, 108, 34);
		contentPane.add(lblDist);

		textDist = new JTextField();
		textDist.setColumns(10);
		textDist.setBounds(746, 282, 96, 19);
		contentPane.add(textDist);

		textTicketNo = new JTextField();
		textTicketNo.setColumns(10);
		textTicketNo.setBounds(668, 129, 96, 19);
		contentPane.add(textTicketNo);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\JavaProjects\\Travel\\src\\travel\\hdbrts-logo2.png"));
		lblNewLabel_1.setBounds(316, 434, 214, 134);
		contentPane.add(lblNewLabel_1);
		btnNext.addActionListener
		(
				new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						try {}
						catch(Exception sd){}
						if (group1.isSelected(null))
						{
							JOptionPane.showMessageDialog(null, 
									"Please Select bus type!", 
									"ERROR", 
									JOptionPane.WARNING_MESSAGE);
						}
						else if(comboSource.getSelectedIndex()==0)
						{
							JOptionPane.showMessageDialog(null, 
									"Please Select Source", 
									"ERROR", 
									JOptionPane.WARNING_MESSAGE);
							textFrom.setText("");

						}
						else if(comboDestination.getSelectedIndex()==0)
						{
							JOptionPane.showMessageDialog(null, 
									"Please Select Destination", 
									"ERROR", 
									JOptionPane.WARNING_MESSAGE);
							textTo.setText("");

						}
						else if(group2.isSelected(null))
						{
							JOptionPane.showMessageDialog(null, 
									"Please select Journey Type!", 
									"ERROR", 
									JOptionPane.WARNING_MESSAGE);
						}
						else if(group3.isSelected(null))
						{
							JOptionPane.showMessageDialog(null, 
									"Please select Age Group!", 
									"ERROR", 
									JOptionPane.WARNING_MESSAGE);
						}
						else {
							String destValue,sourceValue;
							double price;

//HASH MAP
							//printing selected Detail into Text box on clicking Next
							textFrom.setText((String) comboSource.getSelectedItem()+"*");
							textTo.setText((String) comboDestination.getSelectedItem()+"*");

							Map<String, Integer> map = new HashMap<String, Integer>();
							map.put("Dharwad Terminal", 0);
							map.put("NTTF", 2);
							map.put("Vidyagiri", 3);
							map.put("SDM", 7);
							map.put("RTO", 11);
							map.put("Navanagar", 13);
							map.put("BVB", 18);
							map.put("Hubli Terminal", 22);




							for (String key : map.keySet())
								System.out.println(key + " - " + map.get(key));
							System.out.println();
							String dest1 =((String) comboDestination.getSelectedItem()) ;
							//testing
							//if (map.containsKey(dest1))
							//System.out.println("" + map.get(dest1));


							String source1 =((String) comboSource.getSelectedItem()) ;
							//testing
							//if (map.containsKey(source1))
							//System.out.println("" + map.get(source1));
							//Calculating Price 

							int dist=Math.abs((map.get(dest1))-(map.get(source1)));
							if(dist==0)
							{ JOptionPane.showMessageDialog(null, 
									"Source and Destination cannot be same!", 
									"ERROR", 
									JOptionPane.WARNING_MESSAGE);
							textTo.setText("");
							textFrom.setText("");

							}
							else {

								System.out.println(dist);
						
								if(dist<=5)
									price=5;
								else
									price=(dist*1);
								if(rdbtnNonStop.isSelected())
								{price=(price*1.25);}
								if(rdbtnChild.isSelected())
								{price=(price*0.5);}
								if(rdbtnSeniorCitizen.isSelected())
								{price=(price*0.75);}
								if(rdbtnReturnTicket.isSelected())
								{price=((price*2)-5);}
								if(price<5)
								{price=5;}



								String s = Double.toString(price); 
								textPrice.setText(s);

								String d = Integer.toString(dist);
								textDist.setText(d+" km(s)");



								btnNext.setFont(new Font("Tahoma", Font.BOLD, 15));
								btnNext.setBounds(27, 391, 85, 21);
								contentPane.add(btnNext);
							}
						}


					}


				});}	
}

