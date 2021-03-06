package com.liuyanan.domain;

import java.io.Serializable;
import java.util.Date;

public class Rent implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rent.id
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rent.user_name
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rent.depart_id
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    private Integer departId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rent.item_id
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    private Integer itemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rent.nums
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    private Integer nums;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rent.out_or_in
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    private Integer outOrIn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rent.rent_status
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    private Integer rentStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rent.status
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rent.create_at
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    private Date createAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rent.create_by
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rent.update_at
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    private Date updateAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rent.update_by
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    private String updateBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rent
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rent.id
     *
     * @return the value of rent.id
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rent.id
     *
     * @param id the value for rent.id
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rent.user_name
     *
     * @return the value of rent.user_name
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rent.user_name
     *
     * @param userName the value for rent.user_name
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rent.depart_id
     *
     * @return the value of rent.depart_id
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public Integer getDepartId() {
        return departId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rent.depart_id
     *
     * @param departId the value for rent.depart_id
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rent.item_id
     *
     * @return the value of rent.item_id
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rent.item_id
     *
     * @param itemId the value for rent.item_id
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rent.nums
     *
     * @return the value of rent.nums
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public Integer getNums() {
        return nums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rent.nums
     *
     * @param nums the value for rent.nums
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public void setNums(Integer nums) {
        this.nums = nums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rent.out_or_in
     *
     * @return the value of rent.out_or_in
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public Integer getOutOrIn() {
        return outOrIn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rent.out_or_in
     *
     * @param outOrIn the value for rent.out_or_in
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public void setOutOrIn(Integer outOrIn) {
        this.outOrIn = outOrIn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rent.rent_status
     *
     * @return the value of rent.rent_status
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public Integer getRentStatus() {
        return rentStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rent.rent_status
     *
     * @param rentStatus the value for rent.rent_status
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public void setRentStatus(Integer rentStatus) {
        this.rentStatus = rentStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rent.status
     *
     * @return the value of rent.status
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rent.status
     *
     * @param status the value for rent.status
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rent.create_at
     *
     * @return the value of rent.create_at
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rent.create_at
     *
     * @param createAt the value for rent.create_at
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rent.create_by
     *
     * @return the value of rent.create_by
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rent.create_by
     *
     * @param createBy the value for rent.create_by
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rent.update_at
     *
     * @return the value of rent.update_at
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rent.update_at
     *
     * @param updateAt the value for rent.update_at
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rent.update_by
     *
     * @return the value of rent.update_by
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rent.update_by
     *
     * @param updateBy the value for rent.update_by
     *
     * @mbg.generated Wed Dec 06 19:05:12 CST 2017
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }
}