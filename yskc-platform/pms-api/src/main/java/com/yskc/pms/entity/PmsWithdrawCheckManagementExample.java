package com.yskc.pms.entity;

import com.yskc.pms.utile.PageResultUtils;

import java.util.ArrayList;
import java.util.List;

public class PmsWithdrawCheckManagementExample extends PageResultUtils {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsWithdrawCheckManagementExample() {
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

        public Criteria andWithdrawDepositScheduleIsNull() {
            addCriterion("withdraw_deposit_schedule is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawDepositScheduleIsNotNull() {
            addCriterion("withdraw_deposit_schedule is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawDepositScheduleEqualTo(Long value) {
            addCriterion("withdraw_deposit_schedule =", value, "withdrawDepositSchedule");
            return (Criteria) this;
        }

        public Criteria andWithdrawDepositScheduleNotEqualTo(Long value) {
            addCriterion("withdraw_deposit_schedule <>", value, "withdrawDepositSchedule");
            return (Criteria) this;
        }

        public Criteria andWithdrawDepositScheduleGreaterThan(Long value) {
            addCriterion("withdraw_deposit_schedule >", value, "withdrawDepositSchedule");
            return (Criteria) this;
        }

        public Criteria andWithdrawDepositScheduleGreaterThanOrEqualTo(Long value) {
            addCriterion("withdraw_deposit_schedule >=", value, "withdrawDepositSchedule");
            return (Criteria) this;
        }

        public Criteria andWithdrawDepositScheduleLessThan(Long value) {
            addCriterion("withdraw_deposit_schedule <", value, "withdrawDepositSchedule");
            return (Criteria) this;
        }

        public Criteria andWithdrawDepositScheduleLessThanOrEqualTo(Long value) {
            addCriterion("withdraw_deposit_schedule <=", value, "withdrawDepositSchedule");
            return (Criteria) this;
        }

        public Criteria andWithdrawDepositScheduleIn(List<Long> values) {
            addCriterion("withdraw_deposit_schedule in", values, "withdrawDepositSchedule");
            return (Criteria) this;
        }

        public Criteria andWithdrawDepositScheduleNotIn(List<Long> values) {
            addCriterion("withdraw_deposit_schedule not in", values, "withdrawDepositSchedule");
            return (Criteria) this;
        }

        public Criteria andWithdrawDepositScheduleBetween(Long value1, Long value2) {
            addCriterion("withdraw_deposit_schedule between", value1, value2, "withdrawDepositSchedule");
            return (Criteria) this;
        }

        public Criteria andWithdrawDepositScheduleNotBetween(Long value1, Long value2) {
            addCriterion("withdraw_deposit_schedule not between", value1, value2, "withdrawDepositSchedule");
            return (Criteria) this;
        }

        public Criteria andCauseOfFailureIsNull() {
            addCriterion("cause_of_failure is null");
            return (Criteria) this;
        }

        public Criteria andCauseOfFailureIsNotNull() {
            addCriterion("cause_of_failure is not null");
            return (Criteria) this;
        }

        public Criteria andCauseOfFailureEqualTo(String value) {
            addCriterion("cause_of_failure =", value, "causeOfFailure");
            return (Criteria) this;
        }

        public Criteria andCauseOfFailureNotEqualTo(String value) {
            addCriterion("cause_of_failure <>", value, "causeOfFailure");
            return (Criteria) this;
        }

        public Criteria andCauseOfFailureGreaterThan(String value) {
            addCriterion("cause_of_failure >", value, "causeOfFailure");
            return (Criteria) this;
        }

        public Criteria andCauseOfFailureGreaterThanOrEqualTo(String value) {
            addCriterion("cause_of_failure >=", value, "causeOfFailure");
            return (Criteria) this;
        }

        public Criteria andCauseOfFailureLessThan(String value) {
            addCriterion("cause_of_failure <", value, "causeOfFailure");
            return (Criteria) this;
        }

        public Criteria andCauseOfFailureLessThanOrEqualTo(String value) {
            addCriterion("cause_of_failure <=", value, "causeOfFailure");
            return (Criteria) this;
        }

        public Criteria andCauseOfFailureLike(String value) {
            addCriterion("cause_of_failure like", value, "causeOfFailure");
            return (Criteria) this;
        }

        public Criteria andCauseOfFailureNotLike(String value) {
            addCriterion("cause_of_failure not like", value, "causeOfFailure");
            return (Criteria) this;
        }

        public Criteria andCauseOfFailureIn(List<String> values) {
            addCriterion("cause_of_failure in", values, "causeOfFailure");
            return (Criteria) this;
        }

        public Criteria andCauseOfFailureNotIn(List<String> values) {
            addCriterion("cause_of_failure not in", values, "causeOfFailure");
            return (Criteria) this;
        }

        public Criteria andCauseOfFailureBetween(String value1, String value2) {
            addCriterion("cause_of_failure between", value1, value2, "causeOfFailure");
            return (Criteria) this;
        }

        public Criteria andCauseOfFailureNotBetween(String value1, String value2) {
            addCriterion("cause_of_failure not between", value1, value2, "causeOfFailure");
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