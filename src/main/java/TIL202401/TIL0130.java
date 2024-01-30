package TIL202401;

public class TIL0130 {
    /* replace는 새로운 entry를 push하는 것 대신, 현재 entry를 히스토리 스택에서 교체하도록 폼에 지시한다.
    기본 동작은 Form 동작에 따라 조건적으로 결정된다.
    method=get인 폼은 기본적으로 false이다.
    submission 메서드는 formAction 및 action 동작에 따라 달라진다.
    - action이 예외를 throw 하면 기본값은 false이다.
    - action이 현재 위치로 redirect하면 기본값은 true이다.
    - action이 다른 위치로 redirect하면 기본값은 false이다.
    - formAction이 현재 위치인 경우, 기본값은 true이다.
    - 그 외는 기본값은 false이다.

     GET 메서드를 사용할 때는 사용자가 뒤로 버튼을 클릭하여 이전 검색 결과/필터 등을 볼 수 있도록 하는 것이 일반적이다.
     그러나 다른 메서드의 경우 기본값은 true로 설정되어 있는데, '폼을 다시 제출하시겠습니까?' 프롬프트를 방지하기 위해서이다.
     replace={false}로 설정되어 있더라도 react router는 뒤로 버튼이 클릭될 때,
     메서드가 post, put, patch, delete인 경우에는 폼을 다시 제출하지 않는다.

     따라서 get 제출이고 뒤로 버튼을 클릭했을 때 이전 결과가 표시되는 것을 방지하기 위해 사용한다.
    * */
}
