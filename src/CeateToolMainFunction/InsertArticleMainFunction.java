package CeateToolMainFunction;

import ArticleXMLReader.Article;
import ArticleXMLReader.ArticleFormatFactory;
import ArticleXMLReader.XMLArticleExtractor;
import ArticleXMLReader.XMLLoader;
import databaseUtil.DatabaseController;
import databaseUtil.SqlObject;
import util.IOManager;
import variableTableFolder.DatabaseColumnNameVariableTable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by roye on 2017/4/17.
 */
public class InsertArticleMainFunction {
    static String inputPath;
    static String outputPath;
    static public void main(String args[])
    {
        int systemType=2;// ceate =1 coate = 2 重要 一定要修改
        Properties properties=new Properties();
        IOManager io=new IOManager();
        try {
            properties.load(new FileInputStream("configuration.properties"));
            outputPath=properties.getProperty("outputFilePath");
            inputPath=properties.getProperty("inputFilePath");
        } catch (IOException e) {
            e.printStackTrace();
        }

        File folder=new File(inputPath);
        String[] fileNameSet = new String[0];
        if(folder.isDirectory())
        {
            fileNameSet=folder.list();
        }
        XMLArticleExtractor articleExtractor=new XMLArticleExtractor();
        XMLLoader xmlLoader=new XMLLoader();
        ArticleFormatFactory articleFormatFactory=new ArticleFormatFactory();
        for(String fileName:fileNameSet)
        {
            int articleId=Integer.parseInt(fileName.split("_| ")[0]);
            xmlLoader.setXMLFile(inputPath+fileName);
            articleExtractor.setXmlLoader(xmlLoader);
            articleExtractor.extractArticle();
            String articleXML=articleExtractor.getArticleXML();
            Article correctedArticle=articleExtractor.getCorrectedArticle();
            Article originalArticle=articleExtractor.getOriginalArticle();
            articleFormatFactory.loadArticle(correctedArticle);
            String correctedArticleText=articleFormatFactory.convertArticle();
            articleFormatFactory.loadArticle(originalArticle);
            String oritinalArticleText=articleFormatFactory.convertArticle();
            insertArticle(articleId,systemType,oritinalArticleText,correctedArticleText,articleXML);
        }

    }
    static void insertArticle(int id,int systemType, String originalArticleText, String correctedArticle,String xmlContent)
    {
        DatabaseController databaseController =new DatabaseController();
        SqlObject articleSqlObject=new SqlObject();
        articleSqlObject.addSqlObject(DatabaseColumnNameVariableTable.id,id);
        articleSqlObject.addSqlObject(DatabaseColumnNameVariableTable.systemType,systemType);
        articleSqlObject.addSqlObject(DatabaseColumnNameVariableTable.originalArticleText,originalArticleText);
        articleSqlObject.addSqlObject(DatabaseColumnNameVariableTable.correctedArticleText,correctedArticle);
        articleSqlObject.addSqlObject(DatabaseColumnNameVariableTable.xmlContent,xmlContent);
        databaseController.execInsert(DatabaseColumnNameVariableTable.articlesContentTableName,articleSqlObject);
    }

}
