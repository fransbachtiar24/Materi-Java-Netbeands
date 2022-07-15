package pquiz1;

import java.util.ArrayList;

public class Brand {
    private ArrayList daftarBrand;
    
    
    public Brand() {
        daftarBrand = new ArrayList<String>();
        daftarBrand.add("iPhone");
    }

    public ArrayList getData() {
        return daftarBrand;
    }

    public void setData(String namaBrand) {
        daftarBrand.add(namaBrand);
    }
    
    
    
}
