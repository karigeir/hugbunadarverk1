package is.hi.booksmart;


import is.hi.booksmart.controller.AppController;
import is.hi.booksmart.services.BookService;
import is.hi.booksmart.services.CourseService;
import is.hi.booksmart.services.DepartmentService;
import is.hi.booksmart.services.SchoolService;
import is.hi.booksmart.services.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

// Athugið vel að þessi import séu rétt 
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.Matchers.containsString;

import static org.mockito.Mockito.when;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

/**
 *
 * @author Suzanna Sofía
 * @date nóvember 2017 
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 * 
 * Prófunarklasi sem framkvæmir prófanir á weblayer og notar WebMvcTest og
 * Mockito til að prófa service klasa 
*/

@RunWith(SpringRunner.class)
/**
 *  Aðeins veflagið er keyrt upp en ekki allur "context"-inn
 *  Biðjum um að bæta SearchController inn í "context-inn" sem Mock (prófanahlut)
 */
@WebMvcTest(AppController.class)     
                                            
public class WebMockTest {

    // Þjónninn (Tomcat) ekki keyrður upp 
    @Autowired
    private MockMvc mockMvc;

    // Bætum við prófunar (e. Mock) service klasa - kemur úr springframework safninu (fyrir Mockito
    // sérstaklega gert fyrir Mockito safnið 
    @MockBean
    BookService bookService;
    @MockBean
    SchoolService schoolService;
    @MockBean
    CourseService courseService;
    @MockBean
    DepartmentService deptService;
    @MockBean
    UserService userService;
     
    /**
     * Aðferð sem prófar /lifir á SearchController en með
     * isAlive() true. Ættum að fá til baka forsíðuna (/app)
     */
    @Test
    public void testaLifirTrue() throws Exception {
        // Látum isAlive() skila true 
        // Notum Mockito í prófanirnar - Mockito er Framework fyrir unit testing í Java 
        // http://site.mockito.org/   
        
        // Prófið ætti að takast - prófum sönnu leiðina í if-setningunni
        when(bookService.isAlive()).thenReturn(true);
        this.mockMvc.perform(get("/app/lifir"))
                .andDo(print())
                .andExpect(status()
                .isOk())
                .andExpect(content()
                .string(containsString("BookSmart")));  
      
    }
    /**
     * Aðferð sem prófar /lifir á SearchController en með
     * isAlive() false. Ættum að fá til baka login síðuna (/app/login)
     */
    @Test
    public void testaLifirFalse() throws Exception {
        
        // Prófið ætti að takast - prófum ósönnu leiðina í if-setningunni 
        when(bookService.isAlive()).thenReturn(false);
        this.mockMvc.perform(get("/app/lifir")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content()
                        .string(containsString("Username")));
    }
    
    /**
     * Prófið ætti að mistakast - prófum ósönnu leiðina isAlive() en berum
     * saman við rangan streng. Ættum að fá login síðuna en athugum hvort forsíðan birtist
     * @throws Exception 
     */
    @Test
    public void testaLifirFalseMedRongumStreng() throws Exception {
        
        // Prófið ætti að ekki takast - prófum ósönnu leiðina í if-setningunni 
        when(bookService.isAlive()).thenReturn(false);
        
      
        this.mockMvc.perform(get("/app/lifir")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("BooksMart"))); 
        }
       
    }
