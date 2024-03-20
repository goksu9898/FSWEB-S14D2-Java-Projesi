public class Ceiling {
    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return this.height;
    }

    public PaintColor getPaintedColor() {
        return this.paintedColor;
    }

    private int height;
    private PaintColor paintedColor;
    public void create(){
        System.out.println(this.height+ " " + this.paintedColor);
    }
}

