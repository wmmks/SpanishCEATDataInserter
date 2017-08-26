package CEATEDataToolModel;

import CEATEDataTool.TransformToSqlObject;
import databaseUtil.SqlObject;
import variableTableFolder.DatabaseColumnNameVariableTable;

/**
 * Created by roye on 2017/4/25.
 */
public class ArticleInformation implements TransformToSqlObject {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    protected int id;

    public int getSystemType() {
        return systemType;
    }

    public void setSystemType(int systemType) {
        this.systemType = systemType;
    }

    protected int systemType;
    public String getSubmittedYear() {
        return submittedYear;
    }

    public void setSubmittedYear(String submittedYear) {
        this.submittedYear = submittedYear;
    }

    protected String submittedYear;

    public String getSubmittedMonth() {
        return submittedMonth;
    }

    public void setSubmittedMonth(String submittedMonth) {
        this.submittedMonth = submittedMonth;
    }

    protected String submittedMonth;

    public String getHaveSubmitted() {
        return haveSubmitted;
    }

    public void setHaveSubmitted(String haveSubmitted) {
        this.haveSubmitted = haveSubmitted;
    }

    protected String haveSubmitted;

    public String getWrittingLocation() {
        return writtingLocation;
    }

    public void setWrittingLocation(String writtingLocation) {
        this.writtingLocation = writtingLocation;
    }

    protected String writtingLocation;

    public String getArticleStyle() {
        return articleStyle;
    }

    public void setArticleStyle(String articleStyle) {
        this.articleStyle = articleStyle;
    }

    protected String articleStyle;

    public String getArticleTopic() {
        return articleTopic;
    }

    public void setArticleTopic(String articleTopic) {
        this.articleTopic = articleTopic;
    }

    protected String articleTopic;

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    protected String articleTitle;

    public String getNumberOfWords() {
        return numberOfWords;
    }

    public void setNumberOfWords(String numberOfWords) {
        this.numberOfWords = numberOfWords;
    }

    protected String numberOfWords;

    @Override
    public String toString() {
        return "ArticleInformation{" +
                "id=" + id +
                ", submittedYear='" + submittedYear + '\'' +
                ", submittedMonth='" + submittedMonth + '\'' +
                ", haveSubmitted='" + haveSubmitted + '\'' +
                ", writtingLocation='" + writtingLocation + '\'' +
                ", articleStyle='" + articleStyle + '\'' +
                ", articleTopic='" + articleTopic + '\'' +
                ", articleTitle='" + articleTitle + '\'' +
                ", numberOfWords='" + numberOfWords + '\'' +
                '}';
    }

    @Override
    public SqlObject toSqlObject() {
        SqlObject sqlObject=new SqlObject();
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.id,this.id);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.systemType,this.systemType);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.submittedYear,this.submittedYear);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.submittedMonth,this.submittedMonth);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.haveSubmitted,this.haveSubmitted);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.writtingLocation,this.writtingLocation);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.articleStyle,this.articleStyle);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.articleTopic,this.articleTopic);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.articleTitle,this.articleTitle);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.numberOfWords,this.numberOfWords);
        return sqlObject;
    }
}
