#ifndef GREETER_H
#define GREETER_H
#include <iostream>

class Greeter
{
    public:
        Greeter(const std::string& terve);
        std::string sayHello( void );

    private:
        std::string greetings;

};

Greeter::Greeter(const std::string& terve)
    {
      greetings = terve;
    }

std::string Greeter::sayHello( void )
{
    return greetings;
}
#endif // GREETER_H
