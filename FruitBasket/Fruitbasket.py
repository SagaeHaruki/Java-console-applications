import sys

Basket = []

a = "Apple"
o = "Orange"
m = "Mango"
g = "Guava"

print("Catch and eat any of this Fruits: ('Apple','Orange','Mango','Guava')")
inpt = int(input("How many fruits to catch?\nEnter Here >> "))
print("Chose a Fruit initial Press A, O, M, G")

for i in range(inpt):
   inp2 = input("Fruit " + str(i) + "/" + str(inpt) + "\nEnter Another >>")
   if str.lower(inp2) == 'a':
      Basket.append(a)
   elif str.lower(inp2) == 'o':
      Basket.append(o)
   elif str.lower(inp2) == 'm':
      Basket.append(m)
   elif str.lower(inp2) == 'g':
      Basket.append(g)
   else:
      print("Error")

print("Your basket now have ", Basket)

while True:
   eatF = input("Press E to eat a Fruit: ")
   if eatF == 'e' or eatF == "E":
      Basket.pop()
   if not Basket:
      print("No more Fruits")
      break
   print("Fruits in the Basket: ", Basket)
