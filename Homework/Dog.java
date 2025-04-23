public class Dog
{
   private int age;
   private String breed;
   
   public Dog(int age, String breed)
   {
      this.age = age;
      this.breed = breed;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public String getBreed()
   {
      return breed;
   }
   
   public void setAge(int age)
   {
      this.age = age;
   }
   
   public void setBreed(String breed)
   {
      this.breed = breed;
   }
   
   public String toString()
   {
      return "Breed: "+breed+", Age: "+age;
   }
   
   public boolean equals(Dog dog2)
   {
      return breed.equals(dog2.getBreed());
   }
   
   public int compareTo(Dog other)
   {
      if (age==other.getAge())
      {
         return 0;
      }
      else if (age<other.getAge())
      {
         return -1;
      }
      else
      {
         return 1;
      }
   }
}