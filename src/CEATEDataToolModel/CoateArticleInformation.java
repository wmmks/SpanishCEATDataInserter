package CEATEDataToolModel;

import CEATEDataTool.TransformToSqlObject;
import databaseUtil.SqlObject;
import variableTableFolder.DatabaseColumnNameVariableTable;

/**
 * Created by roye1 on 2017/8/26.
 */
public class CoateArticleInformation extends ArticleInformation implements TransformToSqlObject {
    public String getLongMin() {
        return longMin;
    }

    public void setLongMin(String longMin) {
        this.longMin = longMin;
    }

    private String longMin;

    public String getLongSeg() {
        return longSeg;
    }

    public void setLongSeg(String longSeg) {
        this.longSeg = longSeg;
    }

    private String longSeg;
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
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.longMin,this.longMin);
        sqlObject.addSqlObject(DatabaseColumnNameVariableTable.longSeg,this.longSeg);
        return sqlObject;
    }

    @Override
    public String toString() {
        return "CoateArticleInformation{" +super.toString()+
                "longMin='" + longMin + '\'' +
                ", longSeg='" + longSeg + '\'' +
                '}';
    }
}
