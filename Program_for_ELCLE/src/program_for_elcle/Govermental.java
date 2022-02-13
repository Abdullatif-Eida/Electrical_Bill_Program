/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_for_elcle;

/**
 *
 * @author Abvdula
 */
public class Govermental extends elcle_coustomer {
      private String type;
    private int Consumption;
    
    public Govermental(int coustomer_id,String coustomer_name,int coustomer_meterid,int year,int month, String type,int Consumption)
    {
         super(coustomer_id,coustomer_name,coustomer_meterid,year,month);
        this.type=type;
        this.Consumption=Consumption;
    }
    public void set_type(String type1)
    {
        this.type=type1;
    }
    public String get_type()
    {
        return type;
    }
     public void set_Consumption(int Consumption1)
    {
        this.Consumption=Consumption1;
    }
    public int get_Consumption()
    {
        return Consumption;
    }
    public double flowchart_calc()
    {
        double money=0;
        if(this.type.equals("A"))
            money=this.Consumption*0.5;
        else if(this.type.equals("B"))
            money=this.Consumption*0.75;
        else if (this.type.equals("C"))
            money=this.Consumption*0.9;
        else
            System.out.println("Error Type!!");
        return money;
    }
    public String toString()
    {
        return "*****The Govermental Bill*******\n"+super.toString()+
                "*** Type of Intitution= "+this.type+"\n *** Consumption= "+
                this.Consumption+"\n *** Total Cost Of Money= "+flowchart_calc()+"\n";
    }
}
