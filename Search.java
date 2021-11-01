class Search  
{  
public static void main(String args[])  
{  
int []arr=new int[]{0, 10 ,20 ,40 ,100, -70, 35, 45, 200, 50};
int s = 35;	  
int i = 0;    
   
for (i = 0; i < arr.length; i++)  
{  
if (arr[i] == s) 
{  
System.out.println(s + " is present at location " + (i + 1));  
break;  
}  
}  
}  
}  