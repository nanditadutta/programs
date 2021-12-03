try:
    n=int(input("Enter the value of n"))
except:
    print("Exception Error")
num=[]
while True:
    if(n<=0):
        break
    x=input("Enter Number")
    try:
        y=int(x)
    except:
        print("Exception")
        continue
    num.append(y)
    n=n-1

sum=0

for a in num:
    sum=a+sum

print(sum/n);