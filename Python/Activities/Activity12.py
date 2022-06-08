def SumTen(num):
  if num:
    # Recursive function call
    print(num)
    return num + SumTen(num-1)
    
  else:
    return 0

res = SumTen(10)

# Print result
print(res)