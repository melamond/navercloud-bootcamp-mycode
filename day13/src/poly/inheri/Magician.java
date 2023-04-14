package poly.inheri;

public class Magician {
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;

	public Magician(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 2;
		this.def = 0;
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

	public void castFireBall(Monster monster){
		if(monster.isInactive()) {
			showMonsterAlreadyDeadMessage(monster.getName());
			return;
		}
		if(monster.isInactiveAfterNextAttacked(castFireBallDamage())) {
			// 몬스터가 다음공격에 죽으면 플레이어에게 경험치 부여
			monster.setAfterAttackedHp(castFireBallDamage());
			showMonsterNowDeadMessage(monster.getName());
			gainMonsterExp(monster.getExp());
		} else {
			// 몬스터가 다음 공격에 죽지는 않으면 반격해 플레이어 체력 차감
			monster.setAfterAttackedHp(castFireBallDamage());
			setHpAfterMonsterAttack(monster.getAtk());
			showMonsterCounterAttackMessage(monster.getName());
		}
	}

	public int castFireBallDamage(){ // 파이어볼 스킬 데미지는 공격력의 2배
		return this.atk * 2;
	}
}



