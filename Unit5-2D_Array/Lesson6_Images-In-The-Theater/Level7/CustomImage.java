import org.code.theater.*;
import org.code.media.*;

/*
 * Represents an image that can be customized with image filters
 */
public class CustomImage extends ImagePlus {

  /*
   * Sets the superclass filename to the specified filename
   */
  public CustomImage(String filename) {
    super(filename);
    
  }

  /* ----------------------------------- TO DO -----------------------------------
   * ✅ Level 7: Write your image filter method.
   * -----------------------------------------------------------------------------
   */
  
  // Getting pixels
  Pixel[][] image = getImagePixels();
  
  public void zeroRed(){
    // Loop through the images 
    for(int row = 0; row < image.length; row++){
      for(int col = 0; col < image[0].length; col++){
        Pixel currentPixel = image[row][col];

        // Set red value 
        currentPixel.setRed(0);
      }
    }
  }

  public void zeroBlue(){
    // Loop through the images 
    for(int row = 0; row < image.length; row++){
      for(int col = 0; col < image[0].length; col++){

        // 2D array of Pixel objects that makes up this image 
        Pixel currentPixel = image[row][col];

        // Set each blue value pixels ti 0
        currentPixel.setBlue(0);
      }
    }
  }
  
}
