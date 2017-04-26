package ArticleXMLReader;

import org.dom4j.Element;
import org.dom4j.Node;
import variableTableFolder.XMLArticleExtractorVariableTable;

import java.util.Iterator;

/**
 * Created by roye on 2017/4/14.
 */
public class XMLArticleExtractor {
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
    public Article getOriginalArticle()
    {
        return originalArticle;
    }
    public Article getCorrectedArticle()
    {
        return correctedArticle;
    }
    public void extractArticle()
    {
        originalArticle=new Article(xmlLoader.getArticleName(),xmlLoader.getArticleName().split("_")[0],false);
        correctedArticle=new Article(xmlLoader.getArticleName()+ XMLArticleExtractorVariableTable.xmlCorrectedFileNameTag,xmlLoader.getArticleName().split("_")[0],true);
        Iterator ir= articleElement.nodeIterator();
        while(ir.hasNext())
        {
           Node textNode=(Node) ir.next();
           if(textNode.getNodeTypeName().equals(XMLArticleExtractorVariableTable.xmlTextType))
           {
               String text=textNode.getText();
               text=removeLineFeed(text);
               originalArticle.addWord(text);
               correctedArticle.addWord(text);
           }
           else if(textNode.getNodeTypeName().equals(XMLArticleExtractorVariableTable.xmlElementType))
           {
               Element textElement=(Element)textNode;
               String correctText=textElement.attributeValue(XMLArticleExtractorVariableTable.xmlCorrectedTextTag);
               String originalText=textElement.getText();
               if(correctText!=null)
               {
                   if(correctText.equals(XMLArticleExtractorVariableTable.xmlIgnoredTag))
                   {
                       correctText="";
                   }
               }
               else
               {
                    correctText=textElement.getText();
               }
               correctText=removeLineFeed(correctText);
               originalText=removeLineFeed(originalText);
               originalArticle.addWord(removeLineFeed(originalText));
               correctedArticle.addWord(removeLineFeed(correctText));
           }
        }
    }
    public void showArticle()
    {
        System.out.println(originalArticle.getArticleName());
        System.out.println(originalArticle.toString());
        System.out.println(correctedArticle.getArticleName());
        System.out.println(correctedArticle.toString());
    }
    private String removeLineFeed(String sentence)
    {
        String output=sentence;
        while(output.contains("\n"))
        {
            output=output.replaceAll("\n"," ");
        }
        return output;
    }
}
