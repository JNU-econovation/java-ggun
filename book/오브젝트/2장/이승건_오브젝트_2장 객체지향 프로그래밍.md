# 2장 : 객체지향 프로그래밍

# ✅영화 예매 시스템

### 영화 예매 시스템 요구사항들

- 사용자는 영화 예매 시스템을 이용해 쉽고 빠르게 보고 싶은 영화를 예매할 수 있다.
    - 영화 → 영화에 대한 기본 정보
    - 상영 → 실제로 관객들이 영화를 관람하는 사건(상영 일자, 시간, 순번)
- 특정한 조건을 만족하는 예매자는 요금을 할인받을 수 있다. 단 영화별로 하나의 할인 정책만 할당할 수 있다. 그러나 할인 조건은 다수의 할인 조건을 함께 지정할 수 있다.
    - 할인 조건 → 가격의 할인 여부 결정
        - 순서 조건 : 상영 순번을 이용해 할인 여부 결정
        - 기간 조건 : 영화 시작 시간이 해당 기간 안에 포함될 경우 요금을 할인
    - 할인 정책 → 할인 요금을 결정
        - 금액 할인 정책 : 예매 요금에서 일정 금액을 할인
        - 비율 할인 정책 : 정가에서 일정 비율의 요금을 할인
- 할인을 적용하기 위해서 할인 조건과 할인 정책을 함께 조합해서 사용한다.
    - 먼저 사용자의 예매 정보가 할인 조건 중 하나라도 만족하는지 검사하고, 만족할 경우 할인 정책을 이용해 할인 요금을 계산한다.
    - 할인 정책은 적용되었으나 할인 조건을 만족못하면 요금을 할인하지 않는다.

![2.JPG](2%E1%84%8C%E1%85%A1%E1%86%BC%20%E1%84%80%E1%85%A2%E1%86%A8%E1%84%8E%E1%85%A6%E1%84%8C%E1%85%B5%E1%84%92%E1%85%A3%E1%86%BC%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20d315814bc8c848eb938acc725d511ff2/2.jpg)

# ✅객체지향 프로그래밍을 향해

### 협력, 객체, 클래스

- 객체지향은 객체를 지향하는 것이다.
    - 혹시 객체지향 프로그램을 작성할 때 가장 먼저 고려하는 것이 어떤 클래스가 필요할지 고민하지는 않는가? 이는 객체지향의 본질과는 거리가 멀다. 객체지향은 말 그대로 객체를 지향하는 것이다.

1. 어떤 클래스가 필요한지를 고민하기 전에 어떤 객체들이 필요한지 고민하라.
    1. 클래스의 윤곽을 잡기 위해서는 어떤 객체들이 어떤 상태와 행동을 가지는지 먼저 결정해야 한다.
    2. 🤓 : 어떤 객체들이 필요한지 정확히 어떻게 생각하지?? → 3장 참고
2. 객체를 독립적인 존재가 아니라 기능을 구현하기 위해 협력하는 공동체의 일원으로 봐야 한다.

<aside>
😎 훌륭한 협력이 훌륭한 객체를 낳고
훌륭한 객체가 훌륭한 클래스를 낳는다.

</aside>

### 도메인의 구조를 따르는 프로그램 구조

- 🤓 : 어떤 객체들이 필요한지 정확히 어떻게 생각하지??에 대한 답이 여기 나온다.
    - 요구사항을 분석하는 단계부터 프로그램을 구현하는 마지막 단계까지 도메인의 개념들을 프로그램의 객체라는 개념과 동일하게 볼 수 있다. 즉 어떤 객체들이 필요한지를 어떤 도메인들이 있는지로 연결하면 된다.
    - 요구사항과 프로그램을 객체라는 동일한 관점에서 바라볼 수 있기 때문에 도메인을 구성하는 개념들이 프로그램의 객체와 클래스로 매끄럽게 연결될 수 있다.

<aside>
😎 Q : 어떤 협력이 필요한지와 어떤 객체들이 필요한지 어떻게 알수있을까?

A : 도메인을 설계하고, 도메인의 관계를 통해 협력 관계를 알 수 있고, 도메인을 통해 어떤 객체가 필요한지 알 수 있다.

</aside>

- 일반적으로 클래스의 이름은 대응되는 도메인 개념의 이름과 동일하거나 적어도 유사하게 지어야한다. 클래스 사이의 관계 또한 최대한 도메인 개념 사이에 맺어진 관계와 유사하게 만들어서 프로그램의 구조를 이해하고 예상하기 쉽게 만들어야 한다.

