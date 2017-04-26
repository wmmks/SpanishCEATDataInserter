package CEATEDataToolModel;

import CEATEDataTool.TransformToSqlObject;
import databaseUtil.SqlObject;
import variableTableFolder.DatabaseColumnNameVariableTable;

/**
 * Created by roye on 2017/4/25.
 */
public class ClassInformation implements TransformToSqlObject {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassSchoolSystem() {
        return classSchoolSystem;
    }

    public void setClassSchoolSystem(String classSchoolSystem) {
        this.classSchoolSystem = classSchoolSystem;
    }

    public String getClassDepartment() {
        return classDepartment;
    }

    public void setClassDepartment(String classDepartment) {
        this.classDepartment = classDepartment;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public String getClassGroup() {
        return classGroup;
    }

    public void setClassGroup(String classGroup) {
        this.classGroup = classGroup;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    private String className;
    private String classSchoolSystem;
    private String classDepartment;
    private String classGrade;
    private String classGroup;
    private String teacher;

    @Override
    public SqlObject toSqlObject() {
        SqlObject sqlObject=new SqlObject();
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.id,this.id);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.className,this.className);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.classSchoolSystem,this.classSchoolSystem);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.classDepartment,this.classDepartment);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.classGrade,this.classGrade);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.classGroutp,this.classGroup);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.teacher,this.teacher);
        return sqlObject;
    }

    @Override
    public String toString() {
        return "ClassInformation{" +
                "id=" + id +
                ", className='" + className + '\'' +
                ", classSchoolSystem='" + classSchoolSystem + '\'' +
                ", classDepartment='" + classDepartment + '\'' +
                ", classGrade='" + classGrade + '\'' +
                ", classGroup='" + classGroup + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
