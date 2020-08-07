package com.app.genio.domain;


import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A Order.
 */
@Entity
@Table(name = "jhi_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "order_code")
    private Integer orderCode;

    @Column(name = "cust_id")
    private Integer custId;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "active_flag")
    private Boolean activeFlag;

    @Column(name = "create_date")
    private LocalDate createDate;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "update_date")
    private LocalDate updateDate;

    @Column(name = "update_by")
    private LocalDate updateBy;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public Order orderId(Integer orderId) {
        this.orderId = orderId;
        return this;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderCode() {
        return orderCode;
    }

    public Order orderCode(Integer orderCode) {
        this.orderCode = orderCode;
        return this;
    }

    public void setOrderCode(Integer orderCode) {
        this.orderCode = orderCode;
    }

    public Integer getCustId() {
        return custId;
    }

    public Order custId(Integer custId) {
        this.custId = custId;
        return this;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Integer getProductId() {
        return productId;
    }

    public Order productId(Integer productId) {
        this.productId = productId;
        return this;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public Order startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Order endDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Boolean isActiveFlag() {
        return activeFlag;
    }

    public Order activeFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public Order createDate(LocalDate createDate) {
        this.createDate = createDate;
        return this;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public Order createBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public Order updateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public LocalDate getUpdateBy() {
        return updateBy;
    }

    public Order updateBy(LocalDate updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    public void setUpdateBy(LocalDate updateBy) {
        this.updateBy = updateBy;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Order)) {
            return false;
        }
        return id != null && id.equals(((Order) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Order{" +
            "id=" + getId() +
            ", orderId=" + getOrderId() +
            ", orderCode=" + getOrderCode() +
            ", custId=" + getCustId() +
            ", productId=" + getProductId() +
            ", startDate='" + getStartDate() + "'" +
            ", endDate='" + getEndDate() + "'" +
            ", activeFlag='" + isActiveFlag() + "'" +
            ", createDate='" + getCreateDate() + "'" +
            ", createBy='" + getCreateBy() + "'" +
            ", updateDate='" + getUpdateDate() + "'" +
            ", updateBy='" + getUpdateBy() + "'" +
            "}";
    }
}
