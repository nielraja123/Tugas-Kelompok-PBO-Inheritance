#include <iostream>
#include "Mamalia.cpp"
#pragma once

class Badak : public Mamalia{
    public :
    void info(){
        std::cout << "Badak bercula satu merupakan mamalia yang terancam punah.\n";
        std::cout << "Badak banyak di perjual belikan secara ilegal\n\n";
    }
};
