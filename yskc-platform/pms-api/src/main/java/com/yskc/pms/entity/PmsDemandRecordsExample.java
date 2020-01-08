package com.yskc.pms.entity;

import com.yskc.pms.utile.PageResultUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsDemandRecordsExample extends PageResultUtils {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsDemandRecordsExample() {
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

        public Criteria andDemandTypeIsNull() {
            addCriterion("demand_type is null");
            return (Criteria) this;
        }

        public Criteria andDemandTypeIsNotNull() {
            addCriterion("demand_type is not null");
            return (Criteria) this;
        }

        public Criteria andDemandTypeEqualTo(String value) {
            addCriterion("demand_type =", value, "demandType");
            return (Criteria) this;
        }

        public Criteria andDemandTypeNotEqualTo(String value) {
            addCriterion("demand_type <>", value, "demandType");
            return (Criteria) this;
        }

        public Criteria andDemandTypeGreaterThan(String value) {
            addCriterion("demand_type >", value, "demandType");
            return (Criteria) this;
        }

        public Criteria andDemandTypeGreaterThanOrEqualTo(String value) {
            addCriterion("demand_type >=", value, "demandType");
            return (Criteria) this;
        }

        public Criteria andDemandTypeLessThan(String value) {
            addCriterion("demand_type <", value, "demandType");
            return (Criteria) this;
        }

        public Criteria andDemandTypeLessThanOrEqualTo(String value) {
            addCriterion("demand_type <=", value, "demandType");
            return (Criteria) this;
        }

        public Criteria andDemandTypeLike(String value) {
            addCriterion("demand_type like", value, "demandType");
            return (Criteria) this;
        }

        public Criteria andDemandTypeNotLike(String value) {
            addCriterion("demand_type not like", value, "demandType");
            return (Criteria) this;
        }

        public Criteria andDemandTypeIn(List<String> values) {
            addCriterion("demand_type in", values, "demandType");
            return (Criteria) this;
        }

        public Criteria andDemandTypeNotIn(List<String> values) {
            addCriterion("demand_type not in", values, "demandType");
            return (Criteria) this;
        }

        public Criteria andDemandTypeBetween(String value1, String value2) {
            addCriterion("demand_type between", value1, value2, "demandType");
            return (Criteria) this;
        }

        public Criteria andDemandTypeNotBetween(String value1, String value2) {
            addCriterion("demand_type not between", value1, value2, "demandType");
            return (Criteria) this;
        }

        public Criteria andDemandSizeIsNull() {
            addCriterion("demand_size is null");
            return (Criteria) this;
        }

        public Criteria andDemandSizeIsNotNull() {
            addCriterion("demand_size is not null");
            return (Criteria) this;
        }

        public Criteria andDemandSizeEqualTo(Integer value) {
            addCriterion("demand_size =", value, "demandSize");
            return (Criteria) this;
        }

        public Criteria andDemandSizeNotEqualTo(Integer value) {
            addCriterion("demand_size <>", value, "demandSize");
            return (Criteria) this;
        }

        public Criteria andDemandSizeGreaterThan(Integer value) {
            addCriterion("demand_size >", value, "demandSize");
            return (Criteria) this;
        }

        public Criteria andDemandSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_size >=", value, "demandSize");
            return (Criteria) this;
        }

        public Criteria andDemandSizeLessThan(Integer value) {
            addCriterion("demand_size <", value, "demandSize");
            return (Criteria) this;
        }

        public Criteria andDemandSizeLessThanOrEqualTo(Integer value) {
            addCriterion("demand_size <=", value, "demandSize");
            return (Criteria) this;
        }

        public Criteria andDemandSizeIn(List<Integer> values) {
            addCriterion("demand_size in", values, "demandSize");
            return (Criteria) this;
        }

        public Criteria andDemandSizeNotIn(List<Integer> values) {
            addCriterion("demand_size not in", values, "demandSize");
            return (Criteria) this;
        }

        public Criteria andDemandSizeBetween(Integer value1, Integer value2) {
            addCriterion("demand_size between", value1, value2, "demandSize");
            return (Criteria) this;
        }

        public Criteria andDemandSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_size not between", value1, value2, "demandSize");
            return (Criteria) this;
        }

        public Criteria andOpenedTimeIsNull() {
            addCriterion("opened_time is null");
            return (Criteria) this;
        }

        public Criteria andOpenedTimeIsNotNull() {
            addCriterion("opened_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpenedTimeEqualTo(Date value) {
            addCriterion("opened_time =", value, "openedTime");
            return (Criteria) this;
        }

        public Criteria andOpenedTimeNotEqualTo(Date value) {
            addCriterion("opened_time <>", value, "openedTime");
            return (Criteria) this;
        }

        public Criteria andOpenedTimeGreaterThan(Date value) {
            addCriterion("opened_time >", value, "openedTime");
            return (Criteria) this;
        }

        public Criteria andOpenedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("opened_time >=", value, "openedTime");
            return (Criteria) this;
        }

        public Criteria andOpenedTimeLessThan(Date value) {
            addCriterion("opened_time <", value, "openedTime");
            return (Criteria) this;
        }

        public Criteria andOpenedTimeLessThanOrEqualTo(Date value) {
            addCriterion("opened_time <=", value, "openedTime");
            return (Criteria) this;
        }

        public Criteria andOpenedTimeIn(List<Date> values) {
            addCriterion("opened_time in", values, "openedTime");
            return (Criteria) this;
        }

        public Criteria andOpenedTimeNotIn(List<Date> values) {
            addCriterion("opened_time not in", values, "openedTime");
            return (Criteria) this;
        }

        public Criteria andOpenedTimeBetween(Date value1, Date value2) {
            addCriterion("opened_time between", value1, value2, "openedTime");
            return (Criteria) this;
        }

        public Criteria andOpenedTimeNotBetween(Date value1, Date value2) {
            addCriterion("opened_time not between", value1, value2, "openedTime");
            return (Criteria) this;
        }

        public Criteria andOperationStatusIsNull() {
            addCriterion("operation_status is null");
            return (Criteria) this;
        }

        public Criteria andOperationStatusIsNotNull() {
            addCriterion("operation_status is not null");
            return (Criteria) this;
        }

        public Criteria andOperationStatusEqualTo(Integer value) {
            addCriterion("operation_status =", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusNotEqualTo(Integer value) {
            addCriterion("operation_status <>", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusGreaterThan(Integer value) {
            addCriterion("operation_status >", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation_status >=", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusLessThan(Integer value) {
            addCriterion("operation_status <", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusLessThanOrEqualTo(Integer value) {
            addCriterion("operation_status <=", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusIn(List<Integer> values) {
            addCriterion("operation_status in", values, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusNotIn(List<Integer> values) {
            addCriterion("operation_status not in", values, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusBetween(Integer value1, Integer value2) {
            addCriterion("operation_status between", value1, value2, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("operation_status not between", value1, value2, "operationStatus");
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