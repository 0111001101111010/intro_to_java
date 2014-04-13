/*problems 9 & 10 on page 427
exercise #9*/


//get All positive numbers
public boolean allPositive()
{ public  boolean result = true;
     for(int k=0; k < arr.length; k++)
{
if (arr[k] < 0)
{
result = false;

}// end if in statement
}// end of for loop
return result;
}// end of allPositive class

//exercise #10

public void equals()
{
for (int j=0; j < s1.length; j++)
if( s1[j].equals (s3[j])
System.out.println("s1 == s3");

}