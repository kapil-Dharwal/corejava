import java.awt.*;
import java.awt.event.*;
class   PeriOfcircle extends Frame implements ActionListener
{   
    Label lb1,lb2;
    TextField tf1;
    Button btn1 ,btn2;
    public   PeriOfcircle()
    {
        this.setVisible(true);
        this.setBackground(Color.GRAY);
        this.setLayout(null);
        setTitle("  PERAMTRCIRCLE");
        this.setBounds(50,50,350,400);
        lb1 = new Label("Enter The Radius");
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
                Double r = Double.parseDouble(tf1.getText());
                lb2.setText("perimetar  of circal="+String.valueOf(2*3.14*r));
            }
            catch (NumberFormatException ex) 
            {
                lb2.setText("Please Enter Valid Number");
            } 
            tf1.setText("");
        }
    }
}
class Test
{
    public static void main(String[] args)
    {
        PeriOfcircle ob = new   PeriOfcircle();
    }
}