package com.castalia.major.service.bsh;

import org.springframework.stereotype.Service;

@Service
public class IndexBsh {
	public String getResult(String str) {
		return "I am " + str;
	}
}
