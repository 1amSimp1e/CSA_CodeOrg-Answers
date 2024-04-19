import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // Creates the Book objects
    Book orwell = new Book("1984.jpg", 21424);
    Book fahrenheit = new Book("fahrenheit.jpg", 10721);
    Book gobletoffire = new Book("gobletoffire.jpg", 7758);
    Book winFriends = new Book("winfriends.jpg", 25001);
    Book agreements = new Book("agreements.jpg", 23308);
    Book gratitude = new Book("gratitude.jpg", 10141);

    // Stores the Book objects in a 2D array
    Book[][] bestsellers = {{orwell, fahrenheit, gobletoffire},
                            {winFriends, agreements, gratitude}};

    // Creates a BookScene object
    BookScene scene = new BookScene(bestsellers);

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Call the createScene() method with the 1D array that is returned from
     * calling the findMostReviews() method.
     * -----------------------------------------------------------------------------
     */
    // scene.createScene(scene.findMostReviews());
    scene.test();

    

    // Plays the BookScene
    Theater.playScenes(scene);

  }
}
