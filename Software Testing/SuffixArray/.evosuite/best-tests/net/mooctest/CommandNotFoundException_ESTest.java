/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 18 14:19:22 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import net.mooctest.CommandNotFoundException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CommandNotFoundException_ESTest extends CommandNotFoundException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CommandNotFoundException commandNotFoundException0 = new CommandNotFoundException((String) null);
      String string0 = commandNotFoundException0.getCommand();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CommandNotFoundException commandNotFoundException0 = new CommandNotFoundException(">a*L'xfbD!Cr%>hq");
      String string0 = commandNotFoundException0.getCommand();
      assertEquals(">a*L'xfbD!Cr%>hq", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CommandNotFoundException commandNotFoundException0 = new CommandNotFoundException("");
      String string0 = commandNotFoundException0.getCommand();
      assertEquals("", string0);
  }
}
