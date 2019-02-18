
public class Test {
    public static void main(String[] args) {
        String str = "\"12313213\"";
        System.out.println(str.replaceAll("\"", ""));

        String str1 = "文筆~不好:hff測試。 也不太會，下標;題.請見,諒?嗎哈？哈!fdsfasdf...>  <?靠邀**/-+dfdsfasdfs\"test";
        str1 = str1.replaceAll("。|\\.|\\?|？|!|;|,|，|:|~", "\n");

        System.out.println(str1.replaceAll( "[\\pP+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]" , ""));
    }
}
