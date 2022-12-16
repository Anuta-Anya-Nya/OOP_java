public class App {
    
    public static void main(String[] args) throws Exception {
        Point2D point1 = new Point2D(10);
        Point2D point2 = new Point2D(2, 5);

        System.out.println(point1);
        System.out.println(point2);
        // System.out.println(distanse(point1, point2));
        var dis = Point2D.distanse(point1, point2);
        System.out.println(dis);
    }
}
