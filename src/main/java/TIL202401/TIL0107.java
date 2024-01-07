package TIL202401;

public class TIL0107 {
    /* 애플리케이션 번들ㅇ르 작게 유지하고 route 코드 분할을 돕기위해서, 각 route는 경로 정의 (loader, action, Component/element, ErrorBoundary/errorElement, etc.).
    에서 경로가 일치하지 않는 부분을 해결하는 비동기 함수를 제공한다.
     lazy route는 초기 로드 때와 navigation 혹은 fetcher 요청 loading, submitting 페이즈 도중 실행된다.
     lazy route는 known routes를 매칭한 이후에 실행되기 때문에 route 매칭 속성(path, index, children, caseSensitive)은 lazy하게 정의할 수 없다.*/
}
