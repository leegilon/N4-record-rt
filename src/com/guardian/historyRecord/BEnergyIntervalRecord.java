package com.guardian.historyRecord;

import com.guardian.historyRecord.enums.BHistoryTagEnum;

import javax.baja.history.BTrendRecord;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraSlots;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.status.BStatus;
import javax.baja.sys.*;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * energy trend record define for energyExt
 * @author Chris Lee
 */
@NiagaraType
@NiagaraSlots(
        properties = {
                @NiagaraProperty(name = "typeTag", type = "BHistoryTagEnum", defaultValue = "BHistoryTagEnum.DEFAULT"),
                @NiagaraProperty(name = "EndAt", type = "BAbsTime", defaultValue = "BAbsTime.DEFAULT"),
                @NiagaraProperty(name = "meterRead", type = "double", defaultValue = "0.0d"),
                @NiagaraProperty(name = "cost", type = "double", defaultValue = "0.0d"),
                @NiagaraProperty(name = "fee", type = "double", defaultValue = "0.0d"),
                @NiagaraProperty(name = "bill", type = "double", defaultValue = "0.0d"),
        }
)
public class BEnergyIntervalRecord
    extends BTrendRecord
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.historyRecord.BEnergyIntervalRecord(889331073)1.0$ @*/
/* Generated Thu May 18 17:16:53 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "typeTag"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code typeTag} property.
   * @see #getTypeTag
   * @see #setTypeTag
   */
  public static final Property typeTag = newProperty(0, BHistoryTagEnum.DEFAULT, null);
  
  /**
   * Get the {@code typeTag} property.
   * @see #typeTag
   */
  public BHistoryTagEnum getTypeTag() { return (BHistoryTagEnum)get(typeTag); }
  
  /**
   * Set the {@code typeTag} property.
   * @see #typeTag
   */
  public void setTypeTag(BHistoryTagEnum v) { set(typeTag, v, null); }

////////////////////////////////////////////////////////////////
// Property "EndAt"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code EndAt} property.
   * @see #getEndAt
   * @see #setEndAt
   */
  public static final Property EndAt = newProperty(0, BAbsTime.DEFAULT, null);
  
  /**
   * Get the {@code EndAt} property.
   * @see #EndAt
   */
  public BAbsTime getEndAt() { return (BAbsTime)get(EndAt); }
  
  /**
   * Set the {@code EndAt} property.
   * @see #EndAt
   */
  public void setEndAt(BAbsTime v) { set(EndAt, v, null); }

////////////////////////////////////////////////////////////////
// Property "meterRead"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code meterRead} property.
   * @see #getMeterRead
   * @see #setMeterRead
   */
  public static final Property meterRead = newProperty(0, 0.0d, null);
  
  /**
   * Get the {@code meterRead} property.
   * @see #meterRead
   */
  public double getMeterRead() { return getDouble(meterRead); }
  
  /**
   * Set the {@code meterRead} property.
   * @see #meterRead
   */
  public void setMeterRead(double v) { setDouble(meterRead, v, null); }

////////////////////////////////////////////////////////////////
// Property "cost"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code cost} property.
   * @see #getCost
   * @see #setCost
   */
  public static final Property cost = newProperty(0, 0.0d, null);
  
  /**
   * Get the {@code cost} property.
   * @see #cost
   */
  public double getCost() { return getDouble(cost); }
  
  /**
   * Set the {@code cost} property.
   * @see #cost
   */
  public void setCost(double v) { setDouble(cost, v, null); }

////////////////////////////////////////////////////////////////
// Property "fee"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code fee} property.
   * @see #getFee
   * @see #setFee
   */
  public static final Property fee = newProperty(0, 0.0d, null);
  
  /**
   * Get the {@code fee} property.
   * @see #fee
   */
  public double getFee() { return getDouble(fee); }
  
  /**
   * Set the {@code fee} property.
   * @see #fee
   */
  public void setFee(double v) { setDouble(fee, v, null); }

////////////////////////////////////////////////////////////////
// Property "bill"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code bill} property.
   * @see #getBill
   * @see #setBill
   */
  public static final Property bill = newProperty(0, 0.0d, null);
  
  /**
   * Get the {@code bill} property.
   * @see #bill
   */
  public double getBill() { return getDouble(bill); }
  
  /**
   * Set the {@code bill} property.
   * @see #bill
   */
  public void setBill(double v) { setDouble(bill, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BEnergyIntervalRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    /**
     * create method
     */
    public BEnergyIntervalRecord() {}

    /**
     * Tests whether this record type has a fixed size.  Float records
     * do have a fixed size.
     */
    public boolean isFixedSize() { return true; }

    /**
     * Read the type specific fields from the specified input.
     */
    public void doReadTrend(DataInput in) throws IOException {
        this.setTypeTag(BHistoryTagEnum.make(in.readInt()));
        this.setEndAt(BAbsTime.make(in.readLong()));
        this.setMeterRead((double) in.readFloat());
        this.setCost((double) in.readFloat());
        this.setFee((double) in.readFloat());
        this.setBill((double) in.readFloat());
    }

    /**
     * Write the type specific fields to the specified output.
     */
    public void doWriteTrend(DataOutput out) throws IOException {
        out.writeInt(this.getTypeTag().getOrdinal());
        out.writeLong(this.getEndAt().getMillis());
        out.writeFloat((float) this.getMeterRead());
        out.writeFloat((float) this.getCost());
        out.writeFloat((float) this.getFee());
        out.writeFloat((float) this.getBill());
    }

    /**
     * Set the values in this record.
     * @return Returns this instance with the new values set.
     */
    public BEnergyIntervalRecord set(BAbsTime timestamp,
                                     BHistoryTagEnum typeTag,
                                     double   meterRead,
                                     double   cost,
                                     double   fee,
                                     double   bill,
                                     BStatus  status)
    {
        this.setTimestamp(timestamp);
        this.setTypeTag(typeTag);
        this.setEndAt(timestamp);
        this.setMeterRead(meterRead);
        this.setCost(cost);
        this.setFee(fee);
        this.setBill(bill);
        return this;
    }

    /**
     * draw curve using bill property
     */
    public Property getValueProperty() {
        return bill;
    }

    /**
     * Return <code>getValue()</code>.
     */
    public double getNumeric() {
        return getBill();
    }

    /**
     * Return <code>BFacets.NULL</code>.
     */
    public BFacets getNumericFacets() {
        return BFacets.NULL;
    }

}