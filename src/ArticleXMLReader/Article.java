package ArticleXMLReader;

import java.util.ArrayList;

/**
 * Created by roye on 2017/4/17.
 */
public class Article {
    private ArrayList<String> wordList;
    Article(String name,boolean isCorrected)
    {
        wordList=new ArrayList<String>();
        articleName=name;
        this.isCorrected=isCorrected;
    }
    public String getArticleName() {
        return articleName;
    }
    public ArrayList<String> getWordList()
    {
        return wordList;
    }
    public void addWord(String word)
    {
        wordList.add(word);
    }
    private String articleName;

    public boolean isCorrected() {
        return isCorrected;
    }

    public void setCorrected(boolean corrected) {
        isCorrected = corrected;
    }

    private boolean isCorrected;

    void setArticleName(String name)
    {
        articleName=name;
    }
    public String toString()
    {
        String output="";
        for(String word:wordList)
        {
            output+=word;
        }
        output=output.replaceAll("  "," ");

        return output;
    }
}
