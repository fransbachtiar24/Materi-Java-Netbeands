from abc import ABC, abstractmethod

class Gaji(ABC):
    @abstractmethod
    def setGajipokok(self, gajipokok):
        pass
    
    @abstractmethod
    def getGajiPokok(self):
        pass
