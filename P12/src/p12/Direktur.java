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
public class Direktur extends Karyawan {

    // Override = menulis ulang method
    @Override
    public Double getTotal() {
        return 2.0 * 10.0 * 20000000.0;
    }
}
