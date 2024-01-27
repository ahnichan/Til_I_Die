package TIL202401;

public class TIL0127 {
    /* react router에서 Mutation Submission은
    * POST, PUT, PATCH, DELETE를 사용하여 데이터에 변경을 의도한다는 것이다. 일반 HTML form은 post와 get만 지원하고, 이곳에서도 주로  get과 post 두 가지를 사용한다.
    * 사용자가 form을 제출하면 react router가 route에 대한 action을 매칭하고, serialized(직렬화)된 formdata로 <Route action>을 호출한다.
    * action이 완료되면, 모든 loader 데이터가 자동으로 유효성을 검사하여 UI와 데이터를 동기화시킨다.
    * 메서드는 호출된 route action 내에서 request.method로 사용할 수 있다. 이를 이용하여 제출의 의도에 대한 데이터 추상화를 명령할 수 있다.*/
}
