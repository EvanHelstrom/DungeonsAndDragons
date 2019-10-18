def pickNpc():
    print("You see three shops on the street.")
    name = input("Which do you approach? The (F)irst (S)econd or (T)hird")
    if(name == 'S'):
        general()
    elif(name == 'F'):
        smith()
    elif(name == 'T'):
        stables()


def stables():
    print("You arrive at the stables. You see livestock of several kinds in varying quantities, some better off than the others")
    print("There is a sign listing the prices of various draft animals:")
    for line in lines:
        if("Stables" in line):
            array = line.split(',')
            print(array[1],"for",array[2])

def smith():
    print("You arrive at the blacksmith. You see many swords shields and armors laying before you.")
    print("There is a sign that lists the prices of each piece:")
    for line in lines:
        if("Blacksmith" in line):
            array = line.split(',')
            print(array[1],"for",array[2])

def general():
    print("You stumble into the general store. A random assortment of items is on the table.")
    print("A loud man recites the prices of the items")
    for line in lines:
        if("General" in line):
            array = line.split(',')
            print(array[1],"for",array[2])

def purchase():
    buy = input("Do you want to purchase anything? (Y) or (N)")
    if(buy == "Y"):
        item = input("What item would you like to purchase?")
    else:
        print("You exist the area with disinterest and return to the street.")
        pickNpc()
file = open('interface.csv')
lines = file.read
pickNpc()