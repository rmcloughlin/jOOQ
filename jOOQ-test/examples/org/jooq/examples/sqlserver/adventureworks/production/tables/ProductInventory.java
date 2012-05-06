/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
public class ProductInventory extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory> {

	private static final long serialVersionUID = -1359586326;

	/**
	 * The singleton instance of Production.ProductInventory
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory ProductInventory = new org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductInventory_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.lang.Integer> ProductID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductInventory_Location_LocationID
	 * FOREIGN KEY (LocationID)
	 * REFERENCES Production.Location (LocationID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.lang.Short> LocationID = createField("LocationID", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.lang.String> Shelf = createField("Shelf", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.lang.Byte> Bin = createField("Bin", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.lang.Short> Quantity = createField("Quantity", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.lang.String> rowguid = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public ProductInventory() {
		super("ProductInventory", org.jooq.examples.sqlserver.adventureworks.production.Production.Production);
	}

	public ProductInventory(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.Production, org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory.ProductInventory);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductInventory_ProductID_LocationID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductInventory_ProductID_LocationID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, ?>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_ProductInventory_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_ProductInventory_Location_LocationID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory(alias);
	}
}
