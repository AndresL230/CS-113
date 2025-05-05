public class Yorkshire extends Dog
{
   @Override
   public Yorkshire(String name)
   {
      super(name);
   }
   // -------------------------------------------------------------
   // Small bark -- overrides speak method in Dog
   // -------------------------------------------------------------
   public String speak()
   {
      return "woof";
   }
}
 