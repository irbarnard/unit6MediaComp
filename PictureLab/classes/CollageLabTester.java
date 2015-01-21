/**
 * This class contains class (static) methods
 * that will help you test the CollageLab class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class CollageLabTester
{
  /** Method to test zeroBlue */
  public static void cropAndCopyTest()
  {
      CollageLab sourceCollageLab = new CollageLab("beach.jpg");
      sourceCollageLab.explore();
      sourceCollageLab.cropAndCopy(sourceCollageLab, 0, 50, 0, 50, 51, 51);
      sourceCollageLab.explore();
  }
  public static void testfixUnderWater()
  {
    CollageLab water = new CollageLab("water.jpg");
    water.explore();
     water.fixUnderWater();
     water.explore();
  }
  public static void testGrayScale()
  {
    CollageLab beach = new CollageLab("beach.jpg");
    beach.explore();
    beach.grayScale();
    beach.explore();
  }
  public static void testZeroBlue()
  {
    CollageLab beach = new CollageLab("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testKeepBlueOnly()
  {
      CollageLab beach = new CollageLab("beach.jpg");
      beach.explore();
      beach.keepOnlyBlue();
      beach.explore();
  }
  public static void testNegative()
  {
      CollageLab beach = new CollageLab("beach.jpg");
      beach.explore();
      beach.negate();
      beach.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
    CollageLab caterpillar = new CollageLab("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  public static void testMirrorHorrizontal()
  {
    CollageLab caterpillar = new CollageLab("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorrizontal();
    caterpillar.explore();
  }
  public static void testMirrorHorrizontalBotToTop()
  {
    CollageLab caterpillar = new CollageLab("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorrizontalBotToTop();
    caterpillar.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    CollageLab caterpillar = new CollageLab("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    CollageLab temple = new CollageLab("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
   public static void testMirrorArms()
  {
    CollageLab snowman = new CollageLab("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  public static void testMirrorGull()
  {
      CollageLab seagull = new CollageLab("seagull.jpg");
      seagull.explore();
      seagull.mirrorGull();
      seagull.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    CollageLab canvas = new CollageLab("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    CollageLab swan = new CollageLab("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}