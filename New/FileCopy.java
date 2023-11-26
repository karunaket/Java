import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public void main(String[] args) throws IOException {
        FileInputStream a = null;
        FileOutputStream b = null;
        try {
            File obj_in = new File("name.txt");
            File obj_out = new File("name1.txt");

            a = new FileInputStream(obj_in);
            b = new FileOutputStream(obj_out);

            byte[] buffer = new byte[1024];

            int length;

        } finally {
            if (a != null) {
                a.close();
            }
            if (b != null) {
                b.close();
            }
        }
    }
}
