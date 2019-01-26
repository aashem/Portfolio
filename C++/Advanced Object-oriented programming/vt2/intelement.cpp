#include "intelement.h"

int value;

IntElement::IntElement(void){

}

IntElement::~IntElement(void){

}

IntElement::IntElement(int val){

}

int IntElement::setVal(int val){
    value = val;
}
int IntElement::getVal( void ) const{
    return value;
}

IntElement& IntElement::operator+=(const IntElement& i){
    val+=i.getVal();
    return *this;
}

IntElement& IntElement::operator-=(const IntElement& i){
    val-=i.getVal();
    return *this;

}

IntElement& IntElement::operator*=(const IntElement& i){
    val*=i.getVal();
    return *this;

}

IntElement IntElement::operator+(const IntElement& i){
    IntElement IntElement1(val);
    IntElement1 = IntElement1 + i.getVal();
    return IntElement1;
}

IntElement IntElement::operator-(const IntElement& i){
    IntElement IntElement1(val);
    IntElement1 = IntElement1 - i.getVal();
    return IntElement1;

}

IntElement IntElement::operator*(const IntElement& i){
    IntElement IntElement1(val);
    IntElement1 = IntElement1 * i.getVal();
    return IntElement1;

}
