public class Lingkaran implements MenghitungBidang {
    double r;

    Lingkaran(double r){
        this.r = r;
    }

    @Override
    public void luas() {
        // TODO Auto-generated method stub
        double luas = 3.14*this.r*this.r;
        System.out.println(" Luas Lingkaran = "+luas);
    }

    @Override
    public void keliling() {
        // TODO Auto-generated method stub
        double keliling = 2*3.14*this.r;
        System.out.println(" Keliling Lingkaran = "+keliling);
    }

}
