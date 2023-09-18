import java.awt.*;
import java.awt.event.*;
class Palindrome extends Frame implements ActionListener
{   
    Label lb1,lb2;
    TextField tf1;
    Button btn1 ,btn2;
    public Palindrome()
    {
        this.setVisible(true);
        this.setBackground(Color.GRAY);
        this.setLayout(null);
        setTitle("PALIMDROM PROGRAM");
        this.setBounds(50,50,350,400);
        lb1 = new Label("ENTER THE NUMBER");
        lb1.setBounds(20,50,170,30);
        lb1.setBackground(Color.WHITE);
        lb1.setForeground(Color.BLACK);
        this.add(lb1);
        tf1 = new TextField();
        tf1.setBounds(200,50,130,30);
        add(tf1);
        btn1 = new Button("OK");
        btn1.setBounds(20,100,100,30);
        btn1.setBackground(Color.WHITE);
        btn1.setForeground(Color.BLACK);
        add(btn1);
        btn1.addActionListener(this);
        lb2 = new Label();
        lb2.setBounds(130,100, 200,30);
        lb2.setBackground(Color.YELLOW);
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
                int sum=n,rev=0;
		        while(n>0)
		        {
		        	int r =n%10;
		        	n = n/10;
			        rev = rev*10+r;
		        }
		        if(rev==sum)
                lb2.setText("NUMBER IS PALIMDROM");
		        else
			    lb2.setText("NUMBER NOT PALIMDROM");
            }
            catch (NumberFormatException ex) 
            {
                lb2.setText("PLEASE ENTER VALID NUMBER");
            }
            
            tf1.setText("");
        }
    }
}
class Test
{
    public static void main(String[] args)
    {
        Palindrome ob = new Palindrome();
    }
}