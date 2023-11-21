import java.io.*;

public class ReadText {
    public static void main(String[] args){
        try {
            //创建FileReader
            FileReader fr = new FileReader("X:\\Code Projects\\Java\\Java_Test\\JaveTest-Final\\src\\myText.txt");
            //缓冲指定文件的输入
            BufferedReader br = new BufferedReader(fr);
            String str;//定义一个String类型的变量，用来每次读取一行
            while ((str = br.readLine()) != null){
                System.out.println(str);//在屏幕上输出
            }
            br.close();
            fr.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
