/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables;

/**
 * This class is generated by jOOQ.
 */
public class PurchaseOrderHeader extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader> {

	private static final long serialVersionUID = -1265127586;

	/**
	 * The singleton instance of Purchasing.PurchaseOrderHeader
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader PurchaseOrderHeader = new org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader, java.lang.Integer> PurchaseOrderID = createField("PurchaseOrderID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader, java.lang.Byte> RevisionNumber = createField("RevisionNumber", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader, java.lang.Byte> Status = createField("Status", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_PurchaseOrderHeader_Employee_EmployeeID
	 * FOREIGN KEY (EmployeeID)
	 * REFERENCES HumanResources.Employee (EmployeeID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader, java.lang.Integer> EmployeeID = createField("EmployeeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_PurchaseOrderHeader_Vendor_VendorID
	 * FOREIGN KEY (VendorID)
	 * REFERENCES Purchasing.Vendor (VendorID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader, java.lang.Integer> VendorID = createField("VendorID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_PurchaseOrderHeader_ShipMethod_ShipMethodID
	 * FOREIGN KEY (ShipMethodID)
	 * REFERENCES Purchasing.ShipMethod (ShipMethodID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader, java.lang.Integer> ShipMethodID = createField("ShipMethodID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader, java.sql.Timestamp> OrderDate = createField("OrderDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader, java.sql.Timestamp> ShipDate = createField("ShipDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader, java.math.BigDecimal> SubTotal = createField("SubTotal", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader, java.math.BigDecimal> TaxAmt = createField("TaxAmt", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader, java.math.BigDecimal> Freight = createField("Freight", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader, java.math.BigDecimal> TotalDue = createField("TotalDue", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public PurchaseOrderHeader() {
		super("PurchaseOrderHeader", org.jooq.examples.sqlserver.adventureworks.purchasing.Purchasing.Purchasing);
	}

	public PurchaseOrderHeader(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.purchasing.Purchasing.Purchasing, org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.IDENTITY_PurchaseOrderHeader;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.PK_PurchaseOrderHeader_PurchaseOrderID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader>>asList(org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.PK_PurchaseOrderHeader_PurchaseOrderID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader, ?>>asList(org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.FK_PurchaseOrderHeader_Employee_EmployeeID, org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.FK_PurchaseOrderHeader_Vendor_VendorID, org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.FK_PurchaseOrderHeader_ShipMethod_ShipMethodID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader(alias);
	}
}
