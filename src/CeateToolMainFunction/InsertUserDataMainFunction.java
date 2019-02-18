package CeateToolMainFunction;

import CEATEDataTool.*;
import databaseUtil.DatabaseController;
import variableTableFolder.DatabaseColumnNameVariableTable;

/**
 * Created by roye on 2017/4/25.
 */
public class InsertUserDataMainFunction {


    public static void main(String args[])
    {
        // 請將 excel 轉成 txt (CEATE = 1 COATE = 2)
        int systemType=2;
        UserInformationFileCodeTypeTransformer userInformationFileCodeTypeTransformer=new UserInformationFileCodeTypeTransformer();
        String codeTransformedName=userInformationFileCodeTypeTransformer.convert("2005-2006.txt");
        UserInformationLoader userInformationLoader;
        if(systemType==1)
        {
            userInformationLoader=new UserInformationLoader();
        }
        else
        {
            userInformationLoader=new CoateUserInformationLoader();
        }
        userInformationLoader.loadUserInformationFile(codeTransformedName, systemType);
        insertUserData(userInformationLoader);

    }
    static void insertUserData(UserInformationLoader userInformationLoader)
    {
        DatabaseController databaseController =new DatabaseController();
        for(int i=0;i<userInformationLoader.size();i++)
        {
            databaseController.execInsert(DatabaseColumnNameVariableTable.articlesInformationTableName,userInformationLoader.getArticleInformation(i).toSqlObject());
            databaseController.execInsert(DatabaseColumnNameVariableTable.classInformationTableName,userInformationLoader.getClassInformation(i).toSqlObject());
            databaseController.execInsert(DatabaseColumnNameVariableTable.usersInformationTableName,userInformationLoader.getUserInformation(i).toSqlObject());
            databaseController.execInsert(DatabaseColumnNameVariableTable.usersSpecialExperienceTableName,userInformationLoader.getUserSpecialExperience(i).toSqlObject());
        }

    }
}
