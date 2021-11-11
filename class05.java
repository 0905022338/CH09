class CCount
{
 static int cnt=0;
 public CCount ()
 {
  
  cnt ++;
 }

 public static void count()
 {
  
  System.out.println(cnt+"object(s) created");
 }
}
 public class class05
 {
  public static void main(String args[])
  {
   CCount a=new CCount();
   CCount.count();
   CCount b=new CCount();   
   CCount c=new CCount();
   CCount.count();
   CCount.count();
  }
 }