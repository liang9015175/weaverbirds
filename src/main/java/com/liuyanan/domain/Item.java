package com.liuyanan.domain;

import java.io.Serializable;
import java.util.Date;

public class Item implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table item
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.id
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    private Integer id;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.item_name
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    private String itemName;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.stock_count
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    private Integer stockCount;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.cate_id
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    private Integer cateId;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.status
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    private Integer status;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.create_at
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    private Date createAt;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.create_by
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    private String createBy;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.update_at
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    private Date updateAt;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item.update_by
     *
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    private String updateBy;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.id
     *
     * @return the value of item.id
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.id
     *
     * @param id the value for item.id
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.item_name
     *
     * @return the value of item.item_name
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.item_name
     *
     * @param itemName the value for item.item_name
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.stock_count
     *
     * @return the value of item.stock_count
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public Integer getStockCount() {
        return stockCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.stock_count
     *
     * @param stockCount the value for item.stock_count
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.cate_id
     *
     * @return the value of item.cate_id
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public Integer getCateId() {
        return cateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.cate_id
     *
     * @param cateId the value for item.cate_id
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.status
     *
     * @return the value of item.status
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.status
     *
     * @param status the value for item.status
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.create_at
     *
     * @return the value of item.create_at
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.create_at
     *
     * @param createAt the value for item.create_at
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.create_by
     *
     * @return the value of item.create_by
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.create_by
     *
     * @param createBy the value for item.create_by
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.update_at
     *
     * @return the value of item.update_at
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.update_at
     *
     * @param updateAt the value for item.update_at
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item.update_by
     *
     * @return the value of item.update_by
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item.update_by
     *
     * @param updateBy the value for item.update_by
     * @mbg.generated Sat Oct 14 22:20:15 CST 2017
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }
}