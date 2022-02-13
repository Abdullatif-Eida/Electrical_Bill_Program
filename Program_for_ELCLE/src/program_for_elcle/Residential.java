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
public class Residential extends elcle_coustomer {
    private int period1;
    private int period2;
    private int period3;
    
    public Residential(int coustomer_id,String coustomer_name,int coustomer_meterid,int year,int month,int period1,int period2,int period3)
    {
        super(coustomer_id,coustomer_name,coustomer_meterid,year,month);
        this.period1=period1;
        this.period2=period2;
        this.period3=period3;
    }
    public void set_period1(int period1)
    {
        this.period1=period1;
    }
    public int get_period1()
    {
        return period1;
    }
    public void set_period2(int period2)
    {
        this.period2=period2;
    }
    public int get_period2()
    {
        return period2;
    }
    public void set_period3(int period3)
    {
        this.period3=period3;
    }
    public int get_period3()
    {
        return period3;
    }
    public double flowchart_calc()
    {
        return period1*0.2+period2*0.3+period3*0.5;
    }
    public String toString()
    {
        return " --- THE Resedntial Bill is --- \n"+super.toString()+
                " --- Period 1 is="+this.period1 + "\n" +
                " --- Period 2 is="+this.period2 + "\n" +
                " --- Period 3 is="+this.period3 + "\n" +
                " --- Total Cost Of Money is= "+flowchart_calc()+"\n";
    }
}
