/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package davelaar.demo.model.service.client;

import davelaar.demo.model.service.common.HRService;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Oct 01 17:00:36 CEST 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class HRServiceClient
  extends ApplicationModuleImpl
  implements HRService
{
  /**
   * This is the default constructor (do not remove).
   */
  public HRServiceClient()
  {
  }

  public void employeeQuickSearch(String searchString)
  {
    Object _ret =
      this.riInvokeExportedMethod(this,"employeeQuickSearch",new String [] {"java.lang.String"},new Object[] {searchString});
    return;
  }
}
