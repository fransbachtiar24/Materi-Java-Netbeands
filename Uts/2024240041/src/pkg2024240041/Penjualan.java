
package pkg2024240041;


public class Penjualan extends Barang {
    private Double jumlahbarang;
    private Double totalharga;
    private Double totalbayar;
    private Double pajak;
    

    public Double getJumlahbarang() {
        return jumlahbarang;
    }

    public void setJumlahbarang(Double jumlahbarang) {
        this.jumlahbarang = jumlahbarang;
    }


    public Double getTotalharga() {
        return totalharga;
    }

    public Double getTotalbayar() {
        return getTotalharga() + (getTotalharga() * pajak);
    }

    public Double getPajak() {
        return pajak / 100;
    }

    public void setPajak(Double pajak) {
        this.pajak = pajak;
    }
    
    
    
    
}
