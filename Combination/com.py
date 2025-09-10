n=int(input())
r=int(input())
def fact(n):
    if n==0 or n==1:
        return 1
    return n*fact(n-1)
ans=fact(n)//(fact(r)*fact(n-r))
print(ans)