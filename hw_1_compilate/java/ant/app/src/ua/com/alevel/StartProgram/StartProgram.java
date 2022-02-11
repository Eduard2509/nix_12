package ua.com.alevel.StartProgram;

import org.apache.commons.lang3.StringUtils;
import ua.com.alevel.ProgramContinue.ProgramContinue;

public class StartProgram {

    public void begin() {

        System.out.println("program start");
        System.out.println(StringUtils.upperCase("program start"));
        System.out.println();

        ProgramContinue programContinue = new ProgramContinue();
        programContinue.go();
    }
}
