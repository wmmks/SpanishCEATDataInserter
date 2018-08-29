package ArticleXMLReader;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import variableTableFolder.XMLArticleExtractorVariableTable;

import java.io.*;
import java.util.regex.Pattern;

/**
 * Created by roye on 2017/4/17.
 */
public class XMLLoader {
    private SAXReader reader;
    private Document Document;
    private Element articleElement;

    public String getArticleName() {
        return articleName;
    }

    private String articleName;
    public XMLLoader()
    {
        reader= new SAXReader();
    }
    private void setArticleName(String fileName)
    {
        articleName=fileName;
    }
    public void setXMLFile(String filePath)
    {
        File xmlFile=new File(filePath);
        try {
            replaceInvalidCode(filePath);
            Document = reader.read(xmlFile);
            setArticleName(xmlFile.getName());
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        setArticleElement();
    }
    void setArticleElement()
    {
        articleElement= Document.getRootElement().element(XMLArticleExtractorVariableTable.xmlArticleTagName);
    }
    String getArticleXML()
    {
        return articleElement.asXML().replaceAll("  "," ");
    }
   public Element getArticleElement()
    {
        return articleElement;
    }

    /**
     * Replace Invalid Character.
     */
    private void replaceInvalidCode(String filePath) {
        String originalFileContent = "";
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String currentReadingLine = reader.readLine();
            while (currentReadingLine != null) {
                originalFileContent += currentReadingLine + System.lineSeparator();
                currentReadingLine = reader.readLine();
            }
            Pattern p = Pattern.compile("[^\\u0009\\u000A\\u000D\u0020-\\uD7FF\\uE000-\\uFFFD\\u10000-\\u10FFF]+");
            String modifiedFileContent = p.matcher(originalFileContent).replaceAll("");
            writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(modifiedFileContent);
        } catch (IOException e) {
            //handle exception
        } finally {
            //10
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                //handle exception
            }
        }
    }
}
