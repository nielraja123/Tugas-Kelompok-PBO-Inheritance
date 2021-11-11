public class Main{
  public static void main(String[] args) {
      //Polimorfisme cara 1
      System.out.println("\n================== POLIMORFISME CARA 1 ==================");
      Makhluk makhluk;
      Makhluk mamalia;

      makhluk = new Makhluk();
      makhluk.info();                 //Output = info() di class Makhluk
      mamalia = new Mamalia();
      mamalia.info();                //Output = info() di class Mamalia
      
      //Polimorfisme cara 2
      System.out.println("\n================== POLIMORFISME CARA 2 ==================");
      Mamalia mamalia1 = new Mamalia();
      Badak badak = new Badak();
      Kucing kucing = new Kucing();
      Gajah gajah = new Gajah();
      
      mamalia1.info();                //Output = info() di class mamalia1
      badak.info();                    //Output = info() di class badak
      kucing.info();                  //Output = info() di class Kucing
      gajah.info();               //Output = info() di class Gajah
  }
}