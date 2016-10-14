package uk.co.mysterymayhem.gravitymod.capabilities;

import java.util.concurrent.Callable;

/**
 * Created by Mysteryem on 2016-10-10.
 */
class Factory implements Callable<IGravityDirectionCapability> {

    @Override
    public IGravityDirectionCapability call() throws Exception {
        return new GravityDirectionCapabilityImpl();
    }
}