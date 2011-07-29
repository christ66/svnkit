package org.tmatesoft.svn.core.wc2;

public abstract class AbstractSvnUpdate<V> extends SvnOperation<V> {
    
    private boolean ignoreExternals;
    private boolean updateLocksOnDemand;

    protected AbstractSvnUpdate(SvnOperationFactory factory) {
        super(factory);
    }

    public boolean isIgnoreExternals() {
        return ignoreExternals;
    }

    public boolean isUpdateLocksOnDemand() {
        return updateLocksOnDemand;
    }

    public void setIgnoreExternals(boolean ignoreExternals) {
        this.ignoreExternals = ignoreExternals;
    }

    /**
     * Only relevant for 1.6 working copies. 
     */
    public void setUpdateLocksOnDemand(boolean updateLocksOnDemand) {
        this.updateLocksOnDemand = updateLocksOnDemand;
    }

}