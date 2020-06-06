package com.yskc.pms.entity;

import com.yskc.pms.utile.PageResultUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsVoidePlayExample extends PageResultUtils {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsVoidePlayExample() {
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

        public Criteria andVideoContentIsNull() {
            addCriterion("video_content is null");
            return (Criteria) this;
        }

        public Criteria andVideoContentIsNotNull() {
            addCriterion("video_content is not null");
            return (Criteria) this;
        }

        public Criteria andVideoContentEqualTo(String value) {
            addCriterion("video_content =", value, "videoContent");
            return (Criteria) this;
        }

        public Criteria andVideoContentNotEqualTo(String value) {
            addCriterion("video_content <>", value, "videoContent");
            return (Criteria) this;
        }

        public Criteria andVideoContentGreaterThan(String value) {
            addCriterion("video_content >", value, "videoContent");
            return (Criteria) this;
        }

        public Criteria andVideoContentGreaterThanOrEqualTo(String value) {
            addCriterion("video_content >=", value, "videoContent");
            return (Criteria) this;
        }

        public Criteria andVideoContentLessThan(String value) {
            addCriterion("video_content <", value, "videoContent");
            return (Criteria) this;
        }

        public Criteria andVideoContentLessThanOrEqualTo(String value) {
            addCriterion("video_content <=", value, "videoContent");
            return (Criteria) this;
        }

        public Criteria andVideoContentLike(String value) {
            addCriterion("video_content like", value, "videoContent");
            return (Criteria) this;
        }

        public Criteria andVideoContentNotLike(String value) {
            addCriterion("video_content not like", value, "videoContent");
            return (Criteria) this;
        }

        public Criteria andVideoContentIn(List<String> values) {
            addCriterion("video_content in", values, "videoContent");
            return (Criteria) this;
        }

        public Criteria andVideoContentNotIn(List<String> values) {
            addCriterion("video_content not in", values, "videoContent");
            return (Criteria) this;
        }

        public Criteria andVideoContentBetween(String value1, String value2) {
            addCriterion("video_content between", value1, value2, "videoContent");
            return (Criteria) this;
        }

        public Criteria andVideoContentNotBetween(String value1, String value2) {
            addCriterion("video_content not between", value1, value2, "videoContent");
            return (Criteria) this;
        }

        public Criteria andVideoCheckScheduleIsNull() {
            addCriterion("video_check_schedule is null");
            return (Criteria) this;
        }

        public Criteria andVideoCheckScheduleIsNotNull() {
            addCriterion("video_check_schedule is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCheckScheduleEqualTo(String value) {
            addCriterion("video_check_schedule =", value, "videoCheckSchedule");
            return (Criteria) this;
        }

        public Criteria andVideoCheckScheduleNotEqualTo(String value) {
            addCriterion("video_check_schedule <>", value, "videoCheckSchedule");
            return (Criteria) this;
        }

        public Criteria andVideoCheckScheduleGreaterThan(String value) {
            addCriterion("video_check_schedule >", value, "videoCheckSchedule");
            return (Criteria) this;
        }

        public Criteria andVideoCheckScheduleGreaterThanOrEqualTo(String value) {
            addCriterion("video_check_schedule >=", value, "videoCheckSchedule");
            return (Criteria) this;
        }

        public Criteria andVideoCheckScheduleLessThan(String value) {
            addCriterion("video_check_schedule <", value, "videoCheckSchedule");
            return (Criteria) this;
        }

        public Criteria andVideoCheckScheduleLessThanOrEqualTo(String value) {
            addCriterion("video_check_schedule <=", value, "videoCheckSchedule");
            return (Criteria) this;
        }

        public Criteria andVideoCheckScheduleLike(String value) {
            addCriterion("video_check_schedule like", value, "videoCheckSchedule");
            return (Criteria) this;
        }

        public Criteria andVideoCheckScheduleNotLike(String value) {
            addCriterion("video_check_schedule not like", value, "videoCheckSchedule");
            return (Criteria) this;
        }

        public Criteria andVideoCheckScheduleIn(List<String> values) {
            addCriterion("video_check_schedule in", values, "videoCheckSchedule");
            return (Criteria) this;
        }

        public Criteria andVideoCheckScheduleNotIn(List<String> values) {
            addCriterion("video_check_schedule not in", values, "videoCheckSchedule");
            return (Criteria) this;
        }

        public Criteria andVideoCheckScheduleBetween(String value1, String value2) {
            addCriterion("video_check_schedule between", value1, value2, "videoCheckSchedule");
            return (Criteria) this;
        }

        public Criteria andVideoCheckScheduleNotBetween(String value1, String value2) {
            addCriterion("video_check_schedule not between", value1, value2, "videoCheckSchedule");
            return (Criteria) this;
        }

        public Criteria andVideoCheckDefeatedCauseIsNull() {
            addCriterion("video_check_defeated_cause is null");
            return (Criteria) this;
        }

        public Criteria andVideoCheckDefeatedCauseIsNotNull() {
            addCriterion("video_check_defeated_cause is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCheckDefeatedCauseEqualTo(String value) {
            addCriterion("video_check_defeated_cause =", value, "videoCheckDefeatedCause");
            return (Criteria) this;
        }

        public Criteria andVideoCheckDefeatedCauseNotEqualTo(String value) {
            addCriterion("video_check_defeated_cause <>", value, "videoCheckDefeatedCause");
            return (Criteria) this;
        }

        public Criteria andVideoCheckDefeatedCauseGreaterThan(String value) {
            addCriterion("video_check_defeated_cause >", value, "videoCheckDefeatedCause");
            return (Criteria) this;
        }

        public Criteria andVideoCheckDefeatedCauseGreaterThanOrEqualTo(String value) {
            addCriterion("video_check_defeated_cause >=", value, "videoCheckDefeatedCause");
            return (Criteria) this;
        }

        public Criteria andVideoCheckDefeatedCauseLessThan(String value) {
            addCriterion("video_check_defeated_cause <", value, "videoCheckDefeatedCause");
            return (Criteria) this;
        }

        public Criteria andVideoCheckDefeatedCauseLessThanOrEqualTo(String value) {
            addCriterion("video_check_defeated_cause <=", value, "videoCheckDefeatedCause");
            return (Criteria) this;
        }

        public Criteria andVideoCheckDefeatedCauseLike(String value) {
            addCriterion("video_check_defeated_cause like", value, "videoCheckDefeatedCause");
            return (Criteria) this;
        }

        public Criteria andVideoCheckDefeatedCauseNotLike(String value) {
            addCriterion("video_check_defeated_cause not like", value, "videoCheckDefeatedCause");
            return (Criteria) this;
        }

        public Criteria andVideoCheckDefeatedCauseIn(List<String> values) {
            addCriterion("video_check_defeated_cause in", values, "videoCheckDefeatedCause");
            return (Criteria) this;
        }

        public Criteria andVideoCheckDefeatedCauseNotIn(List<String> values) {
            addCriterion("video_check_defeated_cause not in", values, "videoCheckDefeatedCause");
            return (Criteria) this;
        }

        public Criteria andVideoCheckDefeatedCauseBetween(String value1, String value2) {
            addCriterion("video_check_defeated_cause between", value1, value2, "videoCheckDefeatedCause");
            return (Criteria) this;
        }

        public Criteria andVideoCheckDefeatedCauseNotBetween(String value1, String value2) {
            addCriterion("video_check_defeated_cause not between", value1, value2, "videoCheckDefeatedCause");
            return (Criteria) this;
        }

        public Criteria andApplyCheckTimeIsNull() {
            addCriterion("apply_check_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyCheckTimeIsNotNull() {
            addCriterion("apply_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCheckTimeEqualTo(Date value) {
            addCriterion("apply_check_time =", value, "applyCheckTime");
            return (Criteria) this;
        }

        public Criteria andApplyCheckTimeNotEqualTo(Date value) {
            addCriterion("apply_check_time <>", value, "applyCheckTime");
            return (Criteria) this;
        }

        public Criteria andApplyCheckTimeGreaterThan(Date value) {
            addCriterion("apply_check_time >", value, "applyCheckTime");
            return (Criteria) this;
        }

        public Criteria andApplyCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_check_time >=", value, "applyCheckTime");
            return (Criteria) this;
        }

        public Criteria andApplyCheckTimeLessThan(Date value) {
            addCriterion("apply_check_time <", value, "applyCheckTime");
            return (Criteria) this;
        }

        public Criteria andApplyCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_check_time <=", value, "applyCheckTime");
            return (Criteria) this;
        }

        public Criteria andApplyCheckTimeIn(List<Date> values) {
            addCriterion("apply_check_time in", values, "applyCheckTime");
            return (Criteria) this;
        }

        public Criteria andApplyCheckTimeNotIn(List<Date> values) {
            addCriterion("apply_check_time not in", values, "applyCheckTime");
            return (Criteria) this;
        }

        public Criteria andApplyCheckTimeBetween(Date value1, Date value2) {
            addCriterion("apply_check_time between", value1, value2, "applyCheckTime");
            return (Criteria) this;
        }

        public Criteria andApplyCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_check_time not between", value1, value2, "applyCheckTime");
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