

         import java.awt.Color;
         import java.awt.Font;
         import java.awt.event.ActionEvent;
         import java.awt.event.ActionListener;
         
         import javax.swing.JButton;
         import javax.swing.JFrame;
         import javax.swing.JTextField;
public class Calculator extends JFrame implements ActionListener {
    

    JButton addition,subtraction,multiplication,division,dot,percentage,backspace,Cancel;
    JButton one,two,three, four,five, six, seven, eight, nine,zero;
   JButton plusmius,equal;
    
   double firstnumber,secondnumber,result;
   String operation, answer;
   
    JTextField input;
                public Calculator() {
                    setLayout(null);
                    
                    getContentPane().setBackground(Color.gray);
                    
                    input=new JTextField();
                    input.setBounds(10,10,340,60);
                    input.setForeground(Color.black);
                    input.setColumns(10);
               //	 input.setLayout();
                    input.setFont(new Font("tahomo",Font.BOLD,18));
                    add(input);
                    
          //............Operator button...................//
              
                   
        
               
                   
                   addition=new JButton("+");
                   addition.setBounds(267,80,80,50);
                   addition.setFont(new Font("tohomo",Font.BOLD,14));
                   addition.addActionListener(this);
                   add(addition);
                   addition.addActionListener(new ActionListener() {
                       
                       @Override
                       public void actionPerformed(ActionEvent e) {
                           firstnumber=Double.parseDouble(input.getText());
                           input.setText("");
                           operation="+";
                           
                       }
                   });
                   
                   subtraction=new JButton("-");
                 subtraction.setBounds(267,150,80,50);
             subtraction.setFont(new Font("tohomo",Font.BOLD,14));
             subtraction.addActionListener(this);
                  add(subtraction);
                 subtraction.addActionListener(new ActionListener() {
                       
                       @Override
                       public void actionPerformed(ActionEvent e) {
                           //String number=input.getText()+subtraction.getText();
                           
                           firstnumber=Double.parseDouble(input.getText());
                           input.setText("");
                           operation="-";
                           
                       }
                   });
                   
                 multiplication=new JButton("*");
                 multiplication.setBounds(267,220,80,50);
                 multiplication.setFont(new Font("tohomo",Font.BOLD,14));
                 multiplication.addActionListener(this);
                  add(multiplication);
                  
                 multiplication.addActionListener(new ActionListener() {
                       
                       @Override
                       public void actionPerformed(ActionEvent e) {
                       //	String number=input.getText()+multiplication.getText();
                           
                           firstnumber=Double.parseDouble(input.getText());
                           input.setText("");
                           operation="*";
                           
                       }
                   });
                 
               division=new JButton("/");
               division.setBounds(267,290,80,50);
               division.setFont(new Font("tohomo",Font.BOLD,14));
               division.addActionListener(this);
                add(division);
division.addActionListener(new ActionListener() {
                       
                       @Override
                       public void actionPerformed(ActionEvent e) {
                           firstnumber=Double.parseDouble(input.getText());
                           input.setText("");
                           operation="/";
                           
                       }
                   });
   plusmius=new JButton("+/-");
     plusmius.setBounds(180,360,80,50);
plusmius.setFont(new Font("tohomo",Font.BOLD,14));
plusmius.addActionListener(this);
      add(plusmius);
      
plusmius.addActionListener(new ActionListener() {
       
       @Override
       public void actionPerformed(ActionEvent e) {
           double ops=Double.parseDouble(String.valueOf(input.getText()));
           
           ops=ops*(-1);
           
           input.setText(String.valueOf(ops));
           
       }
   });
dot=new JButton(".");
   dot.setBounds(95,360,80,50);
   dot.setFont(new Font("tohomo",Font.BOLD,24));
   dot.addActionListener(this);
    add(dot);
    
dot.addActionListener(new ActionListener() {
   
   @Override
   public void actionPerformed(ActionEvent e) {
       String number=input.getText()+dot.getText();
       
       input.setText(number);
       
   }
});



                    //...............Number button..................///


                    seven=new JButton("7");
                    seven.setBounds(10,150,80,50);
                    seven.setFont(new Font("tohomo",Font.BOLD,14));
                    seven.addActionListener(this);
                    add(seven);
                    
                       seven.addActionListener(new ActionListener() {
                           
                           @Override
                           public void actionPerformed(ActionEvent e) {
                               String number=input.getText()+seven.getText();
                               
                               input.setText(number);
                               
                           }
                       });
                    
                    eight=new JButton("8");
                    eight.setBounds(95,150,80,50);
                   eight.setFont(new Font("tohomo",Font.BOLD,14));
                   eight.addActionListener(this);
                    add(eight);
                    
                       eight.addActionListener(new ActionListener() {
                           
                           @Override
                           public void actionPerformed(ActionEvent e) {
                               String number=input.getText()+eight.getText();
                               
                               input.setText(number);
                               
                           }
                       });
                    
                   nine=new JButton("9");
                   nine.setBounds(180,150,80,50);
                   nine.setFont(new Font("tohomo",Font.BOLD,14));
                   nine.addActionListener(this);
                    add(nine);
   nine.addActionListener(new ActionListener() {
                           
                           @Override
                           public void actionPerformed(ActionEvent e) {
                               String number=input.getText()+nine.getText();
                               
                               input.setText(number);
                           
                       }
                   });
                    
               
                     
                   four=new JButton("4");
                    four.setBounds(10,220,80,50);
                   four.setFont(new Font("tohomo",Font.BOLD,14));
                   four.addActionListener(this);
                    add(four);
   four.addActionListener(new ActionListener() {
                           
                           @Override
                           public void actionPerformed(ActionEvent e) {
                               String number=input.getText()+four.getText();
                           
                           input.setText(number);
                           
                       }
                   });
                    
                   five=new JButton("5");
                    five.setBounds(95,220,80,50);
                    five.setFont(new Font("tohomo",Font.BOLD,14));
                    five.addActionListener(this);
                    add(five);
   five.addActionListener(new ActionListener() {
                           
                           @Override
                           public void actionPerformed(ActionEvent e) {
                               String number=input.getText()+five.getText();
                               
                               input.setText(number);
                               
                           }
                       });
                    
                   six=new JButton("6");
                   six.setBounds(180,220,80,50);
                   six.setFont(new Font("tohomo",Font.BOLD,14));
                   six.addActionListener(this);
                    add(six);
   six.addActionListener(new ActionListener() {
                           
                           @Override
                           public void actionPerformed(ActionEvent e) {
                               String number=input.getText()+six.getText();
                               
                               input.setText(number);
                               
                           }
                       });
                    
             
                    one=new JButton("1");
                   one.setBounds(10,290,80,50);
              one.setFont(new Font("tohomo",Font.BOLD,14));
              one.addActionListener(this);
                   add(one);
                one.addActionListener(new ActionListener() {
                   
                   @Override
                   public void actionPerformed(ActionEvent e) {
                       String number=input.getText()+one.getText();
                       
                       input.setText(number);
                       
                   }
               });
                   
             two=new JButton("2");
                  two.setBounds(95,290,80,50);
             two.setFont(new Font("tohomo",Font.BOLD,14));
             two.addActionListener(this);
                   add(two);
                   
                two.addActionListener(new ActionListener() {
                   
                   @Override
                   public void actionPerformed(ActionEvent e) {
                       String number=input.getText()+two.getText();
                       
                       input.setText(number);
                       
                   }
               });
                   
                  three=new JButton("3");
                  three.setBounds(180,290,80,50);
            three.setFont(new Font("tohomo",Font.BOLD,14));
            three.addActionListener(this);
                   add(three);
                   
                three.addActionListener(new ActionListener() {
                   
                   @Override
                   public void actionPerformed(ActionEvent e) {
                       String number=input.getText()+three.getText();
                       
                       input.setText(number);
                       
                   }
               });
                   
        
                          zero=new JButton("0");
                          zero.setBounds(10,360,80,50);
                     zero.setFont(new Font("tohomo",Font.BOLD,14));
                     zero.addActionListener(this);
                          add(zero);
   zero.addActionListener(new ActionListener() {
                           
                           @Override
                           public void actionPerformed(ActionEvent e) {
                               String number=input.getText()+zero.getText();
                               
                               input.setText(number);
                               
                           }
                       });
    
                          
   
                   //...............Symbal...........//
   
   
   
                         equal=new JButton("=");
                         equal.setBounds(267,360,80,50);
                     equal.setFont(new Font("tohomo",Font.BOLD,14));
                     equal.addActionListener(this);
                           add(equal);
   equal.addActionListener(new ActionListener() {
                           
                           @Override
                           public void actionPerformed(ActionEvent e) {
                               
                               secondnumber=Double.parseDouble(input.getText());
                               
                               if(operation=="+")
                                   
                               {
                                   result=firstnumber+secondnumber;
                                   answer=String.format("%.2f",result);
                                   
                                   input.setText(answer);
                                   
                                   
                               }
                               
                               else if (operation=="-") {
                                   result=firstnumber-secondnumber;
                                   answer=String.format("%.2f",result);
                                   
                                   input.setText(answer);
                               }
                               
                               else if (operation=="*") {
                                   result=firstnumber*secondnumber;
                                   answer=String.format("%.2f",result);
                                   
                                   input.setText(answer);
                               }
                               
                               else if (operation=="/") {
                                   result=firstnumber/secondnumber;
                                   answer=String.format("%.2f",result);
                                   
                                   input.setText(answer);
                               }
                               else if (operation=="%") {
                                   result=firstnumber%secondnumber;
                                   answer=String.format("%.2f",result);
                                   
                                   input.setText(answer);
                               }
                           }
                       });
                           
                         percentage=new JButton("%");
                       percentage.setBounds(180,80,80,50);
                     percentage.setFont(new Font("tohomo",Font.BOLD,24));
                     percentage.addActionListener(this);
                       add(percentage);
                       
                       percentage.addActionListener(new ActionListener() {
                           
                           @Override
                           public void actionPerformed(ActionEvent e) {
                               firstnumber=Double.parseDouble(input.getText());
                               input.setText("");
                               operation="%";
                               
                           }
                       });
                       
                        backspace=new JButton("\uf0e7");
                       backspace.setBounds(10,80,80,50);
                       backspace.setFont(new Font("tohomo",Font.BOLD,14));
                       add(backspace);
                       
                       backspace.addActionListener(new ActionListener() {
                           
                           @Override
                           public void actionPerformed(ActionEvent e) {
                               
                           String backpace=null;
                               
                               if(input.getText().length()>0)
                               {
                                   StringBuffer sb=new StringBuffer(input.getText());
                                   sb.deleteCharAt(input.getText().length()-1);
                                   
                                   backpace=sb.toString();
                                   
                                   input.setText(backpace);
                               }
                               
                           }
                       });
                       
                          Cancel=new JButton("C");
                       Cancel.setBounds(95,80,80,50);
                       Cancel.setFont(new Font("tohomo",Font.BOLD,14));
                Cancel.addActionListener(this);
                       add(Cancel);
                       
                       Cancel.addActionListener(new ActionListener() {
                           
                           @Override
                           public void actionPerformed(ActionEvent e) {
                               input.setText(null);
                               
                           }
                       });
                   
                         setSize(373,470);
                         setLocation(540,100);
                         setTitle("Calculator");
                         
                         setVisible(true);
                           }
                
                public void actionPerformed(ActionEvent ac)
                {
                    
                }
                // reset method
//                 public void resetmethod()
//                 {
//                	 input.setText(null);
//                 }
               public static void main(String[] args) {
              new Calculator();

                   }

}
