package cme;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GornickiMIchalTestTask2 {
    //RATE CONSTRUCTOR TEST CASES
    @Test
    public void testConstructor_withValidArguments() {

        CarParkKind CAR_PARK_KIND = CarParkKind.VISITOR;

        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        // Create valid periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7,10));

        // Create valid periods for normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(10,21));

        // Create a valid Rate object
        Rate rate = new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods);

        // Verify that the object was created successfully
        assertNotNull(rate);
    }


    @Test
    public void testConstructor_withMinimumValues() {

        CarParkKind CAR_PARK_KIND = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        // Create valid periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7,10));
        // Create valid periods for reduced period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(10,21));

        // Create a valid Rate object
        Rate rate = new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods);

        // Verify that the object was created successfully
        assertNotNull(rate);
    }

    @Test
    public void testConstructor_withOnlyReducedPeriods() {

        CarParkKind CAR_PARK_KIND = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);

        // Create valid periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(6,9));
        reducedPeriods.add(new Period(14,17));
        // Create empty periods for normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(9,14));

        // Create a valid Rate object
        Rate rate = new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods);

        // Verify that the object was created successfully
        assertNotNull(rate);
    }

    @Test
    public void testConstructor_withOnlyNormalPeriods() {

        CarParkKind CAR_PARK_KIND = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = new BigDecimal(7);
        BigDecimal reducedRate = new BigDecimal(3);

        // Create empty periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7,9));

        // Create valid periods for normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(9,12));
        normalPeriods.add(new Period(13,16));

        // Create a valid Rate object
        Rate rate = new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods);

        // Verify that the object was created successfully
        assertNotNull(rate);
    }

    @Test
    public void testConstructor_withMultipleReducedPeriods() {
        BigDecimal normalRate = new BigDecimal(8.5);
        BigDecimal reducedRate = new BigDecimal(4);
        CarParkKind CAR_PARK_KIND = CarParkKind.VISITOR;

        // Create valid periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7, 9));
        reducedPeriods.add(new Period(11, 13));
        reducedPeriods.add(new Period(18, 20));
        // Create valid periods for normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(9, 11));

        // Create a valid Rate object
        Rate rate = new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods);

        // Verify that the object was created successfully
        assertNotNull(rate);
    }

    @Test
    public void testConstructor_withMultipleNormalPeriods() {
        BigDecimal normalRate = new BigDecimal(6);
        BigDecimal reducedRate = new BigDecimal(3);
        CarParkKind CAR_PARK_KIND = CarParkKind.STUDENT;

        // Create valid periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(8, 10));

        // Create valid periods for normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(7, 8));
        normalPeriods.add(new Period(10, 11));
        normalPeriods.add(new Period(13, 14));

        // Create a valid Rate object
        Rate rate = new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods);

        // Verify that the object was created successfully
        assertNotNull(rate);
    }

    @Test
    public void testConstructor_withMultiplePeriods() {

        CarParkKind CAR_PARK_KIND = CarParkKind.MANAGEMENT;

        BigDecimal normalRate = new BigDecimal(8);
        BigDecimal reducedRate = new BigDecimal(3.5);

        // Create valid periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7,9));
        reducedPeriods.add(new Period(11,13));
        reducedPeriods.add(new Period(18,20));

        // Create valid periods for normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(9,11));
        normalPeriods.add(new Period(13,16));

        // Create a valid Rate object
        Rate rate = new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods);

        // Verify that the object was created successfully
        assertNotNull(rate);
    }

    @Test
    public void testConstructor_withMaximumNormalRate() {

        CarParkKind CAR_PARK_KIND = CarParkKind.VISITOR;
        BigDecimal normalRate = new BigDecimal(99999999.99);
        BigDecimal reducedRate = new BigDecimal(2);

        // Create valid periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7, 10));

        // Create valid periods for normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(10, 21));

        // Create a valid Rate object
        Rate rate = new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods);

        // Verify that the object was created successfully
        assertNotNull(rate);
    }

    @Test
    public void testConstructor_withMaximumReducedRate() {

        CarParkKind CAR_PARK_KIND = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(99999999.99);

        // Create valid periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7, 10));

        // Create valid periods for normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(10, 21));

        // Call the method and expect an IllegalArgumentException to be thrown
        assertThrows(IllegalArgumentException.class, () -> new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods));
    }

    @Test
    public void testConstructor_withMaxNormalAndReducedRate() {
        // Set up test data
        BigDecimal normalRate = new BigDecimal(99999999.99);
        BigDecimal reducedRate = new BigDecimal(9999.99);
        CarParkKind carParkKind = CarParkKind.STAFF;

        // Create valid periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7, 10));

        // Create valid periods for normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(10, 21));

        // Call the constructor and verify that a valid Rate object is returned
        Rate rate = new Rate(normalRate, reducedRate, carParkKind, reducedPeriods, normalPeriods);
        assertNotNull(rate);
    }

    @Test
    public void testConstructor_withInvalidNormalRate() {
        // Set up test data
        BigDecimal normalRate = new BigDecimal(-1);
        BigDecimal reducedRate = new BigDecimal(5);
        CarParkKind carParkKind = CarParkKind.VISITOR;

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7, 10));

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(10, 12));

        // Call the constructor and expect an IllegalArgumentException to be thrown
        assertThrows(IllegalArgumentException.class, () ->  new Rate(normalRate, reducedRate, carParkKind, reducedPeriods, normalPeriods));
    }

    @Test
    public void testConstructor_withInvalidReducedRate() {
        // Set up test data
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(-1);
        CarParkKind carParkKind = CarParkKind.VISITOR;
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(13, 16));
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(10, 13));

        // Call the constructor and expect an IllegalArgumentException to be thrown
        assertThrows(IllegalArgumentException.class, () ->  new Rate(normalRate, reducedRate, carParkKind, reducedPeriods, normalPeriods));

    }

    @Test
    public void testConstructor_withReducedRateGreaterThanNormalRate() {
        // Set up test data
        CarParkKind CAR_PARK_KIND = CarParkKind.VISITOR;
        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(5);

        // Create valid periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(10,13));

        // Create valid periods for normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(8,10));
        normalPeriods.add(new Period(13,16));

        // Call the constructor and expect an IllegalArgumentException to be thrown
        assertThrows(IllegalArgumentException.class, () -> new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods));
    }

    @Test
    public void testConstructor_withReducedPeriodsOverlapping() {

        CarParkKind CAR_PARK_KIND = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        // Create invalid reduced periods (overlapping)
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7,10));
        reducedPeriods.add(new Period(9,12));

        // Create valid periods for normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(12,18));

        // Call the constructor and expect an IllegalArgumentException to be thrown
        assertThrows(IllegalArgumentException.class, () -> new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods));
    }
    @Test
    public void testConstructor_withOverlappingNormalPeriods() {
        // Set up test data
        CarParkKind CAR_PARK_KIND = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        // Create valid periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(17,18));

        // Create invalid periods for normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(7,11));
        normalPeriods.add(new Period(9,13));

        // Call the constructor and expect an IllegalArgumentException to be thrown
        assertThrows(IllegalArgumentException.class, () -> new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods));
    }

    @Test
    public void testConstructor_withNullCarParkKind() {
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        // Create valid periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7,10));
        reducedPeriods.add(new Period(13,16));

        // Create valid periods for normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(10,12));

        // Create a valid Rate object
        Rate rate = new Rate(normalRate, reducedRate, null, reducedPeriods, normalPeriods);

        // Verify that the object was created successfully
        assertNotNull(rate);
    }

    @Test
    public void testConstructor_withNullNormalPeriods() {

        CarParkKind CAR_PARK_KIND = CarParkKind.VISITOR;
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        // Create valid periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(0,2));

        // Create null periods for normal period
        ArrayList<Period> normalPeriods = null;

        // Call the constructor and expect an IllegalArgumentException to be thrown
        assertThrows(IllegalArgumentException.class, ()-> new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods));
    }

    @Test
    public void testConstructor_withNullReducedPeriods() {
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);
        CarParkKind CAR_PARK_KIND = CarParkKind.VISITOR;
        ArrayList<Period> reducedPeriods = null;
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(2, 4));
        normalPeriods.add(new Period(7, 9));
        normalPeriods.add(new Period(12, 14));

        // Call the constructor and expect an IllegalArgumentException to be thrown
        assertThrows(IllegalArgumentException.class, ()-> new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods));
    }

