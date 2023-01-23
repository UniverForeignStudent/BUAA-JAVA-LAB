package q4;

import java.io.*;

public class q4 {
	public static void main(String[] args) {
		String s1="input.txt";
		String s2="out.txt";
		try{
			addLineNo(s1,s2);
		}catch(IOException e) {}
		
	}

    public static void addLineNo(String inputpath, String outpath) throws IOException {
        FileReader fr = new FileReader(inputpath);
        FileWriter fw = new FileWriter(outpath);
        BufferedReader br = new BufferedReader(fr);

        int c = 0;
        while (true) {
            String s = br.readLine();
            c++;
            if (s == null) {
                break;
            }
            fw.write(c + ". " + s + "\n");
        }

        fr.close();
        br.close();
        fw.close();
    }
}
