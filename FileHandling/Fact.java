import java.awt.*;
import java.awt.event.*;

class Factorial extends Frame implements ActionListener
{
	TextField tf;
	Button b;
	Label l, r;
	Factorial()
	{  
		this.setBackground(Color.GRAY);
		this.setTitle("FACTORIAL");
		l = new Label("Enter number");
		r = new Label();
		tf = new TextField();
		b = new Button("Fact");  
		setBounds(30, 40, 200, 20);
		l.setBounds(30, 70, 150, 20);
		r.setBounds(30, 170, 200, 20);
		tf.setBounds(30, 90, 190, 30);
		b.setBounds(30, 130, 190, 30);  

		add(l);
		add(r);
		add(tf);
		add(b);

		setSize(250,210);
		setLayout(null);
		setVisible(true);

		b.addActionListener(this);
		addWindowListener(new WindowAdapter()
		{  
            public void windowClosing(WindowEvent e)
            {  
                System.exit(0);  
            }  
        });
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			int num = Integer.parseInt(tf.getText());
			r.setText(num+  "fact is"  +getFactorial(num));
		}
	}
	public int getFactorial(int x)
	{
		int fact = 1;
		for(int i = x; i > 0; --i)
		{
			fact *= i;
		}
		return(fact);
	}
	public static void main(String[] args)
	{
		Factorial factorial = new Factorial();
	}
}