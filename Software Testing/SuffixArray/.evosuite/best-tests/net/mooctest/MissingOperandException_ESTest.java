/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 18 14:19:57 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import net.mooctest.MissingOperandException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MissingOperandException_ESTest extends MissingOperandException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MissingOperandException missingOperandException0 = new MissingOperandException("{^[S4[/ ", (String) null);
      String string0 = missingOperandException0.getOperator();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MissingOperandException missingOperandException0 = new MissingOperandException(".zyc7&jUr", "");
      String string0 = missingOperandException0.getOperator();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MissingOperandException missingOperandException0 = new MissingOperandException("", "l");
      String string0 = missingOperandException0.getOperator();
      assertEquals("l", string0);
  }
}
