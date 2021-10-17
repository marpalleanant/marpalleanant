package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class TestCalculator {
	
	    @Test
	    void empty_string_should_return_0() throws Exception {
	        StringCalculator stringCalculator = new StringCalculator();
	        assertEquals(0, stringCalculator.add(""));
	    }
	    @Test
	    void string_with_single_number_should_return_number_as_int() throws Exception {
	        StringCalculator stringCalculator = new StringCalculator();
	        assertEquals(1, stringCalculator.add("1"));
	    }
	    @Test
	    void string_with_single_number_should_return_number_as_int1() throws Exception {
	        StringCalculator stringCalculator = new StringCalculator();
	        assertEquals(3, stringCalculator.add("1, 2"));
	    }
	    @Test
	    void string_with_single_number_should_return_number_as_int2() throws Exception {
	        StringCalculator stringCalculator = new StringCalculator();
	        assertEquals(0, stringCalculator.add("1,2,3,4,5,6,7,8,9,10"));
	    }
	    @Test
	    void string_with_single_number_should_return_number_as_int3() throws Exception {
	        StringCalculator stringCalculator = new StringCalculator();
	        assertEquals(3, stringCalculator.add("1-2"));
	    }
	    @Test
	    void string_with_single_number_should_return_number_as_int4() throws Exception {
	        StringCalculator stringCalculator = new StringCalculator();
	        assertEquals(-1, stringCalculator.add("-1"));
	    }
	}