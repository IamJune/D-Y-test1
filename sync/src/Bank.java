import java.text.SimpleDateFormat;
import java.util.Date;

public class Bank {
	private int count = 0;		//账户余额
	
//	操作时间
	public static String getCurrentTime(){
		String returnStr = null;
		SimpleDateFormat timef = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		returnStr = timef.format(date);
		return returnStr;
	}
//  存钱   -- 使用关键字synchronized实现同步
	public void addMoney(int money){
		synchronized (this) {
			count += money;
		}
		System.out.println(getCurrentTime() + "存进：" + money);
	}
	
//	取钱   -- 使用关键字synchronized实现同步
	public void subMoney(int money){
		synchronized (this) {
			if(count - money < 0){
				System.out.println("余额不足");
				return;
			}
			count -= money;
		}
	
		System.out.println(getCurrentTime() + "取出：" + money);
	}
//	查询
	public void lookMoney(){
		System.out.println(getCurrentTime() + "账户余额：" + count);
	}
}
