class Merge
{
public static void main(String[] arg)
{
int arr1[] = {1,3,5,7,9,11};
int arr2[] = {13,15,17,19,21};
int i,k=0;

int newLength= arr1.length + arr1.length;
int arr3[] = new int[newLength];

for(i=0; i<arr1.length; i++)
arr3[i] = arr1[i];

for (int j=0;j<arr2.length;j++)
{
arr3[i] = arr2[j];
i++;
}
for(k=0;k<arr3.length;k++)

System.out.println(arr3[k]);

}
}