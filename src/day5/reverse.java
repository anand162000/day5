package day5;
import java.util.*;
public class reverse {
static void revers(char str[],int start,int end){
char temp;

while (start <= end)
{
	temp = str[start];
	str[start] = str[end];
	str[end] = temp;
	start++;
	end--;
}
}
static char[] reverseWords(char []s)
{


int start = 0;
for (int end = 0; end < s.length; end++)
{
	
	if (s[end] == ' ')
	{
	revers(s, start, end);
	start = end + 1;
	}
}


revers(s, start, s.length - 1);


revers(s, 0, s.length - 1);
return s;
}


public static void main(String[] args)

{
	Scanner sc=new Scanner(System.in);
String s ;
s=sc.nextLine();
char []p = reverseWords(s.toCharArray());
System.out.print(p);
}
}


