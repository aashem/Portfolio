#ifndef SQUAREMATRIX_H_INCLUDED
#define SQUAREMATRIX_H_INCLUDED
#include "intelement.h"
#include <iostream>

class SquareMatrix
{
    public:
        SquareMatrix();
        SquareMatrix(const IntElement& i11,const IntElement& i12, const IntElement& i21, const IntElement& i22);
        SquareMatrix(const SquareMatrix& m);
        ~SquareMatrix();
        SquareMatrix& operator+=(const SquareMatrix& m);
        SquareMatrix& operator-=(const SquareMatrix& m);
        SquareMatrix& operator*=(const SquareMatrix& m);
        void print(std::ostream& os) const;
        std::string toString() const;


    private:
        IntElement e11;
        IntElement e12;
        IntElement e21;
        IntElement e22;
};

#endif // SQUAREMATRIX_H
