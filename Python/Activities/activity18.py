# Importing the pandas
import pandas
dataframe = pandas.read_csv("sample.csv")
print (dataframe)
print("============")
print(dataframe["Usernames"])
print("============")
print("Username of second row:" ,dataframe["Usernames"][1], "|" ,"Password of second row is:",dataframe["Passwords"][1])
print("============")
print("Sort the Usernames column data in ascending order: ")
print(dataframe.sort_values('Usernames'))
print("============")
print("Sort the Password column data in descending order: ")
print(dataframe.sort_values('Passwords', ascending=False))