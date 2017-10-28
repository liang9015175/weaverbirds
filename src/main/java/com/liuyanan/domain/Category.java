package com.liuyanan.domain;

import java.io.Serializable;
import java.util.Date;

public class Category implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table category
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.id
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    private Integer id;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_name
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    private String categoryName;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.status
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    private Integer status;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.create_at
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    private Date createAt;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.create_by
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    private String createBy;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.update_at
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    private Date updateAt;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.update_by
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    private String updateBy;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.id
     *
     * @return the value of category.id
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.id
     *
     * @param id the value for category.id
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_name
     *
     * @return the value of category.category_name
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_name
     *
     * @param categoryName the value for category.category_name
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.status
     *
     * @return the value of category.status
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.status
     *
     * @param status the value for category.status
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.create_at
     *
     * @return the value of category.create_at
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.create_at
     *
     * @param createAt the value for category.create_at
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.create_by
     *
     * @return the value of category.create_by
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.create_by
     *
     * @param createBy the value for category.create_by
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.update_at
     *
     * @return the value of category.update_at
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.update_at
     *
     * @param updateAt the value for category.update_at
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.update_by
     *
     * @return the value of category.update_by
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.update_by
     *
     * @param updateBy the value for category.update_by
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }
}