package countstar.counts2.dao.UserDAO;
import countstar.counts2.model.Worker;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
@Mapper
public interface workerDAO {


    /**
      *更新众包工人信息
     */
     void updateW(@Param("worker") Worker worker);
    /**
     *新增众包工人信息
     */
     void insertW(@Param("worker") Worker worker);

    /**
    * 查询手机号是否已经存在
    * @param phNum
    * @return
    */
     Integer isExist (@Param("phNum") String phNum);



     /**
    * 通过手机号码获取worker信息
    * @param phNum
    * @return
    */
     Worker getWorkerByPhNum(@Param("phNum") String phNum);


    /**
     * 获取所有worker的列表
     */
     ArrayList<Worker> getAllWorkers();


}
