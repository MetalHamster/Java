import java.io.IOException;

/**
 * @author Matthias.Flueckiger
 */
public class ProcessBuilderClass {
    public static void openNotepad() throws IOException {
        ProcessBuilder pb = new ProcessBuilder("notepad");
        Process p = pb.start();
    }

    public static void main(String[] args) throws IOException {
        ProcessBuilderClass.openNotepad();
    }
}
