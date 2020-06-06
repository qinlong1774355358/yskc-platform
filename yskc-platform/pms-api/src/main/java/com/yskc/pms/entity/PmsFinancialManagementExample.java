package com.yskc.pms.entity;

import com.yskc.pms.utile.PageResultUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PmsFinancialManagementExample extends PageResultUtils {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsFinancialManagementExample() {
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

        public Criteria andAccoutSumBalanceIsNull() {
            addCriterion("accout_sum_balance is null");
            return (Criteria) this;
        }

        public Criteria andAccoutSumBalanceIsNotNull() {
            addCriterion("accout_sum_balance is not null");
            return (Criteria) this;
        }

        public Criteria andAccoutSumBalanceEqualTo(BigDecimal value) {
            addCriterion("accout_sum_balance =", value, "accoutSumBalance");
            return (Criteria) this;
        }

        public Criteria andAccoutSumBalanceNotEqualTo(BigDecimal value) {
            addCriterion("accout_sum_balance <>", value, "accoutSumBalance");
            return (Criteria) this;
        }

        public Criteria andAccoutSumBalanceGreaterThan(BigDecimal value) {
            addCriterion("accout_sum_balance >", value, "accoutSumBalance");
            return (Criteria) this;
        }

        public Criteria andAccoutSumBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("accout_sum_balance >=", value, "accoutSumBalance");
            return (Criteria) this;
        }

        public Criteria andAccoutSumBalanceLessThan(BigDecimal value) {
            addCriterion("accout_sum_balance <", value, "accoutSumBalance");
            return (Criteria) this;
        }

        public Criteria andAccoutSumBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("accout_sum_balance <=", value, "accoutSumBalance");
            return (Criteria) this;
        }

        public Criteria andAccoutSumBalanceIn(List<BigDecimal> values) {
            addCriterion("accout_sum_balance in", values, "accoutSumBalance");
            return (Criteria) this;
        }

        public Criteria andAccoutSumBalanceNotIn(List<BigDecimal> values) {
            addCriterion("accout_sum_balance not in", values, "accoutSumBalance");
            return (Criteria) this;
        }

        public Criteria andAccoutSumBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accout_sum_balance between", value1, value2, "accoutSumBalance");
            return (Criteria) this;
        }

        public Criteria andAccoutSumBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accout_sum_balance not between", value1, value2, "accoutSumBalance");
            return (Criteria) this;
        }

        public Criteria andAccountWithdrawalBalanceIsNull() {
            addCriterion("account_withdrawal_balance is null");
            return (Criteria) this;
        }

        public Criteria andAccountWithdrawalBalanceIsNotNull() {
            addCriterion("account_withdrawal_balance is not null");
            return (Criteria) this;
        }

        public Criteria andAccountWithdrawalBalanceEqualTo(BigDecimal value) {
            addCriterion("account_withdrawal_balance =", value, "accountWithdrawalBalance");
            return (Criteria) this;
        }

        public Criteria andAccountWithdrawalBalanceNotEqualTo(BigDecimal value) {
            addCriterion("account_withdrawal_balance <>", value, "accountWithdrawalBalance");
            return (Criteria) this;
        }

        public Criteria andAccountWithdrawalBalanceGreaterThan(BigDecimal value) {
            addCriterion("account_withdrawal_balance >", value, "accountWithdrawalBalance");
            return (Criteria) this;
        }

        public Criteria andAccountWithdrawalBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("account_withdrawal_balance >=", value, "accountWithdrawalBalance");
            return (Criteria) this;
        }

        public Criteria andAccountWithdrawalBalanceLessThan(BigDecimal value) {
            addCriterion("account_withdrawal_balance <", value, "accountWithdrawalBalance");
            return (Criteria) this;
        }

        public Criteria andAccountWithdrawalBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("account_withdrawal_balance <=", value, "accountWithdrawalBalance");
            return (Criteria) this;
        }

        public Criteria andAccountWithdrawalBalanceIn(List<BigDecimal> values) {
            addCriterion("account_withdrawal_balance in", values, "accountWithdrawalBalance");
            return (Criteria) this;
        }

        public Criteria andAccountWithdrawalBalanceNotIn(List<BigDecimal> values) {
            addCriterion("account_withdrawal_balance not in", values, "accountWithdrawalBalance");
            return (Criteria) this;
        }

        public Criteria andAccountWithdrawalBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account_withdrawal_balance between", value1, value2, "accountWithdrawalBalance");
            return (Criteria) this;
        }

        public Criteria andAccountWithdrawalBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account_withdrawal_balance not between", value1, value2, "accountWithdrawalBalance");
            return (Criteria) this;
        }

        public Criteria andAccountExpendSumBalanceIsNull() {
            addCriterion("account_expend_sum_balance is null");
            return (Criteria) this;
        }

        public Criteria andAccountExpendSumBalanceIsNotNull() {
            addCriterion("account_expend_sum_balance is not null");
            return (Criteria) this;
        }

        public Criteria andAccountExpendSumBalanceEqualTo(BigDecimal value) {
            addCriterion("account_expend_sum_balance =", value, "accountExpendSumBalance");
            return (Criteria) this;
        }

        public Criteria andAccountExpendSumBalanceNotEqualTo(BigDecimal value) {
            addCriterion("account_expend_sum_balance <>", value, "accountExpendSumBalance");
            return (Criteria) this;
        }

        public Criteria andAccountExpendSumBalanceGreaterThan(BigDecimal value) {
            addCriterion("account_expend_sum_balance >", value, "accountExpendSumBalance");
            return (Criteria) this;
        }

        public Criteria andAccountExpendSumBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("account_expend_sum_balance >=", value, "accountExpendSumBalance");
            return (Criteria) this;
        }

        public Criteria andAccountExpendSumBalanceLessThan(BigDecimal value) {
            addCriterion("account_expend_sum_balance <", value, "accountExpendSumBalance");
            return (Criteria) this;
        }

        public Criteria andAccountExpendSumBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("account_expend_sum_balance <=", value, "accountExpendSumBalance");
            return (Criteria) this;
        }

        public Criteria andAccountExpendSumBalanceIn(List<BigDecimal> values) {
            addCriterion("account_expend_sum_balance in", values, "accountExpendSumBalance");
            return (Criteria) this;
        }

        public Criteria andAccountExpendSumBalanceNotIn(List<BigDecimal> values) {
            addCriterion("account_expend_sum_balance not in", values, "accountExpendSumBalance");
            return (Criteria) this;
        }

        public Criteria andAccountExpendSumBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account_expend_sum_balance between", value1, value2, "accountExpendSumBalance");
            return (Criteria) this;
        }

        public Criteria andAccountExpendSumBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account_expend_sum_balance not between", value1, value2, "accountExpendSumBalance");
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