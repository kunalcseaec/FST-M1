# Importing the pandas
import pandas
# Creating dict to hold data
data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}
# Copying data in a dataframe
table = pandas.DataFrame(data)
print (table)
# Writing data into csv file
table.to_csv("sample.csv", index= False)