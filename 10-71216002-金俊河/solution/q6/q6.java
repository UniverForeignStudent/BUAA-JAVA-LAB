package q6;

import java.io.*;

public class q6 {
	public static void main(String[] args) {
		String s1="sourceDir";
		String s2="targetDir";
		try{
			copyDirectiory(s1,s2);
		}catch(IOException e) {}
	}

    public static void copyDirectiory(String sourceDir, String targetDir) throws IOException {
        File source = new File(sourceDir);

        File[] files = source.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                File target = new File(targetDir + "/" + file.getName());
                target.mkdir();
                copyDirectiory(sourceDir + "/" + file.getName(), targetDir + "/" + file.getName());
            } else {
                copyFile(sourceDir + "/" + file.getName(), targetDir + "/" + file.getName());
            }
        }
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
