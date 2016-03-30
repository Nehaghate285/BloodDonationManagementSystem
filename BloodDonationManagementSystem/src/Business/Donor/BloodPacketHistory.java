/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donor;

import java.util.ArrayList;

/**
 *
 * @author Neha Ghate
 */
public class BloodPacketHistory {
 
    ArrayList<BloodPacket> bloodPacketList;

    public BloodPacketHistory() {
    
        bloodPacketList = new ArrayList<>();
    }

    public ArrayList<BloodPacket> getBloodPacketList() {
        return bloodPacketList;
    }

    public void setBloodPacketList(ArrayList<BloodPacket> bloodPacketList) {
        this.bloodPacketList = bloodPacketList;
    }
    
    public BloodPacket addBloodPacket(){
        
        BloodPacket bp = new BloodPacket();
        bloodPacketList.add(bp);
        return bp;
        
    }
    
}
