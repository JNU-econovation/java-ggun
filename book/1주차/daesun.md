# 1주차

# 1주차 - 객체지향의 사실과 오해

# 총정리

한 객체가 여러 역할을 수행하는 것도 가능하고, 여러 객체가 동일한 역할을 수행하는 것도 가능하다.
객체들의 역할과 책임을 적절하게 분리하는 것
객체가 책임을 수행하는 방법은 자율적이다.

객체지향 설계 방법

1. 시스템을 역할별로 분리
2. 각 역할들에게 필요한 행동들을 정리
3. 행동을 수행할 객체들을 선택 = 객체에게 역할들을 부여
- 선택할 때 객체가 내부적으로 관리해야 하는 데이터가 아니라, 객체가 외부에 제공해야 하는 행동을 먼저 생객해야한다.(책임 주도 설계)
1. 역할을 수행하는 객체들은 모여서 하나의 책임을 수행하게됨

행동이 객체를 정한다.

행동과 상태의 상호작용
상태를 활용해서, 객체의 행동방식을 정의할 수 있다.
하지만, 객체의 행동이 상태에 영향을 줄 수도 있다. -> 오직 자기 자신만이 스스로의 상태를 바꿀 수 있다.

객체를 분류하는 기준은 행동이다.

행동이 추상화의 기준이다.

객체가 수행할 행동을 구현하는 방법이 클래스이다.

캡슐화 : 객체의 메소드가 다른 객체에게 영향을 줄 수 있지만, 결국 객체 자신의 상태를 바꾸는 것은 자기 자신이어야 한다

유념할 것 : 클래스의 관점에서 벗어나 객체의 관점에서 보자, 메세지를 주고 받는 동적인 관계에 집중하라

# 1장

객체지향 패러다임의 핵심이 자율적인 객체들의 협력이다.

협력에 참여하여, 특정한 역할을 수행하려 하는 객체들은 적합한 책임을 수행하게 된다.

- 한 객체가 여러 역할을 수행하는 것도 가능하고, 여러 객체가 동일한 역할을 수행하는 것도 가능하다.
- 중요한 것은 역할과 책임을 적절하게 분리하는 것이다.
- 책임을 수행하는 방법은 여러가지이다.

### 책임

다형성 : 동일한 요청에 대해 서로 다른 방식으로 응답할 수 있는 능력

⇒ 오버라이드 된 메소드

### 역할과 책임을 수행하는데, 수행이 된다는 결과가 중요한 거지 방법은 중요하지 않다.

캡슐화 :  메소드를 호출하지만, 메소드의 코드가 어떤 식으로 작성되어있는 지 모른다.

### 객체

- 여러 객체는 동일한 역할을 수행할 수 있다. → 객체는 동일한 역할을 수행하는 다른 객체로 대체될 수 있다.
- 하나의 객체는 동시에 여러 역할을 수행할 수 있다.
- 각 객체는 책임을 수행하는 방법을 자율적으로 선택할 수 있다.

## 객체지향

- 적절한 역할과 책임을 가진 객체로 시스템을 분할한다.
- 객체에게 주어진 역할과 책임을 수행하기위해 필요한 것들을 가지고 있어야한다.
- 객체들은 각자의 역할을 수행하며 객체들이 모여 하나이상의 책임을 수행한다.

## 객체지향 설계

코드를 담는 클래스의 관점에서 메세지를 주고받는 객체의 관점으로 사고의 중심을 전환하라

메세지를 주고 받는 객체들의 동적인 관계에 집중해라

객체의 역할,책임,협력에 집중하라

# 2장

객체의 상태, 행동, 식별자의 개념

## 상태

현재 상태를 활용하면 , 객체의 행동방식을 정의할 수 있다.

상태에는 단순한 값들도 사용되지만, 같은 객체를 사용해 다른 객체의 상태를 표현해줘야 할 경우가 있다.

결론적으로 모든 객체의 상태는 단순한 값과 객체의 조합으로 표현된다.

객체의 상태를 구성하는 모든 특징을 통틀어 객체의 프로퍼티라고 한다.

객체의 프로퍼티는 단순한 값인 속성과 다른 객체를 가리키는 링크의 두가지 종류의 조합으로 표현 가능하다.

(링크는 객체가 다른 객체를 참조할 수 있다는 것을 의미한다.)

행동 : 다른 객체로 하여금 간접적으로 객체의 상태를 변경하는 것을 가능하게 한다.

객체의 행동으로 인해 발생하는 결과

- 객체 자신의 상태 변경
- 행동 내에서 협력하는 다른 객체에 대한 메세지 전송 → 다른 객체의 상태 변경 → 협력

객체의 행동으로 인해 발생하는 영향으로 다른 객체에게 메세지를 전달할 수도 있지만, 다른 객체가 상태를 변경하는 것은 그 객체의 몫이다.

⇒ 오직 자기 자신만이 스스로의 상태를 관리할 수 있다.

→ 캡슐화

객체의 프로퍼티를 변화시키는 것은 메소드를 사용할 것 , 이것이 상태를 캡슐화하는 것인 가 싶다..

### 식별자

값은 상태를 기반으로 동등성을 판단할 수 있다.

