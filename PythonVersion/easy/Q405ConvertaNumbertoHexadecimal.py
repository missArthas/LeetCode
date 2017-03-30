class Solution(object):
    def toHex(self, num):
        """
        :type num: int
        :rtype: str
        """
        if(num==0):return "0"
        result = "";
        map={0:"0",1:"1",2:"2",3:"3",4:"4",5:"5",6:"6",7:"7",8:"8",9:"9",10:"a",11:"b",12:"c",13:"d",14:"e",15:"f"}
        a=4294967296
        if(num<0):num+=a
        while(num!=0):
            result+=map[num%16];
            num/=16
        return result[::-1]
object=Solution()
print object.toHex(26)
print object.toHex(-1)