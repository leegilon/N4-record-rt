package com.guardian.historyRecord.enums;

import javax.baja.nre.annotations.NiagaraEnum;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.nre.annotations.Range;
import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * Created by Chris on 2016-12-12.
 */
@NiagaraType
@NiagaraEnum(
        range = {
                @Range("summary"),
                @Range("runState"),
                @Range("alarmState"),
                @Range("log"),
                @Range("energy"),
                @Range("meterRead"),
                @Range("cov"),
        },
        defaultValue = "summary"
)
public final class BHistoryTypeEnum
    extends BFrozenEnum
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.historyRecord.enums.BHistoryTypeEnum(2966359256)1.0$ @*/
/* Generated Fri May 05 13:09:41 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */
  
  /** Ordinal value for summary. */
  public static final int SUMMARY = 0;
  /** Ordinal value for runState. */
  public static final int RUN_STATE = 1;
  /** Ordinal value for alarmState. */
  public static final int ALARM_STATE = 2;
  /** Ordinal value for log. */
  public static final int LOG = 3;
  /** Ordinal value for energy. */
  public static final int ENERGY = 4;
  /** Ordinal value for meterRead. */
  public static final int METER_READ = 5;
  /** Ordinal value for cov. */
  public static final int COV = 6;
  
  /** BHistoryTypeEnum constant for summary. */
  public static final BHistoryTypeEnum summary = new BHistoryTypeEnum(SUMMARY);
  /** BHistoryTypeEnum constant for runState. */
  public static final BHistoryTypeEnum runState = new BHistoryTypeEnum(RUN_STATE);
  /** BHistoryTypeEnum constant for alarmState. */
  public static final BHistoryTypeEnum alarmState = new BHistoryTypeEnum(ALARM_STATE);
  /** BHistoryTypeEnum constant for log. */
  public static final BHistoryTypeEnum log = new BHistoryTypeEnum(LOG);
  /** BHistoryTypeEnum constant for energy. */
  public static final BHistoryTypeEnum energy = new BHistoryTypeEnum(ENERGY);
  /** BHistoryTypeEnum constant for meterRead. */
  public static final BHistoryTypeEnum meterRead = new BHistoryTypeEnum(METER_READ);
  /** BHistoryTypeEnum constant for cov. */
  public static final BHistoryTypeEnum cov = new BHistoryTypeEnum(COV);
  
  /** Factory method with ordinal. */
  public static BHistoryTypeEnum make(int ordinal)
  {
    return (BHistoryTypeEnum)summary.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BHistoryTypeEnum make(String tag)
  {
    return (BHistoryTypeEnum)summary.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BHistoryTypeEnum(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BHistoryTypeEnum DEFAULT = summary;

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BHistoryTypeEnum.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

}