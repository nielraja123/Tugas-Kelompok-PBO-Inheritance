#include <string>
class Person {
    protected:
        std::string nama;
        int umur;

    public:
        Person(std::string nama, int umur) {
            this->nama = nama;
            this->umur = umur;
        }
        std::string getNama() {
            return nama;
        }
        int getUmur() {
            return umur;
        }
        void setNama(std::string nama) {
            this->nama = nama;
        }
        void setUmur(int umur) {
            this->umur = umur;
        }
};