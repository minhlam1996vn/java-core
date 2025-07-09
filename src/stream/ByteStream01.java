package stream;

//    https://docs.oracle.com/javase/tutorial/essential/io/streams.html
//    https://docs.oracle.com/javase/tutorial/essential/io/bytestreams.html
//    https://stackoverflow.com/questions/3013996/byte-stream-and-character-stream
//    https://docs.oracle.com/javase/tutorial/essential/io/buffers.html

//    https://docs.oracle.com/javase/tutorial/essential/io/path.html

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream01 {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("./src/stream/input.txt");
            out = new FileOutputStream("./src/stream/output.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
            System.out.println("END");
        }
    }
}
