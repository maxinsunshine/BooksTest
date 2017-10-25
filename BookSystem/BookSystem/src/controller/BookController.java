package controller;

import java.util.List;
import model.BookInfo;
import model.BookTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.inter.IBookService;


@RequestMapping("book")
@Controller
public class BookController {
	
	@Autowired
	private IBookService bookService;
	
	@RequestMapping("bookList")
	/**
	 * ��ȡͼ���б�ת��ҳ��
	 * @return
	 */
	public ModelAndView showList(){
		List<BookInfo> li = null;
		try{
			li =bookService.getAllBook();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return new ModelAndView("book_list","list",li);
	}
	
	@RequestMapping("toaddBook")
	/**
	 * ��ȡ����ͼ�����Ͳ�ת��ҳ��
	 * @return
	 */
	public ModelAndView toAddBookView(){
		List<BookTypeInfo> li=null;
		try{
			li =bookService.getBookTypeList();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return new ModelAndView("book_add","list" ,li);
	}
	
	@RequestMapping("addBook")
	/**
	 * ͼ������
	 * @param bi
	 * @return
	 */
	public String  toAddBookView(BookInfo bi){
		try{
			System.out.println(bi.getBookName());
			bookService.addBook(bi);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "redirect:bookList";
	}
	@RequestMapping("toEditBook")
	/**
	 * �������������ͼ�������뵽requestȻ��ת��toEdit
	 * @param id
	 * @param redirectAttributes
	 * @return
	 */
	public String toEditBook(int id ,RedirectAttributes redirectAttributes){
		
		BookInfo bi =bookService.getBook(id);
		//�൱������ε�request�����һ������
		redirectAttributes.addFlashAttribute("book",bi);
		
		return "redirect:toEdit";
	}
	@RequestMapping("toEdit")
	/**
	 * ��ȡͼ������Ȼ��ת��book_editҳ��
	 * @return
	 */
	public ModelAndView toEditBook(){
		List<BookTypeInfo> li=null;
		try{
			li =bookService.getBookTypeList();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return new ModelAndView("book_edit","list" ,li);
	}
	@RequestMapping("editBook")
	@ResponseBody
	/**
	 * �޸ķ���
	 * @param book
	 * @return
	 */
	public String editBook(BookInfo book){
		try{
			bookService.editBook(book);
			return "succeed";
		}catch(Exception e){
			e.printStackTrace();
		}
		return "falied";
	}
	@RequestMapping("delBook")
	/**
	 * ɾ������
	 * @param id
	 * @return
	 */
	public String delBook(int id){
		boolean flag=false;
		try{
			bookService.delBook(id);
			flag = true;
		}catch(Exception e){
			e.printStackTrace();
		}
		if(flag){
			return "redirect:bookList";
		}else{
			return "failed_delete";
		}
	}
}
