#include "squarematrix.h"
#include "intelement.h"
#include <iostream>
#include <string>
#define CATCH_CONFIG_MAIN





SquareMatrix::SquareMatrix(){

}

SquareMatrix::SquareMatrix(const IntElement& i11,const IntElement& i12, const IntElement& i21, const IntElement& i22){
    e11 = i11;
    e12 = i12;
    e21 = i21;
    e22 = i22;
}

SquareMatrix::SquareMatrix(const SquareMatrix& m){

}

SquareMatrix::~SquareMatrix(){

}

SquareMatrix& SquareMatrix::operator+=(const SquareMatrix& m){
    e11+=m.e11;
    e12+=m.e12;
    e21+=m.e21;
    e22+=m.e22;
    return *this;

}

SquareMatrix& SquareMatrix::operator-=(const SquareMatrix& m){
    e11-=m.e11;
    e12-=m.e12;
    e21-=m.e21;
    e22-=m.e22;
    return *this;
}

SquareMatrix& SquareMatrix::operator*=(const SquareMatrix& m){
    IntElement j11(e11);
    IntElement j12(e12);
    IntElement j21(e21);
    IntElement j22(e22);
    e11=j11*m.e11 + j12*m.e21;
    e12=j11*m.e12 + j12*m.e22;
    e21=j21*m.e11 + j22*m.e21;
    e22=j21*m.e12 + j22*m.e22;
    return *this;

}

std::string SquareMatrix::toString() const{
   std::string os  = std::to_string(e11.getVal())+ std::to_string(e12.getVal()) + std::to_string(e21.getVal())+ std::to_string(e22.getVal());
   return os;
}

void SquareMatrix::print(std::ostream& os) const{
    std::cout << "[,][,]";
}

