package com.guardian.historyRecord;

import com.guardian.json.JSONObj;
import com.guardian.json.JSONSupport;

import javax.baja.history.BHistoryRecord;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * alarming record define for log
 * @author Chris Lee
 */
@NiagaraType
@NiagaraProperty(
        name = "occureTime",
        type = "BAbsTime",
        defaultValue = "BAbsTime.NULL"
)
@NiagaraProperty(
        name = "alarmUuid",
        type = "String",
        defaultValue = "-",
        flags = Flags.HIDDEN
)
@NiagaraProperty(
        name = "sourceUuid",
        type = "String",
        defaultValue = "-",
        flags = Flags.HIDDEN
)
@NiagaraProperty(
        name = "stationName",
        type = "String",
        defaultValue = "-",
        flags = Flags.READONLY | Flags.HIDDEN
)
@NiagaraProperty(
        name = "stationDiaplsyName",
        type = "String",
        defaultValue = "-",
        flags = Flags.READONLY | Flags.HIDDEN
)
@NiagaraProperty(
        name = "deviceName",
        type = "String",
        defaultValue = "-",
        flags = Flags.READONLY
)
@NiagaraProperty(
        name = "deviceDisplayName",
        type = "String",
        defaultValue = "-",
        flags = Flags.READONLY
)
@NiagaraProperty(
        name = "sourceString",
        type = "String",
        defaultValue = "-",
        flags = Flags.READONLY
)
@NiagaraProperty(
        name = "sourceTarget",
        type = "String",
        defaultValue = "-",
        flags = Flags.READONLY
)
@NiagaraProperty(
        name = "alarmMessage",
        type = "String",
        defaultValue = "-",
        flags = Flags.READONLY
)
@NiagaraProperty(
        name = "alarmValue",
        type = "String",
        defaultValue = "-",
        flags = Flags.READONLY
)
@NiagaraProperty(
        name = "limitValue",
        type = "String",
        defaultValue = "-",
        flags = Flags.READONLY
)
@NiagaraProperty(
        name = "note",
        type = "String",
        defaultValue = "-",
        flags = Flags.READONLY
)
@NiagaraProperty(
        name = "repeatTimes",
        type = "long",
        defaultValue = "0",
        flags = Flags.READONLY
)

public final class BAlarmOpenRecord
        extends BHistoryRecord
        implements JSONSupport
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.guardian.historyRecord.BAlarmOpenRecord(1012298142)1.0$ @*/
/* Generated Thu Nov 09 10:10:28 CST 2017 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "occureTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code occureTime} property.
   * @see #getOccureTime
   * @see #setOccureTime
   */
  public static final Property occureTime = newProperty(0, BAbsTime.NULL, null);
  
  /**
   * Get the {@code occureTime} property.
   * @see #occureTime
   */
  public BAbsTime getOccureTime() { return (BAbsTime)get(occureTime); }
  
  /**
   * Set the {@code occureTime} property.
   * @see #occureTime
   */
  public void setOccureTime(BAbsTime v) { set(occureTime, v, null); }

////////////////////////////////////////////////////////////////
// Property "alarmUuid"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code alarmUuid} property.
   * @see #getAlarmUuid
   * @see #setAlarmUuid
   */
  public static final Property alarmUuid = newProperty(Flags.HIDDEN, "", null);
  
  /**
   * Get the {@code alarmUuid} property.
   * @see #alarmUuid
   */
  public String getAlarmUuid() { return getString(alarmUuid); }
  
  /**
   * Set the {@code alarmUuid} property.
   * @see #alarmUuid
   */
  public void setAlarmUuid(String v) { setString(alarmUuid, v, null); }

////////////////////////////////////////////////////////////////
// Property "sourceUuid"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code sourceUuid} property.
   * @see #getSourceUuid
   * @see #setSourceUuid
   */
  public static final Property sourceUuid = newProperty(Flags.HIDDEN, "", null);
  
  /**
   * Get the {@code sourceUuid} property.
   * @see #sourceUuid
   */
  public String getSourceUuid() { return getString(sourceUuid); }
  
  /**
   * Set the {@code sourceUuid} property.
   * @see #sourceUuid
   */
  public void setSourceUuid(String v) { setString(sourceUuid, v, null); }

////////////////////////////////////////////////////////////////
// Property "stationName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code stationName} property.
   * @see #getStationName
   * @see #setStationName
   */
  public static final Property stationName = newProperty(Flags.READONLY | Flags.HIDDEN, "", null);
  
  /**
   * Get the {@code stationName} property.
   * @see #stationName
   */
  public String getStationName() { return getString(stationName); }
  
  /**
   * Set the {@code stationName} property.
   * @see #stationName
   */
  public void setStationName(String v) { setString(stationName, v, null); }

