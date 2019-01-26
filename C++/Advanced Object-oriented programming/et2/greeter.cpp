#include "greeter.h"
#define CATCH_CONFIG_MAIN
#include "catch.hpp"
#include <iostream>

bool testaus(const std::string& terve)
{
    std::string kopio;
    Greeter greeter(terve);
    kopio = greeter.sayHello();
    if (kopio == terve)
        {
            return true;
    }
    else
        {
            return false;
        }
}

TEST_CASE("greetertest""greeter")
{
    CHECK(testaus("terve"));
    CHECK(testaus("00000"));
    CHECK(testaus("111111111111"));
}
