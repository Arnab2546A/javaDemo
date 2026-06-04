
import java.io.*;


public class pracIO {
    public static void main(String[] args) throws IOException {
        File f1=new File("pw.txt");
        System.out.println(f1.exists());
        f1.createNewFile();
        System.out.println(f1.exists());
        System.out.println("----------------------------");
        File dir=new File("PW");
        System.out.println(dir.exists());
        dir.mkdir();
        System.out.println(dir.exists());
    }
}
