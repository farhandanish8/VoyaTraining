package com.voya.sample;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.voya.testcases.CalculatorTest;

@RunWith(Suite.class)
//@RunWith(JUnitPlatform.class)
//@SelectPackages({"com.voya.testcases"})
//@IncludePackages({"com.voya.testcases.trail"})
//@ExcludePackages({"com.voya.testcases.greet"})
//@SelectClasses({CalculatorTest.class})
@ExcludeTags({"first"})
public class AllTests {

}
