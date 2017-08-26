package CEATEDataToolModel;

import CEATEDataTool.TransformToSqlObject;
import databaseUtil.SqlObject;
import variableTableFolder.DatabaseColumnNameVariableTable;

/**
 * Created by roye1 on 2017/8/26.
 */
public class CoateUserInformation extends UserInformation implements TransformToSqlObject {
    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCollector() {
        return collector;
    }

    public void setCollector(String collector) {
        this.collector = collector;
    }

    private String collector;

    @Override
    public SqlObject toSqlObject() {
        SqlObject sqlObject=new SqlObject();
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.id,this.id);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.systemType,this.systemType);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.idUnderYear,this.idUnderYear);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.chineseName,this.chineseName);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.spanishName,this.spanishName);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.gender,this.gender);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.schoolName,this.schoolName);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.studentId,this.studentId);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.schoolStstem,this.schoolSystem);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.department,this.department);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.grade,this.grade);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.group,this.group);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.learningHours,this.learningHours);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.learningYears,this.learningYears);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.learningMonths,this.learningMonths);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.wisconsinNumberOfCorrect,this.wisconsinNumberOfCorrect);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.wisconsinScore,this.wisconsinScore);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.level,this.level);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.dateOfAgreementSubmit,this.dateOfAgreementSubmit);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.collector,this.collector);
        return sqlObject;
    }
}
