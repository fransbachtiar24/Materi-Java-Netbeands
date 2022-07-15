from abc import ABC

class Karyawan(ABC):
    __nik=""

    def setNik(self, nik):
        self.__nik = nik
    
    def getNik(self):
        return self.__nik
