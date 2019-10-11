package com.zensar.spring.performers;

import com.zensar.spring.exceptions.PerformanceException;

/**
 * @author akansh_sai
 *
 */
public interface Performer {
	void perform() throws PerformanceException;

}
