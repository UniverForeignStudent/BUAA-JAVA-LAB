package q3;

import java.io.*;

public class q3 {
	public static void main(String[] args) {
		String s1="input.txt";
		String s2="out.txt";
		try{
			removeComments(s1,s2);
		}catch(IOException e) {}
	}
    public static void removeComments(String input, String output) throws IOException {
        FileReader fr = new FileReader(input);
        FileWriter fw = new FileWriter(output);
        BufferedReader br = new BufferedReader(fr);

        while (true) {
            String s = br.readLine();
            if (s == null) {
                break;
            }
            if (!s.startsWith("//")) {
                fw.write(s + "\n");
            }
        }

        fr.close();
        br.close();
        fw.close();
    }
}
