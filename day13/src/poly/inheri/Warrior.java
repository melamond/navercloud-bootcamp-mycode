package poly.inheri;

public class Warrior {
	// 정보은닉 적용
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;

	public Warrior(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 3;
		this.def = 1;
		this.exp = 0;
	}

	public void showStatus() {
		System.out.println("아이디 : " + this.id);
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("획득경험치 : " + this.exp);
		System.out.println("-----------------------");
	}

	// 파라미터로 모든 몬스터의 부모인 Monster를 선언하면
	// 다형성 원리에 의해서 상속받은 모든 몬스터가 대입 가능합니다.
	public void hunt(Monster monster) {
		// 죽은 몬스터는 교전 불가 및 종료
		if(monster.isInactive()) {
			showMonsterAlreadyDeadMessage(monster.getName());
			return;
		}
		if(monster.isInactiveAfterNextAttacked(this.atk)) {
			// 몬스터가 다음공격에 죽으면 플레이어에게 경험치 부여
			monster.setAfterAttackedHp(this.atk);
			showMonsterNowDeadMessage(monster.getName());
			gainMonsterExp(monster.getExp());
		} else {
			// 몬스터가 다음 공격에 죽지는 않으면 반격해 플레이어 체력 차감
			monster.setAfterAttackedHp(this.atk);
			setHpAfterMonsterAttack(monster.getAtk());
			showMonsterCounterAttackMessage(monster.getName());
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	// 그냥 Warrior 내부에서 적어도 되지만 코드흐름을
	// 메서드 호출로만 제어하기 위한 분리
	public void gainMonsterExp(int monsterExp){
		this.exp += monsterExp;
	}

	public void setHpAfterMonsterAttack(int monsterAttack){
		if(monsterAttack == 0){ // 공격력이 0 이면
			return;
		} else if (monsterAttack > 0 && monsterAttack - this.def <= 0) { // 공격력이 양수이나 방어력으로 상쇄될때
			this.hp--;
		} else {
			this.hp -= (monsterAttack - this.def);
		}
	}

	public void showMonsterAlreadyDeadMessage(String monsterName){
		System.out.println("이 " + monsterName+" 은(는) 이미 죽어서 교전할 수 없습니다.");
	}

	public void showMonsterNowDeadMessage(String monsterName){
		System.out.println(monsterName+" 이(가) 죽었습니다.");
	}

	public void showMonsterCounterAttackMessage(String monsterName){
		System.out.println(monsterName+" 이(가) 반격했습니다.");
	}
/*
	public void setMonsterCounterAttackDamage(int monsterAttack){
		if(monsterAttack == 0){ // 공격력이 0 이면
			return;
		} else if (monsterAttack > 0 && monsterAttack - this.def <= 0) { // 공격력이 양수이나 방어력으로 상쇄될때
			this.hp--;
		} else {
			this.hp -= (monsterAttack - this.def);
		}
	}

 */
}