////////////////////////////////////////////////////////////////
// Property "stationDiaplsyName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code stationDiaplsyName} property.
   * @see #getStationDiaplsyName
   * @see #setStationDiaplsyName
   */
  public static final Property stationDiaplsyName = newProperty(Flags.READONLY | Flags.HIDDEN, "", null);
  
  /**
   * Get the {@code stationDiaplsyName} property.
   * @see #stationDiaplsyName
   */
  public String getStationDiaplsyName() { return getString(stationDiaplsyName); }
  
  /**
   * Set the {@code stationDiaplsyName} property.
   * @see #stationDiaplsyName
   */
  public void setStationDiaplsyName(String v) { setString(stationDiaplsyName, v, null); }

////////////////////////////////////////////////////////////////
// Property "deviceName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code deviceName} property.
   * @see #getDeviceName
   * @see #setDeviceName
   */
  public static final Property deviceName = newProperty(Flags.READONLY, "", null);
  
  /**
   * Get the {@code deviceName} property.
   * @see #deviceName
   */
  public String getDeviceName() { return getString(deviceName); }
  
  /**
   * Set the {@code deviceName} property.
   * @see #deviceName
   */
  public void setDeviceName(String v) { setString(deviceName, v, null); }

////////////////////////////////////////////////////////////////
// Property "deviceDisplayName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code deviceDisplayName} property.
   * @see #getDeviceDisplayName
   * @see #setDeviceDisplayName
   */
  public static final Property deviceDisplayName = newProperty(Flags.READONLY, "", null);
  
  /**
   * Get the {@code deviceDisplayName} property.
   * @see #deviceDisplayName
   */
  public String getDeviceDisplayName() { return getString(deviceDisplayName); }
  
  /**
   * Set the {@code deviceDisplayName} property.
   * @see #deviceDisplayName
   */
  public void setDeviceDisplayName(String v) { setString(deviceDisplayName, v, null); }

////////////////////////////////////////////////////////////////
// Property "sourceString"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code sourceString} property.
   * @see #getSourceString
   * @see #setSourceString
   */
  public static final Property sourceString = newProperty(Flags.READONLY, "", null);
  
  /**
   * Get the {@code sourceString} property.
   * @see #sourceString
   */
  public String getSourceString() { return getString(sourceString); }
  
  /**
   * Set the {@code sourceString} property.
   * @see #sourceString
   */
  public void setSourceString(String v) { setString(sourceString, v, null); }

////////////////////////////////////////////////////////////////
// Property "sourceTarget"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code sourceTarget} property.
   * @see #getSourceTarget
   * @see #setSourceTarget
   */
  public static final Property sourceTarget = newProperty(Flags.READONLY, "", null);
  
  /**
   * Get the {@code sourceTarget} property.
   * @see #sourceTarget
   */
  public String getSourceTarget() { return getString(sourceTarget); }
  
  /**
   * Set the {@code sourceTarget} property.
   * @see #sourceTarget
   */
  public void setSourceTarget(String v) { setString(sourceTarget, v, null); }

////////////////////////////////////////////////////////////////
// Property "alarmMessage"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code alarmMessage} property.
   * @see #getAlarmMessage
   * @see #setAlarmMessage
   */
  public static final Property alarmMessage = newProperty(Flags.READONLY, "", null);
  
  /**
   * Get the {@code alarmMessage} property.
   * @see #alarmMessage
   */
  public String getAlarmMessage() { return getString(alarmMessage); }
  
  /**
   * Set the {@code alarmMessage} property.
   * @see #alarmMessage
   */
  public void setAlarmMessage(String v) { setString(alarmMessage, v, null); }

////////////////////////////////////////////////////////////////
// Property "alarmValue"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code alarmValue} property.
   * @see #getAlarmValue
   * @see #setAlarmValue
   */
  public static final Property alarmValue = newProperty(Flags.READONLY, "", null);
  
  /**
   * Get the {@code alarmValue} property.
   * @see #alarmValue
   */
  public String getAlarmValue() { return getString(alarmValue); }
  
  /**
   * Set the {@code alarmValue} property.
   * @see #alarmValue
   */
  public void setAlarmValue(String v) { setString(alarmValue, v, null); }

////////////////////////////////////////////////////////////////
// Property "limitValue"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code limitValue} property.
   * @see #getLimitValue
   * @see #setLimitValue
   */
  public static final Property limitValue = newProperty(Flags.READONLY, "", null);
  
  /**
   * Get the {@code limitValue} property.
   * @see #limitValue
   */
  public String getLimitValue() { return getString(limitValue); }
  
  /**
   * Set the {@code limitValue} property.
   * @see #limitValue
   */
  public void setLimitValue(String v) { setString(limitValue, v, null); }

