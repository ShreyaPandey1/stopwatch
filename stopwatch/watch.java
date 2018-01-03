class watch
{
public static void main(String args[])
{
int s=0,m=0,h=0;
try
{
for( ; ;)
{
s++;
Thread.sleep(1000);
if(s==60)
{
m=m+1;
s=0;
}
if(m==60)
{
h=h+1;
m=0;
}


System.out.print("\f \r"+h+"\t :"+m+"\t :"+s);
}
}
catch(InterruptedException e)
{
}
}
}
