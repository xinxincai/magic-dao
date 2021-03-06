package pers.zr.opensource.magic.dao.action;

import pers.zr.opensource.magic.dao.constants.ActionMode;
import pers.zr.opensource.magic.dao.shard.ShardStrategy;

/**
 * Created by zhurong on 2016-4-28.
 */
public abstract class Action {

    protected ActionTable table;

    protected ShardStrategy shardStrategy;

    protected String sql;
    protected Object[] params;

    public abstract String getSql();

    public abstract Object[] getParams();

    public abstract ActionMode getActionMode();

}
