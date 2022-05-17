import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator  implements ActionListener {
	
	
	boolean isoperatorclicked=false;
	
	String oldValue;
	int buttonClick=0;


	

	
	
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton twoButton;
	JButton oneButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divisonButton;
	JButton multiButton;
	JButton plusButton;
	JButton minusButton;
	JButton clearButton;

	public Calculator(){
		 jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(400, 100);
		
		
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 20, 540, 70);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.WHITE);
		jf.add(displayLabel);
		
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30,120,80,80);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 50));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		
		
	 eightButton=new JButton("8");
		eightButton.setBounds(130,120,80,80);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 50));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230,120,80,80);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 50));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
	 fourButton=new JButton("4");
		fourButton.setBounds(30,230,80,80);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 50));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
	 fiveButton=new JButton("5");
		fiveButton.setBounds(130,230,80,80);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 50));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		 sixButton=new JButton("6");
		sixButton.setBounds(230,230,80,80);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 50));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		
	 twoButton=new JButton("2");
		twoButton.setBounds(130,330,80,80);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 50));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
	 oneButton=new JButton("1");
		oneButton.setBounds(230,330,80,80);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 50));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(30,330,80,80);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 50));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		
	 dotButton=new JButton(".");
		dotButton.setBounds(30,430,80,80);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 50));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		 zeroButton=new JButton("0");
		zeroButton.setBounds(130,430,80,80);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 50));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		 equalButton=new JButton("=");
		equalButton.setBounds(230,430,80,80);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 50));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		
		
		 divisonButton=new JButton("/");
		divisonButton.setBounds(330,120,80,80);
		divisonButton.setFont(new Font("Arial", Font.PLAIN, 50));
		divisonButton.addActionListener(this);
		jf.add(divisonButton);
		
		 multiButton=new JButton("*");
		multiButton.setBounds(330,230,80,80);
		multiButton.setFont(new Font("Arial", Font.PLAIN, 30));
		multiButton.setHorizontalTextPosition(SwingConstants.CENTER);
		multiButton.addActionListener(this);
		jf.add(multiButton);
		
		 plusButton=new JButton("+");
		plusButton.setBounds(330,330,80,80);
		plusButton.setFont(new Font("Arial", Font.PLAIN, 50));
		plusButton.setHorizontalTextPosition(SwingConstants.CENTER);
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(330,430,80,80);
		minusButton.setFont(new Font("Arial", Font.PLAIN, 50));
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		
		clearButton=new JButton("clear");
		clearButton.setBounds(430,430,80,80);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 20));
		clearButton.addActionListener(this);
		jf.add(clearButton);
	
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		new Calculator();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		displayLabel.setFont(new Font("Serif", Font.ITALIC, 40));
		
		if(e.getSource()==sevenButton) {
			if (isoperatorclicked) {
				displayLabel.setText("7");
				isoperatorclicked=false;}
			else {
				displayLabel.setText(displayLabel.getText()+"7");
				}
			 
			
			
			
				
		}else if(e.getSource()==eightButton) {
			if (isoperatorclicked) {
				displayLabel.setText("8");
				isoperatorclicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
			
		}else if(e.getSource()==nineButton) {
			if (isoperatorclicked) {
				displayLabel.setText("9");
				isoperatorclicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
			
		} else if(e.getSource()==fourButton) {
			if (isoperatorclicked) {
				displayLabel.setText("4");
				isoperatorclicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		} else if(e.getSource()==fiveButton) {
			if (isoperatorclicked) {
				displayLabel.setText("5");
				isoperatorclicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		} else if(e.getSource()==sixButton) {
			if (isoperatorclicked) {
				displayLabel.setText("6");
				isoperatorclicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		} else if(e.getSource()==threeButton) {
			if (isoperatorclicked) {
				displayLabel.setText("3");
				isoperatorclicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
		} else if (e.getSource()==twoButton) {
			if (isoperatorclicked) {
				displayLabel.setText("2");
				isoperatorclicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		} else if(e.getSource()==oneButton) {
			if (isoperatorclicked) {
				displayLabel.setText("1");
				isoperatorclicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"1");}
			
			
		}  else if(e.getSource()==dotButton) {
			displayLabel.setText(displayLabel.getText()+".");
			
			
		} else if(e.getSource()==zeroButton) {
			if (isoperatorclicked) {
				displayLabel.setText("0");
				isoperatorclicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
			
			
		}  else if(e.getSource()==equalButton) {
			
			if(buttonClick==1) {
			String newValue=displayLabel.getText();
			
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			
			float result=oldValueF+newValueF;
			displayLabel.setText(result+"");}
			
			
			
			if(buttonClick==2) {
				String newValue=displayLabel.getText();
				
				float oldValueF=Float.parseFloat(oldValue);
				float newValueF=Float.parseFloat(newValue);
				
				float result=oldValueF-newValueF;
				displayLabel.setText(result+"");}
			
			
			
			if(buttonClick==3) {
				String newValue=displayLabel.getText();
				
				float oldValueF=Float.parseFloat(oldValue);
				float newValueF=Float.parseFloat(newValue);
				
				float result=oldValueF*newValueF;
				displayLabel.setText(result+"");}
			
			
			
			if(buttonClick==4) {
				String newValue=displayLabel.getText();
				
				float oldValueF=Float.parseFloat(oldValue);
				float newValueF=Float.parseFloat(newValue);
				
				float result=oldValueF/newValueF;
				displayLabel.setText(result+"");}
		}
			
			 
		 else if(e.getSource()==divisonButton) {
			 isoperatorclicked=true;
			 oldValue=displayLabel.getText();
				buttonClick=4;
			
		} else if(e.getSource()==multiButton) {
			isoperatorclicked=true;
			buttonClick=3;
			oldValue=displayLabel.getText();
			
		} else if(e.getSource()==plusButton) {
		
			isoperatorclicked=true;
			oldValue=displayLabel.getText();
			buttonClick=1;
			
			
			
			
			
		} else if(e.getSource()==minusButton) {
			
			isoperatorclicked=true;
			oldValue=displayLabel.getText();
			buttonClick=2;
			
			
			
		} else if(e.getSource()==clearButton) {
			displayLabel.setText("");
		} 
		
	
	
		
	
	
	
		}}
	
	
	
	
		
	
	
	

