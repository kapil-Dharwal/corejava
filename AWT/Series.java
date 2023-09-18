import frame1.VolumeOfcone;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

class Qube extends Frame implements WindowListener,ActionListener
{
   Label lb1,lb2,lb3;
   Button btn1,btn2;
   TextField  tf1;
    
    public Qube()
    {
        this.setVisible(true);
        this.setTitle("QUBE SERIES");
        this.setBackground(Color.GRAY);
        this.setBounds(100,70, 600, 400);
        this.setLayout(null);
        
        lb1=new Label("Enter a number for squre serise ");
        lb1.setBounds(10 ,50 , 200, 30);
		lb1.setBackground(Color.WHITE);
        this.add(lb1);
        
        
        tf1=new TextField();
        tf1.setBounds(250, 50, 150, 30);
        this.add(tf1);
        
        lb2=new Label();
        lb2.setBounds(200,180 ,200,30);
        lb2.setBackground(Color.WHITE);
        this.add(lb2);
        
       
        btn1=new  Button("OK");
        btn1.setBounds(10,180, 150,30);
        btn1.setBackground(Color.WHITE);
        btn1.setForeground(Color.black);
        this.add(btn1);
		btn2=new  Button(" VOLUME OF CONE");
        btn2.setBounds(10,250, 150,30);
        btn2.setBackground(Color.WHITE);
        btn2.setForeground(Color.black);
        this.add(btn2);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        this.addWindowListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent ac) {
       if(ac.getSource()==btn1)
        {
            try 
            {
                int n=Integer.parseInt(tf1.getText());
                int i;
                String str="";
                for(i=1;i<=n;i++)
                {		
					str=str+" "+i*i*i;
                }
                lb2.setText(str);
              
             }
            catch(NumberFormatException ex)
            {
              lb3.setText("Please enter no");
            }
            tf1.setText("");
           // tf2.setText("");
        }
		else if(ac.getSource()==btn2)
		{
			VolumeOfcone v=new VolumeOfcone();
			//v.setVisible(true);
		}
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void windowOpened(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosing(WindowEvent e) {
        this.dispose();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
 class Test
 {
    public static void main(String args[])throws IOException
    {
        new Qube();
    }
}