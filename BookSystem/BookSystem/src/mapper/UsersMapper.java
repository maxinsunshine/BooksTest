package mapper;

import java.util.List;

import model.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    
    //��ѯ���е��û�
    List<Users> getAllUsers();
    
    //��ѯ�Ƿ��Ѿ�����
    int findUserExistCount(Users record);
    
    //��¼����
    Users login(String username,String password);
}