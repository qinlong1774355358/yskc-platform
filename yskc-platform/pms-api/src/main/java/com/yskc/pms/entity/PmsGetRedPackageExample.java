package com.yskc.pms.entity;

import com.yskc.pms.utile.PageResultUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PmsGetRedPackageExample extends PageResultUtils {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsGetRedPackageExample() {
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

        public Criteria andRedPackageNumberIsNull() {
            addCriterion("red_package_number is null");
            return (Criteria) this;
        }

        public Criteria andRedPackageNumberIsNotNull() {
            addCriterion("red_package_number is not null");
            return (Criteria) this;
        }

        public Criteria andRedPackageNumberEqualTo(String value) {
            addCriterion("red_package_number =", value, "redPackageNumber");
            return (Criteria) this;
        }

        public Criteria andRedPackageNumberNotEqualTo(String value) {
            addCriterion("red_package_number <>", value, "redPackageNumber");
            return (Criteria) this;
        }

        public Criteria andRedPackageNumberGreaterThan(String value) {
            addCriterion("red_package_number >", value, "redPackageNumber");
            return (Criteria) this;
        }

        public Criteria andRedPackageNumberGreaterThanOrEqualTo(String value) {
            addCriterion("red_package_number >=", value, "redPackageNumber");
            return (Criteria) this;
        }

        public Criteria andRedPackageNumberLessThan(String value) {
            addCriterion("red_package_number <", value, "redPackageNumber");
            return (Criteria) this;
        }

        public Criteria andRedPackageNumberLessThanOrEqualTo(String value) {
            addCriterion("red_package_number <=", value, "redPackageNumber");
            return (Criteria) this;
        }

        public Criteria andRedPackageNumberLike(String value) {
            addCriterion("red_package_number like", value, "redPackageNumber");
            return (Criteria) this;
        }

        public Criteria andRedPackageNumberNotLike(String value) {
            addCriterion("red_package_number not like", value, "redPackageNumber");
            return (Criteria) this;
        }

        public Criteria andRedPackageNumberIn(List<String> values) {
            addCriterion("red_package_number in", values, "redPackageNumber");
            return (Criteria) this;
        }

        public Criteria andRedPackageNumberNotIn(List<String> values) {
            addCriterion("red_package_number not in", values, "redPackageNumber");
            return (Criteria) this;
        }

        public Criteria andRedPackageNumberBetween(String value1, String value2) {
            addCriterion("red_package_number between", value1, value2, "redPackageNumber");
            return (Criteria) this;
        }

        public Criteria andRedPackageNumberNotBetween(String value1, String value2) {
            addCriterion("red_package_number not between", value1, value2, "redPackageNumber");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalIsNull() {
            addCriterion("red_package_total is null");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalIsNotNull() {
            addCriterion("red_package_total is not null");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalEqualTo(Integer value) {
            addCriterion("red_package_total =", value, "redPackageTotal");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalNotEqualTo(Integer value) {
            addCriterion("red_package_total <>", value, "redPackageTotal");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalGreaterThan(Integer value) {
            addCriterion("red_package_total >", value, "redPackageTotal");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("red_package_total >=", value, "redPackageTotal");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalLessThan(Integer value) {
            addCriterion("red_package_total <", value, "redPackageTotal");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalLessThanOrEqualTo(Integer value) {
            addCriterion("red_package_total <=", value, "redPackageTotal");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalIn(List<Integer> values) {
            addCriterion("red_package_total in", values, "redPackageTotal");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalNotIn(List<Integer> values) {
            addCriterion("red_package_total not in", values, "redPackageTotal");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalBetween(Integer value1, Integer value2) {
            addCriterion("red_package_total between", value1, value2, "redPackageTotal");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("red_package_total not between", value1, value2, "redPackageTotal");
            return (Criteria) this;
        }

        public Criteria andRedPackageResidueIsNull() {
            addCriterion("red_package_residue is null");
            return (Criteria) this;
        }

        public Criteria andRedPackageResidueIsNotNull() {
            addCriterion("red_package_residue is not null");
            return (Criteria) this;
        }

        public Criteria andRedPackageResidueEqualTo(Integer value) {
            addCriterion("red_package_residue =", value, "redPackageResidue");
            return (Criteria) this;
        }

        public Criteria andRedPackageResidueNotEqualTo(Integer value) {
            addCriterion("red_package_residue <>", value, "redPackageResidue");
            return (Criteria) this;
        }

        public Criteria andRedPackageResidueGreaterThan(Integer value) {
            addCriterion("red_package_residue >", value, "redPackageResidue");
            return (Criteria) this;
        }

        public Criteria andRedPackageResidueGreaterThanOrEqualTo(Integer value) {
            addCriterion("red_package_residue >=", value, "redPackageResidue");
            return (Criteria) this;
        }

        public Criteria andRedPackageResidueLessThan(Integer value) {
            addCriterion("red_package_residue <", value, "redPackageResidue");
            return (Criteria) this;
        }

        public Criteria andRedPackageResidueLessThanOrEqualTo(Integer value) {
            addCriterion("red_package_residue <=", value, "redPackageResidue");
            return (Criteria) this;
        }

        public Criteria andRedPackageResidueIn(List<Integer> values) {
            addCriterion("red_package_residue in", values, "redPackageResidue");
            return (Criteria) this;
        }

        public Criteria andRedPackageResidueNotIn(List<Integer> values) {
            addCriterion("red_package_residue not in", values, "redPackageResidue");
            return (Criteria) this;
        }

        public Criteria andRedPackageResidueBetween(Integer value1, Integer value2) {
            addCriterion("red_package_residue between", value1, value2, "redPackageResidue");
            return (Criteria) this;
        }

        public Criteria andRedPackageResidueNotBetween(Integer value1, Integer value2) {
            addCriterion("red_package_residue not between", value1, value2, "redPackageResidue");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalMoneyIsNull() {
            addCriterion("red_package_total_money is null");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalMoneyIsNotNull() {
            addCriterion("red_package_total_money is not null");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalMoneyEqualTo(BigDecimal value) {
            addCriterion("red_package_total_money =", value, "redPackageTotalMoney");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalMoneyNotEqualTo(BigDecimal value) {
            addCriterion("red_package_total_money <>", value, "redPackageTotalMoney");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalMoneyGreaterThan(BigDecimal value) {
            addCriterion("red_package_total_money >", value, "redPackageTotalMoney");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("red_package_total_money >=", value, "redPackageTotalMoney");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalMoneyLessThan(BigDecimal value) {
            addCriterion("red_package_total_money <", value, "redPackageTotalMoney");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("red_package_total_money <=", value, "redPackageTotalMoney");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalMoneyIn(List<BigDecimal> values) {
            addCriterion("red_package_total_money in", values, "redPackageTotalMoney");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalMoneyNotIn(List<BigDecimal> values) {
            addCriterion("red_package_total_money not in", values, "redPackageTotalMoney");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("red_package_total_money between", value1, value2, "redPackageTotalMoney");
            return (Criteria) this;
        }

        public Criteria andRedPackageTotalMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("red_package_total_money not between", value1, value2, "redPackageTotalMoney");
            return (Criteria) this;
        }

        public Criteria andRemainingTimeIsNull() {
            addCriterion("remaining_time is null");
            return (Criteria) this;
        }

        public Criteria andRemainingTimeIsNotNull() {
            addCriterion("remaining_time is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingTimeEqualTo(Integer value) {
            addCriterion("remaining_time =", value, "remainingTime");
            return (Criteria) this;
        }

        public Criteria andRemainingTimeNotEqualTo(Integer value) {
            addCriterion("remaining_time <>", value, "remainingTime");
            return (Criteria) this;
        }

        public Criteria andRemainingTimeGreaterThan(Integer value) {
            addCriterion("remaining_time >", value, "remainingTime");
            return (Criteria) this;
        }

        public Criteria andRemainingTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("remaining_time >=", value, "remainingTime");
            return (Criteria) this;
        }

        public Criteria andRemainingTimeLessThan(Integer value) {
            addCriterion("remaining_time <", value, "remainingTime");
            return (Criteria) this;
        }

        public Criteria andRemainingTimeLessThanOrEqualTo(Integer value) {
            addCriterion("remaining_time <=", value, "remainingTime");
            return (Criteria) this;
        }

        public Criteria andRemainingTimeIn(List<Integer> values) {
            addCriterion("remaining_time in", values, "remainingTime");
            return (Criteria) this;
        }

        public Criteria andRemainingTimeNotIn(List<Integer> values) {
            addCriterion("remaining_time not in", values, "remainingTime");
            return (Criteria) this;
        }

        public Criteria andRemainingTimeBetween(Integer value1, Integer value2) {
            addCriterion("remaining_time between", value1, value2, "remainingTime");
            return (Criteria) this;
        }

        public Criteria andRemainingTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("remaining_time not between", value1, value2, "remainingTime");
            return (Criteria) this;
        }

        public Criteria andRemainingBalanceIsNull() {
            addCriterion("remaining_balance is null");
            return (Criteria) this;
        }

        public Criteria andRemainingBalanceIsNotNull() {
            addCriterion("remaining_balance is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingBalanceEqualTo(BigDecimal value) {
            addCriterion("remaining_balance =", value, "remainingBalance");
            return (Criteria) this;
        }

        public Criteria andRemainingBalanceNotEqualTo(BigDecimal value) {
            addCriterion("remaining_balance <>", value, "remainingBalance");
            return (Criteria) this;
        }

        public Criteria andRemainingBalanceGreaterThan(BigDecimal value) {
            addCriterion("remaining_balance >", value, "remainingBalance");
            return (Criteria) this;
        }

        public Criteria andRemainingBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("remaining_balance >=", value, "remainingBalance");
            return (Criteria) this;
        }

        public Criteria andRemainingBalanceLessThan(BigDecimal value) {
            addCriterion("remaining_balance <", value, "remainingBalance");
            return (Criteria) this;
        }

        public Criteria andRemainingBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("remaining_balance <=", value, "remainingBalance");
            return (Criteria) this;
        }

        public Criteria andRemainingBalanceIn(List<BigDecimal> values) {
            addCriterion("remaining_balance in", values, "remainingBalance");
            return (Criteria) this;
        }

        public Criteria andRemainingBalanceNotIn(List<BigDecimal> values) {
            addCriterion("remaining_balance not in", values, "remainingBalance");
            return (Criteria) this;
        }

        public Criteria andRemainingBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remaining_balance between", value1, value2, "remainingBalance");
            return (Criteria) this;
        }

        public Criteria andRemainingBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remaining_balance not between", value1, value2, "remainingBalance");
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