# try getting list of numbers from user
def SumList(num):
    sum = 0
    for n in num:
       sum += n
    return sum

numList = [12,22,65,32,78]
print(numList)
print("Sum of numList = ", SumList(numList))



