Fruit = {
    "apple":180,
    "mango":120,
    "banana":75,
    "grapes":160,
    "muskmelon":40,
}
x= input("Enter fruit name: ").lower()
if x in Fruit:
    print("Yes")
else:
    print("No")