package service.inter;

import java.util.List;

import org.springframework.stereotype.Repository;

import model.BookInfo;
import model.BookTypeInfo;

public interface IBookService {
	
	//����ͼ����Ϣ
	public boolean addBook(BookInfo bookInfo);
	//ɾ��ͼ����Ϣ
	public boolean delBook(int id);
	//�޸�ͼ����Ϣ
	public boolean editBook(BookInfo bookInfo);
	//��ȡͼ���б�
	public List<BookInfo> getAllBook();
	//��ȡĳ��ͼ��
	public BookInfo getBook(int id);
	//�õ�����ͼ������
	public List<BookTypeInfo> getBookTypeList();
	
}
