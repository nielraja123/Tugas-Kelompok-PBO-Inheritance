#include <iostream>
#include "Mamalia.cpp"
#pragma once
 
class Kucing : public Mamalia{
    public :
    void info(){
        std::cout << "Kucing merupakan mamalia yang lucu\n";
        std::cout << "Kucing telah berkembang menjadi ratusan ras dengan bermacam-macam variasi\n\n";
    }
};
