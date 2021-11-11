public class Student extends Person {
    private String npm;
    private float nilaiPenguji1;
    private float nilaiPenguji2;
    private float nilaiPembimbing;
    
    Student(String nama, int umur, String npm){
        super(nama, umur);
        this.npm = npm;
    }

    public String getNpm() {
        return this.npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public float getNilaiPenguji1() {
        return nilaiPenguji1;
    }

    public void setNilaiPenguji1(float nilaiPenguji1) {
        this.nilaiPenguji1 = nilaiPenguji1;
    }

    public float getNilaiPenguji2() {
        return nilaiPenguji2;
    }

    public void setNilaiPenguji2(float nilaiPenguji2) {
        this.nilaiPenguji2 = nilaiPenguji2;
    }

    public float getNilaiPembimbing() {
        return nilaiPembimbing;
    }

    public void setNilaiPembimbing(float nilaiPembimbing) {
        this.nilaiPembimbing = nilaiPembimbing;
    }

    public float getNilaiAkhir(){
        return (nilaiPenguji1*0.3f + nilaiPenguji2*0.3f + nilaiPembimbing*0.4f);
    }

    public char getHurufMutu(){
        float nilai = this.getNilaiAkhir();
        if(nilai > 0 && nilai <= 60){
            return 'T';
        }else if(nilai > 60 && nilai <= 70){
            return 'C';
        }else if(nilai > 70 && nilai <= 80){
            return 'B';
        }else if(nilai > 80 && nilai <= 100){
            return 'A';
        }
        return 'T';
    }

    public String getStatus(){
        char hurufMutu = this.getHurufMutu();
        if(hurufMutu == 'T'){
            return "MOHON MAAF ANDA TIDAK LULUS";
        }
        return "SELAMAT ANDA LULUS";
    }

    public String toString(){
        return  "NPM\t\t: " + this.getNpm() + "\n" +
                "Nama\t\t: " + this.getNama() + "\n" +
                "Umur\t\t: " + this.getUmur() + "\n" +
                "Nilai Penguji 1 : " + this.getNilaiPenguji1() + "\n" +
                "Nilai Penguji 2 : " + this.getNilaiPenguji2() + "\n" +
                "Nilai Pembimbing: " + this.getNilaiPembimbing() + "\n" +
                "Nilai Akhir\t: " + this.getNilaiAkhir() + "\n" +
                "Huruf Mutu\t: " + this.getHurufMutu() + "\n" +
                "Status\t\t: " + this.getStatus() + "\n";
    }

    public void print(){
        System.out.println(this.toString());
    }
}
