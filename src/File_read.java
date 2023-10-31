import java.io.*;
import java.util.*;
class File_read {
    public static void main(String[] args){
        try{
            readfile("test1.txt");

        }catch(FileNotFoundException e){
            System.out.println("Error "+e.getMessage());
        }
    }
    public static void readfile(String filename) throws FileNotFoundException{
        File file=new File(filename);
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine()){
            String line =sc.nextLine();
            System.out.println(line);;
        }
        sc.close();
    }
}
