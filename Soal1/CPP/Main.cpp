#include <iostream>
#include "Student.cpp"

int main(){
    Student mahasiswa1 = Student("Andre Nathaniel", 19, "140810200042");
    mahasiswa1.setNilaiPenguji1(70);
    mahasiswa1.setNilaiPenguji2(80);
    mahasiswa1.setNilaiPembimbing(90);
    std::cout << mahasiswa1.str();

    Student mahasiswa2 = Student("Dian Maulida", 18, "140810200084");
    mahasiswa2.setNilaiPenguji1(50);
    mahasiswa2.setNilaiPenguji2(55);
    mahasiswa2.setNilaiPembimbing(60);
    std::cout << mahasiswa2.str();
}