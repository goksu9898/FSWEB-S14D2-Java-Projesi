public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;

    }
    public void make(){
        System.out.println("The bed is being made.");
    }
    public int getPillows(){
        return this.pillows;
    }
    public int getHeight(){
        return this.height;
    }
    public int getSheets(){
        return this.sheets;
    }
    public int getQuilts() {
        return this.quilt;
    }

}