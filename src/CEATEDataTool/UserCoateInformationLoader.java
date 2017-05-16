package CEATEDataTool;

import CEATEDataToolModel.ArticleInformation;

/**
 * Created by roye on 2017/5/16.
 */
public class UserCoateInformationLoader extends  UserInformationLoader{

    UserCoateInformationLoader()
    {
        super();
    }
    private void addArticleInformationList(String []columnValueSet)
    {
        int [] articleInformationIndex={0,28,29,30,31,32,33,34,35};
        ArticleInformation articleInformation=new ArticleInformation();
        articleInformation.setId(Integer.parseInt(columnValueSet[articleInformationIndex[0]]));
        articleInformation.setSubmittedYear(columnValueSet[articleInformationIndex[1]]);
        articleInformation.setSubmittedMonth(columnValueSet[articleInformationIndex[2]]);
        articleInformation.setHaveSubmitted(columnValueSet[articleInformationIndex[3]]);
        articleInformation.setWrittingLocation(columnValueSet[articleInformationIndex[4]]);
        articleInformation.setArticleStyle(columnValueSet[articleInformationIndex[5]]);
        articleInformation.setArticleTopic(columnValueSet[articleInformationIndex[6]]);
        articleInformation.setArticleTitle(columnValueSet[articleInformationIndex[7]]);
        articleInformation.setNumberOfWords(columnValueSet[articleInformationIndex[8]]);
        articleInformationList.add(articleInformation);

    }
}
