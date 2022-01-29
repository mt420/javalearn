/**
 * @author Tong.M
 * @version V1.0 @Description 从键盘分别输入年、月日，判断这一天是当的 第几天 注：
 *     判断一年是否闰的标准注： 判断一年是否闰的标准1）可以被 4整除，但不可被 100 整除 或 2）可以被 400
 *     @Package
 *     PACKAGE_NAME
 * @date 2022-01-28 4:10 p.m.
 */
public class DateCount {
  public static void main(String[] args) {
    //
    System.out.println("请输入年份");
    int year=ReadKeyboard.readNumber();
    System.out.println("请输入月份");
    int month=ReadKeyboard.readNumber();
    System.out.println("请输入日期");
    int day=ReadKeyboard.readNumber();
    int day_Count=0;
    switch (month){
        case 12:day_Count+=30;
        case 11:day_Count+=31;
        case 10:day_Count+=30;
        case 9:day_Count+=31;
        case 8:day_Count+=31;
        case 7:day_Count+=30;
        case 6:day_Count+=31;
        case 5:day_Count+=30;
        case 4:day_Count+=30;
        case 3:if((year%400)==0||((year%4)==0&&(year%100)!=0)) {day_Count+=29;}else {day_Count+=28;};
        case 2:day_Count+=31;
        case 1:day_Count+=31;
    }
    System.out.println("这是当年的第  "+day_Count+" 天");
  }
}
