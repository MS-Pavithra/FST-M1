numL1 = [22,31,12,14,17]
numL2 = [1,43,22,56,78]
print("numL1 = ", numL1)
print("numL2 = ", numL2)
numL3 = []
for n in numL1:
    if (n % 2 != 0):
        numL3.append(n)

for m in numL2:
    if (m % 2 == 0):
        numL3.append(m)
print("numL3 = ", numL3)

"""for x in numL3:
    print (x)"""