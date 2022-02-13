/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_for_elcle;

/**
 *
 * @author mhdab
 */
public class Commercial extends elcle_coustomer {
     private int Consumption;
    public Commercial(int coustomer_id,String coustomer_name,int coustomer_meterid,int year,int month, int Consumption)
    {
        super(coustomer_id,coustomer_name,coustomer_meterid,year,month);
        this.Consumption=Consumption;
    }
    public void set_Consumption(int cons1)
    {
        this.Consumption=cons1;
    }
    public int get_Consumption()
    {
        return this.Consumption;
    }
    public double flowchart_calc()
    {
        double money;
        if(this.Consumption<=300)
            money=this.Consumption*0.75;
        else if(this.Consumption<=500)
            money=300*0.75+(this.Consumption-300)*0.9;
        else if(this.Consumption<=700)
            money=300*0.75+200*0.9+(this.Consumption-500)*1.2;
        else
            money=300*0.75+200*0.9+200*1.2+(this.Consumption-700)*1.5;
        return money;
    }
    
    public String toString()
    {
        return "*****THE Commercial Bill*******\n"+super.toString()+"\n"+
                "*** Consumtion= "+this.Consumption+"\n"+
                "*** Total Cost Of Money= "+flowchart_calc()+"\n";
    }
}
