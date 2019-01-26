#ifndef SQUAREMATRIX_H
#define SQUAREMATRIX_H
#include "intelement.h"

class SquareMatrix()
{
    public:
        SquareMatrix();
        SquareMatrix(const intElement& i11, const intElement& i12, const intElement& i21, const IntElement& i22);
        SquareMatrix(const SquareMatrix& m);
        namespace SquareMatrix
        {
            SquareMatrix();
        }
        SquareMatrix& operator+ = (const SquareMatrix& m);
        SquareMatrix& operator- = (const SquareMatrix& m);
        SquareMatrix& operator* = (const SquareMatrix& m);

    private:
        intElement e11;
        IntElement e12;
        intElement e21;
        intElement e22;
};

#endif // SQUAREMATRIX_H
