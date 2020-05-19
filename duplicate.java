import java.util.Scanner;
class duplicate
{
public static void main(String args[])
{
//String a = new String("Sakkett");
Scanner sc = new Scanner(System.in);
String a = sc.nextLine();
int count=0;
char chars[] =a.toCharArray();
for(int i=0;i<a.length();i++)
{
for(int j=i+1;j<a.length();j++)
{
if(chars[i]==chars[j])
{
System.out.println(chars[j]);
count++;
break;

}


}

}
}
}