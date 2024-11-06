package com.hexaware.junit5.test.suites;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import com.hexaware.junit5.test.suites.AdditionTest;
import com.hexaware.junit5.test.suites.MultiplicationTest;
import com.hexaware.junit5.test.suites.SubstractionTest;

@Suite
@SelectClasses({AdditionTest.class , SubstractionTest.class , MultiplicationTest.class})

//@SelectPackages({"com.hexaware.junit5.test.suites"})

@IncludeTags({"MTag"})
//@ExcludeTags("dev")
class CalculatorTestSuite {


	
}
