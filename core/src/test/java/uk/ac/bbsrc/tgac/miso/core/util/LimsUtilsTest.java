package uk.ac.bbsrc.tgac.miso.core.util;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import uk.ac.bbsrc.tgac.miso.core.data.Sample;
import uk.ac.bbsrc.tgac.miso.core.data.impl.SampleImpl;

public class LimsUtilsTest {

  @Test
  public void testValidateRelationshipForSimpleSample() throws Exception {
    Sample child = new SampleImpl(); // Simple sample has no SampleAdditionalInfo.
    Sample parent = null; // Simple sample has no parent.
    assertTrue("Simple sample with a null parent and null SampleAdditionalInfo is a valid relationship",
        LimsUtils.isValidRelationship(null, parent, child));
  }

}
