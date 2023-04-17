package final_.field;

public class Collector {

    // 참조형 변수를 가진 배열의 경우 배열 자체의 주소는 final이지만
    // 배열 내부 자료까지 불변함을 보장하지는 않는다.
    final String[] stickers = {"피카츄", "꼬부기", "미뇽"};
}
