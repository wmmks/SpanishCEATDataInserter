package CEATEDataTool;

import databaseUtil.DatabaseController;
import variableTableFolder.DatabaseColumnNameVariableTable;

/**
 * Created by roye on 2017/4/25.
 */
public class main {


    public static void main(String args[])
    {
        UserInformationLoader userInformationLoader=new UserInformationLoader();
        userInformationLoader.loadUserInformationFile("asd.txt");
        insertUserData(userInformationLoader);
    }
    static void insertUserData(UserInformationLoader userInformationLoader)
    {
        DatabaseController databaseController =new DatabaseController();
        System.out.println(userInformationLoader.size());
        databaseController.insertArticleInformation(DatabaseColumnNameVariableTable.articlesInformationTableName,userInformationLoader.getArticleInformation(0).toSqlObject());
        databaseController.insertArticleInformation(DatabaseColumnNameVariableTable.classInformationTableName,userInformationLoader.getClassInformation(0).toSqlObject());
        databaseController.insertArticleInformation(DatabaseColumnNameVariableTable.usersInformationTableName,userInformationLoader.getUserInformation(0).toSqlObject());
        databaseController.insertArticleInformation(DatabaseColumnNameVariableTable.usersSpecialExperienceTableName,userInformationLoader.getUserSpecialExperience(0).toSqlObject());

    }
}
