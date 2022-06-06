firstList = [2,4,6,8,11,13]
secondList =[3,5,7,9,2,4]
thirdList = []
for x in firstList:
    if (x % 2 !=0):
        thirdList.append(x)

for y in secondList:
    if (y % 2 ==0):
        thirdList.append(y)
print("New List is : ", thirdList) 
