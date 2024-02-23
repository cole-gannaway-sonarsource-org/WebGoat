package org.dummy.insecure.framework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoverageMetricsTest {
	CoverageMetrics c = new CoverageMetrics();

	@Test
	void unitTest1() {
		assertEquals(0.5, c.f(1), 0.0);
	}
	
//	@Test
//	void unitTest2() {
//		assertEquals(0.0, c.f(0), 0.0);
//	}

}
