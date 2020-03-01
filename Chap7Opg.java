import java.awt.Point;
import java.util.Random;
import java.util.Arrays;
public class Chap7Opg {


  public static boolean sumOk(int[] inputArr,int sum) {
    boolean retVal = false;
    int retsum = 0;
    int tmpSum = 0;
    int lo =  0;
    int hi = inputArr.length-1;

    while(lo<hi) {
      tmpSum = inputArr[lo]+inputArr[hi];
      if (tmpSum==sum) {
        System.out.println("Sum reached ");
        retVal=true;
        return retVal;
      }
      if(tmpSum < sum) {
        lo++;
      }else{
        hi--;
      }
    }
    return retVal;
  }


  //public static void printMyArray(int[] inputArr) {
   // 
  //}
  public static int sumMyArray(int[] inputArr) {
    int sum = 0;
    for(int i=0;i<inputArr.length;i++) {
      sum = sum + inputArr[i];
    }
    return sum;
  }

  public static void printMyArray(int[] inputArr) {
    for (int i=inputArr.length-1;i>=0;i--) {
      System.out.println(inputArr[i]);
    }

    int counter = 0;
    for(int i: inputArr)  {
      if (i>3) {
        System.out.println("idx: " + counter + " value: " + i);
      }
      counter++;
    }
  }
    public static String myParser(String str) {
      String retVal = "";
      String[] tmpArr = str.split(",");
      retVal = "Payment: " + tmpArr[3];
      retVal = retVal + " Country:" + tmpArr[6];
      return retVal;
    }

    public static void paintTri(Point[] pps) {
    }


  public static void main(String[] args) {

    //create arrays
    int[] myArr = new int[] {1,2,4,4};
    int[] myArr1 = new int[] {1,2,4,4};
    int[] myArr2 = new int[] {1,2,5,9};
    // create arrays of objects

    paintTri(myPoints);



    String customer = "223;kuurt;Anton;Odense;StorkeVejj;18";
    String p1 = "1/2/09 6:17,Product1,1200,Mastercard,carolina,Basildon,England,United Kingdom,1/2/09 6:00,1/2/09 6:08,51.5,-1.1166667";

    System.out.println(myParser(p1));
    String[] customerArr = customer.split(";");

    printMyArray(myArr);
    int mySum = sumMyArray(myArr);
    //accessing elements
    System.out.println(myArr[0]);
    System.out.println("MYSUM: " + mySum);


    //modyfying elements
    myArr[2]=123;
    //Displaying arrays


    //using util
    System.out.println(Arrays.toString(myArr));
    //Copying arrays


    // manually

    // the bad way

    int[] myCp = Arrays.copyOfRange(myArr,0,(myArr.length));

    //Array traversal
    //just print
    //search


    //Manipulate
    //to slim


    //Random numbers
    //fill 


    //fill with primes


    //Building a histogram


    //Enhanced for-loop


    //counting chars


    //Strings
  }
}
