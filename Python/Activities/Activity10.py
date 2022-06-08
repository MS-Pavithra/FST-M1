Num_Tuple = (input("Enter numbers separated by ',' :").split (","))
print("Num_Tuple = ", Num_Tuple)

for n in Num_Tuple:
    if (int(n)%5) == 0:
        print(n)