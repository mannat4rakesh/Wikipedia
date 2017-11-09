
package org.mule.modules.wikicon.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.wikicon.WikiconConnector;


/**
 * A <code>WikiconConnectorCapabilitiesAdapter</code> is a wrapper around {@link WikiconConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-11-09T10:05:59-08:00", comments = "Build UNNAMED.2793.f49b6c7")
public class WikiconConnectorCapabilitiesAdapter
    extends WikiconConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
