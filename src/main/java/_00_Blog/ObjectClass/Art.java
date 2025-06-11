package _00_Blog.ObjectClass;

public class Art { //예술품
    private String artistName;
    private String artTitle;
    private int artPrice;

    public Art(String artistName, String artTitle, int artPrice) {
        this.artistName = artistName;
        this.artTitle = artTitle;
        this.artPrice = artPrice;
    }

    @Override
    public String toString() {
        return "Art{" +
                "artistName=" + artistName +
                ", artTitle=" + artTitle +
                ", artPrice=" + artPrice +
                '}';
    }
}
