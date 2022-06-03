def Totalsum(numbers):
	sum = 0
	for x in numbers:
		sum += x
	return sum
 
# Define the list of numbers
number_List = [16, 30, 43, 50]
 
# Call the sum() function with numList as argument
result = Totalsum(number_List)
 
# Print result with message
print("The sum of all the elements is: " + str(result))
