package springapp.web;

import junit.framework.TestCase;

import org.springframework.web.servlet.ModelAndView;

public class HelloControllerTests extends TestCase {

	public void testHandleRequestView() throws Exception {
		HelloController controller = new HelloController();
		ModelAndView modelAndView = controller.getName();
		assertEquals("hello.jsp", modelAndView.getViewName());
	}
}