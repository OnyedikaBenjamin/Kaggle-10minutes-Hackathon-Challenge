import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProgressTracker {
    public static void main(String[] args) {
        File file = new File("src/MyProgress.txt");
        try {
            if(!file.exists()){ file
                    .createNewFile();}
            PrintWriter printWriter = new PrintWriter(
                    new FileWriter(file)
            );
            printWriter.write("|------------- BENJAMIN PROGRESS TRACKER --------------|\n");
            for(int i=1; i<=357; i++) {
                double percentage = ((double) (i) * 100) / 357;
                if (String.valueOf(i).length() == 1) {
                    printWriter.write(String.format("|---------------- Task %s    |   %.2f %% ----------------|\n",
                            i, percentage));
                } else if (String.valueOf(i).length() == 2) {
                    if (percentage >= 10 && percentage < 100)
                        printWriter.write(String.format("|--------------- Task %s    |   %.2f %% ---------------|\n",
                                i, percentage));
                    else printWriter.write(String.format("|--------------- Task %s    |   %.2f %% ----------------|\n",
                            i, percentage));
                } else {
                    if (percentage >= 100) {
                        printWriter.write(String.format("|-------------- Task %s    |   %.2f %% --------------|\n",
                                i, percentage
                        ));}
                    else{
                        printWriter.write(String.format("|-------------- Task %s    |   %.2f %% ---------------|\n",
                                i, percentage
                        ));}}}
            printWriter.flush();printWriter.close();
        }
        catch(IOException ioe){
            System.out.println(ioe.getMessage());
            throw new IllegalStateException(ioe);
        }
    }
}
