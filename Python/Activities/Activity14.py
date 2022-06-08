def fibonacci(number):
    if number <= 1:
        return number
    else:
        return(fibonacci(number-2) + fibonacci(number-1))
    
nterms = int(input("Enter a number: "))

if nterms <= 0:
    print("Please enter a positive number")
else:
    for i in range(1,nterms):
        print(fibonacci(i))