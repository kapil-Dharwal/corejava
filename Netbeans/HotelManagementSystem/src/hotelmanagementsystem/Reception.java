package hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame implements ActionListener{
     JButton newCustomer ;
    Reception(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        newCustomer = new JButton("New Customer Form");
        newCustomer.setBounds(10,30,200,30);
        newCustomer.setBackground(Color.black);
        newCustomer.setForeground(Color.white);
        newCustomer.addActionListener(this);
        add(newCustomer);
        
        JButton rooms = new JButton("Rooms");
        rooms.setBounds(10,70,200,30);
        rooms.setBackground(Color.black);
        rooms.setForeground(Color.white);
        add(rooms);
        
        JButton department = new JButton("Department");
        department.setBounds(10,110,200,30);
        department.setBackground(Color.black);
        department.setForeground(Color.white);
        add(department);
        
        JButton allemployee = new JButton("All Employee");
        allemployee.setBounds(10,150,200,30);
        allemployee.setBackground(Color.black);
        allemployee.setForeground(Color.white);
        add(allemployee);
        
        JButton customer = new JButton("Customer Information");
        customer.setBounds(10,190,200,30);
        customer.setBackground(Color.black);
        customer.setForeground(Color.white);
        add(customer);
        
        JButton manager = new JButton("Manager Information");
        manager.setBounds(10,230,200,30);
        manager.setBackground(Color.black);
        manager.setForeground(Color.white);
        add(manager);
        
        JButton checkout = new JButton("Checkout");
        checkout.setBounds(10,270,200,30);
        checkout.setBackground(Color.black);
        checkout.setForeground(Color.white);
        add(checkout);
        
        JButton update = new JButton("Update");
        update.setBounds(10,310,200,30);
        update.setBackground(Color.black);
        update.setForeground(Color.white);
        add(update);
        
        JButton roomstatus = new JButton("Update Room Status");
        roomstatus.setBounds(10,350,200,30);
        roomstatus.setBackground(Color.black);
        roomstatus.setForeground(Color.white);
        add(roomstatus);
        
        JButton pickup = new JButton("Pickup Service");
        pickup.setBounds(10,390,200,30);
        pickup.setBackground(Color.black);
        pickup.setForeground(Color.white);
        add(pickup);
        
        JButton searchRoom = new JButton("Search Room");
        searchRoom.setBounds(10,430,200,30);
        searchRoom.setBackground(Color.black);
        searchRoom.setForeground(Color.white);
        add(searchRoom);
        
        JButton logout = new JButton("Logout");
        logout.setBounds(10,470,200,30);
        logout.setBackground(Color.black);
        logout.setForeground(Color.white);
        add(logout);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/fourth.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(250,30,500,470);
        add(image);
        
        setBounds(350,200,800,570);
        setVisible(true);
        
        
    
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == newCustomer){
            setVisible(false);
            new AddCustomer();
        }
    
    }
    public static void main(String[] args) {
        new Reception();
    }
}
