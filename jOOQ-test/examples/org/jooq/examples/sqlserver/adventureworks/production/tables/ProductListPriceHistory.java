/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
public class ProductListPriceHistory extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductListPriceHistory> {

	private static final long serialVersionUID = -1803831660;

	/**
	 * The singleton instance of Production.ProductListPriceHistory
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.ProductListPriceHistory ProductListPriceHistory = new org.jooq.examples.sqlserver.adventureworks.production.tables.ProductListPriceHistory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductListPriceHistory> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductListPriceHistory.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductListPriceHistory_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductListPriceHistory, java.lang.Integer> ProductID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductListPriceHistory, java.sql.Timestamp> StartDate = createField("StartDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductListPriceHistory, java.sql.Timestamp> EndDate = createField("EndDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductListPriceHistory, java.math.BigDecimal> ListPrice = createField("ListPrice", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductListPriceHistory, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public ProductListPriceHistory() {
		super("ProductListPriceHistory", org.jooq.examples.sqlserver.adventureworks.production.Production.Production);
	}

	public ProductListPriceHistory(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.Production, org.jooq.examples.sqlserver.adventureworks.production.tables.ProductListPriceHistory.ProductListPriceHistory);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductListPriceHistory> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductListPriceHistory_ProductID_StartDate;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductListPriceHistory>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductListPriceHistory>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductListPriceHistory_ProductID_StartDate);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductListPriceHistory, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductListPriceHistory, ?>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_ProductListPriceHistory_Product_ProductID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.ProductListPriceHistory as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.ProductListPriceHistory(alias);
	}
}
