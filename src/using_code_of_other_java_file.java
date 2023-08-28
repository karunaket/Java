public class using_code_of_other_java_file {
    public static void main(String[] args){
        Chocolate a = new Chocolate();
        String eat = a.iEatChocolates();
        System.out.println(eat);
    }
    /*Here I am calling the method iEatChocolates() form Chocolate file and while calling the method from other file, the
      method must be public...*/
}
