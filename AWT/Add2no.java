import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;

class AddTwoNumbers extends Frame implements ActionListener 
{
	
		TextField tf1; 
		TextField tf2; 
		Label l1,l2;
		Button b; 

		AddTwoNumbers()
		{
				this.setBackground(Color.GRAY);
				setTitle("Add Two Numbers");
				tf1 = new TextField(); 
				tf1.setBounds(100, 50, 85, 20);
				
				tf2 = new TextField(); 
				tf2.setBounds(100, 100, 85, 20); 
				
				b = new Button("Add"); 
				b.setBounds(110, 220, 60, 40); 
				
				this.setLayout(null);
				l1 = new Label("enter two number"); 
				l1.setBounds(12, 45, 95, 80); 
				
				
				
				add(b); 
				add(tf1);
				add(tf2);
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
				
			int a = Integer.parseInt(tf1.getText());
			int b = Integer.parseInt(tf2.getText());
			int c = a + b;
			
			l1.setText("result = " + String.valueOf(c)); 
		}

		public static void main(String[] args) throws Exception
		{
			new AddTwoNumbers(); 
		}
}