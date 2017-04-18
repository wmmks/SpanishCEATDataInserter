package ArticleXMLReader;

import util.IOManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by roye on 2017/4/17.
 */
public class ArticleMain {
    static String inputPath;
    static String outputPath;
    public static void main(String args[])
    {

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
            xmlLoader.setXMLFile(inputPath+fileName);
            articleExtractor.setXmlLoader(xmlLoader);
            articleExtractor.extractArticle();
            Article correctedArticle=articleExtractor.getCorrectedArticle();
            Article originalArticle=articleExtractor.getOriginalArticle();
            articleFormatFactory.loadArticle(correctedArticle);
            articleFormatFactory.convertAndWriteFile(outputPath);
            articleFormatFactory.loadArticle(originalArticle);
            articleFormatFactory.convertAndWriteFile(outputPath);
        }


    }
}
