import util.IOManager;

import java.io.*;


/**
 * Created by roye on 2017/4/14.
 */
public class main {

    public static void main(String arg[]) {

       IOManager io=new IOManager();
       io.setreadpath("CEATE2010 dp_30523Ln_40923Jo.csv");
        while(io.ready())
        {
            System.out.println(io.readLine());
        }

    }
}