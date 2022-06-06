number_list = list(input("Enter numbers: ").split(","))
print(number_list)
Firstnum = print("First Number is : ",number_list[0])
Lastnum = print("last Number is : ",number_list[-1])
if Firstnum == Lastnum :
   print(True)
else :
    print(False)


