package poly.inheri;

public class Monster {
	
	// 모든 몬스터 클래스의 부모로 설계
	private String name; // 온갖 타입을 다 받을 수 있는 다형성 특성상 몬스터 종류 식별용
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	// 부모쪽 생성자로 초기화할때 어떤 몬스터가 생성될지 사전에 알 수 없으므로
	// 고정값이 아닌 입력자료를 받아 처리해야 하기 때문
	public Monster(String name, int hp, int atk, int def, int exp) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	// 연산이나 값 추가 설정등을 하는 게터 세터도 가능
	// 몬스터 사망 여부 판단
	public boolean isInactive() { // 비활성화 상태인가
		return this.hp > 0 ? false : true ; // 체력이 0보다 크면 false(활성화) 아니면 true(비활성화)
	}

	// 다음 공격에 몬스터가 죽는지 판단
	public boolean isInactiveAfterNextAttacked(int userAtk){ // 모험가의 공격력 받아오기
		return this.hp - (userAtk - this.def) > 0 ? false : true; // 남은 HP가 0보다 많으면 false(활성화)
	}

	// setter는 대부분 void 리턴자료형
	public void setAfterAttackedHp(int atk){ // 공격 당한 뒤의 몬스터의 체력
		//monster.setHp(monster.getHp() - (this.atk - monster.getDef()));
		this.hp -= (atk - this.def);
	}
}
