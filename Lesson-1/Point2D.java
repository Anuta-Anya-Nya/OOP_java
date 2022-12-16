/**
 * "Это точка 2Д"
 */
// /** вызывает доки
public class Point2D {
    private int x, y; // пожно зактрыть доступ иодификатором, то тогда не получится даже прочитать
    //3 перегрузки конструктора: с 2 агрументами, без аргументов(по умолчанию) и с 1 агрументом
    
    /**
     * Это конструктор
     * @param valueX это координата Х
     * @param valueY это координата У
     */
    
    public Point2D(int valueX, int valueY){
        x = valueX; //инициализация 2 агрументов
        y= valueY;
    }
    public Point2D(int value){
        this(value, value);//this обращение к отдельной единице текущей сущности(класса). тут к конструктору
    }
    public Point2D(){
        this(0);
    }

    

    // public Point2D(){
    //     x=0;
    //     y=0;
    // }
    // public Point2D(int value){
    //     x=value;
    //     y=value;
    // }
    //private модификатор дотсупа показывает, что метод доступен только в классе. в клиентском коде нет
    public int getX() { //позволяет получить значение
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int value) {//позволяет изменить значение(необходимо не всегда)
        this.x = value;
    }
    public void setY(int value) {
        this.y = value;
    }
      
    private String getInfo() {
        return String.format("x: %d, y: %d", x, y);
    }
    @Override //переопределение
    public String toString() {
        return getInfo();
    }
    public static double distanse(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x-b.x, 2)+Math.pow(a.y-b.y,2));
    }
}
