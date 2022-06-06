numTuples = tuple((input("Enter the numbers: ").split(",")))
print("Numbers are :", numTuples)
for x in numTuples:
    if (int(x) % 5 == 0):
        print(x)
  
