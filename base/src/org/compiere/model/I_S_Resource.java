/**********************************************************************
 * This file is part of Adempiere ERP Bazaar                          *
 * http://www.adempiere.org                                           *
 *                                                                    *
 * Copyright (C) Trifon Trifonov.                                     *
 * Copyright (C) Contributors                                         *
 *                                                                    *
 * This program is free software;
 you can redistribute it and/or      *
 * modify it under the terms of the GNU General Public License        *
 * as published by the Free Software Foundation;
 either version 2     *
 * of the License, or (at your option) any later version.             *
 *                                                                    *
 * This program is distributed in the hope that it will be useful,    *
 * but WITHOUT ANY WARRANTY;
 without even the implied warranty of     *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the       *
 * GNU General Public License for more details.                       *
 *                                                                    *
 * You should have received a copy of the GNU General Public License  *
 * along with this program;
 if not, write to the Free Software        *
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,         *
 * MA 02110-1301, USA.                                                *
 *                                                                    *
 * Contributors:                                                      *
 * - Trifon Trifonov (trifonnt@users.sourceforge.net)                 *
 *                                                                    *
 * Sponsors:                                                          *
 * - Company (http://www.site.com)                                    *
 **********************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import org.compiere.util.KeyNamePair;

/** Generated Interface for S_Resource
 *  @author Trifon Trifonov (generated) 
 *  @version Release 3.5.1a
 */
public interface I_S_Resource 
{

    /** TableName=S_Resource */
    public static final String Table_Name = "S_Resource";

    /** AD_Table_ID=487 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_User_ID */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

	/** Set User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID);

	/** Get User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID();

	public I_AD_User getAD_User() throws Exception;

    /** Column name ChargeableQty */
    public static final String COLUMNNAME_ChargeableQty = "ChargeableQty";

	/** Set Chargeable Quantity	  */
	public void setChargeableQty (BigDecimal ChargeableQty);

	/** Get Chargeable Quantity	  */
	public BigDecimal getChargeableQty();

    /** Column name DailyCapacity */
    public static final String COLUMNNAME_DailyCapacity = "DailyCapacity";

	/** Set DailyCapacity	  */
	public void setDailyCapacity (BigDecimal DailyCapacity);

	/** Get DailyCapacity	  */
	public BigDecimal getDailyCapacity();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name IsAvailable */
    public static final String COLUMNNAME_IsAvailable = "IsAvailable";

	/** Set Available.
	  * Resource is available
	  */
	public void setIsAvailable (boolean IsAvailable);

	/** Get Available.
	  * Resource is available
	  */
	public boolean isAvailable();

    /** Column name IsManufacturingResource */
    public static final String COLUMNNAME_IsManufacturingResource = "IsManufacturingResource";

	/** Set IsManufacturingResource	  */
	public void setIsManufacturingResource (boolean IsManufacturingResource);

	/** Get IsManufacturingResource	  */
	public boolean isManufacturingResource();

    /** Column name M_Warehouse_ID */
    public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";

	/** Set Warehouse.
	  * Storage Warehouse and Service Point
	  */
	public void setM_Warehouse_ID (int M_Warehouse_ID);

	/** Get Warehouse.
	  * Storage Warehouse and Service Point
	  */
	public int getM_Warehouse_ID();

	public I_M_Warehouse getM_Warehouse() throws Exception;

    /** Column name ManufacturingResourceType */
    public static final String COLUMNNAME_ManufacturingResourceType = "ManufacturingResourceType";

	/** Set ManufacturingResourceType	  */
	public void setManufacturingResourceType (String ManufacturingResourceType);

	/** Get ManufacturingResourceType	  */
	public String getManufacturingResourceType();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name PercentUtilization */
    public static final String COLUMNNAME_PercentUtilization = "PercentUtilization";

	/** Set PercentUtilization	  */
	public void setPercentUtilization (BigDecimal PercentUtilization);

	/** Get PercentUtilization	  */
	public BigDecimal getPercentUtilization();

    /** Column name PlanningHorizon */
    public static final String COLUMNNAME_PlanningHorizon = "PlanningHorizon";

	/** Set Planning Horizon.
	  * The planning horizon is the amount of time (Days) an organisation will look into the future when preparing a strategic plan.
	  */
	public void setPlanningHorizon (int PlanningHorizon);

	/** Get Planning Horizon.
	  * The planning horizon is the amount of time (Days) an organisation will look into the future when preparing a strategic plan.
	  */
	public int getPlanningHorizon();

    /** Column name QueuingTime */
    public static final String COLUMNNAME_QueuingTime = "QueuingTime";

	/** Set QueuingTime	  */
	public void setQueuingTime (BigDecimal QueuingTime);

	/** Get QueuingTime	  */
	public BigDecimal getQueuingTime();

    /** Column name S_ResourceType_ID */
    public static final String COLUMNNAME_S_ResourceType_ID = "S_ResourceType_ID";

	/** Set Resource Type	  */
	public void setS_ResourceType_ID (int S_ResourceType_ID);

	/** Get Resource Type	  */
	public int getS_ResourceType_ID();

	public I_S_ResourceType getS_ResourceType() throws Exception;

    /** Column name S_Resource_ID */
    public static final String COLUMNNAME_S_Resource_ID = "S_Resource_ID";

	/** Set Resource.
	  * Resource
	  */
	public void setS_Resource_ID (int S_Resource_ID);

	/** Get Resource.
	  * Resource
	  */
	public int getS_Resource_ID();

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();

    /** Column name WaitingTime */
    public static final String COLUMNNAME_WaitingTime = "WaitingTime";

	/** Set Waiting Time.
	  * Workflow Simulation Waiting time
	  */
	public void setWaitingTime (BigDecimal WaitingTime);

	/** Get Waiting Time.
	  * Workflow Simulation Waiting time
	  */
	public BigDecimal getWaitingTime();
}
