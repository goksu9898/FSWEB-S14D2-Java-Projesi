public class Main {
    public static void main(String[] args)
    {

        Carpet carpet= new Carpet(10,8,PaintColor.BLUE);
        Wardrobe wardrobe= new Wardrobe(10,4, 5.5);
        Lamp lamp= new Lamp(true,3,LampType.FLORASAN);
        Bed bed= new Bed("KingSize", 4,3, 2, 1);
        Ceiling ceiling= new Ceiling(100, PaintColor.GREEN);
        Wall wall1= new Wall("north");
        Wall wall2= new Wall("south");
        Wall wall3= new Wall("east");
        Wall wall4= new Wall("west");
        Bedroom bedroom = new Bedroom("Goksu's room", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        bedroom.getWall1().create();
        System.out.println(bedroom.getCarpet().getWidth());
    }

}