package ua.com.alevel.ProgramRun;

import ua.com.alevel.LoadingProgram.LoadingProgram;
import org.apache.commons.lang3.StringUtils;

public class ProgramRun {

    public void begin() {

        System.out.println(StringUtils.upperCase("program start"));
        System.out.println();


        LoadingProgram loadingProgram = new LoadingProgram();
        loadingProgram.go();
    }
}
