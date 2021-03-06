package cn.lt.android.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "RETRY_STATISTICS_ENTITY".
*/
public class RetryStatisticsEntityDao extends AbstractDao<RetryStatisticsEntity, Long> {

    public static final String TABLENAME = "RETRY_STATISTICS_ENTITY";

    /**
     * Properties of entity RetryStatisticsEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property MUploadFailureDataByJsonString = new Property(1, String.class, "mUploadFailureDataByJsonString", false, "M_UPLOAD_FAILURE_DATA_BY_JSON_STRING");
    };


    public RetryStatisticsEntityDao(DaoConfig config) {
        super(config);
    }
    
    public RetryStatisticsEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"RETRY_STATISTICS_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"M_UPLOAD_FAILURE_DATA_BY_JSON_STRING\" TEXT);"); // 1: mUploadFailureDataByJsonString
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"RETRY_STATISTICS_ENTITY\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, RetryStatisticsEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String mUploadFailureDataByJsonString = entity.getMUploadFailureDataByJsonString();
        if (mUploadFailureDataByJsonString != null) {
            stmt.bindString(2, mUploadFailureDataByJsonString);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public RetryStatisticsEntity readEntity(Cursor cursor, int offset) {
        RetryStatisticsEntity entity = new RetryStatisticsEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1) // mUploadFailureDataByJsonString
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, RetryStatisticsEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setMUploadFailureDataByJsonString(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(RetryStatisticsEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(RetryStatisticsEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
