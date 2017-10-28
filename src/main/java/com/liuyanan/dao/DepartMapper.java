package com.liuyanan.dao;

import com.liuyanan.domain.Depart;
import com.liuyanan.domain.DepartExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface DepartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table depart
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    long countByExample(DepartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table depart
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    int deleteByExample(DepartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table depart
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table depart
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    int insert(Depart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table depart
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    int insertSelective(Depart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table depart
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    List<Depart> selectByExampleWithRowbounds(DepartExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table depart
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    List<Depart> selectByExample(DepartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table depart
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    Depart selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table depart
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    int updateByExampleSelective(@Param("record") Depart record, @Param("example") DepartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table depart
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    int updateByExample(@Param("record") Depart record, @Param("example") DepartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table depart
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    int updateByPrimaryKeySelective(Depart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table depart
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    int updateByPrimaryKey(Depart record);
}