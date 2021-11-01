class MinMax 
{
public static void main(String args[]) 
{

int max = 0;
int[] arr = {20,55,45,68,78,100,233,43,57,-21,-75};
int min = arr[0];

for(int i=0; i<arr.length; i++ ) 
{
if(arr[i]>max)
max = arr[i];
}
     
for(int i=0; i<arr.length; i++ ) 
{
if(arr[i]<min) 
min = arr[i];
}
   
System.out.println("Maximum value in the array is::"+max);
System.out.println("Minimum value in the array is::"+min);
}
}