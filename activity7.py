Number_list = list(input("Enter numbers: ").split(","))
sum = 0
for number in Number_list:
    sum += int(number)
print (sum)