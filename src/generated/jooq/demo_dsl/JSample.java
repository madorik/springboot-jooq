/*
 * This file is generated by jOOQ.
 */
package jooq.demo_dsl;


import java.util.Arrays;
import java.util.List;

import jooq.demo_dsl.tables.JNotice;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JSample extends SchemaImpl {

    private static final long serialVersionUID = -1069274302;

    /**
     * The reference instance of <code>sample</code>
     */
    public static final JSample SAMPLE = new JSample();

    /**
     * The table <code>sample.notice</code>.
     */
    public final JNotice NOTICE = JNotice.NOTICE;

    /**
     * No further instances allowed
     */
    private JSample() {
        super("sample", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            JNotice.NOTICE);
    }
}
