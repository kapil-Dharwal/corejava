import java.awt.*;
import java.awt.event.*;
class  ProLoss extends Frame implements ActionListener
{   
    Label lb1,lb2,lb3,lb4;
    TextField tf1,tf2,tf3;
    Button btn1 ,btn2;
    public  ProLoss()
    {
        this.setVisible(true);
        this.setBackground(Color.GRAY);
        this.setLayout(null);
        setTitle(" PROFIT AND LOSS");
        this.setBounds(50,50,350,400);
        lb1 = new Label("Enter first number");
        lb1.setBounds(20,50,170,30);
        lb1.setForeground(Color.BLACK);
        this.add(lb1);
		lb3 = new Label("Enter second number");
        lb3.setBounds(20,100,170,30);
        lb3.setForeground(Color.BLACK);
        this.add(lb3);
		lb4 = new Label("Enter third number");
        lb4.setBounds(20,150,170,30);
        lb4.setForeground(Color.BLACK);
        this.add(lb4);
 
        tf1 = new TextField();
        tf1.setBounds(200,50,130,30);
        add(tf1);
		tf2 = new TextField();
        tf2.setBounds(200,100,130,30);
        add(tf2);
		tf3 = new TextField();
        tf3.setBounds(200,150,130,30);
        add(tf3);
        btn1 = new Button("OK");
        btn1.setBounds(20,190,100,30);
        btn1.setBackground(Color.WHITE);
        btn1.setForeground(Color.BLACK);
        add(btn1);
        btn1.addActionListener(this);
        lb2 = new Label();
        lb2.setBounds(130,190, 200,30);
        lb2.setBackground(Color.WHITE);
        lb2.setForeground(Color.BLACK);
        add(lb2);
        addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
    }
    @Override
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn1)
        {
            try 
            {
                int n = Integer.parseInt(tf1.getText());
                int m = Integer.parseInt(tf2.getText());
				int o = Integer.parseInt(tf3.getText());
		        if(n>m)
                lb2.setText("first number is grater");
		        else if(m>o)
			    lb2.setText("second number is grater");
				else{
					lb2.setText("third number is grater");
				}
            }
            catch (NumberFormatException ex) 
            {
                lb2.setText("Please Enter Valid Number");
            }
            
            tf1.setText("");
			tf2.setText("");
			tf3.setText("");
        }
    }
}
class Test
{
    public static void main(String[] args)
    {
        ProLoss ob = new ProLoss();
    }
}