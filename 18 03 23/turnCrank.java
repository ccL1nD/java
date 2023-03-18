public void turnCrank() {
    if (state == SOLD) {
        System.out.println("Turning twice doesn't get you another gumball");
    } else if (state == NO_QUARTER) {
        System.out.println("You turned but there's no quarter");
    } else if (SOLD_OUT) {
        System.out.println("You turned, but there are no gumballs");
    } else if (state == HAS_QUARTER) {
        System.out.println("You turned...");
        state = SOLD;
        dispense();
    }
}