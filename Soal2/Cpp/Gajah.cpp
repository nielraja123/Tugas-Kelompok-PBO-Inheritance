#include <iostream>
#include "Mamalia.cpp"
#pragma once
 
class Gajah : public Mamalia{
    public :
    void info(){
        std::cout << "Gajah merupakan mamalia terbesar di darat.\n";
        std::cout << "Gajah bertelinga besar.\n\n";
    }
};
