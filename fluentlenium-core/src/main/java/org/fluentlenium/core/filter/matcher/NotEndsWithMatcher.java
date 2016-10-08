package org.fluentlenium.core.filter.matcher;

import java.util.regex.Pattern;

/**
 * Matcher checking that actual doesn't end with input value.
 */
public class NotEndsWithMatcher extends AbstractMatcher {

    /**
     * Creates a not ends with matcher.
     *
     * @param value input value
     */
    public NotEndsWithMatcher(final String value) {
        super(value);
    }

    /**
     * Creates a not ends with matcher.
     *
     * @param value input value
     */
    public NotEndsWithMatcher(final Pattern value) {
        super(value);
    }

    @Override
    public MatcherType getMatcherType() {
        return MatcherType.NOT_ENDS_WITH;
    }

    @Override
    public boolean isSatisfiedBy(final String obj) {
        return !CalculateService.endsWith(getPattern(), getValue(), obj);
    }

}
