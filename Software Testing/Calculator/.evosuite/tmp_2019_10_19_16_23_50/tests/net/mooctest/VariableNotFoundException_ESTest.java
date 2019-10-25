/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 19 08:24:37 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import net.mooctest.VariableNotFoundException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VariableNotFoundException_ESTest extends VariableNotFoundException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VariableNotFoundException variableNotFoundException0 = new VariableNotFoundException((String) null, (String) null);
      String string0 = variableNotFoundException0.getVar();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VariableNotFoundException variableNotFoundException0 = new VariableNotFoundException("", "m`|cDif{;a");
      String string0 = variableNotFoundException0.getVar();
      assertEquals("m`|cDif{;a", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VariableNotFoundException variableNotFoundException0 = new VariableNotFoundException("");
      String string0 = variableNotFoundException0.getVar();
      assertEquals("", string0);
  }
}
