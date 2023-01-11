package junittesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junittesting1.countA;
import junittesting1.squareTest;

@RunWith(Suite.class)
@SuiteClasses({ countA.class, squareTest.class })
system.out.println("hellio");
system.out.println("hellio2");

public class AllTests {}
