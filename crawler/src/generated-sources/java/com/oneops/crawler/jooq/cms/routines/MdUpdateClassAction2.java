/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.routines;


import com.oneops.crawler.jooq.cms.Kloopzcm;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MdUpdateClassAction2 extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -540690504;

    /**
     * The parameter <code>kloopzcm.md_update_class_action.p_action_id</code>.
     */
    public static final Parameter<Integer> P_ACTION_ID = createParameter("p_action_id", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>kloopzcm.md_update_class_action.p_action_name</code>.
     */
    public static final Parameter<String> P_ACTION_NAME = createParameter("p_action_name", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>kloopzcm.md_update_class_action.p_is_inheritable</code>.
     */
    public static final Parameter<Boolean> P_IS_INHERITABLE = createParameter("p_is_inheritable", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>kloopzcm.md_update_class_action.p_descr</code>.
     */
    public static final Parameter<String> P_DESCR = createParameter("p_descr", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>kloopzcm.md_update_class_action.p_args</code>.
     */
    public static final Parameter<String> P_ARGS = createParameter("p_args", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public MdUpdateClassAction2() {
        super("md_update_class_action", Kloopzcm.KLOOPZCM);

        addInParameter(P_ACTION_ID);
        addInParameter(P_ACTION_NAME);
        addInParameter(P_IS_INHERITABLE);
        addInParameter(P_DESCR);
        addInParameter(P_ARGS);
        setOverloaded(true);
    }

    /**
     * Set the <code>p_action_id</code> parameter IN value to the routine
     */
    public void setPActionId(Integer value) {
        setValue(P_ACTION_ID, value);
    }

    /**
     * Set the <code>p_action_name</code> parameter IN value to the routine
     */
    public void setPActionName(String value) {
        setValue(P_ACTION_NAME, value);
    }

    /**
     * Set the <code>p_is_inheritable</code> parameter IN value to the routine
     */
    public void setPIsInheritable(Boolean value) {
        setValue(P_IS_INHERITABLE, value);
    }

    /**
     * Set the <code>p_descr</code> parameter IN value to the routine
     */
    public void setPDescr(String value) {
        setValue(P_DESCR, value);
    }

    /**
     * Set the <code>p_args</code> parameter IN value to the routine
     */
    public void setPArgs(String value) {
        setValue(P_ARGS, value);
    }
}
