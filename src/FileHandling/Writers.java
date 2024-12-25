package FileHandling;

import java.io.*;
import java.util.Scanner;

public class Writers {
    public static void main(String[] args) {
        OutputStream os=System.out;
//        os.write(🥰); //range is exceeded
//        try(OutputStreamWriter osw=new OutputStreamWriter(System.out)) {
//            osw.write("hello world");
//            osw.write(" fuck off");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println();
        Scanner scanner=new Scanner(System.in);
        try (FileWriter fw=new FileWriter("C:\\Users\\NITHIN\\IdeaProjects\\DSA\\src\\FileHandling\\note.txt",true)){
            String str=scanner.nextLine();
            fw.append(str);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        try (BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\NITHIN\\IdeaProjects\\DSA\\src\\FileHandling\\note.txt",true))){
            String str=scanner.nextLine();
            bw.append(str);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        try {
            File fo=new File("new-file.txt");
            fo.createNewFile();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
