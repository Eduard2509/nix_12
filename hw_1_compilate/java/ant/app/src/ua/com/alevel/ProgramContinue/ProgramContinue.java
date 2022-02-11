package ua.com.alevel.ProgramContinue;

import ua.com.alevel.FinishProgram.ProgramEnd;
import org.apache.commons.math3.distribution.*;

public class ProgramContinue {
    public void go() {

        System.out.println("Program continue");

        //I found this example here https://www.baeldung.com/apache-commons-math
        NormalDistribution normalDistribution = new NormalDistribution(10, 3);
        double randomValue = normalDistribution.sample();

        System.out.println("Your random number: " + randomValue);
        System.out.println();

        ProgramEnd programEnd = new ProgramEnd();
        programEnd.done();

    }
}
