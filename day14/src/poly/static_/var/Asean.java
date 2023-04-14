package poly.static_.var;

public class Asean {
    // Asean 팀의 조별과제
    // 출석 20 발표 30 기말 50
    // 개인만의 점수
    private String name;
    private int attendanceScore;
    private int finalTermScore;

    // 발표는 조별과제 4명
    // 모두가 똑같은 점수
    public static int presentationScore; // 29점

    public Asean(String name, int attendanceScore, int finalTermScore){
        this.name = name;
        this.attendanceScore = attendanceScore;
        this.finalTermScore = finalTermScore;
    }

    // 스태틱 블록 내부 코드는 프로그램 시작시 즉시 자동으로 한번 호출
    static {
        presentationScore = 29;
    }

    public void showStudentScore() {
        System.out.println("학생명 : " + this.name);
        System.out.println("출석점수 : " + this.attendanceScore);
        System.out.println("팀점수 : " + presentationScore);
        System.out.println("기말점수 : " + this.finalTermScore);
        System.out.println("최종성적 : " + (attendanceScore +
                presentationScore + finalTermScore));
        System.out.println("-----------");
    }
}