왜냐하면, 값은 오직 상태만을 가지기 때문이다.

따라서, 식별자는 필요가 없다.

객체는 시간에 따라 변경되는 상태를 포함하며, 행동을 통해 상태를 변경한다.

따라서, 객체는 상태만으로는 객체의 동일성을 판단할 수 없다.

따라서, 식별자가 필요하다.

객체지향 프로그래밍에서 숫자는 Integer 클래스로부터 생성된 객체이고, 사람도 Person클래스부터 생성된 객체이다.

값과 객체가 혼란스러울 수 있어 값 같은 경우에는 값 객체라 부르고, 객체의 경우 참조 객체 또는 엔티티라고 부른다.

### 객체지향 설계 - 행동이 상태를 결정한다.

객체지향 설계는 애플리케이션에서 필요한 협력을 생각하고 협력에 참여하는 데 필요한 행동을 생각한 후 행동을 수행할 객체를 선택하는 방식으로 수행된다.

객체의 행동을 먼저 결정하고 그 후에 행동에 적절한 상태를 선택한다.

# 3장

객체지향을 현실 세계의 추상화라고 하는데, 이는 잘못된 부분이 있다.

소프트웨어 안에서 객체는 스스로 행동할 수 있다.

예를 들어서, 실제 세계의 상품은 스스로 가격계산과 같은 행동을 수행할 수 없지만, 객체는 가능하다.

이렇듯 소프트웨어의 객체는 의인화라는 특성을 가지고 있다.

다시말해서, 현실 객체가 하지 못하는 일들을 소프트웨어의 객체는 할 수 있다.

그렇다면, 현실과 소프트웨어 사이의 관계는 어떻게 표현 할 수 있을까?

이 책에서는 은유라고 표현한다.

어떤 이유로 은유라고 표현했나 하면, 현실 속의 객체의 의미 일부가 소프트웨어의 객체로 전달되기 때문이다.

또한, 현실 객체가 하지 못하는 일을 소프트웨어 객체는 할 수 있기 때문이다.

내 생각 :

객체의 행동, 객체간의 협력에 집중하라, 객체가 할 수 있는 것은 그 객체가 가진 역할안에서의 모든 일을 할 수 있다.

추상화 : 복잡성을 단순화하기 위해서, 특정 부분을 의도적으로 생략하거나 감추는 방법

그렇다면, 추상화를 하려 할 때 어떤 점을 중심으로 생각해야할까?

- 첫 번째는 사물들 간의 공통점은 취하고, 차이점은 버리는 일반화를 통해 단순하게 만드는 것이다.
- 두 번째는 차원의 중요한 부분을 강조하기 위해 불필요한 세부사항을 제거함으로써 단순하게 만드는 것이다.

# 추상화 방법 - 일반화, 강조

### 개념

개념 : 공통점을 기반으로 객체를 묶기 위한 그릇

내 생각 : 추상화하려는 것들의 공통점을 표현하는 용어

그리고, 그 공통점을 가지지 못 하는 사물은 같은 객체로 표현할 수 없다.

### 분류

특정한 사물을 같은 공통점을 가진 것들(=객체)에 포함하거나 포함하지 않는 행위

공통점을 강조하고, 다른 특이사항은 과감히 제거함.

### 객체

개념을 이용하여, 객체를 여러 그룹으로 분류할 수 있다.

### 인스턴스

개념을 사용해서 분류된 객체의 각각의 사물들

---

### 타입

타입은 개념이다.

프로그래밍 언어 관점에서 타입을 아래와 같은 방식으로 정의하였다.

- 어떤 객체들이 동일한 행동을 수행할 수 있다면, 그 객체들은 동일한 타입이다.
- 객체의 내부적인 표현은 외부로부터 감춰진다.

결론적으로, 객체를 타입으로 분류하는 기준은 행동이다.

그 객체가 어떤 데이터를 가지고 있느냐가 아니다.

내생각 : 타입이 행동에의해 결정된다. → ‘메서드’를 기준으로 타입을 분류한다 → 인터페이스, 상속할 때도 메서드를 중심으로 생각해야 되는 건가

타입은 행동에 의해 계속해서 바뀐다.

결국에는 타입은 객체의 동적인 특성을 추상화하는 것이다.

### 객체지향 설계

외부에 행동만을 제공하고 데이터는 행동 뒤로 감춰야한다. → 캡슐화

행동에 따라 객체를 분류하기 위해서는 객체가 내부적으로 관리해야 하는 데이터가 아니라, 객체가 외부에 제공해야 하는 행동을 먼저 생각해야 한다.

책임 - 주도 설계

일반화/특수화 관계를 결정하는 것은 행동이다.

더 일반적으로 행동 → 슈퍼 타입 , 특수하게 행동 → 서브 타입

행동의 개수 : 일반 < 특수

상속할 때도 마찬가지로 행동을 중심으로 생각해야한다.

객체를 분류하는 기준은 타입이며, 타입을 나누는 기준은 객체가 수행하는 행동이다.

타입을 구현하는 방법이 클래스이다.

클래스는 타입을 구현하기 위해 프로그래밍 언어에서 제공하는 구현 메커니즘이다.

