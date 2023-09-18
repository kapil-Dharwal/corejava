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

class Table extends Frame implements WindowListener,ActionListener
{
   Label lb1,lb2,lb3;
   Button btn1;
   TextField  tf1;
    
    public Table()
    {
        this.setVisible(true);
        this.setTitle("TABBLE");
        this.setBackground(Color.GRAY);
        this.setBounds(100,70, 600, 400);
        this.setLayout(null);
        
        lb1=new Label("Enter a number for a tabble ");
        lb1.setBounds(10 ,50 , 150, 30);
		lb1.setBackground(Color.WHITE);
        this.add(lb1);
        
        
        tf1=new TextField();
        tf1.setBounds(250, 50, 200, 30);
        this.add(tf1);
        
        lb2=new Label();
        lb2.setBounds(200,180 ,420,30);
        lb2.setBackground(Color.WHITE);
        this.add(lb2);
        
       
        btn1=new  Button("OK");
        btn1.setBounds(10,180, 150,30);
        btn1.setBackground(Color.WHITE);
        btn1.setForeground(Color.black);
        this.add(btn1);
        
        btn1.addActionListener(this);
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
                for(i=1;i<=10;i++)
                {		
					str=str+" "+n+"*"+i+"="+n*i;
					
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
        new Table();
    }
}