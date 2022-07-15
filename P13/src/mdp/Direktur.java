/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdp;

import p13.Gaji;
import p13.Karyawan;

/**
 *
 * @author user
 */
public class Direktur extends Karyawan implements Gaji {
    private Double tunjangan;
    private Double gajipokok;

    public Double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(Double tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    public Direktur(String nama) {
        super.setNama(nama);
    }

    @Override
    public Double getTotal() {
        return this.getTunjangan() + this.getGajiPokok();
    }

    @Override
    public Double getGajiPokok() {
        return this.gajipokok;
    }

    @Override
    public void setGajiPokok(Double gajipokok) {
        this.gajipokok = gajipokok;
    }
    
}
