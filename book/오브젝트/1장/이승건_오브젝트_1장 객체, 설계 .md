# 1장 : 객체, 설계

# ✅이 책의 목표

- 코드를 개발하는 사람들이 객체지향 패러다임이라는 용어를 사용할 때 완벽하게는 동일하지 않더라도 어느 정도 유사한 그림을 머릿속에 그릴 수 있는 기반을 제공하기 위해서
- 객체지향에 대한 다양한 오해를 제거함으로써 객체지향 프로그래밍을 하는 개발자들이 동일한 규칙과 표준에 따라 프로그램을 작성할 수 있게 할 것이다.

개발자는 코드를 통해 패러다임을 이해하고 적용할 수 있는 기술을 습득해야 한다.

현실의 패러다임은 천동설과 지동설처럼 두 패러다임이 공존하는게 말이 안되고, 과거의 패러다임을 폐기시키는 혁명적인 과정을 거치지만,  프로그래밍 패러다임은 과거의 패러다임의 단점을 보완하고 발전적인 과정을 거친다.

- 이런 사실은 객체지향 패러다임을 배우는 것이 다른 패러다임을 배우는 것이 도움이 된다는 것이다.
- 은총알은 없다.(=완벽한 것은 없다.) → 객체지향을 배운다고 해서 모든 프로그래밍을 깨우친게 아니다.

### 이론이 먼저인가 실무가 먼저인가?

*부제 : 이론이 먼저인가 코딩이 먼저인가?*

- 대부분의 사람들은 이론이 먼저 정립된 후에 실무가 그 뒤를 따라 발전한다고 생각하지만, 글래스는 어떤 분야를 막론하고, 이론을 정립할 수 없는 초기에 실무가 먼저 급속한 발전을 이룬다고 한다.
- 소프트웨어 설계와 유지보수에 중점을 두려면 이론이 아닌 실무에 초점을 맞추는 것이 효과적이다.
    - 이를 쉽게 말하면 설계나 유지보수에 관해 설명할 때 가장 유용한 도구는 이론으로 덕지덕지 치장된 개념과 용어가 아니라 ‘코드’ 그 자체이다.
    - 이론을 아는 개발자가 아닌 그 이론을 코드로 나타낼 수 있는 개발자가 되자!
    - 개발자는 구체적인 코드를 만지며 손을 더럽힐 때 가장 많은 것을 얻어가는 존재다.
    - 이 책에서는 위의 이유들을 통해서 이 책은 코드 중심으로 객체지향을 설명 할 것이라고 설명하고 있다.

# ✅티켓 판매 애플리케이션 구현하기

소극장을 운영하고 있는 사장이 관람객들의 발길이 이어지도록 작은 이벤트를 기획했다. 이벤트의 내용은 추첨을 통해서 선정된 관람객에게 공연을 무료로 관람할 수 있는 초대장을 발송하는 것이다.

해당 이벤트를 프로그램으로 구현해보자.

![0.JPG](1%E1%84%8C%E1%85%A1%E1%86%BC%20%E1%84%80%E1%85%A2%E1%86%A8%E1%84%8E%E1%85%A6,%20%E1%84%89%E1%85%A5%E1%86%AF%E1%84%80%E1%85%A8%20d76f2aa821434cccb673497b1771025c/0.jpg)

이 때 염두해야할 점

- 이벤트에 당첨된 관람객과 그렇지 못한 관람객은 다른 방식으로 입장시켜야 한다.
    - 이벤트에 당첨된 관람객은 초대장으로 티켓을 교환한 후 입장할 수 있다.
    - 이벤트에 당첨되지 못한 관람객은 티켓을 구매해야만 입장할 수 있다.
- 즉 관람객을 입장시키기 전 이벤트 당첨 여부를 확인해야하고, 당첨자가 아니면 티켓을 판매 시킨 후 입장시켜야 한다.

