package ua.com.alevel.ProgramStart;

import ua.com.alevel.ContinueProgram.ContinueProgram;
import org.apache.commons.lang3.StringUtils;

public class ProgramStart {

    public void begin() {

        System.out.println("program start");
        System.out.println(StringUtils.upperCase("program start"));
        System.out.println();

        ContinueProgram continueProgram = new ContinueProgram();
        continueProgram.go();
    }
}
