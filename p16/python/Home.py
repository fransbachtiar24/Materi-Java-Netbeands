from mdp.Direktur import Direktur

#membuat objek
direktur = Direktur(12.0);
print("Tunjangan dari constructor : ", direktur.getTunjangan())
#print(direktur.tunjangan) tidak bisa diakses karena private
direktur.setTunjangan(13.0)
print("Tunjangan setelah diset : ", direktur.getTunjangan())

direktur.setNik("101057")
print("NIK : ", direktur.getNik())

direktur.setGajipokok(250000.0)
print("Gaji pokok : ", direktur.getGajiPokok())

direktur.setNama("Frans")
print("Nama anda : ",direktur.getNama())