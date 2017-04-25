package CEATEDataTool;

import util.IOManager;


import java.io.*;


/**
 * Created by roye on 2017/4/14.
 */
public class UserInformationFileCodeTypeTransformer {

    static String readCodeType="Unicode";
    static String writeCodeType="utf-8";

    IOManager io;
    public UserInformationFileCodeTypeTransformer()
    {
        io=new IOManager();

    }
    public void convert(String filename)
    {
        String transformed="-transformed";
        io.setCodetype(readCodeType);
        io.setreadpath(filename);
        io.setCodetype(writeCodeType);
        io.setwritepath(filename+transformed,true);
        while(io.ready())
        {
            io.writeLine(io.readLine());
        }
    }


}