![3.JPG](2%E1%84%8C%E1%85%A1%E1%86%BC%20%E1%84%80%E1%85%A2%E1%86%A8%E1%84%8E%E1%85%A6%E1%84%8C%E1%85%B5%E1%84%92%E1%85%A3%E1%86%BC%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20d315814bc8c848eb938acc725d511ff2/3.jpg)

![4.JPG](2%E1%84%8C%E1%85%A1%E1%86%BC%20%E1%84%80%E1%85%A2%E1%86%A8%E1%84%8E%E1%85%A6%E1%84%8C%E1%85%B5%E1%84%92%E1%85%A3%E1%86%BC%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20d315814bc8c848eb938acc725d511ff2/4.jpg)

### 클래스 구현하기

- 위에서 도메인 개념들의 구조를 반영하여서 적절한 클래스 구조를 만들었다면 이제 적절한 프로그래밍 언어를 이용해 이 구조를 구현하는 것이다.

```java
public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }
}
```

- 사용자들이 예매하는 대상인 ‘상영’을 구현
- 영화, 순번, 상영 시작 시간을 인스턴스 변수로 포함
- 중요한 점은 인스턴스 변수의 가시성은 private이고, 메서드의 가시성은 public이라는 것이다.
    - 클래스를 구현할 때 가장 중요한 것은 클래스의 경계를 구분 짓는 것이다.

### 자율적인 객체

- 객체에게 원하는 것을 요청하고는 객체가 스스로 최선의 방법을 결정할 수 있을 것이라는 점을 믿고 기다려야 한다.

<aside>
😎 훌륭한 객체지향 프로그램을 만들기 위해 따라야 하는 핵심 원칙 → 객체의 상태는 숨기고 행동만 외부에 공개하라

**인터페이스와 구현의 분리**

객체의 명확성이 객체의 자율성을 보장하며, 프로그래머에게 구현의 자유를 제공한다.

</aside>

인터페이스와 구현의 분리

- 퍼블릭 인터페이스 → 외부에서 접근 가능한 부분 ex) public
- 구현 → 외부에서 접근 불가능하고, 오직 내부에서만 접근 가능한 부분으로 구현 ex) private, protected

### 프로그래머의 자유

- 프로그래머의 역할을 **클래스 작성자**와 **클라이언트 프로그래머**로 구분하자.
    - **클래스 작성자 →** 새로운 데이터 타입을 프로그램에 추가한다.
        - 클라이언트 프로그래머에게 필요한 부분만 공개하고, 나머지는 꽁꽁 숨겨야 한다.
            - **구현 은닉** : 그래야 외부 접근으로 인한 코드 변경을 걱정하지 않고, 내부 구현을 마음대로 변경할 수있다.
    
    - **클라이언트 프로그래머** → 필요한 클래스들을 엮어서 애플리케이션을 빠르고 안정적으로 구축하는 것
    

### 협력하는 객체들의 공동체

```java
public Reservation reserve(Customer customer, int audienceCount) {
    return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
}
```

- Screening 클래스 내의 예매하는 기능을 구현한 메서드이다.

```java
public Money calculateFee(int audienceCount) {
    return movie.calcurateMovieFee(this).times(audienceCount);
}
```

- Screening 클래스 내의 요금을 계산해서 Reservation 객체를 만드는데 사용하는 메서드

```java
public class Money {
    // final은 값이 바뀌지 않고, static은 메모리 주소가 딱 한번 할당된다.
    // 어차피 값 안바뀔꺼, 메모리 주소를 할당하는게 낫지 않겠나? -> 같이 쓰이는 이유
    public static final MoneyZERO= Money.wons(0);

    // BigDecimal은 돈과 소수점을 다룬다면 필수로 선택해야할 자료형
    private final BigDecimal amount;

    public static Money wons(long amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public static Money wons(double amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    Money(BigDecimal amount) {
        this.amount = amount;
    }

    public Money plus(Money amount) {
        // BigDecimal 타입의 사칙 연산은 메서드를 이용해야 한다.
        // 입력으로 받은 돈을 현재 돈에 더해준다.
        return new Money(this.amount.add(amount.amount));
    }

    public Money minus(Money amount) {
        return new Money(this.amount.subtract(amount.amount));
    }

    public Money times(double percent) {
        return new Money(this.amount.multiply(
                BigDecimal.valueOf(percent)));
    }

    public boolean isLessThan(Money other) {
        return amount.compareTo(other.amount) < 0;
    }

    public boolean isGreaterThanOrEqual(Money other) {
        return amount.compareTo(other.amount) >= 0;
    }
}
```

