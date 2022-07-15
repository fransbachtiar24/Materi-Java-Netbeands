from Gaji import Gaji
from Karyawan import Karyawan
from biodata import biodata

class Direktur(Karyawan, Gaji):
    #__private
    #_protected
    #public
    __tunjangan=0.0
    __gajipokok=0.0
    

    def __init__(self, tunjangan):
        self.__tunjangan = tunjangan

    def setTunjangan(self, tunjangan):
        self.__tunjangan =tunjangan
    
    def getTunjangan(self):
        return self.__tunjangan
    
    def setGajipokok(self, gajipokok):
        self.__gajipokok = gajipokok * 100
    
    def getGajiPokok(self):
        return self.__gajipokok

    def setNama(self, nama):
        self.nama=nama

    def getNama(self):
        return self.nama
    
