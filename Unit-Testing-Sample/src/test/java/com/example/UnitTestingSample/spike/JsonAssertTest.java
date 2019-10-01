package com.example.UnitTestingSample.spike;

import static org.junit.Assert.*;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {

	
	String actualResponse = "{\"id\":1,\"name\":\"ball\",\"quantity\":100,\"price\":10}";
	
	
	@Test
	public void jsonAssert_strictTrueAcceptsSpaces() throws JSONException{
		
		String expectedExpected = "{\"id\": 1,\"name\":\"ball\",\"quantity\":100,\"price\":10}";
		JSONAssert.assertEquals(expectedExpected, actualResponse, true);
		
	}

	
	@Test
	public void jsonAssert_strictFalse() throws JSONException{
		
		String expectedExpected = "{\"id\": 1,\"name\":\"ball\",\"quantity\":100,\"price\":10}";
		JSONAssert.assertEquals(expectedExpected, actualResponse, false);
		
	}
	
	
	@Test
	public void jsonAssert_withoutEscapeChar() throws JSONException{
		
		String expectedExpected = "{id: 1,name:ball,quantity:100,price:10}";
		JSONAssert.assertEquals(expectedExpected, actualResponse, false);
		
	}
}