- 금액과 관련된 다양한 계산을 구현하는 간단한 클래스이다.

- 1장에서는 금액을 구현하기 위해 Long 타입을 사용했지만, 위 코드에서는 Money 객체 타입을 사용한 이유
    - Long 타입은 Money 타입처럼 저장하는 값이 금액과 관련돼 있다는 의미를 전달할 수 없고,금액과 관련된 로직이 서로 다른 곳에 중복되어 구현되는 것을 막을 수 없다.
    - 🤓 : 프로젝트간 Date 클래스를 만들어서 Date 타입을 만들지 않았다면 모든 엔티티에 Date 로직을 넣어줬어야 할 거야 ㅎㄷㄷ…

<aside>
😎 객체지향의 장점은 객체를 이용해 도메인의 의미를 풍부하게 표현할 수 있다는 것이다.
따라서 의미를  좀 더 명시적이고, 분명하게 표현할 수 있다면 객체를 사용해서 해당 개념을 구현하라.

객체 타입을 사용하자. 작아보이지만 개념을 명시적으로 표현하는 것은 전체적인 설계의 명확성과 유연성을 높이는 첫걸음이다.

</aside>

```java
public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}
```

- 영화를 예매하기 위한 클래스이다
- 고객, 상영정보, 예매 요금, 인원수가 속성으로 포함된다.

![5.JPG](2%E1%84%8C%E1%85%A1%E1%86%BC%20%E1%84%80%E1%85%A2%E1%86%A8%E1%84%8E%E1%85%A6%E1%84%8C%E1%85%B5%E1%84%92%E1%85%A3%E1%86%BC%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20d315814bc8c848eb938acc725d511ff2/5.jpg)

- 위의 흐름은 다음과 같다.
    1. Screening `reserve()`에서 인자로 Customer, count를  받는다.
    2. `reserve()`에서 Reservation 객체를 생성해주기 위해, Screening 내의 요금을 계산하는 `calcurateFee()`를 호출한다. `calcurateFee()` 는 Money의 `calculateMovieFee()` 를 호출한다.
    3. Money의 `calculateMovieFee()` 는 1인당 예매 요금을 반환해준다.
    4. `calcurateFee()` 는 `calculateMovieFee()` 로부터 반환받은 1인당 예매 요금에 인원수를 곱해서 최종 요금을 Reservation 생성자에 넘겨준다.

- 영화를 예매하기 위해서 Screening, Moview, Reservation 인스턴스들은 서로의 메서드를 호출하며 상호작용한다.
    - 이처럼 시스템의 어떤 기능을 구현하기 위해 객체들 사이에 이뤄지는 상호작용을 **협력**이라고 부른다.
    - 🤓 : 아니 그러면 의존성이 생기는거 아니에요??
        - 아니지. 캡슐화를 통해서 인터페이스로 사용을 하잖아
    
- 객체지향 프로그램을 작성할 때는 먼저 협력의 관점에서 어떤 객체가 필요한지를 결정하고, 객체들의 공통 상태와 행위를 구현하기 위해서 클래스를 작성해야한다.
    - 🤓 : 협력의 관점에서 어떻게 생각할 수 있을까??
        - 도메인간에 어떻게 상호작용하는지를 보면 알 수 있지 않을까?

### 협력에 관한 짧은 이야기

- 메시지와 메서드를 구분하는 것은 매우 중요하다. 이 개념으로부터 다형성이 출발하기 때문이다.
    - 위에서 Reservation의 `calcurateFee()` 는 Money의 `calculateMovieFee()` 를 호출한다고 하였지만, 사실은 Reservation의 `calcurateFee()` 는 Money가 `calculateMovieFee` 이라는 메시지에 응답할 수 있다고 믿고, 메시지를 전달한 것이다.

# ✅할인 요금 구하기

### 할인 요금 계산을 위한 협력 시작하기

