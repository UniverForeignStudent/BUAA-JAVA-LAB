package q5;

import java.io.*;

public class q5 {
	public static void main(String[] args) {
		String s1="source.txt";
		String s2="target.txt";
		try{
			copyFile(s1,s2);
		}catch(IOException e) {}
	}

    public static void copyFile(String sourceFile, String targetFile) throws IOException {
        FileInputStream fis = new FileInputStream(sourceFile);
        FileOutputStream fos = new FileOutputStream(targetFile);
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int len;
        byte[] buf = new byte[1024];
        while ((len = bis.read(buf, 0, 1024)) != -1) {
            bos.write(buf, 0, len);
        }

        bis.close();
        bos.close();
        fis.close();
        fos.close();
    }
}
