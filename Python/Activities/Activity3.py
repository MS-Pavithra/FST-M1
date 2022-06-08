# enter user names
P1= input ("Enter player1 name: ")
P2= input ("Enter player2 name: ")

a = input(P1 + ", do you want to choose rock, paper or scissors? ").lower()
b = input(P2 + ", do you want to choose rock, paper or scissors? ").lower()

if (a==b):
    print("Got tie, go for next round")

elif a=="rock" :
    if b=="scissor":
        print ("ROCK wins.")
    elif b=="paper":
        print ("PAPER wins")
    else:
        print (P2 +"  invalid selection.Select between rock / paper/ scissor")

elif a=="scissor":
    if  b=="paper":
        print("SCISSOR wins.")
    elif b=="rock":
        print ("ROCK wins.")
    else:
        print (P2 +"  invalid selection.Select between rock / paper/ scissor")

elif a=="paper":
    if b=="rock":
        print("PAPER wins.")
    elif b=="scissor":
        print("SCISSOR wins.")
    else:
        print (P2 +"  invalid selection.Select between rock / paper/ scissor")

else:
    print (P1 +" invalid selection.Select between rock / paper/ scissor")