![6.JPG](2%E1%84%8C%E1%85%A1%E1%86%BC%20%E1%84%80%E1%85%A2%E1%86%A8%E1%84%8E%E1%85%A6%E1%84%8C%E1%85%B5%E1%84%92%E1%85%A3%E1%86%BC%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20d315814bc8c848eb938acc725d511ff2/6.jpg)

```java
public class Movie {
    private String title;
    private Duration runnringTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runnringTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runnringTime = runnringTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMoviewFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
```

- Movie를 구현한 클래스이다.
- 제목, 상영 시간, 영화 비용, 할인 정책등을 멤버 변수로 가지고있다.
- `calculateMoviewFee(**)`**  메서드는 영화의 비용을 할인 비용을 적용해서 반환한다.

- 만약 위 코드를 보고, 아니 할인 정책의 종류를 어떻게 알아요?라고 한다며 아직 객체지향 패러다임에 익숙하지 않은것이다.
    - 위 코드에는 객체지향에서 중요하다고 여겨지는 **상속(inheriteance)**과 **다형성**이 숨어있다.

```java
public abstract class DiscountPolicy {
    private List<DistcountConditon> conditons = new ArrayList<>();

    public DiscountPolicy(DistcountConditon ... conditons) {
        this.conditons = Arrays.asList(conditons);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for(DistcountConditon each : conditons) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening Screening);
}
```

- 위코드는 **할인정책**을 구현한 클래스이고, 이 추상 클래스를 AmountDiscountPolicy와 PercentDiscountPolicy가 상속받을 것이다.
- 멤버 변수 conditions는 여러개의 할인 조건을 가지고 있다.
- `calculateDiscountAmount()` 는 전체 할인조건에 따라 차례대로 DiscountCondition의 `isSatisfiedBy()` 메서드를 호출한다.
    - `isSatisfiedBy()` 는 인자로 받은 `Screening`이 조건을 만족하면 true, 만족 못하면 false를 반환한다.
    - 할인 조건이 하나라도 존재하면 추상 메서드인 `getDisCountAmount()` 메서드를 호출한다.
    - `getDisCountAmount()` 메서드는 할인 요금을 계산하는 메서드이다.
    - 만족하는 할인 조건이 하나도 없으면 0원을 반환한다.

- DiscountPolicy는 할인 여부와 요금 계산에 필요한 전체적인 흐름은 정의하지만 실제로 요금을 계산하는 부분은 추상 메서드인 `calculateDiscountAmount()` 에게 위임하고, DiscountPolicy를 상속받는 자식 클래스들이 오버라이딩하여서 구현할 것이다.

<aside>
😎 부모 클래스에 기본적인 알고리즘의 흐름을 구현하고, 중간에 필요한 처리를 자식 클래스에게 위임하는 디자인 패턴을 **Template Method 패턴**이라고 부른다.

</aside>

- 🤓 : 아 부모 PostService 클래스에서 기본 CRUD를 구현하고, 자식 클래스에서 더 자세한 로직을 구현할 때 사용할 수 있겠구나

```java
public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountConditon... conditons) {
        super(conditons);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
```

- 위 DiscountPolicy를 상속받은 자식 클래스이다.
- `super(conditons)` 는 부모 클래스인 DiscountPolicy의 기본 생성자에 접근하여서 인자들을 넘겨준다.

```java
public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountConditon... conditons) {
        super(conditons);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
				// times()는 bigDecimal 타입의 데이터를 곱하는 함수
        return screening.getMovieFee().times(percent);
    }
}
```

- 위 DiscountPolicy를 상속받은 자식 클래스이다.
- AmountDiscountPolicy와 다른 점이라면 고정 금액이 아닌 일정 비율을 차감한다는 것이다.

```java
public interface DiscountConditon {
    boolean isSatisfiedBy(Screening screening);
}
```

- **할인 조건**의 인터페이스이다.
- 위 인터페이스들을 이용해서 각 할인 조건들을 구현체로 구현할 것이다.

```java
public class SequenceCondition implements DiscountConditon{
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
```

- 순번 조건의 할인 여부를 판단하기 위한 구현체
- 만약 상영의 순번과 일치할 경우 할인이 가능하다 판단한다.

```java
public class PeriodConditon implements DiscountConditon {
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    @Override 
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
                startTime.compareTo(screening.getStartTime().toLocalTime()) <= 0 &&
                endTime.compareTo(screening.getStartTime().toLocalTime()) >= 0;
    }
}
```