```java
public class Invitaion {
    private LocalDateTime when;
}
```

- 초대장을 구현한 클래스이다.
- 공연을 관람할 수 있는 초대일자(when)를 인스턴스 변수로 포함하고 있다.

```java
public class Ticket {
    private Long fee;

    public Long getFee() {
        return fee;
    }
}
```

- 티켓을 구현한 클래스이다.

```java
public class Bag {
    private Long amount;
    private Invitaion invitaion;
    private Ticket ticket;
    
    // 초대장 보유 여부
    public boolean hasInvitaion() {
        return invitaion != null;
    }

    // 티켓 보유 여부
    public boolean hasTicket() {
        return ticket != null;
    }

    // 초대장 -> 티켓
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public Bag(long amount) {
        this(null, amount); // this를 통해 해당 객체 생성자에 바로 접근
    }

    public Bag(Invitaion invitaion, long amount) {
        this.invitaion = invitaion;
        this.amount = amount;
    }
}
```

- 관람객이 가지고 올수있는 소지품들(초대장, 현금, 티켓)을 보관할 수 있는 가방 클래스이다.
- 초대장 보유 여부, 티켓 소유 여부, 현금 증가, 감소, 초대장을 티켓으로 변환시켜주는 메서드들이 있다.
- Bag 인스턴스 상태는 현금과 초대장을 함께 가지고 있거나, 현금만 가지고 있는 상태이기에 Bag 객체 생성 시점에 제약을 강제한다.

```java
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}
```

- 관람객을 구현한 클래스이다.
- 관람객은 소지품을 보관하기 위해 가방을 소지할 수 있다.

```java
public class ticketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    // 인스턴스 생성시 판매하거나, 교환해줄 Ticket들과 갯수를 받는다.
    public ticketOffice(Long amount, Ticket ... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}

```

- 매표소를 구현한 클래스이다.
- 매표소에는 관람객에게 판매할 티켓과 티켓의 판매 금액이 보관 되어있어야 한다.

```java
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
```

- 판매원을 구현한 클래스이다.
- 판매원은 자신이 일하는 매표소를 알고있어야 한다.

```java
public class Theather {
    private TicketSeller ticketSeller;

    public Theather(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        // 초대장이 있다면 flow
        if (audience.getBag().hasInvitaion()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        }
        // 초대장이 없다면 flow
        else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
```

- 소극장을 구현한 클래스이다.
- 초대장 유무에 따라서 flow가 나뉘어진다.
- 위 코드들은 정상적으로 동작한다.
    - 그러나 당연하게도 직접적인 값(티켓 수, 일자, 요금등)들을 넣어주지 않았기에 동작만 한다.

# ✅위 코드들은 과연 무엇이 문제인가?

- 로버트 마틴은 SW 모듈이 가져야 하는 세 가지 기능에 관해 설명했다.
    1. 실행 중에 제대로 동작하는 것
    2. 변경을 위해 존재하는 것 → 간단한 작업만으로도 변경이 가능해야한다.
    3. 코드를 읽는 사람과 의사소통하는 것 → 쉽게 읽고 이해할 수 있어야한다.

- 위 코드는 1번은 충족했지만, 2, 3번은 충족하지 못했다.

### 예상을 빗나가는 코드

- 일반적으로는 관람객이 스스로 초대장을 꺼내는 것이 맞는 것이다. 그러나 현재는 관람객은 소극장의 통제를 받는 수동적인 존재이다.
    - Audience 객체에서 초대장을 꺼내는 것이 아니라, Theater 객체에서 Audience 객체가 초대장이 있는지 확인한다.
- 일반적으로 판매원이 티켓을 판매하고, 돈을 관리해야 하나 현재는 소극장이 모든 티켓을 판매하고, 돈을 관리한다.
    - TicketSeller 객체에서 티켓을 판매하고, 돈을 관리하는 것이 아니라, Theather 객체에서 해당 책임들을 소화한다.

