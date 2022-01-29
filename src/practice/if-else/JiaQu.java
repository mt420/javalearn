/**
 * @author Tong.M
 * @version V1.0 @Description大家都知道，男当婚女嫁。那么方长要儿然提出 大家都知道，男当婚女嫁。那么方长要儿然提出 一定的条件： 高180cm 以上；富
 *     ：财1千万以上；帅：是。  如果这三个条件同时满足，则：“我一定要嫁给他 * 如果三个条件有为真的情况，则：“嫁吧比上不足下余。” 如果三个条件都不满足，则：“不嫁！”
 * @date 2022-01-28 3:56 p.m.
 */
public class JiaQu {
  public static void main(String[] args) {
    //
    System.out.println("身高（cm）");
    int high = ReadKeyboard.readNumber();
    System.out.println("财富值(万)");
    int wealth = ReadKeyboard.readNumber();
    System.out.println("帅否(Y/N)");
    char shuai = ReadKeyboard.readConfirmSelection();
    //    int flag=0;
    if (high > 180 && wealth > 1000 && shuai == 'Y') {
      System.out.println("我一定要嫁给他");
    } else if (high > 180 || wealth > 1000 || shuai == 'Y') {
      System.out.println("嫁吧比上不足下余");
    } else {
      System.out.println("不嫁！");
    }
  }
}
