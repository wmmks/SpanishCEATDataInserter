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
    private Document articleDocument;
    private Element articleElement;

    public String getArticleName() {
        return articleName;
    }

    private String articleName;
    XMLLoader()
    {
        reader= new SAXReader();
    }
    void setArticleName(String fileName)
    {
        articleName=fileName;
    }
    void setXMLFile(String filePath)
    {
        //"054_13054_NCKU_姚蘊玲Natalie-Correccion.xml"

        File xmlFile=new File(filePath);
        try {
            articleDocument = reader.read(xmlFile);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        setArticleElement();
    }
    void setArticleElement()
    {
        articleElement= articleDocument.getRootElement().element("body");
    }
   public Element getArticleElement()
    {
        return articleElement;
    }
}
