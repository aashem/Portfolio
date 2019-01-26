def kysy_salasana(""):
    while True:
        if len(salasana) >= 8:
            print("hyvä salasana")
            return salasana
            break
        else:
            print("Pitempi salasana")
            salasana =input("syötä salasana")
            kysy_salasana(salasana)
            break
salasana =input("syötä salasana")
kysy_salasana(salasana)

