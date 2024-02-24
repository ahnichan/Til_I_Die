package TIL202402;

public class TIL0208 {
    /* <ScrollRestoration>을 사용 중이면, 링크를 클릭 할 때 스크롤 위치가 창의 맨 위로 재설정되는 것을 방지할 수 있다.
    * <Link to="?tab=one" preventScrollReset={true} />
    *
    * 이는 사용자가 뒤로/앞으로 버튼으로 위치로 돌아올 때 스크롤 위치를 복원하는 것을 방지하지는 않는다.
    * 이것은 그저 사용자가 링크를 클릭했을 때에 위치 재설정을 방지한다.
    *
    * 이것이 필요한 예는 페이지 상단이 아닌 url 검색 매개변수를 조작하는 탭 목록이 있는 경우이다.
    * 스크롤 위치가 맨 위로 점프하면 토글된 콘텐츠가 뷰포트 밖으로 스크롤 될 수 있기 때문에 방지할 필요가 있다.
    * */
}