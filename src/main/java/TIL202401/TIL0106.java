package TIL202401;

public class TIL0106 {
    /* Nest.js는 react hydrate 기능을 이용하여 hydration을 제공한다.
    * hydrate는 ReactDOM 함수인데, 흔히 리액트 프로젝트를 구축할 때 사용하는 render 함수와 비교하면
    * render는 특정 컴포넌트를 두 번째 파라미터인 지정된 DOM 요소에 하위로 주입하여 렌더링 처리를 하지만
    * hydrate는 특정 컴포넌트를 두 번째 파라미터인 지정된 DOM 요소에 하위로 hydrate 처리를 한다.
    * 이는 새로운 DOM을 생성하는 것이 아니라 기존 DOM tree에서 해당되는 DOM 요소를 찾아 자바스크립트 속성들만 부착시킨다는 의미이다.  */
}
