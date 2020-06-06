package com.yskc.pms.entity;

import com.yskc.pms.utile.PageResultUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsRedPacketExample extends PageResultUtils {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsRedPacketExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLike(String value) {
            addCriterion("serial_number like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotLike(String value) {
            addCriterion("serial_number not like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<String> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<String> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andRedBagTypeIsNull() {
            addCriterion("red_bag_type is null");
            return (Criteria) this;
        }

        public Criteria andRedBagTypeIsNotNull() {
            addCriterion("red_bag_type is not null");
            return (Criteria) this;
        }

        public Criteria andRedBagTypeEqualTo(Integer value) {
            addCriterion("red_bag_type =", value, "redBagType");
            return (Criteria) this;
        }

        public Criteria andRedBagTypeNotEqualTo(Integer value) {
            addCriterion("red_bag_type <>", value, "redBagType");
            return (Criteria) this;
        }

        public Criteria andRedBagTypeGreaterThan(Integer value) {
            addCriterion("red_bag_type >", value, "redBagType");
            return (Criteria) this;
        }

        public Criteria andRedBagTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("red_bag_type >=", value, "redBagType");
            return (Criteria) this;
        }

        public Criteria andRedBagTypeLessThan(Integer value) {
            addCriterion("red_bag_type <", value, "redBagType");
            return (Criteria) this;
        }

        public Criteria andRedBagTypeLessThanOrEqualTo(Integer value) {
            addCriterion("red_bag_type <=", value, "redBagType");
            return (Criteria) this;
        }

        public Criteria andRedBagTypeIn(List<Integer> values) {
            addCriterion("red_bag_type in", values, "redBagType");
            return (Criteria) this;
        }

        public Criteria andRedBagTypeNotIn(List<Integer> values) {
            addCriterion("red_bag_type not in", values, "redBagType");
            return (Criteria) this;
        }

        public Criteria andRedBagTypeBetween(Integer value1, Integer value2) {
            addCriterion("red_bag_type between", value1, value2, "redBagType");
            return (Criteria) this;
        }

        public Criteria andRedBagTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("red_bag_type not between", value1, value2, "redBagType");
            return (Criteria) this;
        }

        public Criteria andRedBagMoneyIsNull() {
            addCriterion("red_bag_money is null");
            return (Criteria) this;
        }

        public Criteria andRedBagMoneyIsNotNull() {
            addCriterion("red_bag_money is not null");
            return (Criteria) this;
        }

        public Criteria andRedBagMoneyEqualTo(Long value) {
            addCriterion("red_bag_money =", value, "redBagMoney");
            return (Criteria) this;
        }

        public Criteria andRedBagMoneyNotEqualTo(Long value) {
            addCriterion("red_bag_money <>", value, "redBagMoney");
            return (Criteria) this;
        }

        public Criteria andRedBagMoneyGreaterThan(Long value) {
            addCriterion("red_bag_money >", value, "redBagMoney");
            return (Criteria) this;
        }

        public Criteria andRedBagMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("red_bag_money >=", value, "redBagMoney");
            return (Criteria) this;
        }

        public Criteria andRedBagMoneyLessThan(Long value) {
            addCriterion("red_bag_money <", value, "redBagMoney");
            return (Criteria) this;
        }

        public Criteria andRedBagMoneyLessThanOrEqualTo(Long value) {
            addCriterion("red_bag_money <=", value, "redBagMoney");
            return (Criteria) this;
        }

        public Criteria andRedBagMoneyIn(List<Long> values) {
            addCriterion("red_bag_money in", values, "redBagMoney");
            return (Criteria) this;
        }

        public Criteria andRedBagMoneyNotIn(List<Long> values) {
            addCriterion("red_bag_money not in", values, "redBagMoney");
            return (Criteria) this;
        }

        public Criteria andRedBagMoneyBetween(Long value1, Long value2) {
            addCriterion("red_bag_money between", value1, value2, "redBagMoney");
            return (Criteria) this;
        }

        public Criteria andRedBagMoneyNotBetween(Long value1, Long value2) {
            addCriterion("red_bag_money not between", value1, value2, "redBagMoney");
            return (Criteria) this;
        }

        public Criteria andEfficaciousTimeIsNull() {
            addCriterion("efficacious_time is null");
            return (Criteria) this;
        }

        public Criteria andEfficaciousTimeIsNotNull() {
            addCriterion("efficacious_time is not null");
            return (Criteria) this;
        }

        public Criteria andEfficaciousTimeEqualTo(Date value) {
            addCriterion("efficacious_time =", value, "efficaciousTime");
            return (Criteria) this;
        }

        public Criteria andEfficaciousTimeNotEqualTo(Date value) {
            addCriterion("efficacious_time <>", value, "efficaciousTime");
            return (Criteria) this;
        }

        public Criteria andEfficaciousTimeGreaterThan(Date value) {
            addCriterion("efficacious_time >", value, "efficaciousTime");
            return (Criteria) this;
        }

        public Criteria andEfficaciousTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("efficacious_time >=", value, "efficaciousTime");
            return (Criteria) this;
        }

        public Criteria andEfficaciousTimeLessThan(Date value) {
            addCriterion("efficacious_time <", value, "efficaciousTime");
            return (Criteria) this;
        }

        public Criteria andEfficaciousTimeLessThanOrEqualTo(Date value) {
            addCriterion("efficacious_time <=", value, "efficaciousTime");
            return (Criteria) this;
        }

        public Criteria andEfficaciousTimeIn(List<Date> values) {
            addCriterion("efficacious_time in", values, "efficaciousTime");
            return (Criteria) this;
        }

        public Criteria andEfficaciousTimeNotIn(List<Date> values) {
            addCriterion("efficacious_time not in", values, "efficaciousTime");
            return (Criteria) this;
        }

        public Criteria andEfficaciousTimeBetween(Date value1, Date value2) {
            addCriterion("efficacious_time between", value1, value2, "efficaciousTime");
            return (Criteria) this;
        }

        public Criteria andEfficaciousTimeNotBetween(Date value1, Date value2) {
            addCriterion("efficacious_time not between", value1, value2, "efficaciousTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNull() {
            addCriterion("creation_time is null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNotNull() {
            addCriterion("creation_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeEqualTo(Date value) {
            addCriterion("creation_time =", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotEqualTo(Date value) {
            addCriterion("creation_time <>", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThan(Date value) {
            addCriterion("creation_time >", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creation_time >=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThan(Date value) {
            addCriterion("creation_time <", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThanOrEqualTo(Date value) {
            addCriterion("creation_time <=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIn(List<Date> values) {
            addCriterion("creation_time in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotIn(List<Date> values) {
            addCriterion("creation_time not in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeBetween(Date value1, Date value2) {
            addCriterion("creation_time between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotBetween(Date value1, Date value2) {
            addCriterion("creation_time not between", value1, value2, "creationTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}