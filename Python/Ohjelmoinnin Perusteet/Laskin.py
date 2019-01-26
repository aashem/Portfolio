while True:
    operaatio = input("valitse operaatio (+, -, *, /) ")
    if operaatio not in ('+', '-', '/', '*'):
        print("Laita oikea merkki")
    else:
        break
while True:    
    try:    
        luku1 = float(input("anna ensimmäinen luku "))
    except ValueError:
        print("")
    else:
        break
    
while True:    
    try:    
        luku2 = float(input("anna ensimmäinen luku "))
    except ValueError:
        print("")
    else:
        break
    
def lisaa(x,y):
    return x + y
        
def vahenna(x,y):
    return x - y
        
def jaa(x,y):
    if y > 0:
        return x / y
    else:
        return ("Tällä ohjelmalla ei pääse äärettömyyteen")
        
def kerro(x,y):
    return x * y
        
if operaatio == '+':
    print ("tulos: ", lisaa(luku1,luku2))

if operaatio == '-':
    print ("tulos: ",vahenna(luku1,luku2)) 

if operaatio == '/':
    print ("tulos: ",jaa(luku1,luku2))

if operaatio == '*':
    print ("tulos: ",kerro(luku1,luku2))    
