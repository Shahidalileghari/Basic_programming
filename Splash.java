package EmPackacage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash extends JFrame  implements ActionListener{
	
	                 JButton click;
                  public Splash() {
					
                	  getContentPane().setBackground(Color.gray);
                	  setLayout(null);
                	  
                	  JLabel welcpmeJLabel=new JLabel(" Welcome to ");
                	  welcpmeJLabel.setBounds(100,40,1200,60);
                	  welcpmeJLabel.setFont(new Font("tahomo",Font.BOLD,50));
                	  welcpmeJLabel.setForeground(Color.blue);
                	  add(welcpmeJLabel);
                	  
                	  
                	  
                	  JLabel heading =new JLabel("Employee Management System");
                	  heading.setBounds(100,120,1200,60);
                	  heading.setFont(new Font("tahomo",Font.PLAIN,50));
                	  heading.setForeground(Color.white);
                	  add(heading);
                	  
                	  click =new JButton("Click to start");
                	  click.setBounds(365,400,300,70);
                	  click.setFont(new Font("tahomo",Font.PLAIN,20));
                	  click.setBackground(Color.black);
                	  click.setForeground(Color.white);
                	  click.addActionListener(this);
                	  add(click);
                	  
                	  setTitle("Employee Management System");
                	  setSize(1000,600);
                	  setLocation(160,50);
                	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                	  setVisible(true);
                	  
                	  
                	  while (true) {
                		  
						heading.setVisible(false);
						
						try {
							Thread.sleep(500);
							
						} catch (Exception e) {
							
							e.printStackTrace();
						}
						
						heading.setVisible(true);
						
						try {
							Thread.sleep(500);
							
						} catch (Exception e) {
							e.printStackTrace();
						}
						
					} 
				      }
                  public void actionPerformed(ActionEvent ae)
                  {
                	  if (ae.getSource()==click) {
                		  
                		  setVisible(false);
                    	  
                    	  new Login();
					}
                  }
	public static void main(String[] args) {
		
                new Splash();
	          }

             }
