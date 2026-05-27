
class Gen<T>{
   private T obj;
   public Gen(T obj){
    this.obj=obj;
   }
   public T getObj(){
    return obj;
   }
   public void display(){
    System.out.println("the type of the input is "+obj.getClass().getName());
   }
}
public class genObj {
    public  static void main(String[]args){
        Gen<Integer> gen=new Gen<Integer>(5);
        gen.display();
        System.out.println(gen.getObj());
    }
}
