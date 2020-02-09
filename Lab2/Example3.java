class Example3
{
      private static int var;
      public Example3(int num)
      {
             var=num;
      }
      public static void main(String args[])
      {
              Example3 myobj = new Example3(3);
              System.out.println("value of var is:"+ var);
      }
}