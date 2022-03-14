public class Balok extends persegiPanjang implements MenghitungRuang{
    private int tinggi;
    Balok(int tinggi, int panjang, int lebar){
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    @Override
    public void volume() {
        // TODO Auto-generated method stub
        int volume;
        volume = super.panjang*super.lebar*this.tinggi;
        System.out.println(" Volume Balok = "+volume);
    }

    @Override
    public void luasPermukaan() {
        // TODO Auto-generated method stub
        int lp = (super.panjang*super.lebar) + (super.panjang*this.tinggi) + (super.lebar*this.tinggi);
        System.out.println(" Luas Permukaan Balok = "+lp);
    }
}
