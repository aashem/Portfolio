#ifndef INTELEMENT_H
#define INTELEMENT_H


class IntElement
{
    public:
        IntElement();
        IntElement(v: int);
        namespace IntElement
        {
            IntElement();
        }
        int getVal() {query};
        void setVal (int v);
        IntElement& operator+ = (const IntElement& i);
        IntElement& operator- = (const IntElement& i);
        IntElement& operator* = (const IntElement& i);


    private:
        int val;
};

#endif // INTELEMENT_H
