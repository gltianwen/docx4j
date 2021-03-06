/*
 *  Copyright 2010, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.xlsx4j.sml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_ExternalBook complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_ExternalBook">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sheetNames" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_ExternalSheetNames" minOccurs="0"/>
 *         &lt;element name="definedNames" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_ExternalDefinedNames" minOccurs="0"/>
 *         &lt;element name="sheetDataSet" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_ExternalSheetDataSet" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://schemas.openxmlformats.org/officeDocument/2006/relationships}id use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_ExternalBook", propOrder = {
    "sheetNames",
    "definedNames",
    "sheetDataSet"
})
public class CTExternalBook {

    protected CTExternalSheetNames sheetNames;
    protected CTExternalDefinedNames definedNames;
    protected CTExternalSheetDataSet sheetDataSet;
    @XmlAttribute(namespace = "http://schemas.openxmlformats.org/officeDocument/2006/relationships", required = true)
    protected String id;

    /**
     * Gets the value of the sheetNames property.
     * 
     * @return
     *     possible object is
     *     {@link CTExternalSheetNames }
     *     
     */
    public CTExternalSheetNames getSheetNames() {
        return sheetNames;
    }

    /**
     * Sets the value of the sheetNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTExternalSheetNames }
     *     
     */
    public void setSheetNames(CTExternalSheetNames value) {
        this.sheetNames = value;
    }

    /**
     * Gets the value of the definedNames property.
     * 
     * @return
     *     possible object is
     *     {@link CTExternalDefinedNames }
     *     
     */
    public CTExternalDefinedNames getDefinedNames() {
        return definedNames;
    }

    /**
     * Sets the value of the definedNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTExternalDefinedNames }
     *     
     */
    public void setDefinedNames(CTExternalDefinedNames value) {
        this.definedNames = value;
    }

    /**
     * Gets the value of the sheetDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link CTExternalSheetDataSet }
     *     
     */
    public CTExternalSheetDataSet getSheetDataSet() {
        return sheetDataSet;
    }

    /**
     * Sets the value of the sheetDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTExternalSheetDataSet }
     *     
     */
    public void setSheetDataSet(CTExternalSheetDataSet value) {
        this.sheetDataSet = value;
    }

    /**
     * Relationship to supporting book file path
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