- 기간 조건을 판단하는 구현체
- 인자로 전달된 Screening의 상영 요일이 dayOfWeek과 같고, 상영 시작 시간이 startTime과 endTime 사이에 있을 경우 true를 반환

- 하나의 영화에 대해 단 하나의 할인 정책만 설정할 수 있지만, 할인 조건의 경우에는 여러개를 적용할 수 있다는 것을 기억하자.
    - Movie 생성자의 파라미터 목록을 이용해 초기화에 필요한 정보를 전달하도록 강제하면, 올바른 상태를 가진 객체의 생성을 보장할 수 있다.

```java
public Movie(String title, Duration runnringTime, Money fee, DiscountPolicy discountPolicy) {
... }
```

# ✅상속과 다형성

- Movie 클래스 어디에서도 할인 정책이 금액 할인 정책인지, 비율 할인 정책인지를 판단하지 않는다. 그러면 어떻게 정책을 선택할 수 있을까??
    - 상속과 다형성을 이용해 특정한 조건을 선택적을 실행하는 방법을 알아보자.

```java
public Movie(String title, Duration runnringTime, Money fee, DiscountPolicy discountPolicy) {
... }
```

- Movie의 생성자는 DiscountPolicy 타입의 객체를 인자로 받는다.
    - AmountDiscountPolicy나 PercentDiscountPolicy는 DiscountPolicy를 상속받기 때문에 Movie 객체를 생성할 때 AmountDiscountPolicy나 PercentDiscountPolicy의 인스턴스를 대신 전달함으로써 할인 정책을 선택할 수 있다.
        - 금액 할인 정책을 사용하고 싶으면 AmountDiscountPolicy 인스턴스를 전달하고, 비율 할인 정책을 적용하고 싶다면 PercentDiscountPolicy 인스턴스를 전달해야한다.
    
    ![**위 사진을 통해 알 수 있듯이 자식 클래스는 부모 클래스의 타입을 물려받는다**](2%E1%84%8C%E1%85%A1%E1%86%BC%20%E1%84%80%E1%85%A2%E1%86%A8%E1%84%8E%E1%85%A6%E1%84%8C%E1%85%B5%E1%84%92%E1%85%A3%E1%86%BC%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%80%E1%85%B3%E1%84%85%E1%85%A2%E1%84%86%E1%85%B5%E1%86%BC%20d315814bc8c848eb938acc725d511ff2/7.jpg)
    
    **위 사진을 통해 알 수 있듯이 자식 클래스는 부모 클래스의 타입을 물려받는다**
    
- 코드의 의존성과 실행 시점(객체를 생성하는 시점)의 의존성이 서로 다를 수 있다는 것이다.
    - 즉 클래스 사이의 의존성과 객체 사이의 의존성은 동일하지 않을 수 있다는 것이다.
        - Movie 클래스와 AmountDiscountPolicy, PercentDiscountPolicy 클래스는 의존성이 없지만, Movie 객체와 AmountDiscountPolicy, PercentDiscountPolicy 객체는 의존성이 있다.

- 🤓 : 그러면 Movie의 인스턴스가 어떤 객체에 의존하고 있는지를 어떻게 알 수 있나??
    - Movie 클래스에서는 의존하는 대상이 DiscountPolicy라는 것만 알 수 있다. Movie 인스턴스를 생성하는 부분을 찾아서 생성자에 전달되는 객체를 통해서 알 수 있다.

- 🤓 :  아니 알겠어 알겠어. 근데 객체지향으로 갈 수록 코드를 보고 이해하기가 오히려 너무 어려워지는데??
    - 설계가 유연해질수록 코드를 이해하고, 디버깅하기는 어려워진다. 반대로 유연성을 억제하면 코드를 이해하고, 디버깅하기는 쉬워지지만 재사용성과 확장 가능성은 낮아진다.

<aside>
😎 훌륭한 객체지향 설계자로 성장하기 위해서는 항상 유연성과 가독성 사이에서 고민해야한다. 

무조건 유연한 설계도, 무조건 읽기 쉬운 코드도 정답이 아니다. 
이것이 객체지향 설계가 어려우면서도 매력적인 이유다.

</aside>

### 상속

