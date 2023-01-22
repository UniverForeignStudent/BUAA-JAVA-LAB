package Q4;

import java.io.IOException;

public class p04 {
    public static void start() throws IOException,RuntimeException{
        throw new RuntimeException("Unable to Start");
    }

    public static void main(String[] args){
        try{
            start();
        }catch (RuntimeException re){
            re.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
