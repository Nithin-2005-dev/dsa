package FileHandling;

import java.io.*;

public class Readers {
    public static void main(String[] args) throws IOException {
        System.err.println("i'm printing error");
        try(InputStreamReader isr=new InputStreamReader(System.in)){
            System.out.println("Enter some letters:");
            int letters=isr.read();
            while (isr.ready()){
                System.out.println((char) letters);
                letters=isr.read();
            }
            isr.close();
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        try(FileReader fr=new FileReader("C:\\Users\\NITHIN\\IdeaProjects\\DSA\\src\\FileHandling\\note.txt")){
            System.out.println("Enter some letters:");
            int letters=fr.read();
            while (fr.ready()){
                System.out.print((char) letters);
                letters=fr.read();
            }
            System.out.print((char) letters);
            fr.close();
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        //byte to char stream and then reading char stream
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("you typed:"+br.readLine());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\NITHIN\\IdeaProjects\\DSA\\src\\FileHandling\\note.txt"))){
            while (br.ready()){
                System.out.print(br.readLine());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
