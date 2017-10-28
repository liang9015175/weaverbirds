package com.liuyanan.dao;

import com.liuyanan.domain.Office;
import com.liuyanan.domain.OfficeExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface OfficeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table office
     *
     * @mbg.generated Sat Oct 28 12:57:31 CST 2017
     */
    long countByExample(OfficeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table office
     *
     * @mbg.generated Sat Oct 28 12:57:31 CST 2017
     */
    int deleteByExample(OfficeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table office
     *
     * @mbg.generated Sat Oct 28 12:57:31 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table office
     *
     * @mbg.generated Sat Oct 28 12:57:31 CST 2017
     */
    int insert(Office record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table office
     *
     * @mbg.generated Sat Oct 28 12:57:31 CST 2017
     */
    int insertSelective(Office record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table office
     *
     * @mbg.generated Sat Oct 28 12:57:31 CST 2017
     */
    List<Office> selectByExampleWithRowbounds(OfficeExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table office
     *
     * @mbg.generated Sat Oct 28 12:57:31 CST 2017
     */
    List<Office> selectByExample(OfficeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table office
     *
     * @mbg.generated Sat Oct 28 12:57:31 CST 2017
     */
    Office selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table office
     *
     * @mbg.generated Sat Oct 28 12:57:31 CST 2017
     */
    int updateByExampleSelective(@Param("record") Office record, @Param("example") OfficeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table office
     *
     * @mbg.generated Sat Oct 28 12:57:31 CST 2017
     */
    int updateByExample(@Param("record") Office record, @Param("example") OfficeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table office
     *
     * @mbg.generated Sat Oct 28 12:57:31 CST 2017
     */
    int updateByPrimaryKeySelective(Office record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table office
     *
     * @mbg.generated Sat Oct 28 12:57:31 CST 2017
     */
    int updateByPrimaryKey(Office record);
}