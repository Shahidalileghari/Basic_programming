import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FirstProgram extends JFrame implements  ActionListener {
	JButton b,m,s,d,r;
	
	double a,c;
	
	JTextField first,second,result;
	   public FirstProgram() {
	          
		   setLayout(null);
		   
		   JLabel head=new JLabel("CALCULATOR");
		   head.setBounds(110,20,340,30);
		   head.setBackground(Color.red);
		   head.setForeground(Color.blue);
		   head.setFont(new Font("tahomo",Font.BOLD,28));
		   add(head);
		   
		    b=new JButton("ADDITION");
		   b.setBounds(30,130,130,30);
		   b.setBackground(Color.red);
		   b.setForeground(Color.black);
		   b.addActionListener(this);
		   b.setFont(new Font("tahomo",Font.BOLD,14));
		   
		   add(b);
		   
		   m=new JButton("MULTIPLICATION");
		   m.setBounds(180,130,190,30);
		   m.setBackground(Color.red);
		   m.setForeground(Color.black);
		   m.addActionListener(this);
		   m.setFont(new Font("tahomo",Font.BOLD,14));
		   
		   add(m);
		   
		   s=new JButton("SUBTRACTION");
		   s.setBounds(30,180,130,30);
		   s.setBackground(Color.red);
		   s.setForeground(Color.black);
		   s.setFont(new Font("tahomo",Font.BOLD,10));
		   s.addActionListener(this);
		   add(s);
		   
		   d=new JButton("DIVIDE");
		   d.setBounds(180,180,190,30);
		   d.setBackground(Color.red);
		   d.setForeground(Color.black);
		   d.setFont(new Font("tahomo",Font.BOLD,14));
		   d.addActionListener(this);
		   add(d);
		   b.addActionListener(this);
		   
		   
		   first=new JTextField();
		   
		   first.setBounds(180,60,190,30);
		   add(first);
		   
           second=new JTextField();
		   second.setBounds(180,90,190,30);
		   add(second);
		   
          JLabel result1=new JLabel("NUMBER_1");
		   
		   result1.setBounds(30,60,120,30);
		   result1.setFont(new Font("tahomo",Font.BOLD,18));
		   
		   add(result1);
		   
           JLabel result2=new JLabel("NUMBER_2");
		   
		   result2.setBounds(30,90,120,30);
		   result2.setFont(new Font("tahomo",Font.BOLD,18));
		   
		   add(result2);
		   
		   result=new JTextField();
		   
		   result.setBounds(180,230,190,30);
		   
		   add(result);
		   
		   r=new JButton("CLEAR");
		   r.setBounds(30,270,340,30);
		   r.setBackground(Color.red);
		   r.setForeground(Color.black);
		   r.setFont(new Font("tahomo",Font.BOLD,18));
		   r.addActionListener(this);
		   add(r);
		   
		   
		   JLabel result=new JLabel("RESULT");
		   
		   result.setBounds(30,230,80,30);
		   result.setFont(new Font("tahomo",Font.BOLD,20));
		   
		   add(result);
		   
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   setVisible(true);
		   setSize(400,400);
		   setLocation(240,180);
		   
	}
	   
	   public void actionPerformed(ActionEvent ec) {
		   
		   if (ec.getSource()==b) {
			
			   a=Integer.parseInt(first.getText());
			   c=Integer.parseInt(second.getText());
			   if("".equals(first.getText())||"".equals(second.getText()))
			   {
				   JOptionPane.showMessageDialog(null, "Enter values");
			   }
			   
			   else {
				   Double d=a+c;
				   
				   result.setText(d+"");
			}
			   
			   
		}
		   
		   else 
			   if (ec.getSource()==s) {
					
				   a=Integer.parseInt(first.getText());
				   c=Integer.parseInt(second.getText());
				   
				   if("".equals(first.getText())||"".equals(second.getText()))
				   {
					   JOptionPane.showMessageDialog(null, "Enter values");
				   }
				   
				   else {
					   Double sub=a-c;
					   
					   result.setText(sub+"");
				}
			}
		   
			   else   if (ec.getSource()==d) {
					
				   a=Integer.parseInt(first.getText());
				   c=Integer.parseInt(second.getText());
				   
				   if("".equals(first.getText())||"".equals(second.getText()))
				   {
					   JOptionPane.showMessageDialog(null, "Enter values");
				   }
				   
				   else {
					   Double div=a/c;
					   
					   result.setText(div+"");
				}
			}
			   else 
				   if (ec.getSource()==m) {
						
					   a=Integer.parseInt(first.getText());
					   c=Integer.parseInt(second.getText());
					   
					   if("".equals(first.getText())||"".equals(second.getText()))
					   {
						   JOptionPane.showMessageDialog(null, "Enter values");
					   }
					   
					   else {
						   Double mult=a+c;
						   
						   result.setText(mult+"");
					}
				}
		   
				   else if(ec.getSource()==r)
					   
				   {
					   
					   result.setText(null);
					   
				   }
	}

	public static void main(String[] args) {
	
		 new FirstProgram();
	

	}

}
