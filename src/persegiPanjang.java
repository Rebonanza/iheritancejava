public class persegiPanjang implements MenghitungBidang{
    int panjang, lebar;
    persegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override
    public void luas() {
        // TODO Auto-generated method stub
        int luas;
        luas = this.panjang*this.lebar;
        System.out.println(" Luas Persegi Panjang = " + luas);   
    }

    @Override
    public void keliling() {
        // TODO Auto-generated method stub
        int keliling;
        keliling = 2*(this.panjang+this.lebar);
        System.out.println(" Keliling Persegi Panjang = "+keliling);
    }

}
