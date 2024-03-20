public class Wall {
    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    private String direction;

    public void create(){
        System.out.println(this.direction);
    }
}
