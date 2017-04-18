package CEATEDataTool;

import util.IOManager;


import java.io.*;


/**
 * Created by roye on 2017/4/14.
 */
public class UserInformationLoader {

    public static void main(String arg[])  {


        IOManager io=new IOManager();
        io.setCodetype("Unicode");
        io.setreadpath("CEATE2010 dp_30523Ln_40923Jo.txt");
        io.setCodetype("utf-8");
        io.setwritepath("asd.txt",true);
        while(io.ready())
        {
            io.writeLine(io.readLine());
        }




    }
}