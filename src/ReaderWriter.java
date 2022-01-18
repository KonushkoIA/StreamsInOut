import java.io.*;

public class ReaderWriter {
    public void reading(){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("exactlyPolindroms.txt"));
                BufferedReader bufferedReader = new BufferedReader(new FileReader("mbPolindrom.txt"))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                boolean flag = false;
                    int y = 0;
                    for (int j = line.length() - 1; j >= 0; j--) {
                        if (line.charAt(y) == line.charAt(j)) {
                            flag = true;
                        }
                        y++;
                    }
                    if(flag){
                        bufferedWriter.write(line);
                        bufferedWriter.newLine();
                        System.out.println("Палиндром: " + line);
                    }

            }
        } catch (IOException e){
        }
    }
}
