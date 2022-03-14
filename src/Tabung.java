public class Tabung extends Lingkaran implements MenghitungRuang {
   private double tinggi;

Tabung(double r, double tinggi){
    super(r);
      this.tinggi = tinggi;

}

@Override
public void volume() {
    // TODO Auto-generated method stub
    double volume = 3.14*super.r*super.r*this.tinggi;
    System.out.println(" Volume Tabung = "+volume);
}

@Override
public void luasPermukaan() {
    // TODO Auto-generated method stub
    double lp = 2*3.14*super.r*(this.tinggi+super.r);
    System.out.println(" Luas Permukaan Tabung = "+lp);
}

}
