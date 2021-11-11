public class Person {
    protected String nama;
    protected int umur;
    
    Person(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return this.umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}