- 🤓 : 아니 그런데 어떻게 Movie와 DiscountPolicy의 의존성이  실행 시점에 AmountDiscountPolicy, PercentDiscountPolicy의 의존성으로 바뀔 수 있는걸까??
    - 답은 상속이다.
        - 상속이 가치 있는 이유는 부모 클래스가 제공하는 모든 인터페이스를 자식 클래스가 물려받을 수 있기 때문이다.
        - 자식 클래스는 부모 클래스가 수신할 수 있는 모든 메시지를 수신할 수 있기 때문에 외부 객체는 자식 클래스를 부모 클래스와 동일한 타입으로 간주할 수 있다.
        - 컴파일러는 코드 상에서 부모 클래스가 나오는 모든 장소에서 자식 클래스를 사용하는 것을 허용한다.
        - 그렇기에 Movie의 생성자 인자 타입이 DiscountPolicy임에도, AmountDiscountPolicy, PercentDiscountPolicy 인스턴스를 전달할 수 있는 것이다.
        - 이처럼 자식 클래스가 부모 클래스를 대신하는 것을 **업캐스팅(upcasting)**이라고 부른다.
        
- 부모 클래스를 상속해서, 부모 클래스와 다른 부분만을 추가해서 새로운 클래스를 쉽고 빠르게 만드는 방법을 **차이에 의한 프로그래밍**이라고 부른다.

### 다형성

- 메시지와 메서드는 다른 개념이다.
    - Movie는 DiscountPolicy의 인스턴스에 calculateDiscountAmount 메시지를 전송한다.
    - 이 때 실행되는 메서드는 Movie와 상호작용하기 위해 연결된 객체의 클래스에 따라 달라진다.
    - Movie와 협력하는 객체가 AmountDiscountPolicy라면 AmountDiscountPolicy에서 오버라이딩한 메서드가, PercentDiscountPolicy 라면 PercentDiscountPolicy에서 오버라이딩한 메서드가 실행될 것이다.
    - Movie는 동일한 메시지를 전송하지만 실제로 어떤 메서드가 실행될 것인지는 메시지를 수신하는 객체의 클래스가 무엇이냐에 따라 달라진다. 이를 **다형성**이라 칭한다.

- 다형성 : 동일한 메시지를 수신했을 때 객체의 타입에 따라 다르게 응답할 수 있는 능력
    - 즉 객체들은 모두 수신한 메시지를 이해할 수 있어야 하기에, 인터페이스가 동일(= 같은 부모로 부터 상속)하다는 것이다.
        - ex) AmountDiscountPolicy와 PercentDiscountPolicy 가 동일한 부모를 상속받아서 같은 인터페이스를 가지게 되고, 이로 인해서 같은 메시지를 이해할 수 있게 된 것
        - 상속은 인터페이스를 통일 시켜서 다형성을 구현하는 방법중 하나이다.
    - 객체지향이 컴파일 시점의 의존성과 실행 시점의 의존성을 분리하고, 하나의 메시지를 선택적을 서로 다른 메서드에 연결할 수 있는 이유가 **지연 바인딩**이라는 메커니즘을 사용한 덕분

- 🤓 : 그러면 인터페이스와 추상 클래스를 다르게 사용하는 목적이 뭐야???
    - 추상 클래스 → 자식 클래스들이 인터페이스와 내부 구현을 함께 상속 받을 수 있게 할 때
    - 인터페이스 → 구현은 공유할 필요가 없고, 인터페이스만 공유하고 싶을 때
        - 공용 인터페이스를 자극해서 책임을 수행하게 하는 것은 객체에게 전송되는 메시지다.
        - 메시지를 따르면 최소의 인터페이스를 얻을 수 있다.
        - 쉽게 말하면 인터페이스란 **메서드 선언부**이다.

# ✅추상화와 유연성

- DiscountPolicy는 AmountDiscountPolicy와 PercentDiscountPolicy보다 더 추상적이다.
    - 그 이유는 인터페이스에 초점을 맞추기 때문이다. → DiscountPolicy는 모든 할인 정책들이 수신할 수 있도록 메시지를 정의하기 때문이다.

