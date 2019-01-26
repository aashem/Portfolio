PI = 3.1416

def laske_kuvion_ala(x):
    nelioala = x**2
    kateetti = (x**2/2) ** 0.5
    kolmionala = kateetti ** 2/2
    sektorinala = 45/360 * PI * kateetti ** 2
    halkaisija = kateetti * 2
    isonelionala = halkaisija ** 2
    isoympyranala = 270/360 * PI * halkaisija ** 2
    kuvionala = nelioala + kolmionala + sektorinala + isonelionala + isoympyranala
    return kuvionala

print ("%.4f"% laske_kuvion_ala(3.467))
