/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donor;

import Business.Employee.Employee;

/**
 *
 * @author Neha Ghate
 */
public class Donor extends Employee{
    
       
    private BloodPacketHistory bph;
    
    public Donor(){
        bph = new BloodPacketHistory();
    }

    public BloodPacketHistory getBph() {
        return bph;
    }

    public void setBph(BloodPacketHistory bph) {
        this.bph = bph;
    }

    @Override
    public String toString() {
        return this.getName();
    }
    
    
    
}