- 이렇게 추상화를 사용했을 때(=다형성을 구현했을 때)의 장점은 아래와 같다.,
    1. 추상화 계층(부모 클래스 or 인터페이스)만 따로 떼어 넣고 살펴보면 **요구사항의 정책을 높은 수준**에서 서술할 수 있다.
        1. ex) 아이패드로 글 쓰기가 아닌 글 쓰기가 더 상위 정책이라고 할 수 있다.
        2. 상위 정책을 기술한다는 것은 기본적인 애플리케이션의 협력 흐름을 기술한다는 것이다.
        3. 재사용 가능한 설계의 기본을 이루는 디자인 패턴이나 프레임워크 모두 추상화를 이용해서 상위 정책을 정의하는 객체지향의 매커니즘을 활용하고있다.
    2. 설계가 좀 더 **유연해진다.**
        1. 기존 구조를 수정하지 않고도 새로운 기능을 쉽게 추가하고, 확장할 수 있다.
        2. ex) 현재 할인 정책이 없는 경우에는 할인 금액이 0원이라는 사실을 결정하는 책임이 Movie에 책임이 있다. 이를 DiscountPolicy에 책임을 주기 위해서는 0원이라는 할인 요금을 계산할 책임을 NoneDiscountPolicy 클래스를 만들어 부여 하면 된다. 이로써 기존 코드를 수정 하지 않고, 애플리케이션의 기능을 확장할 수 있다. → 유연하고 확장 가능한 설계
        
        ```java
        public Movie(String title, Duration runnringTime, Money fee, DiscountPolicy discountPolicy
        ```
        

<aside>
😎 유연성이 필요한 곳에 추상화를 사용하라

유연성이란 → 기존 구조를 건드리지 않고, 새로운 기능을 쉽게 추가하고, 확장할 수 있는 것
추상화 → 추상 클래스나 인터페이스등을 사용하여 상위 정책에서 서술하는 것

</aside>

<aside>
😎 내가 작성하는 모든 코드에는 합당한 이유가 있어야 한다.

비록 아주 사소한 결정이더라도 트레이드오프를 통해 얻어진 결론과 그렇지 않는 결론 사이의 차이는 크다.

고민하고 트레이드오프하라.

</aside>

- 🤓 : 왜 DiscountPolicy에서 할인 조건이 없을 경우에는 getDiscountAmount()를 호출하지 않는다고 한걸까?
    
    ```java
    public Money calculateDiscountAmount(Screening screening) {
            for(DiscountConditon each : conditons) {
                if (each.isSatisfiedBy(screening)) {
                    return getDiscountAmount(screening);
                }
            }
            return Money.ZERO;
        }
    ```
    
    - 조건이 없을 경우 return으로 바로 빠져오기에

### 상속과 합성

- 상속의 가장 큰 문제점은 캡슐화를 위반한다는 것이다.
    - 상속을 이용하기 위해서는 자식이 부모 클래스의 내부 구조를 잘 알고 있어야 하기 때문이다.
    - 캡슐화의 약화는 자식 클래스가 부모 클래스에 강하게 결합되어서 부모가 변경되면 자식도 변경될 확률을 높인다.
- 두 번째 단점은 설계가 유연하지 않다는 것이다.
    - 상속은 실행 시점에 객체의 종류를 변경하는 것이 불가능하다.
    - 상속을 사용하면 기존 생성된 객체의 클래스를 변경할 수 없기에, 새로운 객체를 생성하고, 기존 객체의 상태를 새로운 상태에 복사 붙여 넣기 할 수 밖에 없다.

- 그러나 인스턴스 변수로 연결한 기존 방법을 사용하면 실행 시점에 할인 정책을 간단하게 바꿀 수 있다

```java
public void changeDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }
```

<aside>
😎 코드 재사용을 위해서는 상속보다는 합성이 더 좋은 방법이다.

합성 → 다른 객체의 인스턴스를 자신의 인스턴스 변수로 포함해서 재사용하는 방법
ex) Movie에서 `private DiscountPolicy discountPolicy;` 를 통해서 `discountPolicy.calculateDiscountAmount(screening)` 코드를 작성한 것이 위 설명

</aside>

- 합성은 위 상속이 가진 두 가지 문제점을 모두 해결한다.
    1. 인터페이스에 정의된 메시지를 통해서만 재사용이 가능하기에 구현을 효과적으로 캡슐화 할 수 있다.
    2. 의존하는 인스턴스를 교체하는 것이 비교적 쉽기에 설계를 유연하게 만든다.

- 🤓 : 코드를 재사용하고 싶다면, 추상 클래스를 상속하는 것보다 합성, 즉 객체를 자신의 인스턴스 변수로 가져와서 사용해라. 그게 아니라 다형성을 위한 것이면 인터페이스를 사용하라!

[레퍼런스](https://www.notion.so/2d146f71c3b842a592d3476a1199821b)