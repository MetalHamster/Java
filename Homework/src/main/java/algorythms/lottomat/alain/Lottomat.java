package algorythms.lottomat.alain;

import java.util.*;

/**
 * @author Matthias.Flueckiger
 */
public class Lottomat
{

    public final int MAX = 49;
    private final List<String> numbers = new ArrayList<>();
    private final List<String> choice = new ArrayList<>();

    public Lottomat(int max)
    {
        for (int nr = 1; nr <= max; nr++)
        {
            numbers.add("" + nr);
        }
    }

    public String getNextRandomBall()
    {
        int pos = (int) (Math.random() * numbers.size());
        String ball = numbers.remove(pos);
        choice.add(ball);
        return ball;
    }

    public List<String> getNumberList()
    {
        return numbers;
    }

    public List<String> getChoiceList()
    {
        return choice;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Lottomat lottoMat = new Lottomat(20);
        System.out.println("----- Lottomat ------");
        System.out.println(lottoMat.getNumberList());
        for (int i = 0; i < 6; i++)
        {
            System.out.print("Return for next number");
            in.nextLine();
            System.out.println(lottoMat.getNextRandomBall());
        }
        System.out.println("Lotto-Numbers: " + lottoMat.getChoiceList());
    }
}