package CEATEDataTool;

import CEATEDataToolModel.*;
import util.IOManager;

/**
 * Created by roye on 2017/5/16.
 */
public class CoateUserInformationLoader extends  UserInformationLoader {
    private IOManager io;
    public CoateUserInformationLoader()
    {
        super();
        io=new IOManager();
    }
    /*
    public void addUserInformationDateList(String []columnValueSet)
    {
        addArticleInformationList(columnValueSet);
        addClassInformationList(columnValueSet);
        addUserInformationList(columnValueSet);
        addUserSpecialExperienceList(columnValueSet);
        size+=1;
    }*/
    public void addArticleInformationList(String[] columnValueSet)
    {
        int [] articleInformationIndex={0,29,30,32,33,34,35,36,37,38,39};
        CoateArticleInformation articleInformation=new CoateArticleInformation();
        articleInformation.setId(Integer.parseInt(columnValueSet[articleInformationIndex[0]]));
        articleInformation.setSystemType(this.systemType);
        articleInformation.setSubmittedYear(columnValueSet[articleInformationIndex[1]]);
        articleInformation.setSubmittedMonth(columnValueSet[articleInformationIndex[2]]);
        articleInformation.setHaveSubmitted(columnValueSet[articleInformationIndex[3]]);
        articleInformation.setWrittingLocation(columnValueSet[articleInformationIndex[4]]);
        articleInformation.setArticleStyle(columnValueSet[articleInformationIndex[5]]);
        articleInformation.setArticleTopic(columnValueSet[articleInformationIndex[6]]);
        // COATE 36 column(article title), must to remove "
        articleInformation.setArticleTitle(columnValueSet[articleInformationIndex[7]].replaceAll("\"", ""));
        articleInformation.setNumberOfWords(columnValueSet[articleInformationIndex[8]]);
        articleInformation.setLongMin(columnValueSet[articleInformationIndex[9]]);
        articleInformation.setLongSeg(columnValueSet[articleInformationIndex[10]]);
        articleInformationList.add(articleInformation);

    }
    public void addUserInformationList(String[] columnVauleSet)
    {
        for (int i=0; i < columnVauleSet.length; i++) {
            System.out.println(columnVauleSet[i]);
        }
        int [] userInformationIndex={0,1,2,3,4,5,6,7,8,9,10,17,18,19,25,26,27,28,31};
        CoateUserInformation userInformation=new CoateUserInformation();
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
        userInformation.setLevel(Integer.parseInt(columnVauleSet[userInformationIndex[16]]));
        userInformation.setDateOfAgreementSubmit(columnVauleSet[userInformationIndex[17]]);
        userInformation.setCollector(columnVauleSet[userInformationIndex[18]]);
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
        userSpecialExperience.setId(Integer.parseInt(columnVauleSet[userSpecialExperienceIndex[0]]));
        userSpecialExperience.setSystemType(this.systemType);
        userSpecialExperience.setMotherTongue(columnVauleSet[userSpecialExperienceIndex[1]]);
        userSpecialExperience.setSpecialExeperience(columnVauleSet[userSpecialExperienceIndex[2]]);
        userSpecialExperience.setSpanishRelatedResident(columnVauleSet[userSpecialExperienceIndex[3]]);
        userSpecialExperience.setSpanishRelatedExchange(columnVauleSet[userSpecialExperienceIndex[4]]);
        userSpecialExperience.setSpanishDepartmentExchange(columnVauleSet[userSpecialExperienceIndex[5]]);
        userSpecialExperienceList.add(userSpecialExperience);

    }

}