즉 각 책임들이 올바른 객체들에 할당되지 못했다.

- 이해 가능한 코드란 그 동작이 우리의 예상에서 크게 벗어나지 않는 코드이다.
    - 우리의 예상은 관람객이 직접 자신의 가방에서 초대장을 꺼내 판매원에게 건내고, 티켓을 구매하는 관람객은 가방 안에서 돈을 직접 꺼내서 판매원에게 지불하는 것이다. 판매원은 매표소에 있는 티켓을 직접 꺼내 관람객에게 건네고 관람객에게서 직접 돈을 받아 매표소에 보관해야한다.

- 코드를 이해하기 어려운 또 다른 이유로는 한 메서드의 코드를 이해하기 위해서는 여러 세부적인 내용들을 한꺼번에 기억하고 있어야 한다는 점이다.
    - Theater 객체의 enter 메서드를 이해하기 위해서는 Audience가 Bag을 가지고 있고, Bag 안에는 현금과 티켓이 들어있는 점들을 알고있어야한다.

🤓 : 내 PostService의 save() 메서드와 비슷하지 않은가…

### 변경에 취약한 코드

- 너무 많은 객체들이 Bag 객체에 의존하고 있기에, Bag 객체를 변서
- 객체지향 설계는 서로 의존하면서 협력하는 객체들의 공동체를 구축하는 것이다.
    - 우리의 목표는 애플리케이션의 기능을 구현하는 데 필요한 최소한의 의존성만 유지하고 불필요한 의존성을 제거하는 것이다.

![1.JPG](1%E1%84%8C%E1%85%A1%E1%86%BC%20%E1%84%80%E1%85%A2%E1%86%A8%E1%84%8E%E1%85%A6,%20%E1%84%89%E1%85%A5%E1%86%AF%E1%84%80%E1%85%A8%20d76f2aa821434cccb673497b1771025c/1.jpg)

🤓 : 내 PostService도 이런데 ㅋㅋㅋㅋ ㅠㅠㅠㅠ

# ✅설계 개선하기

- 어떻게 개선할 수 있는가??
    - 올바른 책임을 올바른 객체에게 부여하여서, 관람객과 판매원을 **자율적인 존재**로 만들자
    

### 자율성을 높이자

- 설계를 변경하기 어려운 이유는 Theater가 너무 많은 클래스에 의존하고 있기 때문이다.
    - 이의 해결 방법은 Theater가 기존에 Bag과 TicketOffice를 접근하는 책임을 Audience와 TicketSeller가 직접 Bag과 TicketOffice를 처리하는 **자율적인 존재**가 되도록 설계를 변경하는 것이다.
    - 🤓 : 그러면 PostService의 save() 또한 postMap과 Map을 직접 save 하는 것이 아니라 각 postMap과 Map에게 각자 save를 하는 책임을 부여해야하구나!!
        - 🤓 : 그러면 PostMapService와 MapService에서 save() 메서드를 따로 만들었어야 할까?

- Theater 객체에서 TicketOffice에 접근하던 책임을 TicketSeller에게 책임을 넘겨주자.

```java
public class Theather {
    private TicketSeller ticketSeller;

    public Theather(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
```

```java
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

//    public TicketOffice getTicketOffice() {
//        return ticketOffice;
//    }

    public void sellTo(Audience audience) {
        // 초대장이 있다면 flow
        if (audience.getBag().hasInvitaion()) {
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().setTicket(ticket);
        }
        // 초대장이 없다면 flow
        else {
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketOffice.plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
```

- Theater에서 더 이상 TicketOffice에서 접근하지 못하도록 `getTicketOffice()` 를 제거해줬다.
    - 따라서 TicketSeller는 ticketOffice에 대한 접근은 오직 TicketSeller 안에만 존재하기에, TicketSeller는 ticketOffice에서 티켓을 꺼내거나 판매 요금을 적립하는 일을 스스로 수행할 수 밖에 없다.
