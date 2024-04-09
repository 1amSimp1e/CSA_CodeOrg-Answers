import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // Creates a Scene object
    Scene images = new Scene();

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Level 6: Instantiate an ImagePlus object and draw the image in the scene.
     * -----------------------------------------------------------------------------
     */
    
    ImagePlus bob = new ImagePlus("astronaut.jpg");
    images.drawImage(bob,0,0,images.getWidth());
    images.pause(2);
    
    


    
    

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Level 7: Instantiate a CustomImage and draw your image in the scene without
     * any filters. Then call your filter method and draw the image in the scene again.
     * -----------------------------------------------------------------------------
     */
    CustomImage anotherBob = new CustomImage("astronaut.jpg");
    anotherBob.zeroRed();
    images.pause(2);
    images.drawImage(bob,0,0, images.getWidth());

    // Plays the scene
    Theater.playScenes(images);
    
  }
}
