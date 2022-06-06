import pandas	
from pandas import ExcelFile
from pandas import ExcelWriter
data = {
    "FirstName":["Satvik", "Avinash", "Lahri"],
	"LastName":["Shah", "Kati", "Rath"],
	"Email":["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	"PhoneNumber":["4537829158", "4892184058", "4528727830"]
}

table = pandas.DataFrame(data)
print(table)
#writer = ExcelWriter("sample45.xlsx")
table.to_excel("sample454.xlsx")
