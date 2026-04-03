package com.iread.books.controllertest;

/*import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.iread.books.controller.IReadBooksController;
import com.iread.books.model.IReadBooksModel;
import com.iread.books.service.IReadBooksService;

@WebMvcTest(IReadBooksController.class) */
public class IReadBooksControllerTest {
/*	@Autowired
	private MockMvc mockMvc;
	
	@MockitoBean
	IReadBooksService iReadBooksService;
	
	@Test
	public void testGetAllValues_succes() throws Exception {
		IReadBooksModel book1 = new IReadBooksModel(1, "myautograph", "kalyan", "biography");
        IReadBooksModel book2 = new IReadBooksModel(2, "The Great Gatsby", "F. Scott Fitzgerald", "Classic");
        List<IReadBooksModel> allBooks = Arrays.asList(book1, book2);

        // 2. Define Mock behavior (Stubbing)
        when(iReadBooksService.getAllBooks()).thenReturn(allBooks);

        // 3. Perform request and verify results
		/*
		 * mockMvc.perform(get("/ireadapi/getAllBooks")
		 * .contentType(MediaType.APPLICATION_JSON)) .andExpect(status().isOk())
		 * .andExpect(jsonPath("$.size()").value(2)) // Verify list size
		 * .andExpect(jsonPath("$[0].title").value("myautograph")) // Verify first item
		 * .andExpect(jsonPath("$[1].author").value("kalyan"))
		 * .andExpect(jsonPath("$[2].genre").value("biography"));
		 */
      /*  mockMvc.perform(get("/ireadapi/getAllBooks")
                .contentType(MediaType.APPLICATION_JSON))
        		.andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()").value(2)) 
                // Index 0 = book1
                .andExpect(jsonPath("$[0].bookName").value("myautograph"))
                .andExpect(jsonPath("$[0].author").value("kalyan"))
                .andExpect(jsonPath("$[0].genre").value("biography"))
                // Index 1 = book2
                .andExpect(jsonPath("$[1].bookName").value("The Great Gatsby"));
    } */

}