- 이렇게 개념적으로나 물리적으로 객체 내부의 세부적인 사항을 감추는 것을 **캡슐화**라고 부른다.
    - 🤓 : PostService의 `save()`에서는 너무 많은 사항들이 나와있구나…! 각 엔티티 save 과정, s3upload 과정들을 더 캡슐화 할 필요가 있겠다. → 각 객체들에게 책임을 분담하고, `save()`에서는 인터페이스에만 의존할 수 있도록(=호출하기만 할 수 있도록)

- Theater는 오직 TicketSeller의 인터페이스에만 의존한다.(=`ticketSeller.sellTo(audience);`) TicketSeller가 내부에 TicketOffice 객체를 포함하고 있다는 사실은 구현의 영역이다.
    - 객체를 인터페이스와 구현으로 나누고, 인터페이스만을 공개하는 것은 객체 사이의 결합도를 낮추고 변경하기 쉬운 코드를 작성하기 위해 따라야 하는 가장 기본적인 설계 원칙이다.
    - 🤓 :  이 말은 올바른 객체에게 올바른 책임을 주고, 그 객체를 사용하는 객체에서는 호출해서 사용하기만 하면 되도록 하라는 말인 듯
    
- 그러나 아직도 Audience는 Bag에서 스스로 돈을 꺼내서 티켓을 구매하는 것이 아니라 TicketSeller가 대신 돈을 꺼내서 티켓을 구매하고 있다.

```java
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

//    public TicketOffice getTicketOffice() {
//        return ticketOffice;
//    }

    public void sellTo(Audience audience) {
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
```

```java
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

//    public Bag getBag() {
//        return bag;
//    }

    public Long buy(Ticket ticket) {
        // 초대장이 있다면 flow
        if (bag.hasInvitaion()) {
            bag.setTicket(ticket);
            return 0L;
        }
        // 초대장이 없다면 flow
        else {
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
```

### 무엇이 개선됐는가?

- 우리의 예상과 이제 일치하기에, 코드를 읽는 사람과의 의사소통이라는 관점에서 이 코드는 확실히 개선된 것으로 보인다.
- 또한 Audience나 TicketSeller의 내부 구현을 변경해도 Theater를 함께 변경할 필요가 없어졌다는 것이다. → Theater에서는 Audience나 TicketSeller의 인터페이스만 사용하기에

### 어떻게 한 것인가

- 객체의 자율성을 높이는 방향으로 설계를 개선했다.
    - TicketSeller가 티켓을 판매하기 위해서 TicketOffice를 사용하는 모든 부분을 TicketSeller 내부로 옮기고, 관람객이 스스로 가방에서 돈, 초대장을 꺼내 티켓을 구매하기 위해 Bag을 사용하는 모든 부분을 Audience 내부로 옮겼다.
    - 자기 자신의 문제를 스스로 해결하도록 코드를 변경한 것이다.
        - 🤓 :  PostMap 일은 PostMap이~, Map 일은 Map이~
    - 자기 자신의 일을 다른 누군가가 마음대로 접근해서 대신 해결하지 않도록 해야한다. → **캡슐화**
        - 🤓 :  PostMap 일을 Post가 해결하지 못하도록 PostMap 내부에 `save()` 메서드를 구현하고 외부에서 PostMap 엔티티 자체에 접근하지 못하게 만들고, Post에서는 `save()` 인터페이스만 이용하도록하자.

### 캡슐화와 응집도

- 위의 말들을 요약하면 다음과 같다.

<aside>
😎 객체에 맞는 책임들을 할당하여서, 객체 내부의 상태를 캡슐화하고, 객체 간에 오직 메시지를 통해서만 상호작용하도록 만들자

</aside>

