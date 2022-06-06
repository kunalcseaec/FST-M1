from xml.sax import xmlreader


x = int(input("Please Enter a number: "))
y = x % 2
if y > 0:
    print("Number is an odd number.")
else:
    print("Number is  an even number.")
