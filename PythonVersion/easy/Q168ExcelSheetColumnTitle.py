class Solution(object):
    def convertToTitle(self, n):
        """
        :type n: int
        :rtype: str
        """
        map={1:"A",2:"B",3:"C",4:"D",5:"E",6:"F",7:"G",8:"H",9:"I",10:"J",11:"K",12:"L",13:"M",
             14:"N",15:"O",16:"P",17:"Q",18:"R",19:"S",20:"T",21:"U",22:"V",23:"W",24:"X",25:"Y",26:"Z"}
        result=""
        t=n
        while(t>0):
            k=t%26
            if(k==0):
                k=26
                t=t/26-1
            else:
                t=t/26
            result=result+map[k]
        return result[::-1]

object=Solution()
print object.convertToTitle(27)