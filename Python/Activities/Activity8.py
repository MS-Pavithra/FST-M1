numArr= list ((input("Enter numbers separated by ',':").split(",")))
print(numArr)
if numArr[0] == numArr[-1]:
    print(True)
else:
    print(False)