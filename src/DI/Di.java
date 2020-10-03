package DI;

public class Di {
    /*
        강한결합과 약한결합의 차이점에대해서 이해하기
        강한결합 --> 직접 new 로 생성
        약한결합 --> 생성자, 혹은 Setter로 주입을 받음(Dependency Injection)
                    외부에서 생성된 것을 주입을 받음.
                    약한 결합의 장점은 다른 의존성있는 클래스의 변화에 보다 유연하다는 것이다.
                    내가 직접생성 할 때는 오류가 날 수 있지만, 이미 생성되어있는 것을 받아오기 때문이다.
                    즉, 변경에 민감하지않다.
                    또한, 재사용성이 증가한다.

     */
    Member m1;
    public void setM1(Member m1) {
        this.m1 = m1;
    }
}

class Member {
    String name;
    String nickName;

    public Member(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
    }
}
