package ArticleXMLReader;

import org.dom4j.*;
import org.dom4j.io.SAXReader;

import javax.lang.model.util.Elements;
import java.io.File;
import java.util.Iterator;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Attribute;

/**
 * Created by roye on 2017/4/14.
 */
public class ArticleExtractor {
    private Element articleElement;
    private XMLLoader xmlLoader;
    private Article originalArticle,correctedArticle;
    private void setArticleElement()
    {
        this.articleElement=xmlLoader.getArticleElement();

    }
    public void setXmlLoader(XMLLoader xmlLoader)
    {
        this.xmlLoader=xmlLoader;
        setArticleElement();
    }
    public void extractArticle()
    {
        originalArticle=new Article(xmlLoader.getArticleName(),false);
        correctedArticle=new Article(xmlLoader.getArticleName()+"_corrected",true);
        Iterator ir= articleElement.nodeIterator();
        while(ir.hasNext())
        {
           Node textNode=(Node) ir.next();

           if(textNode.getNodeTypeName().equals("Text"))
           {
               String text=textNode.getText();
               if(textNode.getText().contains("\n"))
               {
                   text=text.replace("\n","");

               }
               originalArticle.addWord(text);
               correctedArticle.addWord(text);
           }
           else if(textNode.getNodeTypeName().equals("Element"))
           {
               Element textElement=(Element)textNode;
               String correctText=textElement.attributeValue("comment");

               if(correctText.equals("000"))
               {
                   correctText="";
               }
               originalArticle.addWord(textElement.getText());
               correctedArticle.addWord(correctText);
           }
        }
    }
    public void showArticle()
    {
        System.out.println(originalArticle.toString());
        System.out.println(correctedArticle.toString());
    }
}
