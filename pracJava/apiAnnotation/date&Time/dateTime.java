
public class dateTime{
    public static void main(String[] args) {
        java.util.Date dt=new java.util.Date();
        System.out.println(dt);
        long gt=dt.getTime();
        System.out.println(gt);
        java.sql.Date dt1=new java.sql.Date(gt);
        System.out.println(dt1);
    }
}
