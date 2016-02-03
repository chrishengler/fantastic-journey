/*
 * Copyright (c) 2016, chris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package fantastic.journey;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chris
 */
public class FellowTravellersTest{

  public FellowTravellersTest(){
  }

  @BeforeClass
  public static void setUpClass(){
  }

  @AfterClass
  public static void tearDownClass(){
  }

  @Before
  public void setUp(){
  }

  @After
  public void tearDown(){
  }
  
 /**
  * Test of readAPIkey method
  */
  @Test
  public void testReadAPIkey(){
    System.out.println("readAPIkey");
    FellowTravellers instance = new FellowTravellers();
    try{
      instance.readAPIkey("nofilehere.txt");
      fail("FellowTravellers.readAPIkey() should throw exception on empty file");
    }
    catch(Exception e){
      System.out.println(e.toString());
    }
    try{
      instance.readAPIkey("example_apiks.txt");
    }
    catch(Exception e){
      System.out.println(e.toString());
    }
    assertEquals("obviouslyinvalidapikey",instance.getAPIkey());
    assertEquals("obviouslyinvalidsecret",instance.getSecret());
  }
  
  /**
   * Test of getAPIauth method, of class FellowTravellers.
   */
  @Test
  public void testGetAPIauth(){
    System.out.println("getAPIauth");
    FellowTravellers instance = new FellowTravellers();
    try{
      instance.readAPIkey("apiks.txt");
    }
    catch(Exception e){
      System.out.println(e.toString());
    }
    instance.getAPIauth();
    assertNotEquals(null,instance.getToken());
  }
  


}
