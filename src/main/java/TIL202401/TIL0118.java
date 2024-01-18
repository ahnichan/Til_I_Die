package TIL202401;

public class TIL0118 {
    /* 데이터가 재검증되어 UI와 데이터가 자동으로 동기화되는 몇 상황이 있다.
    * <Form>에서 호출된 action 이후,
    * <fetcher.Form>에서 호출된 action 이후,
    * useSubmit에서 호출된 action 이후,
    * fetcher.submit에서 호출된 action 이후,
    * useRevalidator를 통해 명시적으로 재유효성이 트리거된 경우,
    * 이미 렌더링된 route의 URL params가 변경된 경우,
    * URL Search params가 변경된 경우,
    * 현재 URL과 동일한 URL로 이동한 경우
    * 만약 route에 shouldRevalidate를 정의하면, 새로운 데이터를 위한 route loader를 호출하기 이전에 함수를 체크한다.
    * 함수가 false를 반환하면, loader는 호출되지 않고, 해당 loader의 기존 데이터가 페이지에 유지된다.
    *  */
}
