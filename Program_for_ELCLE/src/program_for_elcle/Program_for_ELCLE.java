/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_for_elcle;

import javax.swing.JOptionPane;

/**
 *
 * @author mhdab
 */
public class Program_for_ELCLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int choice;
       int id,meterid,year,month,Consumption,period1,period2,period3;
       String name,type;
       String Email,Password;
       
       Email=JOptionPane.showInputDialog("Enter your email: ");
       Password=JOptionPane.showInputDialog("Enter your password:: ");
       if(Email.equals("mhdabdullatifD2016D@gmail.com") && Password.equals("AbdullatifwilltakeD"))
       {
               
       do{
           choice=Integer.parseInt(JOptionPane.showInputDialog("choose:\n1:calculate Commercial Bill"
           +"\n2:calculate Residential Bill\n3:calculate Govermental Bill \n4: close the program"));
           
           if(choice>3)
            {     
               JOptionPane.showMessageDialog(null, "Please Enter a valid number between 1 and 4");
            }else{
               id=Integer.parseInt(JOptionPane.showInputDialog("Enter ID: "));
               name=JOptionPane.showInputDialog("Enter Name: ");
               meterid=Integer.parseInt(JOptionPane.showInputDialog("Enter Meter ID:"));
               year=Integer.parseInt(JOptionPane.showInputDialog("Enter Year:"));
               month=Integer.parseInt(JOptionPane.showInputDialog("Enter Month:"));
           
           switch(choice)
           {
               case 1:Consumption=Integer.parseInt(JOptionPane.showInputDialog("Enter Consumption"));
               Commercial c1= new Commercial(id,name,meterid,year,month,Consumption);
               System.out.println(c1);
               break;
               
               case 2: period1=Integer.parseInt(JOptionPane.showInputDialog("Enter Consumption in Period 1"));
                       period2=Integer.parseInt(JOptionPane.showInputDialog("Enter Consumption in Period 2"));
                       period3=Integer.parseInt(JOptionPane.showInputDialog("Enter Consumption in Period 3"));
                       Residential r1 = new Residential(id,name,meterid,year,month,period1,period2,period3);
                       System.out.println(r1);
                       break;
                       
               case 3: type=JOptionPane.showInputDialog("Enter Type of Institution: ");
                       Consumption=Consumption=Integer.parseInt(JOptionPane.showInputDialog("Enter Consumption"));
                       Govermental g1 = new Govermental(id,name,meterid,year,month,type,Consumption);
                       System.out.println(g1);
                       break;
                       
               default:
                       JOptionPane.showMessageDialog(null, "Please Enter a valid number between 1 and 4");
                       break;
           }  
           
           }
           
       }
       while (choice!=4);
       


       
       
    }else{
        JOptionPane.showMessageDialog(null, "Please Check your Email or Your password");
       }
    
}
}