//CALCULATE METHOD TEST CASES

    @Test
    public void testCalculate_withReducedPeriod() {
        // Set up test data
        CarParkKind CAR_PARK_KIND = CarParkKind.VISITOR;
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        // Create reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7, 13));

        // Create normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(13, 16));

        // Create a Rate object
        Rate rate = new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods);

        // Test the calculate method with reduced period
        Period reducedPeriod = new Period(8, 10);
        BigDecimal cost = rate.calculate(reducedPeriod);

        // Verify that the calculated rate is correct
        assertEquals(new BigDecimal(4), cost);
    }

    @Test
    public void testCalculate_withNormalPeriod() {
        // Set up test data
        CarParkKind CAR_PARK_KIND = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        // Create valid periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7,13));

        // Create valid periods for normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(13,16));

        // Create a valid Rate object
        Rate rate = new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods);

        // Test the calculate method with normal period
        Period normalPeriod = new Period(14, 15);
        BigDecimal cost = rate.calculate(normalPeriod);

        // Verify that the cost is calculated correctly
        assertEquals(new BigDecimal(5), cost);
    }

    @Test
    public void testCalculate_withOverlappingNormalAndReducedPeriod() {
        // Set up test data
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);
        CarParkKind carParkKind = CarParkKind.STUDENT;

        // Create periods
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(7, 13));

        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(12, 16));

        assertThrows(IllegalArgumentException.class, () -> new Rate(normalRate, reducedRate, carParkKind, reducedPeriods, normalPeriods));
    }

    @Test
    public void testCalculate_includingNormalReducedAndFreePeriod() {
        // Set up test data
        CarParkKind CAR_PARK_KIND = CarParkKind.VISITOR;
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        // Create valid periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7,13));

        // Create valid periods for normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(13,16));

        // Create a valid Rate object
        Rate rate = new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods);

        // Calculate the rate for a period that includes normal, reduced and free periods
        Period periodStay = new Period(5,15);
        BigDecimal cost = rate.calculate(periodStay);

        // Verify that the calculated rate is correct
        assertEquals(new BigDecimal(22), cost);
    }
    @Test
    public void testCalculate_withFreePeriod() {
        // Set up test data
        CarParkKind CAR_PARK_KIND = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        // Create valid periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7,13));

        // Create valid periods for normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(13,16));

        // Create a valid Rate object
        Rate rate = new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods);

        // Calculate the rate for a period that includes a free period
        BigDecimal cost = rate.calculate(new Period(1,6));

        // Verify that the rate is calculated correctly
        assertEquals(new BigDecimal(0), cost);
    }

    @Test
    public void testCalculate_withFreeAndReducedPeriod() {
        // Set up test data
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);
        CarParkKind kind = CarParkKind.VISITOR;

        // Create valid periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7, 13));

        // Create valid periods for normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(13, 16));

        // Create a valid Rate object
        Rate rate = new Rate(normalRate, reducedRate, kind, reducedPeriods, normalPeriods);

        // Test including freePeriod and reducedPeriod
        Period period = new Period(6, 10);
        BigDecimal expected = new BigDecimal(6);
        BigDecimal cost = rate.calculate(period);
        assertEquals(expected, cost);
    }
    @Test
    public void testCalculate_includingNormalPeriodAndFreePeriod() {
        // Set up test data
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);
        CarParkKind carParkKind = CarParkKind.VISITOR;

        // Create valid periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(12,16));

        // Create valid periods for normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(7,12));
        normalPeriods.add(new Period(16,24));

        // Create a valid Rate object
        Rate rate = new Rate(normalRate, reducedRate, carParkKind, reducedPeriods, normalPeriods);

        // Calculate the parking fee for a period including normal period and free period
        Period period = new Period(5, 9);
        BigDecimal cost = rate.calculate(period);

        // Verify that the fee is calculated correctly
        assertEquals(new BigDecimal(10), cost);
    }

    @Test
    public void testCalculate_withNullPeriod() {
        // Set up test data
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);
        CarParkKind carParkKind = CarParkKind.VISITOR;

        // Create valid periods for reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7, 13));

        // Create valid periods for normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(13, 24));

        // Create a valid Rate object
        Rate rate = new Rate(normalRate, reducedRate, carParkKind, reducedPeriods, normalPeriods);

        Period period = null;

        assertThrows(NullPointerException.class, ()->  rate.calculate(period));
    }

    //NEW CASES

    @Test
    public void testConstructor_withContainingManyOverlappingPeriods() {
        // Set up test data
        CarParkKind CAR_PARK_KIND = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        // Create reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7,9));
        reducedPeriods.add(new Period(10,13));
        reducedPeriods.add(new Period(17,20));

        // Create normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(8,11));
        normalPeriods.add(new Period(12,18));
        normalPeriods.add(new Period(19,24));

        // Call the constructor and expect an IllegalArgumentException to be thrown
        assertThrows(IllegalArgumentException.class, () -> new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods));
    }

    @Test
    public void testConstructor_withEverythingOverlapping() {
        // Set up test data
        CarParkKind CAR_PARK_KIND = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        // Create reduced period
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7,10));
        reducedPeriods.add(new Period(9,14));
        reducedPeriods.add(new Period(13,20));

        // Create normal period
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(9,11));
        normalPeriods.add(new Period(10,19));
        normalPeriods.add(new Period(18,24));

        // Call the constructor and expect an IllegalArgumentException to be thrown
        assertThrows(IllegalArgumentException.class, () -> new Rate(normalRate, reducedRate, CAR_PARK_KIND, reducedPeriods, normalPeriods));
    }

    @Test
    public void testConstructor_withNullReducedRate() {
        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = null;
        CarParkKind carParkKind = CarParkKind.MANAGEMENT;

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7, 13));

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(13, 24));

        assertThrows(IllegalArgumentException.class, () -> new Rate(normalRate, reducedRate, carParkKind, reducedPeriods, normalPeriods));
    }

    @Test
    public void testConstructor_withNullNormalRates() {
        BigDecimal normalRate = null;
        BigDecimal reducedRate = new BigDecimal(2);
        CarParkKind carParkKind = CarParkKind.VISITOR;

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        reducedPeriods.add(new Period(7, 13));

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        normalPeriods.add(new Period(13, 24));

        assertThrows(IllegalArgumentException.class, () -> new Rate(normalRate, reducedRate, carParkKind, reducedPeriods, normalPeriods));
    }


}