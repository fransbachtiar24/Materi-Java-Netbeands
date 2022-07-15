/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kampus;

import p14.Karyawan;

/**
 *
 * @author user
 */
public class Ob extends Karyawan {
    private Double lembur;
    
    void setLemburDefault(Double lembur){
        this.setNikProtected("Protected");
        this.setNikPublic("Public");
    }
    
    protected void setLemburProtected(Double lembur){
        this.lembur = lembur;
    }
    
    public void setLemburPublic(Double lembur){
        this.lembur = lembur;
    }
    
}
