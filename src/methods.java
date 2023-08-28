public class methods {

               //For void

    public static void main(String[] args){
        addExclaminationPoint("Burger");
    }

    // Passing void - means passing empty
    public static void addExclaminationPoint(String s){
        System.out.println(s + '!');
    }
    /*Here s is the string and from the above method(main), I have passed Burger as a string s and inside the main
      method I have called other method i.e. addExclaminationPoint that will take the string and will add a
      exclamination point at the end...*/


               //For String

    /*public static void main(String[] args){
        String exclaim = addExclaminationPoint("Pizza");
        System.out.println(exclaim);
    }
    public static String addExclaminationPoint(String s){
        return s + "!";
    }*/
    /*Void returns empty so insted of using void, I am using String which will return string insted of returning nothing...*/
}
