package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    //첫 번째 방법 : Bean의 타입을 기준으로 연결하지만, Food타입의 빈이 두 개 이상일 경우에는 필드의 이름으로 찾는다.
//    @Autowired
//    Food pizza;
//
//    @Autowired
//    Food chicken;

    //2. 우선 호출할 객체에 @Primary를 지정해준다.
    @Autowired
    @Qualifier("pizza") //3. Qualifer로 지정한 별칭을 동일하게 지정해준다.
    Food food;

    @Test
    @DisplayName("테스트") //Qualifer가 우선순위가 더 높지만 반드시 명시해야 하는 단점이 있다. 같은 타입의 빈이 여러 개 있을때
    //범용적으로 사용될때에는 Primary , 지엽적으로 사용될때에는 Qualifer를 사용한다.
    void test1() {
        food.eat();
    }
}
