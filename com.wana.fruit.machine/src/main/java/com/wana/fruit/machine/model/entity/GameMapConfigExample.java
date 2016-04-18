package com.wana.fruit.machine.model.entity;

import java.util.ArrayList;
import java.util.List;

public class GameMapConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public GameMapConfigExample() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGameNoIsNull() {
            addCriterion("game_no is null");
            return (Criteria) this;
        }

        public Criteria andGameNoIsNotNull() {
            addCriterion("game_no is not null");
            return (Criteria) this;
        }

        public Criteria andGameNoEqualTo(String value) {
            addCriterion("game_no =", value, "gameNo");
            return (Criteria) this;
        }

        public Criteria andGameNoNotEqualTo(String value) {
            addCriterion("game_no <>", value, "gameNo");
            return (Criteria) this;
        }

        public Criteria andGameNoGreaterThan(String value) {
            addCriterion("game_no >", value, "gameNo");
            return (Criteria) this;
        }

        public Criteria andGameNoGreaterThanOrEqualTo(String value) {
            addCriterion("game_no >=", value, "gameNo");
            return (Criteria) this;
        }

        public Criteria andGameNoLessThan(String value) {
            addCriterion("game_no <", value, "gameNo");
            return (Criteria) this;
        }

        public Criteria andGameNoLessThanOrEqualTo(String value) {
            addCriterion("game_no <=", value, "gameNo");
            return (Criteria) this;
        }

        public Criteria andGameNoLike(String value) {
            addCriterion("game_no like", value, "gameNo");
            return (Criteria) this;
        }

        public Criteria andGameNoNotLike(String value) {
            addCriterion("game_no not like", value, "gameNo");
            return (Criteria) this;
        }

        public Criteria andGameNoIn(List<String> values) {
            addCriterion("game_no in", values, "gameNo");
            return (Criteria) this;
        }

        public Criteria andGameNoNotIn(List<String> values) {
            addCriterion("game_no not in", values, "gameNo");
            return (Criteria) this;
        }

        public Criteria andGameNoBetween(String value1, String value2) {
            addCriterion("game_no between", value1, value2, "gameNo");
            return (Criteria) this;
        }

        public Criteria andGameNoNotBetween(String value1, String value2) {
            addCriterion("game_no not between", value1, value2, "gameNo");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(Integer value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(Integer value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(Integer value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(Integer value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(Integer value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<Integer> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<Integer> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(Integer value1, Integer value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(Integer value1, Integer value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(Integer value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(Integer value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(Integer value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(Integer value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(Integer value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<Integer> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<Integer> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(Integer value1, Integer value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(Integer value1, Integer value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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