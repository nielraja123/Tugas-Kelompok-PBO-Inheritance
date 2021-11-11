from Student import Student

if __name__ == "__main__":
    mahasiswa1 = Student("Andre Nathaniel", 19, "140810200042")

    mahasiswa1.setNilaiPenguji1(70)
    mahasiswa1.setNilaiPenguji2(80)
    mahasiswa1.setNilaiPembimbing(90)

    mahasiswa1.output()

    mahasiswa2 = Student("Dian Maulida", 18, "140810200084")

    mahasiswa2.setNilaiPenguji1(50)
    mahasiswa2.setNilaiPenguji2(55)
    mahasiswa2.setNilaiPembimbing(60)

    mahasiswa2.output()