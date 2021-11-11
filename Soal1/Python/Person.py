
class Person:
    def __init__(self, nama, umur):
        self.__nama = nama
        self.__umur = umur
    
    def getNama(self):
        return self.__nama

    def getUmur(self):
        return self.__umur
    
    def setNama(self, nama):
        self.__nama = nama
    
    def setUmur(self, umur):
        self.__umur = umur

    def __str__(self) -> str:
        return " Nama\t\t : " + self.__nama + "\n Umur\t\t : " + str(self.__umur)
