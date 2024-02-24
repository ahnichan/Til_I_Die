package TIL202402;

public class TIL0206 {
    /* 상대적인 <Link to> 값("/" 로 시작하지 않는)은 부모 route를 기준으로 해석된다.
       즉, 해당 <Link>를 렌더링한 route에 의해 매치된 URL 경로를 기반으로 빌드된다.
    * 이 값에는 계층 구조 상위의 route로 링크하려면 '..'이 포함될 수 있다.
    * 이러한 경우 '..'은 명령 줄 cd 함수와 동일하게 작동한다.
    * 각 '..'은 부모 path의 segment를 하나씩 제거한다.*/
}