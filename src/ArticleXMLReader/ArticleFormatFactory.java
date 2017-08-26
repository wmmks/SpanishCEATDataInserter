package ArticleXMLReader;

import variableTableFolder.ArticleFormatFactoryVariableTable;

/**
 * Created by roye on 2017/4/17.
 */
public class ArticleFormatFactory {
    public String getArticleText() {
        return articleText;
    }

    public void setArticleText(String articleText) {
        this.articleText = articleText;
    }

    private String articleText;

    public String getArticleId() {
        return articleId;
    }

    private String articleId;
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public void loadArticle(Article article)
    {
        fileName=article.getArticleName();
        articleText =article.toString();
        articleId=article.getArticleId();

    }

    private String fileName;
    public String convertArticle()
    {
        String writerName=extractWriterName(fileName);
        try{
            articleText=articleText.split(writerName)[1];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {

        }

        return articleText;
    }
    private String extractWriterName(String fileName)
    {
        String name=fileName.split("_| ")[ArticleFormatFactoryVariableTable.WriterNameIndex];
        String output="";
        for(char word:name.toCharArray())
        {
            if(Character.UnicodeBlock.of(word).toString().equals(ArticleFormatFactoryVariableTable.ChineseJapanKoreanTag))
            {
                output+=word;
            }
            else
            {
                break;
            }

        }
        return output;
    }
}
