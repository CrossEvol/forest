package com.rymcu.forest.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created on 2022/6/13 21:42.
 *
 * @author ronger
 * @email ronger-x@outlook.com
 * @desc : 产品表
 */
@Data
@Table(name = "forest_product")
public class Product implements Serializable, Cloneable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long idProduct;
    /**
     * 产品名
     */
    private String productTitle;
    /**
     * 单价(单位:分)
     */
    private Integer productPrice;
    /**
     * 产品主图
     */
    private String productImgUrl;
    /**
     * 产品描述
     */
    private String productDescription;
    /**
     * 权重;数值越小权限越大;0:无权限
     */
    private Integer weights;
    /**
     * 创建时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createdTime;
    /**
     * 更新时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updatedTime;
}
