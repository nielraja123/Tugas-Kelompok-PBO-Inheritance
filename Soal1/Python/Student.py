from Person import Person
class Student(Person):
    def __init__(self, nama, umur, npm):
        super().__init__(nama, umur)
        self.__npm = npm

    def getNpm(self):
        return self.__npm
    
    def setNpm(self, npm):
        self.__npm = npm
    
    def getNilaiPenguji1(self):
        return self.__nilaiPenguji1
    
    def setNilaiPenguji1(self, nilaiPenguji1):
        self.__nilaiPenguji1 = nilaiPenguji1

    def getNilaiPenguji2(self):
        return self.__nilaiPenguji2
    
    def setNilaiPenguji2(self, nilaiPenguji2):
        self.__nilaiPenguji2 = nilaiPenguji2
    
    def getNilaiPembimbing(self):
        return self.__nilaiPembimbing
    
    def setNilaiPembimbing(self, nilaiPembimbing):
        self.__nilaiPembimbing = nilaiPembimbing

    def getNilaiAkhir(self):
        return self.__nilaiPenguji1*0.3 + self.__nilaiPenguji2*0.3 + self.__nilaiPembimbing*0.4
    
    def getHurufMutu(self):
        nilaiAkhir = self.getNilaiAkhir()

        if nilaiAkhir > 0 and nilaiAkhir <= 60:
            return 'T'
        elif nilaiAkhir > 60 and nilaiAkhir <= 70:
            return 'C'
        elif nilaiAkhir > 70 and nilaiAkhir <= 80:
            return 'B'
        elif nilaiAkhir > 80 and nilaiAkhir <= 100:
            return 'A'
        
        return 'T'
    
    def getStatus(self):
        hurufMutu = self.getHurufMutu()

        if hurufMutu == 'T':
            return "MOHON MAAF ANDA TIDAK LULUS"

        return "SELAMAT ANDA LULUS"

    def __str__(self) -> str:
        return super().__str__() + "\n NPM\t\t : " + self.__npm + "\n Nilai Penguji 1 : " + str(self.__nilaiPenguji1) + "\n Nilai Penguji 2 : " + str(self.__nilaiPenguji2) + "\n Nilai Pembimbing: " + str(self.__nilaiPembimbing) + "\n Nilai Akhir\t : " + str(self.getNilaiAkhir()) + "\n Huruf Mutu\t : " + self.getHurufMutu() + "\n Status\t\t : " + self.getStatus() + "\n"

    def output(self):
        print(self.__str__())