package com.vovan.tests;

import com.vovan.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroopCreation() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    int before = app.getGroopHelper().getGroupCount();
    app.getGroopHelper().createGroupe(new GroupData("test1", null, null));
    int after = app.getGroopHelper().getGroupCount();
    Assert.assertEquals(after, before + 1);

  }


}

