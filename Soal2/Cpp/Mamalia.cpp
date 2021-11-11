#include <iostream>
#include "Makhluk.cpp"
#pragma once

class Mamalia : public Makhluk{
    public :
    void info(){
        std::cout << "Beberapa hewan tergolong ke dalam mamalia.\n";
        std::cout << "Mamalia merupakan hewan menyusui yang berciri-ciri berdarah panas dan memiliki rambut atau bulu.\n\n";
    }
};
