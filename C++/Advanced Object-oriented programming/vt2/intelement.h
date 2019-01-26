#ifndef INTELEMENT_H
#define INTELEMENT_H


class IntElement
{
    public:
        IntElement();
        IntElement(int val);
        ~IntElement();
        getVal() const;
        setVal(int val);
        IntElement& operator+=(const IntElement& i);
        IntElement& operator-=(const IntElement& i);
        IntElement& operator*=(const IntElement& i);
        IntElement operator+(const IntElement& i);
        IntElement operator-(const IntElement& i);
        IntElement operator*(const IntElement& i);

    protected:

    private:
        int val;
};



#endif // INTELEMENT_H
