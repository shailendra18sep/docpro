package springapp.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springapp.domain.Sample;
import springapp.service.SampleService;

@Controller
public class HelloController {
	@Autowired
	SampleService sampleService;
	@Autowired
	private ApplicationContext applContext;
	private static final Logger logger = LoggerFactory
			.getLogger(HelloController.class);

	@RequestMapping("/hello.htm")
	public ModelAndView getName() {
		DBConnector dbConnector = new DBConnector();
		logger.info("asdasdasdasdasdasd");
		System.out.println(applContext.getBean(SampleService.class).toString());
		System.out.println(applContext.getBean(SampleService.class));

		Sample sample = sampleService.getSample("abc");
		System.out.println(sample.getAddress());
		// System.out.println(sample.getName());
		// logger.fatal(sample.getName());
		// DBConnector dbConnector = new DBConnector();

		return new ModelAndView("hello.jsp");
	}
}