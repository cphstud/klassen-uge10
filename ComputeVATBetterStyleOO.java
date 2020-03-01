/*
 * FORMÅL:
 * At omskrive en procesorienteret løsning til en objektorienteret løsning
 *
 * OPGAVE:
 * Du skal forbedre denne kode ved at flytte de forskellige metoder
 * ud i passende klasser
 *
 * Fremgangsmåden er altså flg:
 * 1) kopier eksisterende kode
 * 2) gem hver metode i en klasse med passende naven (doDiag bliver til Dialog)
 * 3) åbn hver fil og sørg for passende "inventar" (fields, constructor and method)
 * 4) sørg for at Main kun rummer flg:
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.runController();
    }
    *
    * TEST kørsel:
    * Indtast varens pris:
345,6
Du betaler 86,40 Kr i MOMS
 *
 */


import java.util.Scanner;
public class ComputeVATBetterStyle {
  final static int PRCVAT = 25;
  final static String MSG = "MOMS";
  final static String CURRENCY = "Kr";

  public static void main(String[] args){
    runController();

  }
  public static void runController() {
    double userIn = doDiag();
    double moms = doVAT(userIn);
    doView(moms,MSG);
  }

  public static double doVAT(double number){
    double VAT = number / 100 * PRCVAT; 
    return VAT;
  }
  public static double doDiag(){
    Scanner myScan = new Scanner(System.in);
    System.out.println("Indtast varens pris: ");
    double number = myScan.nextDouble();
    return number;
  }
  public static void doView(double result, String typeOfResult){
    System.out.printf("Du betaler %.2f%3s i %s%n",result,CURRENCY,MSG);
  }
}
