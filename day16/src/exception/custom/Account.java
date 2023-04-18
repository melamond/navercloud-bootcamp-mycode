package exception.custom;

public class Account {
    private long balance;
    public long getBalance(){
        return this.balance;
    }

    public void deposit(int money) throws DepositMinusMoneyException{
        if(money < 0){
            throw new DepositMinusMoneyException("1원 미만의 금액을 입금할 수 없습니다");
        }
        this.balance += money;
    }

    public void withDraw(int money) throws BalanceInsufficientException{
        if(this.balance < money){
            throw new BalanceInsufficientException("잔고 부족");
        }
        this.balance -= money;
    }
}
