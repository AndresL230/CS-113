 public class Theater
{
   private String name;
   private String city;
   private Movie[] movies;
   
   public Theater(String name, String city, Movie[] movies)
   {
      this.name = name;
      this.city = city;
      this.movies = movies;
   }
   
   public int countPremiumMovies()
   {
      int count = 0; 
      
      for (Movie m: movies)
         if (m.getPriceCategory().equals("Premium"))
            count++;
      return count;
   }
   
   public Movie[] searchMoviesByKeyword(String keyword)
   {
      int size = 0;
      int index = 0;
       
      for (Movie m: movies)
         if (m.hasKeyword(keyword))
            size+=1;
      
      Movie[] moviesKey = new Movie[size];
      
      for (Movie m: movies)
         if (m.hasKeyword(keyword))
         {
            moviesKey[index] = m;
            index+=1;
         }
      
      return moviesKey;
   }
   
   public Movie longestMovie()
   {
      int index = 0;
      
      for (int i = 0; i<movies.length; i++)
         if (movies[i].getDuration()>=movies[index].getDuration())
            index = i;
      
      return movies[index];
   }
   
   public boolean sameMovieExists(Movie target)
   {
      for (Movie m: movies)
      {
         if (m.isSameMovie(target))
            return true;
      }
      
      return false;
   }
   
   public String[] getBudgetMovies()
   {
      int size = 0;
      int index = 0;
      
      for (Movie m: movies)
         if (m.getPriceCategory().equals("Budget"))
            size+=1;
      
      String[] budgMovies = new String[size];
      
      for (Movie m: movies)
         if (m.getPriceCategory().equals("Budget"))
         {
            budgMovies[index] = m.getTitle();
            index+=1;
         }
           
      return budgMovies;
   }
   
   public String toString()
   {
      String str = name+" Theater in "+city+" is showing: ";
      
      for (Movie m: movies)
         str+= m.toString()+"\n";
      
      return str;
   }
   
   public static void main(String[] args) {
        // Create Movie objects
        Movie m1 = new Movie("Tenet", 150);                      // default price: 10.0
        Movie m2 = new Movie("Barbie", 114, 9.50);
        Movie m3 = new Movie("Dunkirk", 106, 7.75);
        Movie m4 = new Movie("Oppenheimer", 180, 15.00);
        Movie m5 = new Movie("Interstellar", 169);              // default price: 10.0

        // Store them in an array
        Movie[] nowPlaying = {m1, m2, m3, m4, m5};

        // Create Theater object
        Theater t = new Theater("AMC Empire 25", "New York", nowPlaying);

        // Test toString()
        System.out.println("--- Theater Info ---");
        System.out.println(t);

        // Test countPremiumMovies()
        System.out.println("\n--- Premium Movies Count ---");
        System.out.println(t.countPremiumMovies());

        // Test searchMoviesByKeyword()
        System.out.println("\n--- Searching for keyword: \"ter\" ---");
        Movie[] keywordMatches = t.searchMoviesByKeyword("ter");
        for (Movie m : keywordMatches) {
            System.out.println(m);
        }

        // Test longestMovie()
        System.out.println("\n--- Longest Movie ---");
        System.out.println(t.longestMovie());

        // Test sameMovieExists() with same title (case-insensitive)
        System.out.println("\n--- Checking if 'TENET' is playing ---");
        Movie testMovie1 = new Movie("TENET", 130);
        System.out.println(t.sameMovieExists(testMovie1));

        // Test sameMovieExists() with different title
        System.out.println("\n--- Checking if 'Avatar' is playing ---");
        Movie testMovie2 = new Movie("Avatar", 160, 14.50);
        System.out.println(t.sameMovieExists(testMovie2));

        // Test getBudgetMovies()
        System.out.println("\n--- Budget Movies ---");
        String[] budgetTitles = t.getBudgetMovies();
        for (String title : budgetTitles) {
            System.out.println(title);
        }
    }
}