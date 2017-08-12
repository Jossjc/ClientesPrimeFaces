/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.dao;

import junit.framework.TestCase;

/**
 *
 * @author Oracle D77738
 */
public class ConexionTest extends TestCase {
    
    public ConexionTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
      public void testConexion(){
        ConnectionDao con = new ConnectionDao();
        con.conectar();
        assertNotNull(con.getCon()); 
    }
}
