package dao.inter;

import java.util.List;

import model.BookInfo;

public interface IBookInfoDao {
	
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
	
	
}
