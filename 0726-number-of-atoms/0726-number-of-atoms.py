class Solution:
    def countOfAtoms(self, formula: str) -> str:

        tt=""
        arr=[]
        temp=""
        for i in range(0,len(formula)):
            cu=formula[i]

            if temp=="":
                temp+=cu
                continue
            if cu=="(" or cu==")":
                if temp!="":
                    arr.append(temp)
                arr.append(cu)
                temp=""
                continue
            
            if temp.isnumeric():
                if cu.isnumeric():
                    temp+=cu
                else:
                    arr.append(temp)
                    temp=cu
            else:
                if cu.isnumeric():
                    arr.append(temp)
                    temp=cu
                else:
                    if cu.isupper():
                        arr.append(temp)
                        temp=cu
                    else:
                        temp+=cu
        if temp!="":
            arr.append(temp)
       
        newarr=[]
        i=0
        while i<len(arr):
            cu=arr[i]
            if cu=="(":
                newarr.append((cu,0))
                
            elif cu==")":
                
                nexta=1
                if i+1<len(arr):
                    temp=arr[i+1]
                    if temp.isnumeric():
                        nexta=int(temp)
                        i+=1
                temparr=[]
                while len(newarr)>0 and newarr[-1][0]!="(":
                    f,c=newarr.pop()
                    temparr.append((f,c*nexta))
                newarr.pop()
                for k in range(0,len(temparr)):
                    newarr.append(temparr[k])
            elif cu.isalpha():
                nexta=1
                if i+1<len(arr):
                    temp=arr[i+1]
                    if temp.isnumeric():
                        nexta=int(temp)
                        i+=1
                newarr.append((cu,nexta))
            i+=1

        newarr.sort(key=lambda x:(x[0],x[1]))
        
        
        dicta={}
       
        for i in range(0,len(newarr)):
            f,c=newarr[i]
            dicta[f]=dicta.get(f,0)+c
        # print(dicta)
        for i in range(0,len(newarr)):
            f,c=newarr[i]
            if f in dicta:
                tt+=f
                if dicta[f]>1:
                    tt+=str(dicta[f])
                del dicta[f]


        return tt



        
        