package christmas.domain;

import java.time.LocalDate;

public class GiftEvent implements Event {
    private static final LocalDate START_DATE = LocalDate.of(2023, 12, 1);
    private static final LocalDate END_DATE = LocalDate.of(2023, 12, 31);
    private static final int GIFT_ORDER_AMOUNT_THRESHOLD = 120000;

    @Override
    public boolean isApplicable(LocalDate date, int totalOrderAmount) {
        return date == null || (date.isAfter(START_DATE) && date.isBefore(END_DATE) && totalOrderAmount >= GIFT_ORDER_AMOUNT_THRESHOLD);
    }

    @Override
    public int calculateDiscount(LocalDate visitDate, int totalOrderAmount) {
        return 0;
    }
}
