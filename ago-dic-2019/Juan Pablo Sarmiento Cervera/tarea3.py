A=input("Dame los Nombres: ").split()
for i in range(len(A)):      
    min_idx = i 
    for j in range(i+1, len(A)):
        if len(A[min_idx]) >len(A[j]):
            min_idx = j 
    A[i], A[min_idx] = A[min_idx], A[i] 
print ("Sorted array") 
for i in range(len(A)): 
    print(A[i])