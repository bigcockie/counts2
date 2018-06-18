package countstar.counts2.dao;

import countstar.counts2.model.Assignment;
import countstar.counts2.model.Images;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.ArrayList;

@Mapper
public interface imageDAO {
    /**
     *任务发布时可以同时储存图片
     */
    void insertI(@Param("assignment") Assignment assignment);
    /**
     *更新图片信息
     */
    void updateI(@Param("assignment") Assignment assignment);
    /**
     * 根据任务编号得到所有相关图片的信息
     * @param aid
     * @return
     */
    ArrayList<Images> getImagesByAid(@Param("aid") String aid);
    /**
     * 根据任务编号得到已经完成的数量
     * @param aid
     * @return
     */
    Integer getNumOfCompletedByAid(@Param("aid") String aid);
    /**
     * 根据任务编号得到图片总的数量
     * @param aid
     * @return
     */
    Integer getNumByAid(@Param("aid") String aid);
}
