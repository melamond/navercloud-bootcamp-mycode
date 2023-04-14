package example.encap.good;

public class MyBirthday {
    /*
    은닉시 변수는 무조건 private
     */
    private int year;
    private int month;
    private int day;
    // alt shift s -> sourcce -> generate constructor using fields (이클립스기준)
    // 인텔리제이는 alt insert
    // 로 필드값을 이용해 생성자를 간단히 만들수 있음
    public MyBirthday(int year, int month, int day) { // 생성자 내에서 setter 사용가능
        setYear(year);
        setMonth(month);
        setDay(day);
    }
    /*
    public MyBirthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    */

    void showDateInfo(){
        System.out.println("내 생일은");
        System.out.println(year + "년");
        System.out.println(month + "월");
        System.out.println(day + "일");
    }

    /*
    은닉된 변수에 접근하기 위해서는
    클래스 설계시 미리 설정해둔 setter/getter 메소드를
    이용해 데이터에 접근해야 합니다
     */

    /*
    -setter 메서드 선언
    1. setter 는 은닉변수에 값을 저장(세팅)하기 위해 선언
    2. 메소드의 접근 제한자는 public 으로 설정하고
    이름은 일반적으로 set+변수명으로 지정
     */

    public void setDay(int Day){
        if(day < 1 || day > 31){
            this.day = 1; // 잘못 들어온 수에 대한 처리는 각자 임의로... (여기서는 1로 고정)
        }else {
            this.day = day;
        }
    }

    /*
    -getter 메소드 선언
    1. getter 는 말 그대로 수를 get 하는 용도
    2. 값을 조회만 할 수 있고 변경은 불가능 하기 때문에 직접조회보다 보안성을 높여준다
    3. 이름은 마찬가지로 get+변수명을 사용해 만든다
     */
    public int getDay() {
        return this.day;
    }

    // year, month 도 만들기
    public void setMonth(int month){
        if (month < 1 || month > 12){
            this.month = 1; // 아니면 Math.abs(month % 12); ?
        } else {
            this.month = month;
        }
    }

    public int getMonth(){
        return this.month;
    }

    public void setYear(int year){
        if(year > 2023){
            this.year = 2023;
        } else if (year < 0) {
            this.year = -year;
        } else {
            this.year = year;
        }
    }

    public int getYear() {
        return this.year;
    }
}
