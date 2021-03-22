/*
 * This file is generated by jOOQ.
 */
package sample_dsl;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import sample_dsl.tables.Notice;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sample extends SchemaImpl {

    private static final long serialVersionUID = 1577926218;

    /**
     * The reference instance of <code>sample</code>
     */
    public static final Sample SAMPLE = new Sample();

    /**
     * The table <code>sample.notice</code>.
     */
    public final Notice NOTICE = Notice.NOTICE;

    /**
     * No further instances allowed
     */
    private Sample() {
        super("sample", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Notice.NOTICE);
    }
}
