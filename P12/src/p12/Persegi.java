/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p12;


/**
 *
 * @author user
 */
public class Persegi implements BangunDatar{
    private Double sisi;

    public Double getSisi() {
        return sisi;
    }

    public void setSisi(Double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public Double getLuas() {
        return this.sisi * this.sisi;
    }
}