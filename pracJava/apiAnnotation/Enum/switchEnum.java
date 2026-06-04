enum Results{
    PASS,
    FAIL,
    NR;
}
public class switchEnum {
    public static void main(String[] args) {
        Results rs=Results.PASS;
        switch(rs){
            case PASS:
            System.out.println("Passed");
            break;
            case FAIL:
            System.out.println("Failed");
            case NR:
            System.out.println("No Result");
        }
    }
}
