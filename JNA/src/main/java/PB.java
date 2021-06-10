import java.util.Scanner;

public class PB {
    public static void main(String[] args)
    {
        try
        {
            ProcessBuilder pBuilder = new ProcessBuilder();

            pBuilder.command("cmd", "/c","ver");
            //pBuilder.command("cmd", "/c","dir");


            Process process = pBuilder.start();
            Scanner s = new Scanner(process.getInputStream());
            while (s.hasNext())
            {
                System.out.println(s.nextLine());
            }

//            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//            String line;
//            while ((line = reader.readLine()) != null)
//            {
//                System.out.println(line);
//            }
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
