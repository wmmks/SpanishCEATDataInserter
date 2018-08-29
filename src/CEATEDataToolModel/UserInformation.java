package CEATEDataToolModel;

import CEATEDataTool.TransformToSqlObject;
import databaseUtil.SqlObject;
import variableTableFolder.DatabaseColumnNameVariableTable;

/**
 * Created by roye on 2017/4/25.
 */
public class UserInformation implements TransformToSqlObject {
    protected int id;

    public int getSystemType() {
        return systemType;
    }

    public void setSystemType(int systemType) {
        this.systemType = systemType;
    }

    protected int systemType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getSpanishName() {
        return spanishName;
    }

    public void setSpanishName(String spanishName) {
        this.spanishName = spanishName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSchoolSystem() {
        return schoolSystem;
    }

    public void setSchoolSystem(String schoolSystem) {
        this.schoolSystem = schoolSystem;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getLearningHours() {
        return learningHours;
    }

    public void setLearningHours(int learningHours) {
        this.learningHours = learningHours;
    }

    public String getLearningYears() {
        return learningYears;
    }

    public void setLearningYears(String learningYears) {
        this.learningYears = learningYears;
    }

    public String getLearningMonths() {
        return learningMonths;
    }

    public void setLearningMonths(String learningMonths) {
        this.learningMonths = learningMonths;
    }

    public int getWisconsinNumberOfCorrect() {
        return wisconsinNumberOfCorrect;
    }

    public void setWisconsinNumberOfCorrect(int wisconsinNumberOfCorrect) {
        this.wisconsinNumberOfCorrect = wisconsinNumberOfCorrect;
    }

    public int getWisconsinScore() {
        return wisconsinScore;
    }

    public void setWisconsinScore(int wisconsinScore) {
        this.wisconsinScore = wisconsinScore;
    }

    public String getDateOfAgreementSubmit() {
        return dateOfAgreementSubmit;
    }

    public void setDateOfAgreementSubmit(String dateOfAgreementSubmit) {
        this.dateOfAgreementSubmit = dateOfAgreementSubmit;
    }


    public String getCollector() {
        return collector;
    }

    public void setCollector(String collector) {
        this.collector = collector;
    }

    public String getIdUnderYear() {
        return idUnderYear;
    }

    public void setIdUnderYear(String idUnderYear) {
        this.idUnderYear = idUnderYear;
    }

    protected String idUnderYear;
    protected String chineseName;
    protected String spanishName;
    protected String gender;
    protected String schoolName;
    protected String studentId;
    protected String schoolSystem;
    protected String department;
    protected String grade;
    protected String group;
    protected int learningHours;
    protected String learningYears;
    protected String learningMonths;
    protected int wisconsinNumberOfCorrect;
    protected int wisconsinScore;
    protected String dateOfAgreementSubmit;
    protected String collector;

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
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.dateOfAgreementSubmit,this.dateOfAgreementSubmit);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.collector,this.collector);
        return sqlObject;
    }

    @Override
    public String toString() {
        return "UserInformation{" +
                "id=" + id +
                ", idUnderYear='" + idUnderYear + '\'' +
                ", chineseName='" + chineseName + '\'' +
                ", spanishName='" + spanishName + '\'' +
                ", gender='" + gender + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", schoolSystem='" + schoolSystem + '\'' +
                ", department='" + department + '\'' +
                ", grade='" + grade + '\'' +
                ", group='" + group + '\'' +
                ", learningHours=" + learningHours +
                ", learningYears='" + learningYears + '\'' +
                ", learningMonths='" + learningMonths + '\'' +
                ", wisconsinNumberOfCorrect=" + wisconsinNumberOfCorrect +
                ", wisconsinScore=" + wisconsinScore +
                ", dateOfAgreementSubmit='" + dateOfAgreementSubmit + '\'' +
                ", collector='" + collector + '\'' +
                '}';
    }
}
