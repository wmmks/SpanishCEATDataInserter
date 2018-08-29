package CEATEDataTool;

import CEATEDataToolModel.*;
import util.IOManager;

import java.util.ArrayList;

/**
 * Created by roye on 2017/4/25.
 */
public class UserInformationLoader{
    private IOManager io;
    protected int size;
    protected int systemType;
    protected ArrayList<ArticleInformation> articleInformationList;
    protected ArrayList<ClassInformation> classInformationList;
    protected ArrayList<UserInformation> userInformationList;
    protected ArrayList<UserSpecialExperience> userSpecialExperienceList;
    public UserInformationLoader()
    {
        io=new IOManager();
        size=0;
        articleInformationList =new ArrayList<>();
        classInformationList =new ArrayList<>();
        userInformationList =new ArrayList<>();
        userSpecialExperienceList =new ArrayList<>();
    }
    public int size()
    {
        return size;
    }

    public ArticleInformation getArticleInformation(int index)
    {
        return articleInformationList.get(index);
    }
    public ClassInformation getClassInformation(int index)
    {
        return classInformationList.get(index);
    }
    public UserSpecialExperience getUserSpecialExperience(int index)
    {
        return userSpecialExperienceList.get(index);
    }
    public UserInformation getUserInformation(int index)
    {
        return userInformationList.get(index);
    }
    public void loadUserInformationFile(String filePath,int systemType)
    {
        io.setreadpath(filePath);
        this.systemType=systemType;
        String columnName;
        if(io.ready())
        {
            int i=0;
            columnName=io.readLine();
        }
        String columnValueRow;

        while(io.ready())
        {
            columnValueRow=io.readLine();

            if(columnValueRow.replaceAll("\t","").length()==0)
            {
                continue;
            }
            String[] columnValueSet=columnValueRow.split("\t");

            addUserInformationDateList(columnValueSet);
        }
    }
    public void addUserInformationDateList(String[] columnValueSet)
    {
        addArticleInformationList(columnValueSet);
        addClassInformationList(columnValueSet);
        addUserInformationList(columnValueSet);
        addUserSpecialExperienceList(columnValueSet);
        size+=1;
    }
    public void addArticleInformationList(String[] columnValueSet)
    {
        int [] articleInformationIndex={0,28,29,31,32,33,34,35,36};
        ArticleInformation articleInformation=new ArticleInformation();
        articleInformation.setId(Integer.parseInt(columnValueSet[articleInformationIndex[0]]));
        articleInformation.setSystemType(this.systemType);
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
    public void addUserInformationList(String[] columnVauleSet)
    {
        int [] userInformationIndex={0,1,2,3,4,5,6,7,8,9,10,17,18,19,25,26,27,30};
        UserInformation userInformation=new UserInformation();
        userInformation.setId(Integer.parseInt(columnVauleSet[userInformationIndex[0]]));
        userInformation.setSystemType(this.systemType);
        userInformation.setIdUnderYear(columnVauleSet[userInformationIndex[1]]);
        userInformation.setChineseName(columnVauleSet[userInformationIndex[2]]);
        userInformation.setSpanishName(columnVauleSet[userInformationIndex[3]]);
        userInformation.setGender(columnVauleSet[userInformationIndex[4]]);
        userInformation.setSchoolName(columnVauleSet[userInformationIndex[5]]);
        userInformation.setStudentId(columnVauleSet[userInformationIndex[6]]);
        userInformation.setSchoolSystem(columnVauleSet[userInformationIndex[7]]);
        userInformation.setDepartment(columnVauleSet[userInformationIndex[8]]);
        userInformation.setGrade(columnVauleSet[userInformationIndex[9]]);
        userInformation.setGroup(columnVauleSet[userInformationIndex[10]]);
        userInformation.setLearningHours(Integer.parseInt(columnVauleSet[userInformationIndex[11]]));
        userInformation.setLearningYears(columnVauleSet[userInformationIndex[12]]);
        userInformation.setLearningMonths(columnVauleSet[userInformationIndex[13]]);
        userInformation.setWisconsinNumberOfCorrect(Integer.parseInt(columnVauleSet[userInformationIndex[14]]));
        userInformation.setWisconsinScore(Integer.parseInt(columnVauleSet[userInformationIndex[15]]));
        userInformation.setDateOfAgreementSubmit(columnVauleSet[userInformationIndex[16]]);
        userInformation.setCollector(columnVauleSet[userInformationIndex[17]]);
        userInformationList.add(userInformation);

    }
    public void addClassInformationList(String[] columnVauleSet)
    {
        int [] classInformationIndex={0,11,12,13,14,15,16};
        ClassInformation classInformation=new ClassInformation();
        classInformation.setId(Integer.parseInt(columnVauleSet[classInformationIndex[0]]));
        classInformation.setSystemType(this.systemType);
        classInformation.setClassName(columnVauleSet[classInformationIndex[1]]);
        classInformation.setClassSchoolSystem(columnVauleSet[classInformationIndex[2]]);
        classInformation.setClassDepartment(columnVauleSet[classInformationIndex[3]]);
        classInformation.setClassGrade(columnVauleSet[classInformationIndex[4]]);
        classInformation.setClassGroup(columnVauleSet[classInformationIndex[5]]);
        classInformation.setTeacher(columnVauleSet[classInformationIndex[6]]);
        classInformationList.add(classInformation);

    }
    public void addUserSpecialExperienceList(String[] columnVauleSet)
    {
        int [] userSpecialExperienceIndex={0,20,21,22,23,24};
        UserSpecialExperience userSpecialExperience=new UserSpecialExperience();
        userSpecialExperience.setSystemType(this.systemType);
        userSpecialExperience.setId(Integer.parseInt(columnVauleSet[userSpecialExperienceIndex[0]]));
        userSpecialExperience.setMotherTongue(columnVauleSet[userSpecialExperienceIndex[1]]);
        userSpecialExperience.setSpecialExeperience(columnVauleSet[userSpecialExperienceIndex[2]]);
        userSpecialExperience.setSpanishRelatedResident(columnVauleSet[userSpecialExperienceIndex[3]]);
        userSpecialExperience.setSpanishRelatedExchange(columnVauleSet[userSpecialExperienceIndex[4]]);
        userSpecialExperience.setSpanishDepartmentExchange(columnVauleSet[userSpecialExperienceIndex[5]]);
        userSpecialExperienceList.add(userSpecialExperience);

    }

}
