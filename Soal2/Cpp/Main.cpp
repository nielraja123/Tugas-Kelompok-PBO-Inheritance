
#include <iostream>
#include "Badak.cpp"
#include "Gajah.cpp"
#include "Kucing.cpp"

int main(){
    //Polimorfisme 1 (Polimorfisme dari Parent : Makhluk, ke Child : Mamalia)
    std::cout << "\n================== POLIMORFISME 1 ==================\n";
    Makhluk makhluk;
    Mamalia mamalia;

    makhluk.info();                 //Output = info() di class Makhluk
    mamalia.info();                //Output = info() di class Mamalia
    
    //Polimorfisme 2 (Polimorfisme dari Child : Mamalia, ke Grandchild : Gajah, badak, kucing)
    std::cout << "\n================== POLIMORFISME 2 ==================\n";
    Mamalia mamalia1;
    Badak badak;
    Kucing kucing;
    Gajah gajah;
    
    mamalia1.info();                //Output = info() di class mamalia
    badak.info();                    //Output = info() di class badak
    kucing.info();                  //Output = info() di class  kucing
    gajah.info();               //Output = info() di class Gajah
}