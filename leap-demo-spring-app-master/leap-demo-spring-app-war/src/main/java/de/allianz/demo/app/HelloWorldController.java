package de.allianz.demo.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * A simple hello world controller that prints a encrypted property.
 * <p>
 * Created by d22j2n3 on 04.04.2017.
 */
@Controller
public class HelloWorldController {

    /*
     * Here we can read an encrypted property with Spring Expression language.
     * The $config{ prefix and } suffix was configured in the applicationContext.xml in
     * the EncryptablePropertyPlaceholderConfigurer bean definition.
     *
     * It can also be used within spring application context xml configurations, e.g.
     * for datasource parameters.
     */
    @Value("$config{encrypted_property}")
    private String property;

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public ModelAndView helloWorld() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("property", property);
        mv.setViewName("hello");
        return mv;
    }
}
