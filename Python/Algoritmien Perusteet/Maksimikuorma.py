import time


def lueTiedosto():
	lista1 = []
	#funktio joka lukee tiedoston, tiedosto sisältää verkon tiedot sekä mistä mihin halutaan löytää reitti
	#kysytään käyttäjältä input jotta voidaan testata helpommin usealla tiedostolla.
	while True:
		file = input("Anna Tiedoston Nimi jonka haluat lukea: ")
		try:
			with open(file, "r") as lista:
				for rivi in lista:
					lista1.append((rivi.rstrip()).split())
				return lista1
		except IOError:
			print("Tiedoston aukaiseminen ei onnistunut. Yritä uudestaan ")




def etsiParasTie(verkko, alku, loppu, solmut=[], nykykuorma={}, ksolmut={}):
	reitti = []
	vsolmut = {}
	#Funktio joka käyttää Dijkstra algoritmiä löytääkseen parhaimman reitin verkosta, paras reitti on reitti jolla voidaan kuljettaa suurin kuorma
	#alku on muuttuja missä on tallennettu ensimmäinen solmu ja loppu päämäärän solmu
	#vsolmut = Vapaatsolmut sanakirja mihin tallenetaan solmut missä ei ole käyty ja ksolmut taas katsotutsolmut sanakirja.
	#reittiin tallennetaan paras reitti joka palautetaan vastauksena.
	if alku == loppu:
		edellinen = loppu
	#tarkistaa ollaanko reitin lopussa
		while edellinen != None:
			reitti.append(edellinen)
			edellinen = ksolmut.get(edellinen, None)
	#listaa reitin väärinpäin palatessaan takaisin alkuun
		kuorma = nykykuorma[loppu] - 8
		if kuorma < 8:
			print("ei ole kulkukelpoisia reittejä")
	#kuorma ei voi olla pienempi kuin 8, koska tehtävänanto
		else:
			reitti.reverse()
			print("Isoimman kuorman reitti kulkee solmujen  " + str(reitti) +" välillä. \nja " + "\nMaksimikuorma on: " + str(kuorma) +" tonnia")
	#kääntää reitin oikeinpäin ja printtaa sen
	else:
		if not solmut:
			nykykuorma[alku] = float('inf')
	#määritetään kuorman arvoksi loputon koska kuorman maksimia ei ole määritelty
		for reitti in verkko[alku]:
			if reitti not in solmut:
				maxkuorma = min(nykykuorma[alku], verkko[alku][reitti])
				if maxkuorma > nykykuorma.get(reitti, 0):
					nykykuorma[reitti] = maxkuorma
					ksolmut[reitti] = alku
		solmut.append(alku)
	#tämä for looppi katsoo viereisten solmujen arvot ja jos solmua ei ole vielä käyty valitsee se reitin jossa on suurin maksim
		for solmu in verkko:
			if solmu not in solmut:
				vsolmut[solmu] = nykykuorma.get(solmu, 0)
	#etsitään loput solmut

		try:
			seuraavareitti = str(max(vsolmut, key=vsolmut.get))
		except ValueError:
			seuraavareitti = loppu
	#käy sanakirjaa läpi ja lisää suurimman arvon seuraavaksi, jos sanakirja on tyhjä tiedetään että solmuja ei enää ole
		etsiParasTie(verkko, seuraavareitti, loppu, solmut, nykykuorma, ksolmut)
	#kutsutaan funktiota uudestaan seuraavan solmun arvoilla





def main():
	#Mainissa suoritetaan muut funktiot ja lisätään kaikki reitit verkko sanakirjaan for loopilla
	#reitin hakeminen alkaa aina "1" solmusta, ja päättyy tiedoston viimeiseen numeroon eli loppu muuttujassa sijoitettavaan arvoon.
	lista1 = lueTiedosto()
	alku = '1'
	loppu = lista1.pop()
	lista1.pop(0)

	verkko = {}
	for solmu in lista1:
		if solmu [0] in verkko:
			verkko[solmu[0]][solmu[1]] = int(solmu[2])
			if solmu[1] in verkko:
				verkko[solmu[1]][solmu[0]] = int(solmu[2])
		else:
			verkko[solmu[0]] = {solmu[1]: int(solmu[2])}
			verkko[solmu[1]] = {solmu[0]: int(solmu[2])}

	ajastinalku = time.perf_counter()
	etsiParasTie(verkko, alku, loppu[0])
	ajastinloppu = time.perf_counter()
	print(ajastinloppu - ajastinalku)
	#otetaan aika testejä varten


if __name__ == "__main__":
	main()