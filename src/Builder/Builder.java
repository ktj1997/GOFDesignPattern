package Builder;

import java.time.LocalDate;

public class Builder {
    /*
        Builder 패턴은 Java 에서 객체를 생성할 때 흔히 사용되는 패턴
        코드를 읽고쓰거나 유지보수 할 때 편리하다.

        생성자가 많다면 Builder패턴을 적용하라
     */

    public static void main(String[] args) {
        Person p1 = Person.builder()
                .firstName("kim")
                .lastName("taejun")
                .addressTwo("경기도")
                .addressTwo("수원시")
                .married(false)
                .date(LocalDate.now())
                .build();

        System.out.println(p1);
    }
}
