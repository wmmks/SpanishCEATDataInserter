package CeateToolMainFunction;

import CEATEDataTool.UserInformationLoader;
import databaseUtil.DatabaseController;
import variableTableFolder.DatabaseColumnNameVariableTable;

/**
 * Created by roye on 2017/4/25.
 */
public class InsertUserDataMainFunction {


    public static void main(String args[])
    {
        UserInformationLoader userInformationLoader=new UserInformationLoader();
        userInformationLoader.loadUserInformationFile("asd.txt");
        insertUserData(userInformationLoader);
        InsertArticleMainFunction articleConverter=new InsertArticleMainFunction();

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
