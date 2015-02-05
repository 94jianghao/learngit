package NumberGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by jh_pc on 15-2-5.
 */
public class GameProcess {
    private final PrintStream out;
    private  final NumberGenerator numberGenerator;
    private  final CompareNumber compareNumber;
    private final  BufferedReader reader;

    public GameProcess(PrintStream out, BufferedReader reader, NumberGenerator numberGenerator, CompareNumber number) {
        this.out= out;
        this.reader=reader;
        this.numberGenerator=numberGenerator;
        this.compareNumber=number;

    }

    public void start() throws IOException{
        int chance=6;
        out.println("Welcome");
        while(chance>0) {
            out.println("Please input your answer(6):");
            String input = numberGenerator.generate();
            String answer = reader.readLine();
            String result = compareNumber.numTest(Integer.parseInt(input), Integer.parseInt(answer));
            if ("4A0B".equals(result))
            {
                out.println("Congratulation");
                return;

            }
            out.println(result);
            chance--;
        }
        out.println("Game over!");



    }



}
