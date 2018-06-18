package countstar.counts2.dao.UserDAO;

import countstar.counts2.model.Requester;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface requesterDAO {
    //更新request的数据
    void updateR(@Param("requester") Requester requester);
    //插入新的worker
    void insertR(@Param("requester") Requester requester);

    /**
     * 查询手机号是否已经存在
     * @param phNum
     * @return
     */
    Integer isExist (@Param("phNum") String phNum);



    /**
     * 通过手机号码获取requester信息
     * @param phNum
     * @return
     */
    Requester getRequesterByPhNum(@Param("phNum") String phNum);




    /**
     * 获取所有requester的列表
     */
    ArrayList<Requester> getAllRequester();
}
