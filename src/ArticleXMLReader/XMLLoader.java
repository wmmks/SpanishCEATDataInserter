package ArticleXMLReader;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

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
            Document = reader.read(xmlFile);
            setArticleName(xmlFile.getName());
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        setArticleElement();
    }
    void setArticleElement()
    {
        articleElement= Document.getRootElement().element("body");
    }
   public Element getArticleElement()
    {
        return articleElement;
    }
}
