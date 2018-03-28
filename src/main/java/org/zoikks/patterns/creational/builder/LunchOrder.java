package org.zoikks.patterns.creational.builder;

/**
 *
 * Pitfalls:
 *  - Designed to be immutable.
 *  - Inner static class
 *  - Designed first
 *  - Complexity (people aren't used to an object returning itself for each subsequent call)
 *
 */
public class LunchOrder {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    // Own container.
    public static class Builder {

        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        // Could mandate this constructor to take arguments if desired.
        public Builder() {

        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }
    }


    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}