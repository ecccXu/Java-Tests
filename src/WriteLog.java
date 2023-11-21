import java.io.*;

public class WriteLog {
    public static void main(String[] args) {
        try {
            /* 好像不需要创建文件操作，直接就能创建了 */
//            File file = new File("E:\\log.txt");
//            if (!file.exists()) {   //文件不存在则创建文件，先创建目录
//                File dir = new File(file.getParent());
//                dir.mkdirs();
//                file.createNewFile();
//            }
            //缓冲System.in输入流
            //System.in是字节流，通过InputStreamReader将其转换为字符流
            BufferedReader bufR = new BufferedReader(new InputStreamReader(System.in));
            //缓冲FileWriter
            BufferedWriter bufW = new BufferedWriter(new FileWriter("E:\\log.txt"));
            //因为我没D盘，所以我放在另外一个磁盘

            String str;

            while (!(str = bufR.readLine()).equals("quit#")){
                bufW.write(str);
                /* newLine()方法写入与操作系统相关的换行字符，依执行环境当时的OS来决定该输出那种换行字符 */
                bufW.newLine();
            }
            bufR.close();
            bufW.close();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("没有指定文件");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
