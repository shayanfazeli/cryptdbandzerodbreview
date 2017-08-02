"""
Performance Measurement
"""


"""
This script measures the amount of time that is required for zeroDB
to return the result of variety of queries that it supports.
"""

#Importing necessary packages:
import time
import zerodb
import pdb
from zerodb.query import *
from models import *

#Configuring the database which is in use:
PASSWORD = "123"
db = zerodb.DB(("localhost", 8001), username="root", password=PASSWORD)

#Perform queries of various kinds and natures, let the bashscript time it all:

for i in range(10000):
	first_three_johns = db[Employee].query(name="John", limit=3)
	rich_johns = db[Employee].query(InRange("salary", 195000, 200000),
	name="John")
	notrich_johns = db[Employee].query(NotInRange("salary", 0, 1))
	poor_johns = db[Employee].query(NotEq("salary", 200000))
	print "Batch number " + str(i) + " is finished."
	
print "All done."
print "Table length: " + str(len(db[Employee]))
































