package CEATEDataToolModel;

import CEATEDataTool.TransformToSqlObject;
import databaseUtil.SqlObject;
import variableTableFolder.DatabaseColumnNameVariableTable;

/**
 * Created by roye on 2017/4/25.
 */
public class UserSpecialExperience implements TransformToSqlObject {
    private int id;
    private String motherTongue;
    private String specialExeperience;
    private String spanishRelatedResident;
    private String spanishRelatedExchange;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }

    public String getSpecialExeperience() {
        return specialExeperience;
    }

    public void setSpecialExeperience(String specialExeperience) {
        this.specialExeperience = specialExeperience;
    }

    public String getSpanishRelatedResident() {
        return spanishRelatedResident;
    }

    public void setSpanishRelatedResident(String spanishRelatedResident) {
        this.spanishRelatedResident = spanishRelatedResident;
    }

    public String getSpanishRelatedExchange() {
        return spanishRelatedExchange;
    }

    public void setSpanishRelatedExchange(String spanishRelatedExchange) {
        this.spanishRelatedExchange = spanishRelatedExchange;
    }

    public String getSpanishDepartmentExchange() {
        return spanishDepartmentExchange;
    }

    public void setSpanishDepartmentExchange(String spanishDepartmentExchange) {
        this.spanishDepartmentExchange = spanishDepartmentExchange;
    }

    private String spanishDepartmentExchange;

    @Override
    public SqlObject toSqlObject() {
        SqlObject sqlObject=new SqlObject();
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.id,this.id);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.motherTongue,this.motherTongue);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.specialExperience,this.specialExeperience);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.spanishRelatedResident,this.spanishRelatedResident);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.spanishRelatedExchange,this.spanishRelatedExchange);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.spanishDepartmentExchange,this.spanishDepartmentExchange);
        return sqlObject;
    }

    @Override
    public String toString() {
        return "UserSpecialExperience{" +
                "id=" + id +
                ", motherTongue='" + motherTongue + '\'' +
                ", specialExeperience='" + specialExeperience + '\'' +
                ", spanishRelatedResident='" + spanishRelatedResident + '\'' +
                ", spanishRelatedExchange='" + spanishRelatedExchange + '\'' +
                ", spanishDepartmentExchange='" + spanishDepartmentExchange + '\'' +
                '}';
    }
}
