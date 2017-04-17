package ArticleXMLReader;

/**
 * Created by roye on 2017/4/17.
 */
public class ArticleMain {
    public static void main(String args[])
    {
        ArticleExtractor articleExtractor=new ArticleExtractor();
        XMLLoader xmlLoader=new XMLLoader();
        xmlLoader.setXMLFile("054_13054_NCKU_姚蘊玲Natalie-Correccion.xml");
        articleExtractor.setXmlLoader(xmlLoader);
        articleExtractor.extractArticle();
        articleExtractor.showArticle();

    }
}
