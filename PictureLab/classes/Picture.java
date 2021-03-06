import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
import java.util.Random;
/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  public void cropAndCopy(Picture sourcePicture, int startSourceRow, int endSourceRow, int startSourceCol, int endSourceCol,
         int startDestRow, int startDestCol)
  {
     Picture pics = sourcePicture;
     Pixel[][] pixels = this.getPixels2D();
     int rowMin = startSourceRow;
     int rowMax = endSourceRow;
     int colMin = startSourceCol;
     int colMax = endSourceCol;
     int targetRow = startDestRow;
     int targetCol = startDestCol;
     Pixel topPixel = null;
     Pixel bottomPixel = null;
     int width = colMax-colMin;
     int reset = targetCol;
      for (int row =  rowMin; row < rowMax; row++)
     {
         for (int col = colMin; col < colMax; col++)
         {
             topPixel = pixels[row][col];
             bottomPixel = pixels[targetRow][targetCol];
             bottomPixel.setColor(topPixel.getColor());
             targetCol += 1;
         }
         targetCol = reset;
         targetRow += 1;
    }
  }
  
  public void verticalMirrorSegment(Picture sourcePicture, int startSourceRow, int endSourceRow, int startSourceCol, int endSourceCol)
  {
     Picture pics = sourcePicture;
     Pixel[][] pixels = this.getPixels2D();
     int rowMin = startSourceRow;
     int rowMax = endSourceRow;
     int colMin = startSourceCol;
     int colMax = endSourceCol;
     Pixel leftPixel = null;
     Pixel rightPixel = null;
     int width = colMax-colMin;
      for (int row =  rowMin; row < rowMax; row++)
     {
         for (int col = colMin; col < colMax; col++)
         {
             leftPixel = pixels[row][col];
             rightPixel = pixels[row][width - 1 - col];
             rightPixel.setColor(leftPixel.getColor());
         }
    }
   
  }
  public void horrizontalMirrorSegment(Picture sourcePicture, int startSourceRow, int endSourceRow, int startSourceCol, int endSourceCol)
  {
     Picture pics = sourcePicture;
     Pixel[][] pixels = this.getPixels2D();
     int rowMin = startSourceRow;
     int rowMax = endSourceRow;
     int colMin = startSourceCol;
     int colMax = endSourceCol;
     Pixel topPixel = null;
     Pixel bottomPixel = null;
     int width = colMax-colMin;
      for (int col =  colMin; col < colMax; col++)
     {
         for (int row = rowMin; row < rowMax; row++)
         {
             topPixel = pixels[row][col];
             bottomPixel = pixels[rowMax - 1 - row][col];
             bottomPixel.setColor(topPixel.getColor());
         }
    }
   
  }
  public void horrizontalBottomToTopMirrorSegment(Picture sourcePicture, int startSourceRow, int endSourceRow, int startSourceCol, int endSourceCol)
  {
     Picture pics = sourcePicture;
     Pixel[][] pixels = this.getPixels2D();
     int rowMin = startSourceRow;
     int rowMax = endSourceRow;
     int colMin = startSourceCol;
     int colMax = endSourceCol;
     Pixel topPixel = null;
     Pixel bottomPixel = null;
     int width = colMax-colMin;
      for (int col =  colMin; col < colMax; col++)
     {
         for (int row = rowMin; row < rowMax; row++)
         {
             topPixel = pixels[row][col];
             bottomPixel = pixels[rowMax - 1 - row][col];
             topPixel.setColor(bottomPixel.getColor());
         }
    }
   
  }
  public void randomPixels(Picture sourcePicture, int startSourceRow, int endSourceRow, int startSourceCol, int endSourceCol)
  {
     Picture pics = sourcePicture;
     Pixel[][] pixels = this.getPixels2D();
     int rowMin = startSourceRow;
     int rowMax = endSourceRow;
     int colMin = startSourceCol;
     int colMax = endSourceCol;
     Pixel currentPixel = null;
     int width = colMax-colMin;
      for (int col =  colMin; col < colMax; col++)
     {
         for (int row = rowMin; row < rowMax; row++)
         {
             Random rand = new Random();
             int r = rand.nextInt(255);
             int g = rand.nextInt(255);
             int b = rand.nextInt(255);
             currentPixel = pixels[row][col];
             currentPixel.setRed(r);
             currentPixel.setGreen(g);
             currentPixel.setBlue(b);
         }
    }
   
  }
  public void bloodRed(Picture sourcePicture, int startSourceRow, int endSourceRow, int startSourceCol, int endSourceCol)
  {
     Picture pics = sourcePicture;
     Pixel[][] pixels = this.getPixels2D();
     int rowMin = startSourceRow;
     int rowMax = endSourceRow;
     int colMin = startSourceCol;
     int colMax = endSourceCol;
     Pixel currentPixel = null;
     int width = colMax-colMin;
      for (int col =  colMin; col < colMax; col++)
     {
         for (int row = rowMin; row < rowMax; row++)
         {
             currentPixel = pixels[row][col];
             currentPixel.setRed(255);

         }
    }
   
  }
  public void coolBlue(Picture sourcePicture, int startSourceRow, int endSourceRow, int startSourceCol, int endSourceCol)
  {
     Picture pics = sourcePicture;
     Pixel[][] pixels = this.getPixels2D();
     int rowMin = startSourceRow;
     int rowMax = endSourceRow;
     int colMin = startSourceCol;
     int colMax = endSourceCol;
     Pixel currentPixel = null;
     int width = colMax-colMin;
      for (int col =  colMin; col < colMax; col++)
     {
         for (int row = rowMin; row < rowMax; row++)
         {
             currentPixel = pixels[row][col];
             currentPixel.setBlue(255);

         }
    }
   
  }
  public void linkGreen(Picture sourcePicture, int startSourceRow, int endSourceRow, int startSourceCol, int endSourceCol)
  {
     Picture pics = sourcePicture;
     Pixel[][] pixels = this.getPixels2D();
     int rowMin = startSourceRow;
     int rowMax = endSourceRow;
     int colMin = startSourceCol;
     int colMax = endSourceCol;
     Pixel currentPixel = null;
     int width = colMax-colMin;
      for (int col =  colMin; col < colMax; col++)
     {
         for (int row = rowMin; row < rowMax; row++)
         {
             currentPixel = pixels[row][col];
             int r = currentPixel.getRed();
             int b = currentPixel.getBlue();
             currentPixel.setGreen(255);
             currentPixel.setRed(r/2);
             currentPixel.setBlue(b * 2);
         }
    }
   
  }
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  public void fixUnderWater()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
          int r = pixelObj.getRed();
         
          pixelObj.setGreen(r +50);

      }
    }
  }
  public void grayScale()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
         int r = pixelObj.getRed();
         int g = pixelObj.getGreen();
         int b = pixelObj.getBlue();
         int average = (r + g + b)/ 3;
         pixelObj.setRed(average);
         pixelObj.setGreen(average);
         pixelObj.setBlue(average);
      }
    }
  }
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {

    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyBlue()
  {
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
          for(Pixel pixelObj : rowArray)
          {
              pixelObj.setRed(0);
              pixelObj.setGreen(0);
          }
        }
  }
  public void negate()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
        for(Pixel pixelObj : rowArray)
        {
              int r = pixelObj.getRed();
              int g = pixelObj.getGreen();
              int b = pixelObj.getBlue();
              pixelObj.setRed(255 -r);
              pixelObj.setGreen(255- g);
              pixelObj.setBlue(255-b);
        }
    }  
  }
  public void mirrorHorrizontal()
  {
     Pixel[][] pixels = this.getPixels2D();
     Pixel topPixel = null;
     Pixel bottomPixel = null;
     int width = pixels.length;
     int height = pixels[0].length;
     for (int col =  0; col < height; col++)
     {
         for (int row = 0; row < width; row++)
         {
             topPixel = pixels[row][col];
             bottomPixel = pixels[width - 1 - row][col];
             bottomPixel.setColor(topPixel.getColor());
         }

    }
  }
  
  public void mirrorHorrizontalBotToTop()
  {
      {
         Pixel[][] pixels = this.getPixels2D();
         Pixel topPixel = null;
         Pixel bottomPixel = null;
         int width = pixels.length;
         int height = pixels[0].length;
         for (int col =  0; col < height; col++)
         {
             for (int row = 0; row < width; row++)
             {
                 topPixel = pixels[row][col];
                 bottomPixel = pixels[width - 1 - row][col];
                 topPixel.setColor(bottomPixel.getColor());
             }
    
        }
    }

  }
  public void mirrorVerticalRightToLeft()
  {
     Pixel[][] pixels = this.getPixels2D();
     Pixel leftPixel = null;
     Pixel rightPixel = null;
     int width = pixels[0].length;
     for (int row = 0; row < pixels.length; row++)
     {
         for (int col = 0; col < width / 2; col++)
         {
             leftPixel = pixels[row][col];
             rightPixel = pixels[row][width - 1 - col];
             leftPixel.setColor(rightPixel.getColor());
         }

    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  public void mirrorArms()
  {
    //row 160 min 170 max  col 104 min 169 max 
    int mirrorPoint = 190;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 160; row < mirrorPoint; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 104; col < 169; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    for (int row = 173; row < 197; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 239; col < 294; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[197 - row + 197][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }  
  }
  public void mirrorGull()
  {
      int mirrorPoint = 346 ;
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      Pixel[][] pixels = this.getPixels2D();
      
      for (int row = 232; row < 346; row++)
      {
          for(int col = 236; col < 343; col++)
          {
            leftPixel = pixels[row][col];      
            rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
            rightPixel.setColor(leftPixel.getColor());  
          }
      }
      
  }
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  public void copyAndPaste(Picture sourcePicture, Picture replacement, int startSourceRow, int endSourceRow, int startSourceCol, int endSourceCol,
         int startDestRow, int startDestCol)
  {
     Picture target = sourcePicture;
     Pixel[][] targetPixels = this.getPixels2D();
     Picture pics = replacement;
     Pixel[][] pixels = this.getPixels2D();
     int rowMin = startSourceRow;
     int rowMax = endSourceRow;
     int colMin = startSourceCol;
     int colMax = endSourceCol;
     int targetRow = startDestRow;
     int targetCol = startDestCol;
     Pixel startPixel = null;
     Pixel endPixel = null;
     int width = colMax-colMin;
     int reset = targetCol;
     
      for (int row =  rowMin; row < rowMax; row++)
     {
         for (int col = colMin; col < colMax; col++)
         {
             startPixel = pixels[row][col];
             endPixel = targetPixels[targetRow][targetCol];
             endPixel.setColor(startPixel.getColor());
             targetCol += 1;
         }
         targetCol = reset;
         targetRow += 1;
    }
  }
  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture finalPic = new Picture("swords.jpeg");
    Picture sourcePicture = new Picture("swords.jpeg");
    Picture replacement = new Picture("nujabesTribute.jpg");
    finalPic.mirrorVertical();
    finalPic.cropAndCopy(sourcePicture, 684, 1020, 0, 1599, 0, 0);
    finalPic.mirrorVerticalRightToLeft();
    finalPic.verticalMirrorSegment(sourcePicture, 0, (1020-684), 0, 1599);
    finalPic.horrizontalBottomToTopMirrorSegment(sourcePicture, 0, 336, 0, 1599);
    finalPic.randomPixels(sourcePicture,336, 684 ,0, 1599);
    finalPic.horrizontalMirrorSegment(sourcePicture, 684, 1020, 0, 1599);
    finalPic.horrizontalMirrorSegment(sourcePicture, 0, 336, 0, 1599);
    finalPic.copyAndPaste(sourcePicture, replacement, 0, 474, 0, 750, 135, 562);
    finalPic.bloodRed(sourcePicture, 0, 336, 0, 1599 );
    finalPic.bloodRed(sourcePicture, 336, 471, 561, 1311 );
    finalPic.coolBlue(sourcePicture, 471, 605, 1124, 1311 );
    finalPic.coolBlue(sourcePicture,  684, 1020, 0, 1599);
    finalPic.linkGreen(sourcePicture,  270, 470, 1124, 1311);
    finalPic.explore();
    finalPic.write("MyCollage.jpg");
    //684 rows 0 cols for start
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpeg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
