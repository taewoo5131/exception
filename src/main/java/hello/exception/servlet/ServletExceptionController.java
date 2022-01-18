package hello.exception.servlet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
public class ServletExceptionController {
    @GetMapping("/error-ex")
    void errorEx() {
        throw new RuntimeException("예외 발생 !");
    }

    @GetMapping("/error-404")
    void error404(HttpServletResponse response) throws Exception{
        response.sendError(HttpServletResponse.SC_NOT_FOUND,"404오류!");
    }

    @GetMapping("/error-500")
    void error500(HttpServletResponse response) throws Exception{
        response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,"500오류!");
    }
}
