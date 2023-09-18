import java.awt.*;
import java.awt.event.*;
class  Sallry extends Frame implements ActionListener
{   
    Label lb1,lb2,lb3;
    TextField tf1,tf2;
    Button btn1 ;
    public  Sallry()
    {
        this.setVisible(true);
        this.setBackground(Color.GRAY);
        this.setLayout(null);
        setTitle("SALARY");
        this.setBounds(50,50,350,400);
        lb1 = new Label("Enter enter year");
        lb1.setBounds(20,50,170,30);
        lb1.setForeground(Color.BLACK);
        this.add(lb1);
		lb3 = new Label("Enter sallry");
        lb3.setBounds(20,100,170,30);
        lb3.setForeground(Color.BLACK);
        this.add(lb3);
 
        tf1 = new TextField();
        tf1.setBounds(200,50,130,30);
        add(tf1);
		tf2 = new TextField();
        tf2.setBounds(200,100,130,30);
        add(tf2);
		
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
					int year = Integer.parseInt(tf1.getText());
					int sallry= Integer.parseInt(tf2.getText());
                if(year>=5)
				{
					double per= sallry*5/100;
					lb2.setText(" percent =:"+String.valueOf(per));
					double bonus=sallry+per;
					lb2.setText(" bonuas =:"+String.valueOf(bonus));

				}
				else
				{

					lb2.setText("year not 5 crosh:");
				}
            }
            catch (NumberFormatException ex) 
            {
                lb2.setText("Please Enter Valid Number");
            }
            
            tf1.setText("");
			tf2.setText("");
			
        }
    }
}
class Test
{
    public static void main(String[] args)
    {
        Sallry ob = new Sallry ();
    }
}