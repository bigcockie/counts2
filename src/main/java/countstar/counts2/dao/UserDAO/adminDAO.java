package countstar.counts2.dao.UserDAO;

import countstar.counts2.model.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface adminDAO {
    //更新admin的数据
    void updateA(@Param("admin") Admin admin);

    /**
     * 查询手机号是否已经存在
     * @param phNum
     * @return
     */
    Integer isExist (@Param("phNum") String phNum);


    /**
     * 通过手机号码获取admin信息
     * @param phNum
     * @return
     */
    Admin getAdminByPhNum(@Param("phNum") String phNum);



    /**
     * 获取所有admin的列表
     */
    ArrayList<Admin> getAllAdmins();
}