////////////////////////////////////////////////////////////////
// Property "note"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code note} property.
   * @see #getNote
   * @see #setNote
   */
  public static final Property note = newProperty(Flags.READONLY, "", null);
  
  /**
   * Get the {@code note} property.
   * @see #note
   */
  public String getNote() { return getString(note); }
  
  /**
   * Set the {@code note} property.
   * @see #note
   */
  public void setNote(String v) { setString(note, v, null); }

////////////////////////////////////////////////////////////////
// Property "repeatTimes"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code repeatTimes} property.
   * @see #getRepeatTimes
   * @see #setRepeatTimes
   */
  public static final Property repeatTimes = newProperty(Flags.READONLY, 0, null);
  
  /**
   * Get the {@code repeatTimes} property.
   * @see #repeatTimes
   */
  public long getRepeatTimes() { return getLong(repeatTimes); }
  
  /**
   * Set the {@code repeatTimes} property.
   * @see #repeatTimes
   */
  public void setRepeatTimes(long v) { setLong(repeatTimes, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BAlarmOpenRecord.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    @Override
    public boolean isFixedSize() {
        return false;
    }

    @Override
    protected void doRead(DataInput dataInput) throws IOException {
        this.setOccureTime(BAbsTime.make(dataInput.readLong()));
        this.setAlarmUuid(dataInput.readUTF());
        this.setSourceUuid(dataInput.readUTF());
        this.setStationName(dataInput.readUTF());
        this.setStationDiaplsyName(dataInput.readUTF());
        this.setDeviceName(dataInput.readUTF());
        this.setDeviceDisplayName(dataInput.readUTF());
        this.setSourceString(dataInput.readUTF());
        this.setSourceTarget(dataInput.readUTF());
        this.setAlarmMessage(dataInput.readUTF());
        this.setAlarmValue(dataInput.readUTF());
        this.setLimitValue(dataInput.readUTF());
        this.setNote(dataInput.readUTF());
        this.setRepeatTimes(dataInput.readLong());
    }

    @Override
    protected void doWrite(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.getOccureTime().getMillis());
        dataOutput.writeUTF(this.getAlarmUuid());
        dataOutput.writeUTF(this.getSourceUuid());
        dataOutput.writeUTF(this.getStationName());
        dataOutput.writeUTF(this.getStationDiaplsyName());
        dataOutput.writeUTF(this.getDeviceName());
        dataOutput.writeUTF(this.getDeviceDisplayName());
        dataOutput.writeUTF(this.getSourceString());
        dataOutput.writeUTF(this.getSourceTarget());
        dataOutput.writeUTF(this.getAlarmMessage());
        dataOutput.writeUTF(this.getAlarmValue());
        dataOutput.writeUTF(this.getLimitValue());
        dataOutput.writeUTF(this.getNote());
        dataOutput.writeLong(this.getRepeatTimes());
    }

    @Override
    public String toJSONString() {
        return this.getJSONObj().toString();
    }

    @Override
    public JSONObj getJSONObj() {
        JSONObj jsonObj = new JSONObj();
        return this.appendJSONObj(jsonObj);
    }

    @Override
    public JSONObj appendJSONObj(JSONObj jsonObj) {
        jsonObj.put(this.getLexicon().get("api.json.openAlarm.occureTime.mills"),this.getOccureTime().getMillis());
        jsonObj.put(this.getLexicon().get("api.json.openAlarm.alarmUuid"),this.getAlarmUuid());
        jsonObj.put(this.getLexicon().get("api.json.openAlarm.sourceUuid"),this.getSourceUuid());
        jsonObj.put(this.getLexicon().get("api.json.openAlarm.stationName"),this.getStationName());
        jsonObj.put(this.getLexicon().get("api.json.openAlarm.stationDiaplsyName"),this.getStationDiaplsyName());
        jsonObj.put(this.getLexicon().get("api.json.openAlarm.deviceName"),this.getDeviceName());
        jsonObj.put(this.getLexicon().get("api.json.openAlarm.deviceDisplayName"),this.getDeviceDisplayName());
        jsonObj.put(this.getLexicon().get("api.json.openAlarm.sourceString"),this.getSourceString());
        jsonObj.put(this.getLexicon().get("api.json.openAlarm.sourceTarget"),this.getSourceTarget());
        jsonObj.put(this.getLexicon().get("api.json.openAlarm.alarmMessage"),this.getAlarmMessage());
        jsonObj.put(this.getLexicon().get("api.json.openAlarm.alarmValue"),this.getAlarmValue());
        jsonObj.put(this.getLexicon().get("api.json.openAlarm.limitValue"),this.getLimitValue());
        jsonObj.put(this.getLexicon().get("api.json.openAlarm.note"),this.getNote());
        jsonObj.put(this.getLexicon().get("api.json.openAlarm.repeatTimes"),this.getRepeatTimes());
        return jsonObj;
    }

}
