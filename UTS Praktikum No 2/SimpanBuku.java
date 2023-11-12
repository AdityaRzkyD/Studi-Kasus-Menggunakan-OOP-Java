abstract class SimpanBuku {
    private String JudulBuku, genre;

    public SimpanBuku(String JudulBuku, String genre){
        this.JudulBuku = JudulBuku;
        this.genre = genre;
    }

    public String getJudulBuku() {
        return JudulBuku;
    }

    public String getGenre() {
        return genre;
    }
}
