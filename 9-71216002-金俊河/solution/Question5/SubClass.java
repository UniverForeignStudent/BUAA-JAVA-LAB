package Q5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class SubClass extends SuperClass {
  public void start() throws IOException{
      throw new IOException("Unable to open file");
  }
  public void open(String fileName) throws FileNotFoundException{
      FileInputStream fis=new FileInputStream(fileName);
  }
}
