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

import de.umass.lastfm.Authenticator;
import de.umass.lastfm.Caller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author chris
 */
public class FellowTravellers{

  private String apikey;
  private String secret;
  private String token;

  FellowTravellers(){
    
  }

  public void getAPIauth(){
    token = Authenticator.getToken(apikey);
  }
  
  public String getAPIkey(){
    return apikey;
  }
  
  public String getSecret(){
    return secret;
  }
  
  public String getToken(){
    return token;
  }
  
  /**
   * read API key file
   * 
   * actually reads API key and secret
   * 
   * @param filename
   * @throws FileNotFoundException 
   */
  public void readAPIkey(String filename) throws FileNotFoundException, IOException{
    try{
      FileReader fr = new FileReader(filename);
      BufferedReader br = new BufferedReader(fr);
      apikey = br.readLine();
      secret = br.readLine();
    }
    catch(Exception e){
      System.out.println("could not read API key file");
      throw e;
    }
  }
  
  public void setToken(String newToken){
    token = newToken;
  }
  
}
