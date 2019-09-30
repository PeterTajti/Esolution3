//package FoundationExam;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
////Alt+Entr a funkció classára, így csinálnuk új testert, JavaUtil4!
//public class UniqueNumberFunctionsTest {
//
//  //Class neve
//  UniqueNumberFunctions uniqueNumberFunctions;
//
//  @Before
//  public void setup() {
//
//    //Példányosítjuk a class nevét
//    uniqueNumberFunctions = new UniqueNumberFunctions();
//
//  }
//
//  //Csinálunk egy új matrixot...
//  @Test
//  public void uniqueNumbers() {
//    int[][] myTestMatrix = {
//            {1, 1},
//            {4, 2}
//    };
//
//    //...majd csinálunk egy expected kimenetelt...
//    List<Integer> expectedResult = Arrays.asList(1, 4, 2);
//    //...és egy tényleges kimenetelt, ami a funkció kimenetele a testelni kívánt matrixxal.
//    List<Integer> actualResult = UniqueNumberFunctions.findUnipueNumbers(myTestMatrix);
//    //Ha megegyeznek akkor lefut a test.
//    assertEquals(expectedResult, actualResult);
//  }
//
//}