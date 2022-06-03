print("Hello, World!")
myVariable = 7
print(type(myVariable))
print(myVariable)

	
a = """Lorem ipsum dolor sit amet,
consectetur adipiscing elit,
sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua."""
print(a) 

""" STRINGS WORK LIKE ARRAYS"""
b = "Hello, World!"
print(b[1]) # Output: "e"
print(b[-4]) 
print(b[0:3]) 


d = "Hello, World!"
print(len(d)) # Output: 13



age = 36
txt = "My name is John, and I am {}"
print(txt.format(age))
 
# Output: My name is John, and I am 36


quantity = 3
itemno = 567
price = 49.95
myorder = "I want {} pieces of item {} for {} dollars."
print(myorder.format(quantity, itemno, price))


quantity = 3
itemno = 567
price = 49.95
myorder = "I want to pay {2} dollars for {0} pieces of item {1}."
print(myorder.format(quantity, itemno, price))

txt1 = "hello World" [::-1]
print (txt1)
