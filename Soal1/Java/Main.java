public class Main {
    public static void main(String[] args) {
        Student mahasiswa1 = new Student("Andre Nathaniel", 19, "140810200042");
        mahasiswa1.setNilaiPenguji1(70f);
        mahasiswa1.setNilaiPenguji2(80f);
        mahasiswa1.setNilaiPembimbing(90f);
        System.out.println(mahasiswa1);

        Student mahasiswa2 = new Student("Dian Maulida", 18, "140810200084");
        mahasiswa2.setNilaiPenguji1(50f);
        mahasiswa2.setNilaiPenguji2(55f);
        mahasiswa2.setNilaiPembimbing(60f);
        System.out.println(mahasiswa2);
    }
}
