import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

class MicroBlog {
    public String truncate(String input) {
        
      int[] myArray = input.codePoints().limit(5).toArray();
      String decoded = new String(myArray, 0, myArray.length);

      return decoded;
    }
}
