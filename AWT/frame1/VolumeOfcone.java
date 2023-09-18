package frame1;
import java.awt.*;
import java.awt.event.*;
public class  VolumeOfcone extends Frame implements ActionListener
{   
    Label lb1,lb2,lb3;
    TextField tf1,tf2;
    Button btn1 ,btn2;
    public  VolumeOfcone()
    {
        this.setVisible(true);
        this.setBackground(Color.GRAY);
        this.setLayout(null);
        setTitle(" VOLUME OF CONE");
        this.setBounds(50,50,350,400);
        lb1 = new Label("Enter redius Of v_cone");
        lb1.setBounds(20,50,170,30);
        lb1.setBackground(Color.WHITE);
        lb1.setForeground(Color.BLACK);
        this.add(lb1);
		lb3 = new Label("Enter lenght Of v_cone");
        lb3.setBounds(20,100,170,30);
        lb3.setBackground(Color.WHITE);
		this.add(lb3);
        tf1 = new TextField();
        tf1.setBounds(200,50,130,30);
        add(tf1);
		 tf2 = new TextField();
        tf2.setBounds(200,100,130,30);
        add(tf2);
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
				Double h = Double.parseDouble(tf2.getText());
                lb2.setText(" VolumeOfcone="+String.valueOf((1*3.14*r*r*h)/3));
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
       VolumeOfcone ob = new  VolumeOfcone();
    }
}