package TIL202401;

public class TIL0112 {
    /* loader에서 request는 애플리케이션에 생성되는 Fetch Request 인스턴스이다.
    *  로더가 request를 받는 것이 어색할 수 있으나, <Link>가 다음 코드를 수행한다고 가정해보고 어떤 기본 동작이 방지되고 있는 지 생각해보자
    *
    * <a
      href={props.to}
      onClick={(event) => {
        event.preventDefault();
        navigate(props.to);
      }}
      />
    *
    *  react router가 없었다면 브라우저는 서버에 요청을 보낼 것이다. 그러나 react router는 이것을 막고 요청을 서버에 보내는 것이 아닌 loader에 보낸다.
    * 가장 일반적인 예시는 URL을 생성하고 여기서 URLSearchParams를 읽는 것이다.
    * function loader({ request }) {
      const url = new URL(request.url);
      const searchTerm = url.searchParams.get("q");
      return searchProducts(searchTerm);
      }
    *
    * 이곳 API들은 react router의 api가 아니라 표준 웹 object인 Request, URL, URLSearchParams
    * */
}

