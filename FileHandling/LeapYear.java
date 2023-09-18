import java.awt.*;
import java.awt.Frame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
 

class Leap extends Frame implements WindowListener,ActionListener
{
    Label lb1,lb2,lb3;
    TextField tf1,tf2,tf3;
    Button btn1,btn2;
	Font f1;

public Leap()
	{
      this.setVisible(true);
      this.setTitle("LEAP YEAR");
      this.setBackground(Color.GRAY);
      this.setBounds(200,120,430,400);
      this.setLayout(null);
      
      lb1=new Label ("Find Year is LeapYear Or NormalYear ");
      lb1.setBounds(40,90,370,30);
	   lb1.setForeground(Color.white);
	   lb1.setFont (new Font ("TimesRoman", Font.BOLD, 20));
            this.add(lb1);
			
			 lb2=new Label ("Enter Any Number :");
      lb2.setBounds(40,150,190,30);
	   lb2.setForeground(Color.white);
	   lb2.setFont (new Font ("TimesRoman", Font.BOLD, 20));
            this.add(lb2);
			
      tf1 = new TextField();
      tf1.setBounds(250,150,70,30);
	  tf1.setFont (new Font ("TimesRoman", Font.BOLD, 20));
      this.add(tf1);
	  
	  btn1=new Button("OK");
	  btn1.setBounds(140,220,100,30);
	  btn1.setBackground(Color.white);
	  btn1.setFont (new Font ("TimesRoman", Font.BOLD, 20));
	  btn1.setForeground(Color.black);
	   btn1.addActionListener(this);
	  this.addWindowListener(this);
	   this.add(btn1);
	 
			
	  tf2 = new TextField();
      tf2.setBounds(50,280,310,30);
	  tf2.setFont (new Font ("TimesRoman", Font.BOLD, 20));
	  tf2.setForeground(Color.black);

      this.add(tf2);
	}
	@Override
      public void actionPerformed(ActionEvent e)
     {
		  String s = tf1.getText();
		  int a=Integer.parseInt(s);
		 if(a%4==0)
		 {
			 tf2.setText("      This is LeapYear");
		 }
		 else
		 {
			 tf2.setText("   This is Normal Year");
		 }
		 
	 }
	 @Override
		public void windowOpened(WindowEvent e) {
		  //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
		}

		@Override
		public void windowClosing(WindowEvent e) {
			//System.exit(0);
			dispose();
		  //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
		}

		@Override
		public void windowClosed(WindowEvent e) {
		   // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
		}

		@Override
		public void windowIconified(WindowEvent e) {
		   // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
		   // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
		}

		@Override
		public void windowActivated(WindowEvent e) {
		   // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
		   // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
		}
    }
 class Test
 {
	public static void main(String args[])
	{
		new Leap();
	}
}