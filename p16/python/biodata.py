from abc import ABC, abstractmethod

class biodata(ABC):
   @abstractmethod
   def setNama(self, nama):
       pass

   @abstractmethod
   def getNama(self):
       pass