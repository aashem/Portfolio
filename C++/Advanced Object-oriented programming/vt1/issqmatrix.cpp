#define CATCH_CONFIG_MAIN
#include "catch.hpp"

#include <iostream>
#include <sstream>
#include <limits>
#include "issqmatrix.h"

bool isSquareMatrix(const std::string& str){
    std::stringstream inputstream(str);
    char c;
    int num;
    int row = 0;
    int n = std::numeric_limits<int>::max();
    int row_nums = 0;

    inputstream >> c;
    if(!inputstream.good() || c!='[')
        return false;

    while(row < n){
        //Luetaan rivi ja lasketaan sen luvut
        //1. rivillä n = yo. lukumäärä
        inputstream >> c;
        if(!inputstream.good() || c!='[')
            return false;

        row_nums = 0;
        while(c!=']'){
            // Lue kokonaisluku inputstreamista. Jos ei onnistu -> false
            // Lue merkki c:hen. Jos ei , eikä ] -> false
            // Laske lukujen määrä muuttujaan row_nums
            inputstream >> num;
            if(!inputstream.good())
                return false;
            inputstream >> c;
            if(!inputstream.good() || c!=',' || c!=']')
                return false;

            row_nums++;
        }
        //1. rivillä päivitetään n
        //muuten tarkistetaan rivin pituus
        if(row == 0)
            n = row_nums;
            row++; //virhe?
    }

    //tarkistetaan viimeinen merkki ]
    return true;
}

TEST_CASE("Square matrix checking", "[matrix]"){
    CHECK(isSquareMatrix("][1]]"));
    CHECK(isSquareMatrix("[[1]]"));
    // JNE
}

/* int main(){
    std::cout << isSquareMatrix("[[1]]") << std::endl;
    return 0;
} */
