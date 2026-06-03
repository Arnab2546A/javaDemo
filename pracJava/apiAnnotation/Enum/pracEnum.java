enum Result{
    PASS,
    FAIL,
    NR;

     Result() {
        System.out.println("constructor is called");
    }
    int marks;
    void setResults(int marks){
        this.marks=marks;
    }
    int getResults(){
        return marks;
    }
}
public class pracEnum {
    public static void main(String[] args) {
        Result.PASS.setResults(100);
        int rs=Result.PASS.getResults();
        System.out.println(rs);
        Result.FAIL.setResults(25);
        int rs1=Result.FAIL.getResults();
        System.out.println(rs1);
        Result r=Result.FAIL;
    }
}