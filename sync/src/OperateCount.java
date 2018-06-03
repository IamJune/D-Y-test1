
public class OperateCount {
	public static void main(String args[]){
		final Bank bank = new Bank();
		
		Thread addM = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i < 5; i++){
					bank.addMoney(i*10);
					System.out.println("\n");
				}
				bank.lookMoney();
			}
		});
		
		Thread subM = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i < 5; i++){
					bank.subMoney(i*10);
					System.out.println("\n");
				}
				bank.lookMoney();
			}
		});
		
		addM.start();
		subM.start();
	}
}
