package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class LyUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LyUserExample() {
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

        public Criteria andUsersIdIsNull() {
            addCriterion("users_id is null");
            return (Criteria) this;
        }

        public Criteria andUsersIdIsNotNull() {
            addCriterion("users_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsersIdEqualTo(String value) {
            addCriterion("users_id =", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotEqualTo(String value) {
            addCriterion("users_id <>", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThan(String value) {
            addCriterion("users_id >", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThanOrEqualTo(String value) {
            addCriterion("users_id >=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThan(String value) {
            addCriterion("users_id <", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThanOrEqualTo(String value) {
            addCriterion("users_id <=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLike(String value) {
            addCriterion("users_id like", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotLike(String value) {
            addCriterion("users_id not like", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdIn(List<String> values) {
            addCriterion("users_id in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotIn(List<String> values) {
            addCriterion("users_id not in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdBetween(String value1, String value2) {
            addCriterion("users_id between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotBetween(String value1, String value2) {
            addCriterion("users_id not between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("user_sex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("user_sex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(String value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(String value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(String value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(String value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(String value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(String value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLike(String value) {
            addCriterion("user_status like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotLike(String value) {
            addCriterion("user_status not like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<String> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<String> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(String value1, String value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(String value1, String value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserGradeIsNull() {
            addCriterion("user_grade is null");
            return (Criteria) this;
        }

        public Criteria andUserGradeIsNotNull() {
            addCriterion("user_grade is not null");
            return (Criteria) this;
        }

        public Criteria andUserGradeEqualTo(String value) {
            addCriterion("user_grade =", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotEqualTo(String value) {
            addCriterion("user_grade <>", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeGreaterThan(String value) {
            addCriterion("user_grade >", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeGreaterThanOrEqualTo(String value) {
            addCriterion("user_grade >=", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeLessThan(String value) {
            addCriterion("user_grade <", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeLessThanOrEqualTo(String value) {
            addCriterion("user_grade <=", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeLike(String value) {
            addCriterion("user_grade like", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotLike(String value) {
            addCriterion("user_grade not like", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeIn(List<String> values) {
            addCriterion("user_grade in", values, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotIn(List<String> values) {
            addCriterion("user_grade not in", values, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeBetween(String value1, String value2) {
            addCriterion("user_grade between", value1, value2, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotBetween(String value1, String value2) {
            addCriterion("user_grade not between", value1, value2, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserEndTimeIsNull() {
            addCriterion("user_end_time is null");
            return (Criteria) this;
        }

        public Criteria andUserEndTimeIsNotNull() {
            addCriterion("user_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserEndTimeEqualTo(String value) {
            addCriterion("user_end_time =", value, "userEndTime");
            return (Criteria) this;
        }

        public Criteria andUserEndTimeNotEqualTo(String value) {
            addCriterion("user_end_time <>", value, "userEndTime");
            return (Criteria) this;
        }

        public Criteria andUserEndTimeGreaterThan(String value) {
            addCriterion("user_end_time >", value, "userEndTime");
            return (Criteria) this;
        }

        public Criteria andUserEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("user_end_time >=", value, "userEndTime");
            return (Criteria) this;
        }

        public Criteria andUserEndTimeLessThan(String value) {
            addCriterion("user_end_time <", value, "userEndTime");
            return (Criteria) this;
        }

        public Criteria andUserEndTimeLessThanOrEqualTo(String value) {
            addCriterion("user_end_time <=", value, "userEndTime");
            return (Criteria) this;
        }

        public Criteria andUserEndTimeLike(String value) {
            addCriterion("user_end_time like", value, "userEndTime");
            return (Criteria) this;
        }

        public Criteria andUserEndTimeNotLike(String value) {
            addCriterion("user_end_time not like", value, "userEndTime");
            return (Criteria) this;
        }

        public Criteria andUserEndTimeIn(List<String> values) {
            addCriterion("user_end_time in", values, "userEndTime");
            return (Criteria) this;
        }

        public Criteria andUserEndTimeNotIn(List<String> values) {
            addCriterion("user_end_time not in", values, "userEndTime");
            return (Criteria) this;
        }

        public Criteria andUserEndTimeBetween(String value1, String value2) {
            addCriterion("user_end_time between", value1, value2, "userEndTime");
            return (Criteria) this;
        }

        public Criteria andUserEndTimeNotBetween(String value1, String value2) {
            addCriterion("user_end_time not between", value1, value2, "userEndTime");
            return (Criteria) this;
        }

        public Criteria andUserDescIsNull() {
            addCriterion("user_desc is null");
            return (Criteria) this;
        }

        public Criteria andUserDescIsNotNull() {
            addCriterion("user_desc is not null");
            return (Criteria) this;
        }

        public Criteria andUserDescEqualTo(String value) {
            addCriterion("user_desc =", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescNotEqualTo(String value) {
            addCriterion("user_desc <>", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescGreaterThan(String value) {
            addCriterion("user_desc >", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescGreaterThanOrEqualTo(String value) {
            addCriterion("user_desc >=", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescLessThan(String value) {
            addCriterion("user_desc <", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescLessThanOrEqualTo(String value) {
            addCriterion("user_desc <=", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescLike(String value) {
            addCriterion("user_desc like", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescNotLike(String value) {
            addCriterion("user_desc not like", value, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescIn(List<String> values) {
            addCriterion("user_desc in", values, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescNotIn(List<String> values) {
            addCriterion("user_desc not in", values, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescBetween(String value1, String value2) {
            addCriterion("user_desc between", value1, value2, "userDesc");
            return (Criteria) this;
        }

        public Criteria andUserDescNotBetween(String value1, String value2) {
            addCriterion("user_desc not between", value1, value2, "userDesc");
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