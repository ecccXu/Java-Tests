import java.io.*;

public class WordStatistic {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("X:\\Code Projects\\Java\\Java_Test\\JaveTest-Final\\src\\test.txt");
            BufferedReader br = new BufferedReader(fr);
            String str;
            int Caplets=0,Lowlets=0;//大写字母,小写字母
            while ((str = br.readLine())!=null) {
                for (int i=0; i<str.length(); i++) {
                    if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                        Caplets++;
                    }
                    if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                        Lowlets++;
                    }
                }
            }
            System.out.println("大写字母个数："+Caplets);
            System.out.println("小写字母个数："+Lowlets);
            br.close();
            fr.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
