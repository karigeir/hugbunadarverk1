package is.hi.booksmart.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Dæmi sem sýnir HttpSession og ServletContext
 * 
 * @author Ebba Þóra Hvannberg
 * @date október 2017 
 * HBV501G 
 * Háskóli Íslands 
 */

@Controller
public class SessionController {

  
    /**
     * Sýnir hvernig HttpSession virkar með teljara. Sjálfgefið gildi í Tomcat fyrir
     * timeout á session er 30 mínútur. Hægt að stilla í tomcat uppsetningu (conf/web.xml)
     * @param session núverandi session 
     * @param model
     * @return viðmóti sem birtir stöðu teljara
     */
    @RequestMapping(value="/sessionLogin")
    public String  heimsokn (HttpSession session, Model model) {
        Integer teljari =(Integer) session.getAttribute("HeimsoknTeljari");
        if (teljari == null)
            teljari = new Integer(1);
        else
            teljari = new Integer(teljari.intValue()+1);
        
        session.setAttribute("HeimsoknTeljari", teljari);
        
        System.out.println (" teljari "+teljari.intValue());
        model.addAttribute("teljari", teljari);
        return "session/teljari";
    }
    
    /**
     * Sýnir hvernig ServletContext virkar með teljara
     * 
     * @param session
     * @param model
     * @return 
     */
    
    @RequestMapping(value="/heimsoknServlet")
    public String  heimsoknMargarSessionir (HttpSession session, Model model) {
        ServletContext sContext = session.getServletContext();
        Integer teljari =(Integer) sContext.getAttribute("HeimsoknContextTeljari");
        if (teljari == null)
            teljari = 1;
        else
            teljari = teljari+1;
        
        sContext.setAttribute("HeimsoknContextTeljari", teljari);
        
        model.addAttribute("teljariContext", teljari);
        return "session/teljariContext";
    }
}

