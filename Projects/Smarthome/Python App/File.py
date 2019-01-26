import time
import os
import RPi.GPIO as GPIO
print(GPIO.VERSION)
GPIO.setmode(GPIO.BOARD)
GPIO.setup(31,GPIO.OUT, initial=0)
GPIO.setup(29,GPIO.OUT, initial=0)
GPIO.setup(33,GPIO.IN, pull_up_down=GPIO.PUD_UP)
mode = GPIO.getmode()

print(mode)
#gpio 29, 31

filename = os.path.join("/var/www/html", "test.txt")
#tiedoston nimi + path

#luo test.txt jos ei ole olemassa
def luotxt():
	f= open(filename, "w")
	f.close()

#aukaisee test.txt luettavaksi
def luetxt():
	f= open(filename, "r")

#lukee viestit test.txt
def readmsg(content):
	if content == "LED1":
		return "LED1 ON"
		f.truncate(0)
	elif content == "LED1X":
		return "LED1 OFF"
		f.truncate(0)
	elif content == "LED2":
		return "LED2 ON"
		f.truncate(0)
	elif content == "LED2X":
		return "LED2 OFF"
		f.truncate(0)

#ohjaa ledit viestien mukaan
def ledohj(ledohj):
	if ledctr == "LED1 ON":
                GPIO.output(31,1)        
                print ("led on")
	elif ledctr == "LED1 OFF":
                GPIO.output(31,0) 
                print("led off")
        elif ledctr == "LED2 ON":
                GPIO.output(29,1) 
                print("led on")
        elif ledctr == "LED2 OFF":
                GPIO.output(29,0) 
                print("led off")
                
#lukee sensorilta tulevaa dataa                
def readsensor():
    input = GPIO.input(33)
    if input == 0:
        print("NAPPI PAALLA")
        
		


if __name__ == "__main__":
	luotxt()
	f= open(filename, "r")
	print("toimii")
	try:
            while True:
		contents = f.read()
		print(contents)
		time.sleep(1)
		ledctr = readmsg(contents)
		ledohj(ledctr)
		readsensor()
	except KeyboardInterrupt:
            GPIO.cleanup();
		
