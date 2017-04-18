package ArticleXMLReader;

import util.IOManager;
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
    }
    private String fileName;
    public void convertAndWriteFile(String path)
    {
        IOManager io=new IOManager();
        String writerName=extractWriterName(fileName);
        io.setwritepath(path+fileName,true);
        try{
            io.writeLine(articleText.split(writerName)[1]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            io.writeLine(articleText);
        }


    }
    private String extractWriterName(String fileName)
    {
        String name=fileName.split("_")[ArticleFormatFactoryVariableTable.WriterNameIndex];
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
