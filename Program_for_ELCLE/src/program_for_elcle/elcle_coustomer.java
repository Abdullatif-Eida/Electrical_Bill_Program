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
public class elcle_coustomer {
    private int coustomer_id;
    private String coustomer_name;
    private int coustomer_meterid;
    private int year;
    private int month;
    
    public elcle_coustomer(int coustomer_id,String coustomer_name,int coustomer_meterid,int year,int month)
    {
        this.coustomer_id=coustomer_id;
        this.coustomer_name=coustomer_name;
        this.coustomer_meterid=coustomer_meterid;
        this.year=year;
        this.month=month;
        
    }
    public void set_coustomer_id(int coustomer_id)
    {
        this.coustomer_id=coustomer_id;
    }
    public int get_coustomer_id()
    {
        return coustomer_id;
    }
    public void set_coustomer_name(String coustomer_name)
    {
         this.coustomer_name=coustomer_name;
    }
    public String get_coustomer_name()
    {
        return coustomer_name;
    }
    public void set_coustomer_meterid(int coustomer_meterid)
    {
         this.coustomer_meterid=coustomer_meterid;
    }
    public int get_coustomer_meterid()
    {
        return coustomer_meterid;
    }
    public void set_year(int year)
    {
         this.year=year;
    }
    public int get_year()
    {
        return year;
    }
    public void set_month(int month)
    {
         this.month=month;
    }
    public int get_month()
    {
        return month;
    }
    
    public String toString()
    {
        return " --- The Customer ID is= "+coustomer_id+"\n"
                + " --- The Customer Name is= "+coustomer_name+"\n "
                + " --- The Meter ID is= "+coustomer_meterid+"\n "
                + " --- The Year is= "+year+"\n "
                + " --- The Month is= "+month+"\n";
    }
}
