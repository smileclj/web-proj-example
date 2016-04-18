package com.wana.fruit.machine.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public GameRecordExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBetRateIsNull() {
            addCriterion("bet_rate is null");
            return (Criteria) this;
        }

        public Criteria andBetRateIsNotNull() {
            addCriterion("bet_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBetRateEqualTo(Integer value) {
            addCriterion("bet_rate =", value, "betRate");
            return (Criteria) this;
        }

        public Criteria andBetRateNotEqualTo(Integer value) {
            addCriterion("bet_rate <>", value, "betRate");
            return (Criteria) this;
        }

        public Criteria andBetRateGreaterThan(Integer value) {
            addCriterion("bet_rate >", value, "betRate");
            return (Criteria) this;
        }

        public Criteria andBetRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("bet_rate >=", value, "betRate");
            return (Criteria) this;
        }

        public Criteria andBetRateLessThan(Integer value) {
            addCriterion("bet_rate <", value, "betRate");
            return (Criteria) this;
        }

        public Criteria andBetRateLessThanOrEqualTo(Integer value) {
            addCriterion("bet_rate <=", value, "betRate");
            return (Criteria) this;
        }

        public Criteria andBetRateIn(List<Integer> values) {
            addCriterion("bet_rate in", values, "betRate");
            return (Criteria) this;
        }

        public Criteria andBetRateNotIn(List<Integer> values) {
            addCriterion("bet_rate not in", values, "betRate");
            return (Criteria) this;
        }

        public Criteria andBetRateBetween(Integer value1, Integer value2) {
            addCriterion("bet_rate between", value1, value2, "betRate");
            return (Criteria) this;
        }

        public Criteria andBetRateNotBetween(Integer value1, Integer value2) {
            addCriterion("bet_rate not between", value1, value2, "betRate");
            return (Criteria) this;
        }

        public Criteria andBetContentIsNull() {
            addCriterion("bet_content is null");
            return (Criteria) this;
        }

        public Criteria andBetContentIsNotNull() {
            addCriterion("bet_content is not null");
            return (Criteria) this;
        }

        public Criteria andBetContentEqualTo(String value) {
            addCriterion("bet_content =", value, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentNotEqualTo(String value) {
            addCriterion("bet_content <>", value, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentGreaterThan(String value) {
            addCriterion("bet_content >", value, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentGreaterThanOrEqualTo(String value) {
            addCriterion("bet_content >=", value, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentLessThan(String value) {
            addCriterion("bet_content <", value, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentLessThanOrEqualTo(String value) {
            addCriterion("bet_content <=", value, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentLike(String value) {
            addCriterion("bet_content like", value, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentNotLike(String value) {
            addCriterion("bet_content not like", value, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentIn(List<String> values) {
            addCriterion("bet_content in", values, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentNotIn(List<String> values) {
            addCriterion("bet_content not in", values, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentBetween(String value1, String value2) {
            addCriterion("bet_content between", value1, value2, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentNotBetween(String value1, String value2) {
            addCriterion("bet_content not between", value1, value2, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetCoinTotalIsNull() {
            addCriterion("bet_coin_total is null");
            return (Criteria) this;
        }

        public Criteria andBetCoinTotalIsNotNull() {
            addCriterion("bet_coin_total is not null");
            return (Criteria) this;
        }

        public Criteria andBetCoinTotalEqualTo(Integer value) {
            addCriterion("bet_coin_total =", value, "betCoinTotal");
            return (Criteria) this;
        }

        public Criteria andBetCoinTotalNotEqualTo(Integer value) {
            addCriterion("bet_coin_total <>", value, "betCoinTotal");
            return (Criteria) this;
        }

        public Criteria andBetCoinTotalGreaterThan(Integer value) {
            addCriterion("bet_coin_total >", value, "betCoinTotal");
            return (Criteria) this;
        }

        public Criteria andBetCoinTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("bet_coin_total >=", value, "betCoinTotal");
            return (Criteria) this;
        }

        public Criteria andBetCoinTotalLessThan(Integer value) {
            addCriterion("bet_coin_total <", value, "betCoinTotal");
            return (Criteria) this;
        }

        public Criteria andBetCoinTotalLessThanOrEqualTo(Integer value) {
            addCriterion("bet_coin_total <=", value, "betCoinTotal");
            return (Criteria) this;
        }

        public Criteria andBetCoinTotalIn(List<Integer> values) {
            addCriterion("bet_coin_total in", values, "betCoinTotal");
            return (Criteria) this;
        }

        public Criteria andBetCoinTotalNotIn(List<Integer> values) {
            addCriterion("bet_coin_total not in", values, "betCoinTotal");
            return (Criteria) this;
        }

        public Criteria andBetCoinTotalBetween(Integer value1, Integer value2) {
            addCriterion("bet_coin_total between", value1, value2, "betCoinTotal");
            return (Criteria) this;
        }

        public Criteria andBetCoinTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("bet_coin_total not between", value1, value2, "betCoinTotal");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("method is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("method is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("method =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("method <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("method >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("method >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("method <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("method <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("method like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("method not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("method in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("method not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("method between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("method not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andGainCoinTotalIsNull() {
            addCriterion("gain_coin_total is null");
            return (Criteria) this;
        }

        public Criteria andGainCoinTotalIsNotNull() {
            addCriterion("gain_coin_total is not null");
            return (Criteria) this;
        }

        public Criteria andGainCoinTotalEqualTo(Integer value) {
            addCriterion("gain_coin_total =", value, "gainCoinTotal");
            return (Criteria) this;
        }

        public Criteria andGainCoinTotalNotEqualTo(Integer value) {
            addCriterion("gain_coin_total <>", value, "gainCoinTotal");
            return (Criteria) this;
        }

        public Criteria andGainCoinTotalGreaterThan(Integer value) {
            addCriterion("gain_coin_total >", value, "gainCoinTotal");
            return (Criteria) this;
        }

        public Criteria andGainCoinTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("gain_coin_total >=", value, "gainCoinTotal");
            return (Criteria) this;
        }

        public Criteria andGainCoinTotalLessThan(Integer value) {
            addCriterion("gain_coin_total <", value, "gainCoinTotal");
            return (Criteria) this;
        }

        public Criteria andGainCoinTotalLessThanOrEqualTo(Integer value) {
            addCriterion("gain_coin_total <=", value, "gainCoinTotal");
            return (Criteria) this;
        }

        public Criteria andGainCoinTotalIn(List<Integer> values) {
            addCriterion("gain_coin_total in", values, "gainCoinTotal");
            return (Criteria) this;
        }

        public Criteria andGainCoinTotalNotIn(List<Integer> values) {
            addCriterion("gain_coin_total not in", values, "gainCoinTotal");
            return (Criteria) this;
        }

        public Criteria andGainCoinTotalBetween(Integer value1, Integer value2) {
            addCriterion("gain_coin_total between", value1, value2, "gainCoinTotal");
            return (Criteria) this;
        }

        public Criteria andGainCoinTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("gain_coin_total not between", value1, value2, "gainCoinTotal");
            return (Criteria) this;
        }

        public Criteria andIsPrizeIsNull() {
            addCriterion("is_prize is null");
            return (Criteria) this;
        }

        public Criteria andIsPrizeIsNotNull() {
            addCriterion("is_prize is not null");
            return (Criteria) this;
        }

        public Criteria andIsPrizeEqualTo(Boolean value) {
            addCriterion("is_prize =", value, "isPrize");
            return (Criteria) this;
        }

        public Criteria andIsPrizeNotEqualTo(Boolean value) {
            addCriterion("is_prize <>", value, "isPrize");
            return (Criteria) this;
        }

        public Criteria andIsPrizeGreaterThan(Boolean value) {
            addCriterion("is_prize >", value, "isPrize");
            return (Criteria) this;
        }

        public Criteria andIsPrizeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_prize >=", value, "isPrize");
            return (Criteria) this;
        }

        public Criteria andIsPrizeLessThan(Boolean value) {
            addCriterion("is_prize <", value, "isPrize");
            return (Criteria) this;
        }

        public Criteria andIsPrizeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_prize <=", value, "isPrize");
            return (Criteria) this;
        }

        public Criteria andIsPrizeIn(List<Boolean> values) {
            addCriterion("is_prize in", values, "isPrize");
            return (Criteria) this;
        }

        public Criteria andIsPrizeNotIn(List<Boolean> values) {
            addCriterion("is_prize not in", values, "isPrize");
            return (Criteria) this;
        }

        public Criteria andIsPrizeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_prize between", value1, value2, "isPrize");
            return (Criteria) this;
        }

        public Criteria andIsPrizeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_prize not between", value1, value2, "isPrize");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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