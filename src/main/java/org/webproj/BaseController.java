package org.webproj;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView; 

@Controller
public class BaseController {
 
    @RequestMapping("/base")  
    public ModelAndView showBasePage() {  
        String message = "Test MVC template: base page";  
        return new ModelAndView("basepage", "message", message);  
    }  
}
