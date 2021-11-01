class Equal {
public static void main(String[] args)
{
int a[] = { 10, 40, 13 };
int b[] = { 10, 40, 13 };
 
boolean result = true;
  
if (a.length == b.length) {
for (int i = 0; i < a.length; i = i + 1) {
                
if (a[i] != b[i]) 
{
result = false;
}
}

}
  