- 객체의 응집도를 높이기 위해서는 객체 스스로 자신의 데이터를 책임져야 한다.
- 객체 지향 애플리케이션은 스스로 책임을 수행하는 자율적인 객체들의 공동체를 구성함으로써 완성된다.
    - 🤓 : 저번에 수민님께서 인터페이스를 사용하여서 `save()`  하라고 말씀하셨던 부분이 이해가 되었다!! 인터페이스를 사용하면 기존과 똑같이 의존하는 것이 아니라 결합도를 낮추고, 변경을 쉽게 할 수 있도록 하는 것이구나!!

### 절차지향과 객체지향

- 변경하기 쉬운 설계는 한 번의 변경에 하나의 클래스만 변경할 수 있는 설계다.
    - 🤓 : PostMap 엔티티에 새로운 멤버 변수를 추가해야한다면 나는 PostService의 `save()` 까지 변경해야 했구나
- 훌륭한 객체지향 설계의 핵심은 캡슐화를 이용해 의존성을 적절히 관리함으로써 객체 사이의 결합도를 낮추는 것이다.

1. 어떤 기능을 설계하는 방법은 한가지 이상일 수 있다.
2. 동일한 기능을 한 가지 이상의 방법으로 설계할 수 있기 때문에 결국 설계는 트레이드오프의 산물이다.
    1. 🤓 : 이번 프로젝트간 게시글과 사진을 보내는 방법이 여러개였던 것 처럼

### 더 개선할 수 있다.

- Bag은 과거 Audience처럼 스스로 자기 자신을 책임지지 않고, 끌려다니는 수동적인 존재다.
    - Bag의 내부 상태에 접근하는 모든 로직을 Bag 안으로 캡슐화해서 결합도를 낮추면 된다.
    - 🤓 : 오 리팩토링할 때 해당 엔티티에 접근하는 로직들을 해당 엔티티 안으로 캡슐화 하면 되겠구나!!

- 그런데 Bag은 현실에서는 자율적인 존재가 아닌데, 스스로 책임을 지게 해도 괜찮은가?
    - 현실에서는 수동적인 존재라고 하더라도 객체 지향 세계에서는 모든 것이 능동적이고 자율적인 존재로 바뀐다. → **의인화**

- 이해하기 쉽고 변경하기 쉬운 코드를 작성하고 싶다면 한 편의 애니메이션을 만든다고 생각하자. 다른 사람의 코드를 읽고 이해하는 동안에는 애니메이션을 보고 있다고 생각하자 그리고 각 객체들을 의인화 시켜보자. 그렇게 하면 안에서 각 캐릭터(=객체)들이 웃고, 떠들고, 화내는 여러 객체를 만나더라도 당황하지 않을 것이다.
    - 🤓 : 그렇지 애니메이션에서는 가방이 웃고 떠들수 있는 자율적인 객체가 될 수 있으니!

# ✅1강 정리

<aside>
😎 객체 스스로 자신의 데이터를 책임져야 한다.

</aside>

<aside>
😎 객체에 맞는 책임들을 할당하여서, 객체 내부의 상태를 캡슐화하고, 객체 간에 오직 메시지를 통해서만 상호작용하도록 만들자

</aside>

<aside>
😎 설계란 코드를 배치하는 것이다.

</aside>

- 설계는 코드를 작성하는 것보다 높은 차원의 창조적인 행위가 아니다.
- 설계는 코드를 작성하는 순간 매 순간 코드를 어떻게 배치할 것인지를 결정하는 과정에서 나온다.

<aside>
😎 좋은 설계란 오늘 요구하는 기능을 온전히 수행하면서 내일의 변경을 매끄럽게 수용할 수 있는 설계다.

요구사항은 항상 변경된다.

</aside>

- 데이터와 프로세스를 하나의 덩어리로 모으는 것은 훌륭한 객체지향 설계로 가는 첫걸음 → 이는 객체 스스로 자신의 데이터를 책임져야 한다.  는 말과 같다.