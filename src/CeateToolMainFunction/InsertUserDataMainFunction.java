package CeateToolMainFunction;

import CEATEDataTool.UserInformationFileCodeTypeTransformer;
import CEATEDataTool.UserInformationLoader;
import databaseUtil.DatabaseController;
import variableTableFolder.DatabaseColumnNameVariableTable;

/**
 * Created by roye on 2017/4/25.
 */
public class InsertUserDataMainFunction {


    public static void main(String args[])
    {
        UserInformationFileCodeTypeTransformer userInformationFileCodeTypeTransformer=new UserInformationFileCodeTypeTransformer();
        String codeTransformedName=userInformationFileCodeTypeTransformer.convert("2013.txt");
        UserInformationLoader userInformationLoader=new UserInformationLoader();
        userInformationLoader.loadUserInformationFile(codeTransformedName);
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
