fruitsname = {
    "apple": 11,
    "guava": 17,
    "orange": 18,
    "mango": 20
}

x= input("Enter Fruit name: ").lower()
if (x in fruitsname):
    print("Fruit is available")
else:
     print("Fruit is not available")