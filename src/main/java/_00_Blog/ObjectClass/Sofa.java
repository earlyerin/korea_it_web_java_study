package _00_Blog.ObjectClass;

public class Sofa { //소파
    private String sofaSize;
    private String sofaColor;
    private int sofaPrice;

    public Sofa(String sofaSize, String sofaColor, int sofaPrice) {
        this.sofaSize = sofaSize;
        this.sofaColor = sofaColor;
        this.sofaPrice = sofaPrice;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "sofaSize=" + sofaSize +
                ", sofaColor=" + sofaColor +
                ", sofaPrice=" + sofaPrice +
                '}';
    }
}
