package Flyweight;

public class Flyweight {
    /*
         플라이 웨이트 패턴은 비용이 큰 자원을 곹옹으로 사용 할 수 있도록 만드는 패턴이다.
         1)중복 생성될 가능성이 높은 경우
           --> 공통자원 형태로 관리하자
         2)자원 생성 비용은 큰데, 사용빈도가 낮은 경우
           --> 미리생성해두는 것은 자원 낭비, 요청이 있을 때만 생성해서 제공하자.


        이 두가지 목적을 수행하기 위해서,
        플라이 웨이트 패턴은 자원생성과 제공을 책임진다.
        자원의 생성(Factory)와 관리는 구분하는 것이 좋을 수 있으나,
        일반적으로는 역할이 그리 다르지 않아서, 한 클래스에서 담당하도록 구현한다.

        장점: 많은 객체를 만들 때 성능을 향상 시킬 수 있다.
             많은 객체를 만들 때 메모리를 줄일 수 있다.

        단점: 특정 인스턴스의 공유 컴포넌트를 다르게 행동하게 하는 것이 불가능하다.
     */
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.getSubject("a"); //생성
        flyweightFactory.getSubject("a"); //재사용
        flyweightFactory.getSubject("b"); //생성
        flyweightFactory.getSubject("b"); //재사용
        //미리 만들어 진 것을 재사용 하는것이 플라이웨이트 패턴이다.

    }

    public static void checkStringFlyWeightPattern() {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        //1 != 2
        String str3 = "Hello";
        String str4 = "Hello";
        //3 == 4

        /*
            1과2는 새롭게 객체를 생성하는 것.
            3과4의 경우 3에서 만들어 진 객체를 4는 참조하는 형식 (플라이웨이트)
            객체의 얕은복사도 플라이웨이트이다.
         */
    }
}
