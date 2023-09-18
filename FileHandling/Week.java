import java.awt.*;
import java.awt.event.*;
class Week  extends Frame implements ActionListener
{   
    Label lb1,lb2;
    TextField tf1;
    Button btn1 ,btn2;
    public Week()
    {
        this.setVisible(true);
        this.setBackground(Color.gray);
        this.setLayout(null);
        setTitle("WEEK");
        this.setBounds(50,50,350,400);
        lb1 = new Label("Enter Your a number");
        lb1.setBounds(20,50,170,30);
        lb1.setBackground(Color.WHITE);
        lb1.setForeground(Color.BLACK);
        this.add(lb1);
        tf1 = new TextField();
        tf1.setBounds(200,50,130,30);
        add(tf1);
        btn1 = new Button("OK");
        btn1.setBounds(20,180,100,30);
        btn1.setBackground(Color.WHITE);
        btn1.setForeground(Color.BLACK);
        add(btn1);
        btn1.addActionListener(this);
		//this.addWindowListener(this);
        lb2 = new Label();
        lb2.setBounds(130,180, 200,30);
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
                if(n==1)
                {
                    lb2.setText("monday");
                }
                else if(n==2)
                {
                    lb2.setText("tuesday");
                }
                else if(n==3)
                {
                    lb2.setText("wednesday");
                }
                else if(n==4)
                {
                    lb2.setText("thursday");
                }
				
                else if(n==5)
                {
                    lb2.setText("friday");
                }
				
                else if(n==6)
                {
                    lb2.setText("saterday");
                }
				
                else if(n==7)
                {
                    lb2.setText("sunday");
                }
                else
                {
                    lb2.setText("valid number");
                }
            }
            catch (NumberFormatException ex) 
            {
                lb2.setText("Please Enter number");
            }
            
            tf1.setText("");
        }
    }
}
class Test
{
    public static void main(String[] args)
    {
        Week ob = new Week();
    }
}