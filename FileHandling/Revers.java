import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;

class Reverse extends Frame implements ActionListener 
{
	
		TextField tf1; 
		TextField tf2; 
		Label l1,l2;
		Button b; 

		Reverse()
		{
				this.setBackground(Color.PINK);
				setTitle("Add Two Numbers");
				tf1 = new TextField(); 
				tf1.setBounds(100, 50, 85, 20);
				
				b = new Button("click"); 
				b.setBounds(110, 220, 60, 40); 
				
				this.setLayout(null);
				l1 = new Label("enter two number"); 
				l1.setBounds(12, 45, 95, 80); 
				
				
				
				add(b); 
				add(tf1);
				add(l1); 
			
				
				setSize(300, 300); 
				setVisible(true);
				
				b.addActionListener(this); 
				addWindowListener(new WindowAdapter()
				{ 
				
					public void windowClosing(WindowEvent we)
					{
						System.exit(0); 
					}
				});
		}

		public void actionPerformed(ActionEvent e)
		{
			int rev=0;
			int a = Integer.parseInt(tf1.getText());
			for(int i=1;i<=a;i++)
			{
				int c = a%10;
				rev=rev*10+c;
				a=a/10;
			}
			l1.setText("result = " + String.valueOf(rev)); 
		}
		public static void main(String[] args) throws Exception
		{
			new Reverse(); 
		}
}