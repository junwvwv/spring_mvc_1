package hello.servlet.web.springmvc.old;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@Component("/springmvc/old-controller")
public class OldController implements Controller {

    /**
     * 스프링 MVC 동작 순서
     * 1. 핸들러 조회 : 핸들러 매핑을 통해 요청 URL 에 매핑된 핸들러(컨트롤러)를 조회한다
     * 2. 핸들러 어댑터 조회 : 핸들러를 실행할 수 있는 핸들러 어댑터를 조회한다
     * 3. 핸들러 어댑터 실행
     * 4. 핸들러 실행
     * 5. ModelAndView 반환 : 핸들러 어댑터는 핸들러가 반환하는 정보롤 ModelAndView 로 변환해서 반환한다
     * 6.viewResolver 호출 : 뷰 리졸버를 찾고 실행한다
     * 7. View 반환 : 뷰 리졸버는 뷰의 논리 이름을 물리 이름으로 바꾸고, 렌더링 역할을 담당하는 뷰 객체를 반환한다
     * 8. 뷰 렌더링
     */

    /**
     * Controller 인터페이스
     * - 과거에 스프링이 사용한 방식으로 @Controller 어노테이션과 전혀 다름
     * - /springmvc/old-controller 라는 스프링 빈으로 등록되고, 빈의 이름으로 URL 이 매핑 된다
     *
     * ViewResolver
     * - 스프링 부트는 InternalResourceViewResolver 라는 뷰 리졸버를 자동으로 등록한다
     * - 설정 파일에 등록한 prefix, suffix 정보를 사용한다
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handleRequest");
        return new ModelAndView("new-form");
    }

}
