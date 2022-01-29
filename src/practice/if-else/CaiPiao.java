/**
 * @author Tong.M
 * @version V1.0 @Description 假设你想开发一个 玩彩票的游戏，程序随机地产生两位数的彩票 ，提示用户输入 一个两位数，然后按照下面的规则判定用户是否能赢。 1)
 *     如果用户输入的数匹配彩票实际顺序，奖金 10 000 美元。 2) 如果用户输入的所有数字匹配彩票，但顺序不一致奖金 3 000 美元。 3)
 *     如果用户输入的一个数字仅满足顺序情况下匹配彩票，奖金 1 000美元。 4) 如果用户输入的一个数字仅满足非顺序情况下匹配彩票，奖金 500 美元。 5)
 *     如果用户输入的数字没有匹配任何一个，则彩票作废 。 提示 ：使用 (int)(Math.random() * 90 + 10) 程序流控制： if -else
 *     else结构 @Package PACKAGE_NAME
 * @date 2022-01-28 2:08 p.m.
 */
public class CaiPiao {
  public static void main(String[] args) {
    //
    int caiPiao = (int) (Math.random() * 90 + 10);

    int caiPiao_2 = caiPiao % 10;
//    System.out.println("caiPiao2:"+caiPiao_2);
    int caiPiao_1 = (caiPiao - caiPiao_2) / 10;
//    System.out.println("caiPiao1:"+caiPiao_1);
    System.out.println("请输入一个两位数字");
    int buyerTicket = ReadKeyboard.readNumber();
    int buyerTicket_2 = buyerTicket % 10;
//    System.out.println("ticket:"+buyerTicket_2);
    int buyerTicket_1 = (buyerTicket - buyerTicket_2) / 10;
//    System.out.println("ticket:"+buyerTicket_1);
    String flag = "";
    /*思路
    判断第一个数字是否相同，不同则判断第二个；之后重复判断第二个；
    根据结果选择对应的奖项
    * */

    if (buyerTicket_1 == caiPiao_1) {
      flag = flag + 2;
    } else if (buyerTicket_1 == caiPiao_2) {
      flag = flag + 1;
    } else {
      flag = flag + 0;
    }
    if (buyerTicket_2 == caiPiao_2) {
      flag = flag + 2;
    } else if (buyerTicket_2 == caiPiao_1) {
      flag = flag + 1;
    } else {
      flag = flag + 0;
    }
    System.out.println("彩票号码是:  " + caiPiao);
    if (flag.equals("22")) {
      System.out.println("您获得奖金 10 000 美元");
    } else if (flag.equals("21") || flag.equals("20") || flag.equals("02") || flag.equals("12")) {
      System.out.println("您获得奖金 1 000 美元");
    } else if (flag.equals("11")) {
      System.out.println("您获得奖金 3 000 美元");
    } else if (flag.equals("10") || flag.equals("01")) {
      System.out.println("您获得奖金 500 美元");
    } else {
      System.out.println("您未中奖");
    }
  }
}
